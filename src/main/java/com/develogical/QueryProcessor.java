package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("Imperial")) {
            return "Imperial College is a university in London.";
        }
        return "";
    }
}
