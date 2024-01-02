package fr.EmiliePaniagua.poec.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class City implements EntityInterface{


    private Long id;
    private Department department;
    private String siren;
    private int population;
    private String name;
    private String code;



    private List<PostalCode> postalCodes;

    public void addPostalCode(PostalCode postalCode){
        postalCodes.add(postalCode);
    }

    @Override
    public Long getId() {
        return null;
    }
}
