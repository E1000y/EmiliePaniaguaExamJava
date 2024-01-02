package fr.EmiliePaniagua.poec.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PostalCode implements EntityInterface {

    private int id;
    private String code;


    @Override
    public Long getId() {
        return null;
    }
}
