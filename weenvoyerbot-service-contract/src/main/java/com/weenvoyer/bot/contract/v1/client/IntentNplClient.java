package com.weenvoyer.bot.contract.v1.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IntentNplClient {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${intent.api.host}")
    private String url; // URL set on the dev/prod properties

    /* This method gets the response as a string from Intent.
     * @Parameter: Object with the request body.
     * @Return: String response.
     */
    public String getIntentResponse(Object body) {
        return restTemplate.postForObject(url, body, String.class);
    }

}
