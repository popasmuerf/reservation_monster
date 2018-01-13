package io.thirdplanet.reservation_monster.service_interfaces;

import io.thirdplanet.reservation_monster.repo_interfaces.Repository;

/**
 * Created by mikeyb on 1/13/18.
 */
public abstract class ReadOnlyBaseService<TE,T> {
    private Repository<TE,T> repository ;
    public ReadOnlyBaseService(Repository<TE,T> repository){
        this.repository = repository;
    }
    //.............
}
