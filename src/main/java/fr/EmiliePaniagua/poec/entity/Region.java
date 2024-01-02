package fr.EmiliePaniagua.poec.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Region implements EntityInterface {
    private long Id;
    private String name;
    private String code;





    @Override
    public Long getId() {
        return null;
    }
}
