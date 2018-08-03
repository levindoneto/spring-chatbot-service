package com.weenvoyer.facebot.contract.v1;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.weenvoyer.arch.jersey.ApiExceptionModel;
import com.weenvoyer.arch.locale.annotation.LocaleContext;
//import com.weenvoyer.weenvoyerbot.contract.v1.facade.SendFacebookMessageFacade;
//import com.weenvoyer.weenvoyerbot.contract.v1.model.SendMessage;
//import com.weenvoyer.weenvoyerbot.contract.v1.validator.message.SendMessageValidator;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.Locale;

/**
 * Created by levindoneto on 03/08/18.
 */

@Path("v1")
@Api(value = "WeEnvoyer Api", description = "WeEnvoyer bot service for sending messages")
public class MessageEndpoint {

    //@Autowired
    //private SendFacebookMessageFacade sendFacebookMessageFacade;

    @POST
    @Path("/sendmessages")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Receives a message and a list of facebook Id's. Sends the message to contacts who are registered")
    @ApiResponses(value = {
            @ApiResponse(code = 204, response = Void.class, message = "Success!!"),
            @ApiResponse(code = 400, response = ApiExceptionModel.class, message = "No content received"),
            @ApiResponse(code = 400, response = ApiExceptionModel.class, message = "Authorization header is required"),
            @ApiResponse(code = 400, response = ApiExceptionModel.class, message = "Bot id is required"),
            @ApiResponse(code = 400, response = ApiExceptionModel.class, message = "A list of facebook id's is required"),
            @ApiResponse(code = 400, response = ApiExceptionModel.class, message = "Message is empty"),
            @ApiResponse(code = 500, response = ApiExceptionModel.class, message = "Internal server error")
    })
    public void sendMessages(@ApiParam(hidden = true) @LocaleContext Locale locale, @HeaderParam("client-id") String token, String sendMessage) {
        System.out.println(22);
        //SendMessageValidator.validate(locale, sendMessage, token);
        //sendFacebookMessageFacade.sendFacebookMessages(locale, token, sendMessage);
    }
}
