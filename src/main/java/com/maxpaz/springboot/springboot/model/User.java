package com.maxpaz.springboot.springboot.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "user")
@NamedQuery(name = "User.getAll", query = "SELECT user from User user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Pattern(regexp = "[A-Za-z]{3,20}", message = "You have to use value from 3 to 20 characters")
    private String name;

    @Pattern(regexp = "[A-Za-z]{3,20}", message = "You have to use value from 3 to 20 characters")
    @Column(name = "country")
    private String country;

    @Min(value = 0,message = "Your age cannot be less than zero (0)")
    @Max(value = 150,message = "Your age cannot be greater than one hundred fifty (150)")
    @Column(name = "age")
    private byte age;

    public User(String name, String country, byte age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}