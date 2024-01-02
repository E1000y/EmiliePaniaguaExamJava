package fr.EmiliePaniagua.poec.main;

import fr.EmiliePaniagua.poec.entity.Region;
import fr.EmiliePaniagua.poec.repository.RegionRepository;

import java.util.List;

public class MainRegion {
    public static void main(String[] args) {


        RegionRepository rr = new RegionRepository();

        List<Region> regions = rr.findAll();

        for(Region region : regions){
            System.out.println(region.toString());
        }

    }
}
