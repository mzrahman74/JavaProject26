package com.mohammad;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static boolean hasMismatch(String jsonA, String jsonB) {
        try {
            JsonNode a = mapper.readTree(jsonA);
            JsonNode b = mapper.readTree(jsonB);

            return !a.equals(b); // Jackson deep comparison
        } catch (Exception e) {
            return true; // any parsing error = mismatch
        }

    }

}

