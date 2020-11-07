package rest;

import org.json.JSONObject;

import javax.ws.rs.*;

import javax.ws.rs.Path;

@Path("/v1/tracks")
public class Track {
    @POST
    public String getTrackInfo(
             @FormParam("artist") String artist
            ,@FormParam("title") String title
    ) {
        JSONObject result = new JSONObject();
        result.put("artist", artist);
        result.put("title", title);
        
        return result.toString();
    }
}
