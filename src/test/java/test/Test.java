package test;

import java.io.IOException;

public class Test {

    private final ConstructorBasedObjectMapper objectMapper = new ConstructorBasedObjectMapper();

    @org.junit.Test
    public void test() throws IOException {
        String jsonInput = "{\"eventDto\": {\"name\":\"saber\",\"lastname\":\"mylastname\"} }";

        MessageDto result = objectMapper.readValue(jsonInput, MessageDto.class);

        System.out.println(result);
    }
}
