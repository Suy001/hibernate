package com.suy.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author suy
 */
@Entity
@Table(name = "user_info")
public class User implements Serializable {
    private static final long serialVersionUID = -8799474066159451675L;

    @Id
    @Column(name = "user_id", length = 12)
    private String id;

    @Column(name = "user_name", length = 100)
    private String name;

    @Column(name = "user_age", length = 100)
    private String age;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


}
