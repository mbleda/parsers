//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 12:57:02 PM CET 
//


package xjc20131209;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugbank-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cas-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="general-references" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synthesis-reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mechanism-of-action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toxicity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="biotransformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="absorption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="half-life" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protein-binding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="route-of-elimination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="volume-of-distribution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clearance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://drugbank.ca}secondary-accession-numbers"/>
 *         &lt;element ref="{http://drugbank.ca}groups"/>
 *         &lt;element ref="{http://drugbank.ca}taxonomy"/>
 *         &lt;element name="synonyms" type="{http://drugbank.ca}SynonymsType"/>
 *         &lt;element ref="{http://drugbank.ca}salts"/>
 *         &lt;element ref="{http://drugbank.ca}brands"/>
 *         &lt;element ref="{http://drugbank.ca}mixtures"/>
 *         &lt;element ref="{http://drugbank.ca}packagers"/>
 *         &lt;element ref="{http://drugbank.ca}manufacturers"/>
 *         &lt;element ref="{http://drugbank.ca}prices"/>
 *         &lt;element ref="{http://drugbank.ca}categories"/>
 *         &lt;element ref="{http://drugbank.ca}affected-organisms"/>
 *         &lt;element ref="{http://drugbank.ca}dosages"/>
 *         &lt;element ref="{http://drugbank.ca}atc-codes"/>
 *         &lt;element ref="{http://drugbank.ca}ahfs-codes"/>
 *         &lt;element ref="{http://drugbank.ca}patents"/>
 *         &lt;element ref="{http://drugbank.ca}food-interactions"/>
 *         &lt;element ref="{http://drugbank.ca}drug-interactions"/>
 *         &lt;element ref="{http://drugbank.ca}protein-sequences" minOccurs="0"/>
 *         &lt;element name="calculated-properties" type="{http://drugbank.ca}PropertiesType" minOccurs="0"/>
 *         &lt;element name="experimental-properties" type="{http://drugbank.ca}PropertiesType"/>
 *         &lt;element name="external-identifiers" type="{http://drugbank.ca}IdentifiersType"/>
 *         &lt;element ref="{http://drugbank.ca}external-links"/>
 *         &lt;element ref="{http://drugbank.ca}targets"/>
 *         &lt;element ref="{http://drugbank.ca}enzymes"/>
 *         &lt;element ref="{http://drugbank.ca}transporters"/>
 *         &lt;element ref="{http://drugbank.ca}carriers"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="small molecule"/>
 *             &lt;enumeration value="biotech"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="updated" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugType", propOrder = {
    "drugbankId",
    "name",
    "description",
    "casNumber",
    "generalReferences",
    "synthesisReference",
    "indication",
    "pharmacology",
    "mechanismOfAction",
    "toxicity",
    "biotransformation",
    "absorption",
    "halfLife",
    "proteinBinding",
    "routeOfElimination",
    "volumeOfDistribution",
    "clearance",
    "secondaryAccessionNumbers",
    "groups",
    "taxonomy",
    "synonyms",
    "salts",
    "brands",
    "mixtures",
    "packagers",
    "manufacturers",
    "prices",
    "categories",
    "affectedOrganisms",
    "dosages",
    "atcCodes",
    "ahfsCodes",
    "patents",
    "foodInteractions",
    "drugInteractions",
    "proteinSequences",
    "calculatedProperties",
    "experimentalProperties",
    "externalIdentifiers",
    "externalLinks",
    "targets",
    "enzymes",
    "transporters",
    "carriers"
})
public class DrugType {

