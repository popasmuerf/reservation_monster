package io.thirdplanet.reservation_monster.service_interfaces;

import io.thirdplanet.reservation_monster.repo_interfaces.Repository;

import java.util.Collection;

/**
 * Created by mikeyb on 1/13/18.
 */
public abstract class  BaseService<TE,T> extends ReadOnlyBaseService {
    private Repository<TE,T> _repository ;
    public BaseService(Repository<TE, T> repository){
        super(repository);
        _repository = repository ;
    }
    public void add(TE entity) throws Exception{
        _repository.add(entity);
    }
    public Collection<TE> getAll(){
        return _repository.getAll();
    }
}
