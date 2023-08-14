package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;

@Getter
public class PostCalenderFearsObject {
    @JsonProperty("next")
    private JsonNode next;
    @JsonProperty("request")
    private JsonNode request;

}
