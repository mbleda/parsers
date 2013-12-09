package drugbank;

import drugbank.drugbank.DrugInteraction;

import java.nio.file.Paths;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mbleda
 * Date: 12/9/13
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */


public class DrugbankParserTest {

    @org.junit.Test
    public void testDrugbankParser() throws Exception {

        String filePath = "/home/mbleda/projects/2013_variability_drug_binding_proteins/1-data/drugbank/data_to_drugbank_parser/drugbank_20131209.xml";
        String species = "human,Homo sapiens";

        DrugbankXMLParser dxp = new DrugbankXMLParser();

        Object x = dxp.loadXMLInfo(filePath);

//        ObjectMapper jsonMapper = new ObjectMapper();

        DrugbankParser dp = new DrugbankParser();
        List<DrugInteraction> drugInteractions = dp.parse(x, species, Paths.get("/tmp/aaa.json"));

        System.out.println("Number of drug interactions: "+ drugInteractions.size());
    }
}
