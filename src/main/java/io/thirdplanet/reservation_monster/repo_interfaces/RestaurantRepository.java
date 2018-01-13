package io.thirdplanet.reservation_monster.repo_interfaces;

import io.thirdplanet.reservation_monster.dao.Restaurant;

/**
 * Created by mikeyb on 1/13/18.
 */
public interface RestaurantRepository<Restaurnt,String> extends Repository<Restaurant,String>{
boolean ContainsName(String name );
}
