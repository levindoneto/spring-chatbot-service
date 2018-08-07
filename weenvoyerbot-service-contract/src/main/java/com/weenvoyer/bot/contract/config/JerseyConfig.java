package com.weenvoyer.bot.contract.config;

import com.weenvoyer.arch.jersey.DefaulJerseyConfig;
import com.weenvoyer.bot.contract.v1.IntentEnpoint;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/weenvoyerbot-api")
public class JerseyConfig extends DefaulJerseyConfig {

    public JerseyConfig() {
        super();
        register(IntentEnpoint.class);
    }

}
