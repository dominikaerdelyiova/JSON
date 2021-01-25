package sk.kosickaakademia.erdelyiovad.regex.json;

import org.json.simple.JSONObject;

public class EncodeJSON {
    public static void main(String[] args) {
        JSONObject obj = new JsonObject();
            object.put("title", "Anna Karenina");
            object.put("author", "Leo Tolstoj");
            object.put("year", "1978");
            object.put("active", true);
        JSONArray book = new JSONArray();
            book.add("drama");
            book.add("novel");
            book.add("fiction");
            book.add("poetry");
        object.put("book");

        System.out.println(object);


    }

}
