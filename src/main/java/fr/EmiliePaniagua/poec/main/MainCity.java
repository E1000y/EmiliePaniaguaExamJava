package fr.EmiliePaniagua.poec.main;

import fr.EmiliePaniagua.poec.entity.City;
import fr.EmiliePaniagua.poec.repository.CityRepository;
import fr.EmiliePaniagua.poec.service.Dump;

import java.util.List;

public class MainCity {

    public static void main(String[] args) {



        CityRepository cr = new CityRepository();
        List<City> cities = cr.findAll();

        for (City city : cities
                ) {

            System.out.println(city.toString());

        }

    }
}
