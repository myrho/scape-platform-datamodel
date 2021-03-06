package eu.scapeproject.model.metadata.gbs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.scapeproject.model.jaxb.MetadataAdapter;
import eu.scapeproject.model.metadata.TechnicalMetadata;

@XmlRootElement(name = "productionNotes", namespace = "http://books.google.com/gbs")
public class ProductionNotes extends TechnicalMetadata{
    @XmlElement(name = "badPages", namespace = "http://books.google.com/gbs")
    private final String badPages;
    @XmlElement(name = "missingPages", namespace = "http://books.google.com/gbs")
    private final String missingPages;
    @XmlElement(name = "tightBoundPages", namespace = "http://books.google.com/gbs")
    private final String tightBoundPages;

    private ProductionNotes(){
    	super(MetadataType.GOOGLE_PRODUCTION_NOTES);
        this.badPages = null;
        this.missingPages = null;
        this.tightBoundPages = null;
    }
    
    private ProductionNotes(Builder b) {
    	super(MetadataType.GOOGLE_PRODUCTION_NOTES);
        this.badPages = b.badPages;
        this.missingPages = b.missingPages;
        this.tightBoundPages = b.tightBoundPages;
    }

    public String getBadPages() {
        return badPages;
    }

    public String getMissingPages() {
        return missingPages;
    }

    public String getTightBoundPages() {
        return tightBoundPages;
    }

    public static class Builder {
        private String badPages;
        private String missingPages;
        private String tightBoundPages;

        public Builder badPages(String badPages) {
            this.badPages = badPages;
            return this;
        }

        public Builder tightBoundPages(String tightBoundPages) {
            this.tightBoundPages = tightBoundPages;
            return this;
        }

        public Builder missingPages(String missingPages) {
            this.missingPages = missingPages;
            return this;
        }
        
        public ProductionNotes build(){
            return new ProductionNotes(this);
        }
    }
}
