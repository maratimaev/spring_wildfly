package ru.bellintegrator;

import org.springframework.stereotype.Service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class LocationsDao {
    @PersistenceContext(unitName = "postgre")
    EntityManager entityManager;

    public void saveLocations(Locations locations){
        entityManager.persist(locations);
    }
}
