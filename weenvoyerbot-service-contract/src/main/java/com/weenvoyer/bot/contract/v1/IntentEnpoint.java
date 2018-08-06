package com.weenvoyer.bot.contract.v1;

import org.springframework.web.client.RestTemplate;

import com.weenvoyer.bot.contract.v1.facade.IntentFacade;
import com.weenvoyer.bot.contract.v1.response.IntentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("v1")
public class IntentEnpoint {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IntentFacade intentFacade;

    @Value("#{intent.api.host}")
    private String intentUrl;

    @POST
    @Path("/intent")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public IntentResponse intent(HashMap body){
        // Call intent
        // String rest = restTemplate.post(intentUrl, body, String.class);
        return intentFacade.formatIntentResponse(null); // TODO: null to responseIntent
    }
}
