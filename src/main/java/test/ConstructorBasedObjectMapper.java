package test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

public class ConstructorBasedObjectMapper extends ObjectMapper {

    public ConstructorBasedObjectMapper() {
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));
    }
}
