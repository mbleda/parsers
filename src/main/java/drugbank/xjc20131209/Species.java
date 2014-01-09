//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 04:12:32 PM CET 
//


package drugbank.xjc20131209;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="category">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="human"/>
 *               &lt;enumeration value="bacterial"/>
 *               &lt;enumeration value="fungal"/>
 *               &lt;enumeration value="viral"/>
 *               &lt;enumeration value="parasitic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uniprot-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uniprot-taxon-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "category",
    "name",
    "uniprotName",
    "uniprotTaxonId"
})
@XmlRootElement(name = "species")
public class Species {

    protected String category;
    protected String name;
    @XmlElement(name = "uniprot-name")
    protected String uniprotName;
    @XmlElement(name = "uniprot-taxon-id")
    protected String uniprotTaxonId;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uniprotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniprotName() {
        return uniprotName;
    }

    /**
     * Sets the value of the uniprotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniprotName(String value) {
        this.uniprotName = value;
    }

    /**
     * Gets the value of the uniprotTaxonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniprotTaxonId() {
        return uniprotTaxonId;
    }

    /**
     * Sets the value of the uniprotTaxonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniprotTaxonId(String value) {
        this.uniprotTaxonId = value;
    }

}
