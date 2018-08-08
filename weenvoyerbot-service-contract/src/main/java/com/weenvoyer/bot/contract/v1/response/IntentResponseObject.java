package com.weenvoyer.bot.contract.v1.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntentResponseObject {

    private String intention;
    private String output;
    private Map<String, Object> context;
}
