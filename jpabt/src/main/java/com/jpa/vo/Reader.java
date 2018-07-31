package com.jpa.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Reader implements Serializable {

    private static final long serialVersionUID = 4074367019988114836L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @ManyToMany
    @JoinTable(name = "PoetryAndReader", joinColumns ={@JoinColumn(name = "reader_id")},
            inverseJoinColumns = {@JoinColumn(name = "poetry_id")})
    private List<Poetry> poetryList;

    public Reader() {

    }

    public Reader(String name, Integer age, List<Poetry> poetryList) {
        this.name = name;
        this.age = age;
        this.poetryList = poetryList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Poetry> getPoetryList() {
        return poetryList;
    }

    public void setPoetryList(List<Poetry> poetryList) {
        this.poetryList = poetryList;
    }
}
