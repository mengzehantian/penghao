package com.halo.entity;

public class Admin {

    private String id;
    private String name;

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public Admin setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public Admin(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Admin(String id) {
        this.id = id;
    }


}
