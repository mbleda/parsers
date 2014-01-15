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
//        System.out.println(partner.getId().intValue()+" - "+partner.getName());
    }

    // Setting drug paramenters
    //=================================================
    for (DrugType dt : drugs.getDrug()){
        Drug drug = new Drug();
        List<XRef> xRefList = new ArrayList<>();

        // ID
        drug.setId(dt.getDrugbankId());

        // Type
        drug.setType(dt.getType());

        // ATC codes
        drug.setAtcCode(dt.getAtcCodes().getAtcCode());
        for (String atc : dt.getAtcCodes().getAtcCode()){
            xRefList.add(new XRef(atc, "ATC"));
        }

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

        // Category
        drug.setCategory(dt.getCategories().getCategory());

        // Groups
        drug.setGroup(dt.getGroups().getGroup());

        // Description
        drug.setDescription(dt.getDescription());

        // Absorption
        drug.setAbsorption(dt.getAbsorption());

        // Food interactions
        List<Interactor> foodInteractionList = new ArrayList<>();
        for (String food : dt.getFoodInteractions().getFoodInteraction()){
            Interactor interactor = new Interactor(food);
            foodInteractionList.add(interactor);
        }
        drug.setFoodInteractor(foodInteractionList);

        // Drug interactions
        List<Interactor> drugInteractorList = new ArrayList<>();
        for (drugbank.xjc20131209.DrugInteraction drugInt : dt.getDrugInteractions().getDrugInteraction()){
            Interactor drugInterator = new Interactor(drugInt.getName(), drugInt.getDrug(), drugInt.getDescription());
            drugInteractorList.add(drugInterator);
        }
        drug.setDrugInteractor(drugInteractorList);

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
        drug.setXrefs(xRefList);


        // Setting protein targets
        //=================================================
        for (TargetBondType target : dt.getTargets().getTarget()){
            Partner targetPartner = new Partner();
            PartnerType partner = partnersMap.get(target.getPartner());
//            partner.
            System.out.println("Partner: "+target.getPartner());
            System.out.println("Actions: "+target.getActions().getAction());
            System.out.println("References: "+target.getReferences());

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
