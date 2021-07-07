package com.example.hotelreservation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Facilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String displayName;

    public Facilities(){}
    public Facilities(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName);

        /*
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + id);
        result = prime * result *((displayName == null) ? 0 : displayName.hashCode());
        return result;
         */
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Facilities other = (Facilities) obj;
        if(id != other.id)
            return false;
        if(displayName == null){
            if(other.displayName !=null)
                return false;
        }
        else if(!displayName.equals(other.displayName))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
