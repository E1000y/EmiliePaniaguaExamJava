package fr.EmiliePaniagua.poec.main;

import fr.EmiliePaniagua.poec.entity.Department;
import fr.EmiliePaniagua.poec.entity.Region;
import fr.EmiliePaniagua.poec.repository.DepartmentRepository;

import java.util.List;

public class MainDepartment {

    public static void main(String[] args) {

        DepartmentRepository dr = new DepartmentRepository();

     /*   List<Department> departments = dr.findAll();

        for(Department departement: departments){
            System.out.println(departement.toString());
        }
     */
        Region region1 = new Region(1);

       List<Department> dpts = dr.findDepartmentsByRegion(new Region(1));

          for(Department dpt : dpts )     {
              System.out.println(dpt.toString());
          }


    }
}
