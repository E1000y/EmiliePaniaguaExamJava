package fr.EmiliePaniagua.poec.repository;

import fr.EmiliePaniagua.poec.entity.Region;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionRepository extends AbstractRepository<Region> {

    public static RegionRepository instance;

    public RegionRepository() {
        super("region");
    }

    public static RegionRepository getInstance(){
        if(instance == null){
            instance = new RegionRepository();
        }
        return instance;
    }

    @Override
    protected Region update(Region object) {
        return null;
    }

    @Override
    protected Region insert(Region object) {
        return null;
    }

    @Override
    protected Region getObject(ResultSet rs) {
       Region region = new Region();

       try{
           region.setId(rs.getLong("id"));
           region.setName(rs.getString("name"));
           region.setCode(rs.getString("code"));
       }catch(SQLException e){
           System.out.println("Something went wrong getting region : " + e.getMessage());
       }

       return region;
    }
}
