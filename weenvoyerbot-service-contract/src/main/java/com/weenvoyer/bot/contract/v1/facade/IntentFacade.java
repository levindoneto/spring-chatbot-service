package com.weenvoyer.bot.contract.v1.facade;

import com.weenvoyer.bot.contract.v1.client.IntentNplClient;
import com.weenvoyer.bot.contract.v1.response.IntentResponse;
import com.weenvoyer.bot.contract.v1.response.IntentResponseObject;
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
    public IntentResponseObject intent(Object body) {
        IntentResponseObject response = intentClient.getIntentResponse(body);
        return formatResponse(response);
    }

    /* This formats the beginning of the output by removing all the symbols before the first letter or number.
     * @Parameter: String with the output.
     * @Return: String with the formatted output.
     */
    private String formatBeginningOutput(String output) {
        String outputBeginningFormatted = output.replaceAll("^[^a-zA-Z0-9]*", "");
        outputBeginningFormatted = outputBeginningFormatted.substring(0,1).toUpperCase() + outputBeginningFormatted.substring(1);
        return outputBeginningFormatted.trim();
    }

    /* This formats the response from  Intent by removing all the @String which
     * do not have any character on the left side of the at.
     * @Parameter: IntentResponseObject with the intent response.
     * @Return: IntentResponseObject with the formatted intent response.
     */
    private IntentResponseObject formatResponse(IntentResponseObject response) {
        // Object.output -> String
        String output = response.getOutput().replaceAll("(?<![a-z])(@+[a-zA-Z0-9]+)+", "");
        // Object.output <- formatted output
        response.setOutput(formatBeginningOutput(output));

        return response;
    }
}