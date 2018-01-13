package io.thirdplanet.reservation_monster.repositories;

import io.thirdplanet.reservation_monster.dao.Entity;
import io.thirdplanet.reservation_monster.dao.Restaurant;
import io.thirdplanet.reservation_monster.repo_interfaces.RestaurantRepository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mikeyb on 1/13/18.
 */
public class InMemRestaurantRepository implements RestaurantRepository {
    private Map<String, Restaurant> entities ;
    public InMemRestaurantRepository(){
        entities = new LinkedHashMap<>();
    }

    @Override
    public boolean ContainsName(Object name) {
        String strName = (String)name ;
        return entities.containsKey(name);
    }


    @Override
    public void add(Object entity) {
        Restaurant restaurant = (Restaurant) entity;
        entities.put(restaurant.getName(),restaurant);
    }

    @Override
    public void remove(Object id) {
        String strId = (String) id ;
        if (entities.containsKey(strId)){
            entities.remove(id);
        }
    }

    @Override
    public void update(Object entity) {
        Restaurant restaurant  = (Restaurant) entity ;
        if (entities.containsKey(restaurant.getName())){
            entities.put(restaurant.getName(),restaurant);
        }
    }

    @Override
    public boolean contains(Object id){
        throw new UnsupportedOperationException("Not supported yet");
        //To change body of generated methods choose Tools | Templates
    }

    @Override
    public Entity get(Object id) {
        throw new UnsupportedOperationException("Not supported yet");
        //To change body of generated methods choose Tools | Templates
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
