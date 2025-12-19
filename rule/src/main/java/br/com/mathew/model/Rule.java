package br.com.mathew.model;

import br.com.mathew.model.enums.MatchType;

import java.util.List;
import java.util.UUID;

public class Rule {

    private UUID id;
    private String trigger;
    private MatchType match;
    private List<Condition> conditions;
    private List<Action> actions;
    private boolean enabled;

    public UUID getId() {
        return id;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<Action> getActions() {
        return actions;
    }

    public MatchType getMatch() {
        return match;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public String getTrigger() {
        return trigger;
    }
}
