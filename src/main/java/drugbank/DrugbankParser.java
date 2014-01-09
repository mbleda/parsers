package drugbank;

import drugbank.drugbank.*;
import drugbank.drugbank.DrugInteraction;
import drugbank.xjc20131209.*;

import javax.xml.bind.JAXBException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mbleda
 * Date: 12/9/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */

public class DrugbankParser {

    public List<DrugInteraction> parse(Drugs drugs, String species, Path outPath) throws JAXBException {

        List<DrugInteraction> drugInteractions = new ArrayList();

        System.out.println("Number of drugs: "+ drugs.getDrug().size());
        System.out.println("Number of partners: "+ drugs.getPartners().getPartner().size());

        /**
         * Store all Partner Uniprot ID into a Map to speed up searching
         * Partner ID --> Uniprot ID
         */
        Map<Integer, PartnerType> partnersMap = new HashMap<>(20000);
        for (PartnerType partner: drugs.getPartners().getPartner()){
            partnersMap.put(partner.getId().intValue(), partner);
        }

        for (DrugType dt : drugs.getDrug()){
            Drug drug = new Drug();
            List<XRef> xRefList = new ArrayList<>();

            // ID
            drug.setId(dt.getDrugbankId());

            // Type
            drug.setType(dt.getType());

            // ATC codes
            drug.setAtcCode(dt.getAtcCodes().getAtcCode());

            // Indication
            drug.setIndication(dt.getIndication());

            // Pharmacology
            drug.setPharmacology(dt.getPharmacology());

            // Mechanism of action
            drug.setMechanismOfAction(dt.getMechanismOfAction());

            // Toxicity
            drug.setToxicity(dt.getToxicity());

            // Route of elimination
            drug.setRouteOfElimination(dt.getRouteOfElimination());

            // Volume of distribution
            drug.setVolumeOfDistribution(dt.getVolumeOfDistribution());

            // Half life
            drug.setHalfLife(dt.getHalfLife());

            // Clearance
            drug.setClearance(dt.getClearance());

            // Categories
            drug.setCategory(dt.getCategories().getCategory());

            // Groups
            drug.setGroup(dt.getGroups().getGroup());

            // Description
            drug.setDescription(dt.getDescription());

            // Absorption
            drug.setAbsorption(dt.getAbsorption());

            // Xrefs
            xRefList.add(new XRef(dt.getDrugbankId(), "Drugbank"));

            xRefList.add(new XRef(dt.getName().replaceAll("\n", ""), "name"));

            for ( String sa : dt.getSecondaryAccessionNumbers().getSecondaryAccessionNumber()){
                xRefList.add(new XRef(sa, "Drugbank Secondary Accession"));
            }

            for ( String synonym : dt.getSynonyms().getSynonym()){
                xRefList.add(new XRef(synonym, "Synonym"));
            }

            for (IdentifiersType.ExternalIdentifier xr : dt.getExternalIdentifiers().getExternalIdentifier()){
                xRefList.add(new XRef(xr.getIdentifier(), xr.getResource()));
            }

            for (String xr : dt.getAhfsCodes().getAhfsCode()){
                xRefList.add(new XRef(xr, "AHFS"));
            }

            xRefList.add(new XRef(dt.getCasNumber(), "CAS number"));

            for (String brand : dt.getBrands().getBrand()){
                xRefList.add(new XRef(brand, "Brand"));
            }

            for (Manufacturer manufacturer : dt.getManufacturers().getManufacturer()){
                xRefList.add(new XRef(manufacturer.getValue(), "Manufacturer"));
            }

            int food = (dt.getFoodInteractions().getFoodInteraction().size() != 0) ? dt.getFoodInteractions().getFoodInteraction().size() : 0;
            if (food > 1){
                System.out.println(dt.getFoodInteractions().getFoodInteraction());
            }

//            for (dr : dt.getManufacturers().getManufacturer()){
//                xRefList.add(new XRef(manufacturer.getValue(), "Manufacturer"));
//            }


//            System.out.println(dt.getProteinBinding());

//            System.out.println(drug.getId());
            System.out.println("----------------------");

        }

        return drugInteractions;
    }

}
