package ru.bellintegrator;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class LocationsDao {
    @PersistenceContext(unitName = "simple-jpa")
    EntityManager entityManager;

    public void saveLocations(Locations locations){
        entityManager.persist(locations);
    }
}
