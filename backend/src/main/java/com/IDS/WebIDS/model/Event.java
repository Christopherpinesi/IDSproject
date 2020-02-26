package com.IDS.WebIDS.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Event {
    private final UUID idevent;
    @NotBlank
    private String title;
    private String place;
    private Boolean bond;
    private String description;
    private Boolean confirm;
    private String formevent;

    public Event(@JsonProperty("idevent") UUID idevent,
                 @JsonProperty("title") String title,
                 @JsonProperty("place") String place,
                 @JsonProperty("bond") Boolean bond,
                 @JsonProperty("description") String description,
                 @JsonProperty("confirm") Boolean confirm,
                 @JsonProperty("fromevent") String formevent){
        this.idevent = idevent;
        this.title = title;
        this.place = place;
        this.bond = bond;
        this.description = description;
        this.confirm = confirm;
        this.formevent = formevent;
    }
    public UUID getIdevent() {
        return idevent;
    }
    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public Boolean getBond() {
        return bond;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getConfirm() {
        return confirm;
    }

    public String getFormevent() {
        return formevent;
    }
}
