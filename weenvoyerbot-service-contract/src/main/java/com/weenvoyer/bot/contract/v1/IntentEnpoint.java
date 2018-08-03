package com.weenvoyer.bot.contract.v1;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.weenvoyer.bot.contract.v1.response.IntentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("v1")
public class IntentEnpoint {

    @Autowired
    private RestTemplate restTemplate;

    @Value("#{intent.api.host}")
    private String intentUrl;

    @POST
    @Path("/intent")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public  IntentResponse intent(HashMap body){
        // Call intent
        // String ret = restTemplate.post(intentUrl, body, String.class)
        // return new IntentResponse(ret)
        String ret = "";
        return null;
    }
}
