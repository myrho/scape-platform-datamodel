package eu.scapeproject.model.metadata.premis;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.metadata.RightsMetadata;

@XmlRootElement(name="rights",namespace="http://www.loc.gov/standards/premis")
public class PremisRightsMetadata extends RightsMetadata{
    @XmlElement(name="rightsStatements",namespace="http://www.loc.gov/standards/premis")
    private final List<RightsStatement> rightsStatements;

    private PremisRightsMetadata(){
        super(Type.PREMIS);
        this.rightsStatements=null;
    }

    public PremisRightsMetadata(List<RightsStatement> rightsStatements) {
        super(Type.PREMIS);
        this.rightsStatements = rightsStatements;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PremisRightsMetadata other = (PremisRightsMetadata) obj;
        if (rightsStatements == null) {
            if (other.rightsStatements != null)
                return false;
        } else if (!rightsStatements.equals(other.rightsStatements))
            return false;
        return true;
    }

    public List<RightsStatement> getRightsStatements() {
        return rightsStatements;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rightsStatements == null) ? 0 : rightsStatements.hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "PremisRightsMetadata [rightsStatements=" + rightsStatements
				+ "]";
	}
    
    

}
