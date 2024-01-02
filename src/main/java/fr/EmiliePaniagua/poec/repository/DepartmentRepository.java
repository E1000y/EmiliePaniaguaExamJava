package fr.EmiliePaniagua.poec.repository;

import fr.EmiliePaniagua.poec.entity.Department;
import fr.EmiliePaniagua.poec.entity.EntityInterface;
import fr.EmiliePaniagua.poec.entity.Region;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository extends AbstractRepository<Department> {

    private static DepartmentRepository instance ;


    public DepartmentRepository() {
        super("department");
    }

    public static DepartmentRepository getInstance(){
        if( instance == null){
            instance = new DepartmentRepository();

        }
        return instance;

    }


    @Override
    protected Department update(Department object) {
        return null;
    }

    @Override
    protected Department insert(Department object) {
        return null;
    }

    @Override
    protected Department getObject(ResultSet rs) {
        Department department = new Department();

        try{
            department.setId((int) rs.getLong("id"));
            department.setName((rs.getString("name")));
            department.setCode(rs.getString("code"));
        }catch(SQLException e){
            System.out.println("Something went wrong with department : " + e.getMessage());
        }
        return department;
    }


    public List<Department> findDepartmentsByRegion(Region region){

        List<Department> departmentsInRegion = new ArrayList<>();

        //"Select * from departments where region_id = ?"

        try{

            String query = "Select * from departments where region_id = ?";
            PreparedStatement pstmt =connection.prepareStatement(query);
            pstmt.setLong(1,region.getId());
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                departmentsInRegion.add(getObject(rs));
            }

        }catch(SQLException e){
            System.out.println("Error getting departments from Region");
        }






        return departmentsInRegion;








    }



}
