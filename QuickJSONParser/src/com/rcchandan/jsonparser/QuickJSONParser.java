package com.rcchandan.jsonparser;

/**
 * Created by rc_chandan on 17/07/16.
 */
public class QuickJSONParser {

    private String jsonString = "[\n" +
            "{\n" +
            "\"dt\":1468735200,\n" +
            "\"temp\":{\n" +
            "\"day\":30.04,\n" +
            "\"min\":21.53,\n" +
            "\"max\":30.04,\n" +
            "\"night\":21.53,\n" +
            "\"eve\":27.29,\n" +
            "\"morn\":25\n" +
            "},\n" +
            "\"pressure\":926.08,\n" +
            "\"humidity\":74,\n" +
            "\"weather\":[\n" +
            "{\n" +
            "\"id\":500,\n" +
            "\"main\":\"Rain\",\n" +
            "\"description\":\"light rain\",\n" +
            "\"icon\":\"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"speed\":5.51,\n" +
            "\"deg\":274,\n" +
            "\"clouds\":36,\n" +
            "\"rain\":2.43\n" +
            "},]";

    public void printParsedJson () {

    }
}
