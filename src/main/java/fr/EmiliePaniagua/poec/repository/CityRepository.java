package fr.EmiliePaniagua.poec.repository;

import fr.EmiliePaniagua.poec.entity.City;
import fr.EmiliePaniagua.poec.entity.Department;
import fr.EmiliePaniagua.poec.entity.EntityInterface;
import fr.EmiliePaniagua.poec.entity.Region;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRepository extends AbstractRepository<City> {

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
    protected City update(City object) {
        return null;
    }

    @Override
    protected City insert(City object) {
        return null;
    }

    @Override
    protected City getObject(ResultSet rs) {


        City city = new City();

        try{
            city.setId(rs.getLong("id"));
            city.setName(rs.getString("name"));
            city.setCode(rs.getString("code"));
            city.setSiren(rs.getString("siren"));
            city.setPopulation(rs.getInt("population"));




        }catch(SQLException e){
            System.out.println("Something went wrong getting City" + e.getMessage());
        }
        return city;
    }



}

