package edu.hm.cc.zwitscher.backend;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;

import edu.hm.cc.zwitscher.backend.ressources.FeedRessource;
import edu.hm.cc.zwitscher.backend.ressources.ItemRessource;
import edu.hm.cc.zwitscher.backend.ressources.PropertyRessource;

@Component("feedService")
@Path("/feed")
public class FeedService {
    public final static String DATE_FORMAT = "dd.MM.yyyy kk:mm:ss";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FeedRessource getFeed() {
        DateFormatter formatter = new DateFormatter(DATE_FORMAT);

        List<ItemRessource> items = new ArrayList<ItemRessource>();

        List<PropertyRessource> propertiesItem1 = new ArrayList<PropertyRessource>();
        PropertyRessource propertyItem1 = new PropertyRessource();
        propertyItem1.setAuthor("Max Mustermann");
        propertyItem1.setMessage("Hier kommt eine Nachricht");
        propertyItem1.setId(1);
        propertyItem1.setLink("http://www.google.de");
        propertyItem1.setSource("facebook");
        propertyItem1.setCreationDateTime(formatter.print(Calendar
                .getInstance().getTime(), Locale.getDefault()));

        propertiesItem1.add(propertyItem1);

        ItemRessource item = new ItemRessource();
        item.setProperties(propertiesItem1);
        item.setTitle("A message item");
        item.setType("object");
        items.add(item);

        FeedRessource feed = new FeedRessource();
        feed.setDescription("Zwitscher message stream");
        feed.setItems(items);

        return feed;
    }

}
