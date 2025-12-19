package br.com.mathew.model;

import java.util.Map;

public class Action {

    private final String type;
    private final Map<String, Object> params;

    public String getType() {
        return type;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public Action(String type, Map<String, Object> params) {
        this.type = type;
        this.params = params;
    }
}
