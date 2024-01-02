package fr.EmiliePaniagua.poec.repository;

import fr.EmiliePaniagua.poec.entity.EntityInterface;

import java.sql.ResultSet;

public class CityRepository extends AbstractRepository {

    private static CityRepository instance;

    protected CityRepository() {
        super("City");
    }

    public static CityRepository getInstance(){
        if(instance == null){
            instance = new CityRepository();
        }
        return instance;
    }

    @Override
    protected EntityInterface update(EntityInterface object) {
        return null;
    }

    @Override
    protected EntityInterface insert(EntityInterface object) {
        return null;
    }

    @Override
    protected EntityInterface getObject(ResultSet rs) {
        return null;
    }
}
