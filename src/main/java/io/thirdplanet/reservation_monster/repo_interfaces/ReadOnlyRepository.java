package io.thirdplanet.reservation_monster.repo_interfaces;

import io.thirdplanet.reservation_monster.dao.Entity;

import java.util.Collection;

/**
 * Created by mikeyb on 1/13/18.
 */
public interface ReadOnlyRepository<TE,T> {
    boolean contains(T id);
    Entity get(T id);
    Collection<TE> getAll() ;
}
