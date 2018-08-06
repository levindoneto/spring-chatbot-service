package com.weenvoyer.bot.contract.v1.facade;

import com.weenvoyer.bot.contract.v1.response.IntentResponse;

/**
 * Created by levindoneto on 06/08/18.
 */
public class IntentFacade {

    public IntentFacade() {
    }

    public IntentResponse formatIntentResponse(IntentResponse intentResponse) {
        // Call intent
        // String ret = restTemplate.post(intentUrl, body, String.class)
        String response = "@name test @name test@localhost";
        return new IntentResponse(response);
    }

}