package drugbank;

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

        List<PartnerType> partnertype = drugs.getPartners().getPartner();

        /**
         * Store all Partner Uniprot ID into a Map to speed up searching
         * Partner ID --> Uniprot ID
         */
        Map<Integer, String> partnerTypesMap = new HashMap<Integer, String>(20000);
        for (PartnerType partner: drugs.getPartners().getPartner()){
            System.out.println(partner);
//            for (IdentifiersType.ExternalIdentifier xid: partner.getExternalIdentifiers().getExternalIdentifier()){
//                if (xid != null && xid.getResource().equalsIgnoreCase("UniProtKB")){
//                    partnerTypesMap.put(partner.getId().intValue(), xid.getIdentifier());
//                }
//            }
        }

//        for (x partner:drugs.getPartners()){
//
//        }

//        DrugbankXMLParser dxp = new DrugbankXMLParser();
//        drugbank = () dxp.loadXMLInfo("/home/mbleda/projects/2013_variability_drug_binding_proteins/1-data/drugbank/data_to_drugbank_parser/drugbank_20131209.xml");
//


        return drugInteractions;
    }

}
