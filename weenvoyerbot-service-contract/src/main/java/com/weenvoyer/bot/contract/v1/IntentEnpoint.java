package com.weenvoyer.bot.contract.v1;

import org.springframework.web.bind.annotation.RequestBody;
import com.weenvoyer.bot.contract.v1.facade.IntentFacade;
import com.weenvoyer.bot.contract.v1.response.IntentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("v1")
public class IntentEnpoint {
    @Autowired
    private IntentFacade intentFacade;

    @POST
    @Path("/intent")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public IntentResponse intent(@RequestBody Object body){
        return intentFacade.intent(body);
    }
}
