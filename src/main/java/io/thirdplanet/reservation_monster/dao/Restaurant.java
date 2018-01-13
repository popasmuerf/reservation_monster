package io.thirdplanet.reservation_monster.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikeyb on 1/13/18.
 */
public class Restaurant extends BaseEntity<String> {
    private List<Table> tables = new ArrayList<>();
    public Restaurant(String name, String id, List<Table> tables){
        super(id,name);
        this.tables = tables ;
    }
    public void setTables(List<Table> tables){
        this.tables = tables ;
    }
    public List<Table> getTables(){
        return tables;
    }
}
