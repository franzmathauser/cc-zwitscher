package edu.hm.cc.zwitscher.backend;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;

@Component("timeService")
@Path("/time")
public class TimerService {
    public final static String DATE_FORMAT = "dd.MM.yyyy hh:mm:ss";

    @GET
    @Produces("text/plain")
    public String getDateTime() {
        DateFormatter formatter = new DateFormatter(DATE_FORMAT);
        return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
    }
}
