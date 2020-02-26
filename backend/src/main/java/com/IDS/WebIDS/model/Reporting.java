package com.IDS.WebIDS.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Reporting {
    private final UUID idreporting;
            @NotBlank
    public Reporting(@JsonProperty("idreporting") UUID idreporting){
                this.idreporting = idreporting;
            }

    public UUID getIdreporting() {
        return idreporting;
    }
}
