package br.com.mathew.model;

public class Condition {

    private final String field;
    private final String op;
    private final Object value;

    public String getField() {
        return field;
    }

    public String getOp() {
        return op;
    }

    public Object getValue() {
        return value;
    }

    public Condition(String field, String op, Object value){
        this.field = field;
        this.value = value;
        this.op = op;
    }

}
