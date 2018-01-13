package io.thirdplanet.reservation_monster.dao;

import java.math.BigInteger;

/**
 * Created by mikeyb on 1/13/18.
 */
public class Table extends BaseEntity<BigInteger> {
    private int capacity ;
    public Table(String name, BigInteger id, int capacity){
        super(id,name);
        this.capacity = capacity ;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity ;
    }
    public int getCapacity(){
        return capacity ;
    }

}
