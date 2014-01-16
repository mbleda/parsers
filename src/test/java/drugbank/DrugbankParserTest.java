package drugbank;

import com.fasterxml.jackson.databind.ObjectMapper;
import drugbank.drugbank.DrugInteraction;
import drugbank.xjc20131209.DrugType;
import drugbank.xjc20131209.Drugs;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
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

        Drugs drugXML = (Drugs) dxp.loadXMLInfo(filePath);

        DrugbankParser dp = new DrugbankParser();
        dp.parse(drugXML, species, Paths.get("/tmp/drugbank.json"));

    }
}