    @XmlElement(name = "drugbank-id", required = true)
    protected String drugbankId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "cas-number", required = true)
    protected String casNumber;
    @XmlElement(name = "general-references", required = true)
    protected String generalReferences;
    @XmlElement(name = "synthesis-reference", required = true)
    protected String synthesisReference;
    @XmlElement(required = true)
    protected String indication;
    @XmlElement(required = true)
    protected String pharmacology;
    @XmlElement(name = "mechanism-of-action", required = true)
    protected String mechanismOfAction;
    @XmlElement(required = true)
    protected String toxicity;
    @XmlElement(required = true)
    protected String biotransformation;
    @XmlElement(required = true)
    protected String absorption;
    @XmlElement(name = "half-life", required = true)
    protected String halfLife;
    @XmlElement(name = "protein-binding", required = true)
    protected String proteinBinding;
    @XmlElement(name = "route-of-elimination", required = true)
    protected String routeOfElimination;
    @XmlElement(name = "volume-of-distribution", required = true)
    protected String volumeOfDistribution;
    @XmlElement(required = true)
    protected String clearance;
    @XmlElement(name = "secondary-accession-numbers", required = true)
    protected SecondaryAccessionNumbers secondaryAccessionNumbers;
    @XmlElement(required = true)
    protected Groups groups;
    @XmlElement(required = true)
    protected Taxonomy taxonomy;
    @XmlElement(required = true)
    protected SynonymsType synonyms;
    @XmlElement(required = true)
    protected Salts salts;
    @XmlElement(required = true)
    protected Brands brands;
    @XmlElement(required = true)
    protected Mixtures mixtures;
    @XmlElement(required = true)
    protected Packagers packagers;
    @XmlElement(required = true)
    protected Manufacturers manufacturers;
    @XmlElement(required = true)
    protected Prices prices;
    @XmlElement(required = true)
    protected Categories categories;
    @XmlElement(name = "affected-organisms", required = true)
    protected AffectedOrganisms affectedOrganisms;
    @XmlElement(required = true)
    protected Dosages dosages;
    @XmlElement(name = "atc-codes", required = true)
    protected AtcCodes atcCodes;
    @XmlElement(name = "ahfs-codes", required = true)
    protected AhfsCodes ahfsCodes;
    @XmlElement(required = true)
    protected Patents patents;
    @XmlElement(name = "food-interactions", required = true)
    protected FoodInteractions foodInteractions;
    @XmlElement(name = "drug-interactions", required = true)
    protected DrugInteractions drugInteractions;
    @XmlElement(name = "protein-sequences")
    protected ProteinSequences proteinSequences;
    @XmlElement(name = "calculated-properties")
    protected PropertiesType calculatedProperties;
    @XmlElement(name = "experimental-properties", required = true)
    protected PropertiesType experimentalProperties;
    @XmlElement(name = "external-identifiers", required = true)
    protected IdentifiersType externalIdentifiers;
    @XmlElement(name = "external-links", required = true)
    protected ExternalLinks externalLinks;
    @XmlElement(required = true)
    protected Targets targets;
    @XmlElement(required = true)
    protected Enzymes enzymes;
    @XmlElement(required = true)
    protected Transporters transporters;
    @XmlElement(required = true)
    protected Carriers carriers;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "updated", required = true)
    protected String updated;
    @XmlAttribute(name = "created", required = true)
    protected String created;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the drugbankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugbankId() {
        return drugbankId;
    }

    /**
     * Sets the value of the drugbankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugbankId(String value) {
        this.drugbankId = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the generalReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralReferences() {
        return generalReferences;
    }

    /**
     * Sets the value of the generalReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralReferences(String value) {
        this.generalReferences = value;
    }

    /**
     * Gets the value of the synthesisReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynthesisReference() {
        return synthesisReference;
    }

    /**
     * Sets the value of the synthesisReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynthesisReference(String value) {
        this.synthesisReference = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * Gets the value of the pharmacology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacology() {
        return pharmacology;
    }

    /**
     * Sets the value of the pharmacology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacology(String value) {
        this.pharmacology = value;
    }

    /**
     * Gets the value of the mechanismOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    /**
     * Sets the value of the mechanismOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismOfAction(String value) {
        this.mechanismOfAction = value;
    }

    /**
     * Gets the value of the toxicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToxicity() {
        return toxicity;
    }

    /**
     * Sets the value of the toxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToxicity(String value) {
        this.toxicity = value;
    }

    /**
     * Gets the value of the biotransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiotransformation() {
        return biotransformation;
    }

    /**
     * Sets the value of the biotransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiotransformation(String value) {
        this.biotransformation = value;
    }

    /**
     * Gets the value of the absorption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsorption() {
        return absorption;
    }

    /**
     * Sets the value of the absorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsorption(String value) {
        this.absorption = value;
    }

    /**
     * Gets the value of the halfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalfLife() {
        return halfLife;
    }

    /**
     * Sets the value of the halfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalfLife(String value) {
        this.halfLife = value;
    }

    /**
     * Gets the value of the proteinBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinBinding() {
        return proteinBinding;
    }

    /**
     * Sets the value of the proteinBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinBinding(String value) {
        this.proteinBinding = value;
    }

    /**
     * Gets the value of the routeOfElimination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOfElimination() {
        return routeOfElimination;
    }

    /**
     * Sets the value of the routeOfElimination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOfElimination(String value) {
        this.routeOfElimination = value;
    }

    /**
     * Gets the value of the volumeOfDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeOfDistribution() {
        return volumeOfDistribution;
    }

    /**
     * Sets the value of the volumeOfDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeOfDistribution(String value) {
        this.volumeOfDistribution = value;
    }

    /**
     * Gets the value of the clearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearance() {
        return clearance;
    }

    /**
     * Sets the value of the clearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearance(String value) {
        this.clearance = value;
    }

    /**
     * Gets the value of the secondaryAccessionNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryAccessionNumbers }
     *     
     */
    public SecondaryAccessionNumbers getSecondaryAccessionNumbers() {
        return secondaryAccessionNumbers;
    }

    /**
     * Sets the value of the secondaryAccessionNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryAccessionNumbers }
     *     
     */
    public void setSecondaryAccessionNumbers(SecondaryAccessionNumbers value) {
        this.secondaryAccessionNumbers = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the taxonomy property.
     * 
     * @return
     *     possible object is
     *     {@link Taxonomy }
     *     
     */
    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    /**
     * Sets the value of the taxonomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxonomy }
     *     
     */
    public void setTaxonomy(Taxonomy value) {
        this.taxonomy = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link SynonymsType }
     *     
     */
    public SynonymsType getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynonymsType }
     *     
     */
    public void setSynonyms(SynonymsType value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the salts property.
     * 
     * @return
     *     possible object is
     *     {@link Salts }
     *     
     */
    public Salts getSalts() {
        return salts;
    }

    /**
     * Sets the value of the salts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Salts }
     *     
     */
    public void setSalts(Salts value) {
        this.salts = value;
    }

    /**
     * Gets the value of the brands property.
     * 
     * @return
     *     possible object is
     *     {@link Brands }
     *     
     */
    public Brands getBrands() {
        return brands;
    }

    /**
     * Sets the value of the brands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brands }
     *     
     */
    public void setBrands(Brands value) {
        this.brands = value;
    }

    /**
     * Gets the value of the mixtures property.
     * 
     * @return
     *     possible object is
     *     {@link Mixtures }
     *     
     */
    public Mixtures getMixtures() {
        return mixtures;
    }

    /**
     * Sets the value of the mixtures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mixtures }
     *     
     */
    public void setMixtures(Mixtures value) {
        this.mixtures = value;
    }

    /**
     * Gets the value of the packagers property.
     * 
     * @return
     *     possible object is
     *     {@link Packagers }
     *     
     */
    public Packagers getPackagers() {
        return packagers;
    }

    /**
     * Sets the value of the packagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagers }
     *     
     */
    public void setPackagers(Packagers value) {
        this.packagers = value;
    }

    /**
     * Gets the value of the manufacturers property.
     * 
     * @return
     *     possible object is
     *     {@link Manufacturers }
     *     
     */
    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    /**
     * Sets the value of the manufacturers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturers }
     *     
     */
    public void setManufacturers(Manufacturers value) {
        this.manufacturers = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link Prices }
     *     
     */
    public Prices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prices }
     *     
     */
    public void setPrices(Prices value) {
        this.prices = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link Categories }
     *     
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categories }
     *     
     */
    public void setCategories(Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the affectedOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOrganisms }
     *     
     */
    public AffectedOrganisms getAffectedOrganisms() {
        return affectedOrganisms;
    }

    /**
     * Sets the value of the affectedOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOrganisms }
     *     
     */
    public void setAffectedOrganisms(AffectedOrganisms value) {
        this.affectedOrganisms = value;
    }

    /**
     * Gets the value of the dosages property.
     * 
     * @return
     *     possible object is
     *     {@link Dosages }
     *     
     */
    public Dosages getDosages() {
        return dosages;
    }

    /**
     * Sets the value of the dosages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dosages }
     *     
     */
    public void setDosages(Dosages value) {
        this.dosages = value;
    }

    /**
     * Gets the value of the atcCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AtcCodes }
     *     
     */
    public AtcCodes getAtcCodes() {
        return atcCodes;
    }

    /**
     * Sets the value of the atcCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcCodes }
     *     
     */
    public void setAtcCodes(AtcCodes value) {
        this.atcCodes = value;
    }

    /**
     * Gets the value of the ahfsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AhfsCodes }
     *     
     */
    public AhfsCodes getAhfsCodes() {
        return ahfsCodes;
    }

    /**
     * Sets the value of the ahfsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AhfsCodes }
     *     
     */
    public void setAhfsCodes(AhfsCodes value) {
        this.ahfsCodes = value;
    }

    /**
     * Gets the value of the patents property.
     * 
     * @return
     *     possible object is
     *     {@link Patents }
     *     
     */
    public Patents getPatents() {
        return patents;
    }

    /**
     * Sets the value of the patents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patents }
     *     
     */
    public void setPatents(Patents value) {
        this.patents = value;
    }

    /**
     * Gets the value of the foodInteractions property.
     * 
     * @return
     *     possible object is
     *     {@link FoodInteractions }
     *     
     */
    public FoodInteractions getFoodInteractions() {
        return foodInteractions;
    }

    /**
     * Sets the value of the foodInteractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodInteractions }
     *     
     */
    public void setFoodInteractions(FoodInteractions value) {
        this.foodInteractions = value;
    }

    /**
     * Gets the value of the drugInteractions property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractions }
     *     
     */
    public DrugInteractions getDrugInteractions() {
        return drugInteractions;
    }

    /**
     * Sets the value of the drugInteractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractions }
     *     
     */
    public void setDrugInteractions(DrugInteractions value) {
        this.drugInteractions = value;
    }

    /**
     * Gets the value of the proteinSequences property.
     * 
     * @return
     *     possible object is
     *     {@link ProteinSequences }
     *     
     */
    public ProteinSequences getProteinSequences() {
        return proteinSequences;
    }

    /**
     * Sets the value of the proteinSequences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProteinSequences }
     *     
     */
    public void setProteinSequences(ProteinSequences value) {
        this.proteinSequences = value;
    }

    /**
     * Gets the value of the calculatedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getCalculatedProperties() {
        return calculatedProperties;
    }

    /**
     * Sets the value of the calculatedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setCalculatedProperties(PropertiesType value) {
        this.calculatedProperties = value;
    }

    /**
     * Gets the value of the experimentalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getExperimentalProperties() {
        return experimentalProperties;
    }

    /**
     * Sets the value of the experimentalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setExperimentalProperties(PropertiesType value) {
        this.experimentalProperties = value;
    }

    /**
     * Gets the value of the externalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersType }
     *     
     */
    public IdentifiersType getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the externalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersType }
     *     
     */
    public void setExternalIdentifiers(IdentifiersType value) {
        this.externalIdentifiers = value;
    }

    /**
     * Gets the value of the externalLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalLinks }
     *     
     */
    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    /**
     * Sets the value of the externalLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLinks }
     *     
     */
    public void setExternalLinks(ExternalLinks value) {
        this.externalLinks = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link Targets }
     *     
     */
    public Targets getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targets }
     *     
     */
    public void setTargets(Targets value) {
        this.targets = value;
    }

    /**
     * Gets the value of the enzymes property.
     * 
     * @return
     *     possible object is
     *     {@link Enzymes }
     *     
     */
    public Enzymes getEnzymes() {
        return enzymes;
    }

    /**
     * Sets the value of the enzymes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enzymes }
     *     
     */
    public void setEnzymes(Enzymes value) {
        this.enzymes = value;
    }

    /**
     * Gets the value of the transporters property.
     * 
     * @return
     *     possible object is
     *     {@link Transporters }
     *     
     */
    public Transporters getTransporters() {
        return transporters;
    }

    /**
     * Sets the value of the transporters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transporters }
     *     
     */
    public void setTransporters(Transporters value) {
        this.transporters = value;
    }

    /**
     * Gets the value of the carriers property.
     * 
     * @return
     *     possible object is
     *     {@link Carriers }
     *     
     */
    public Carriers getCarriers() {
        return carriers;
    }

    /**
     * Sets the value of the carriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carriers }
     *     
     */
    public void setCarriers(Carriers value) {
        this.carriers = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}