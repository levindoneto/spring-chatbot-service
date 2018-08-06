package com.weenvoyer.bot.contract.v1.facade;

import com.weenvoyer.bot.contract.v1.client.IntentNplClient;
import com.weenvoyer.bot.contract.v1.response.IntentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by levindoneto on 06/08/18.
 */

@Component
public class IntentFacade {
    @Autowired
    private IntentNplClient intentClient;

    /* This method gets the response from intent formatted.
     * @Parameter: Object with the request body.
     * @Return: Intent response.
     */
    public IntentResponse intent(Object body) {
        String response = intentClient.getIntentResponse(body);
        return new IntentResponse(formatResponse(response));
    }

    /* This formats the response from  Intent by removing all the @String which
     * do not have any character on the left side of the at.
     * @Parameter: String with the intent response.
     * @Return: String with the formatted intent response.
     */
    private String formatResponse(String response) {
        return response.replaceAll("(?<![a-z])(@+[a-zA-Z0-9]+)+", "");
    }

}