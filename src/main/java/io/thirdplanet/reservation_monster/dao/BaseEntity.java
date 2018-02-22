package io.thirdplanet.reservation_monster.dao;

/**
 * Created by mikeyb on 1/13/18.
 */
public abstract class BaseEntity<T> extends Entity<T> {
    private T id ;
    public BaseEntity(T id, String name ) {
        super.id = id;
        super.name = name;
    }
    public void setId(T id){
        this.id = id ;
    }
    public T getId(){
        return id ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }
}
