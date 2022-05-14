package com.suy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author suy
 */
@Entity
@Table(name = "product_info")
public class Product implements Serializable {
    private static final long serialVersionUID = -8799474066159451675L;

    @Id
    @Column(name = "product_id", length = 12)
    private String id;

    @Column(name = "product_name", length = 100)
    private String name;

    @Column(name = "product_age", length = 100)
    private String age;

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
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
}
