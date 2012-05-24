package edu.hm.cc.zwitscher.backend.ressources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@XmlRootElement(name = "Feed")
@JsonSerialize(include = Inclusion.NON_NULL)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
public class FeedRessource {

    private String description;

    private List<ItemRessource> items;

    public String getDescription() {
        return description;
    }

    public List<ItemRessource> getItems() {
        return items;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItems(List<ItemRessource> items) {
        this.items = items;
    }

}
