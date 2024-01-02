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
    private long id;
    private String name;
    private String code;


    public Region (long id){
        this.id = id;
    }


    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String toString() {
        return "Region{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
