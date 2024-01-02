package fr.EmiliePaniagua.poec.repository;

import fr.EmiliePaniagua.poec.entity.EntityInterface;

import java.sql.ResultSet;

public class DepartmentRepository extends AbstractRepository {

    private static DepartmentRepository instance ;


    protected DepartmentRepository() {
        super("department");
    }

    public static DepartmentRepository getInstance(){
        if( instance == null){
            instance = new DepartmentRepository();

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
