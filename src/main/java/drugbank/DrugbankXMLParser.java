package drugbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Created with IntelliJ IDEA.
 * User: mbleda
 * Date: 12/9/13
 * Time: 5:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class DrugbankXMLParser {

    public final static String DRUGBANK_CONTEXT = "drugbank.xjc20131209";

    public static void saveXMLInfo(Object obj, String filename) throws FileNotFoundException, JAXBException {
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(DRUGBANK_CONTEXT);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(obj, new FileOutputStream(filename));
    }

    /**
     * Checks if XML info file exists and loads it
     * @throws JAXBException
     * @throws IOException
     */
    public static Object loadXMLInfo(String filename) throws JAXBException {
        Object obj = null;
        JAXBContext jaxbContext = JAXBContext.newInstance(DRUGBANK_CONTEXT);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        obj =  unmarshaller.unmarshal(new File(filename));
        return obj;
    }
}
