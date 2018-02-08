package io.thirdplanet.reservation_monster.services;

import io.thirdplanet.reservation_monster.dao.Restaurant;
import io.thirdplanet.reservation_monster.repo_interfaces.RestaurantRepository;
import io.thirdplanet.reservation_monster.service_interfaces.BaseService;

import java.math.BigInteger;

public class RestaurantService extends BaseService<Restaurant,BigInteger> {
    private RestaurantRepository<Restaurant,String> restaurantRepository ;

    public RestaurantService(RestaurantRepository repository) {
        super(repository);
        restaurantRepository = repository;
    }
    public void add(Restaurant restaurant) throws Exception {
        if(restaurantRepository.ContainsName(restaurant.getName())){
            throw new Exception(String.format("There is already a product with this name - %s", restaurant.getName()));
        }
        if(restaurant.getName() == null || "".equals(restaurant.getName()) ){
            throw new Exception("Restaurant name cannot be null or empty string");
        }
        super.add(restaurant);
    }


}
