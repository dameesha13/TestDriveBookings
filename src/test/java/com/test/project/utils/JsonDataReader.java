package com.test.project.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonDataReader {

    public JSONObject getJSONTestData() throws Exception {
        try {
            JSONParser parser = new JSONParser();
            JSONObject js = (JSONObject) parser.parse(new FileReader("./src/test/resources/data/TestData"));
            return js;
        } catch (Exception e) {
            throw e;
        }
    }
}
