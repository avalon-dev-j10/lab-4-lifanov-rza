
package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Developer implements Person {
    private String name;
    private Date birthDate;

    public Developer(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        Developer anotherDeveloper = (Developer) o;
        int result = name.compareTo(anotherDeveloper.name);
        if (result == 0) result = birthDate.compareTo(anotherDeveloper.birthDate);
        return result; 
    }
    
    @Override
    public String toString() {
        return "Имя: " + name + "\tДата рождения: " + birthDate.toString();
    }
    
    
}
