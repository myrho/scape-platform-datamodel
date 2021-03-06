package eu.scapeproject.model.metadata;

import javax.xml.bind.annotation.XmlSeeAlso;

import eu.scapeproject.dto.mets.MetsMetadata;
import eu.scapeproject.model.metadata.premis.PremisRightsMetadata;

@XmlSeeAlso({ PremisRightsMetadata.class })
public abstract class RightsMetadata  extends MetsMetadata{
    private Type type;

    @SuppressWarnings("unused")
    private RightsMetadata() {
        super();
    }

    public RightsMetadata(Type type) {
        super();
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        PREMIS;
    }

	@Override
	public String toString() {
		return "RightsMetadata [type=" + type + "]";
	}
    
    
    
}
