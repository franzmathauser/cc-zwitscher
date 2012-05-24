package edu.hm.cc.zwitscher.backend.ressources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@XmlRootElement(name = "Item")
@JsonSerialize(include = Inclusion.NON_NULL)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
public class ItemRessource {

    private String title;
    private String type;
    private List<PropertyRessource> properties;

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public List<PropertyRessource> getProperties() {
        return properties;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProperties(List<PropertyRessource> properties) {
        this.properties = properties;
    }

}
