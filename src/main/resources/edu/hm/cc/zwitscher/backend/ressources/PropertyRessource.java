package edu.hm.cc.zwitscher.backend.ressources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@XmlRootElement(name = "Property")
@JsonSerialize(include = Inclusion.NON_NULL)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML,
        MediaType.TEXT_XML })
public class PropertyRessource {

    private Integer id;
    private String author;
    private String message;
    private String link;
    private String source;
    private String creationDateTime;

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public String getLink() {
        return link;
    }

    public String getSource() {
        return source;
    }

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

}
