package com.jpa.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "authorCN")
public class Author implements Serializable {

    private static final long serialVersionUID = 4074367019988114836L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "p_name")
    private String name;

    @Column(name = "p_age")
    private Integer age;

    @Transient
    private String error;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wife_id")
    private Wife wife;


    @OneToMany(mappedBy = "author")
    private List<Poetry> poetryList;

    public Author() {
    }

    public Author( String name,Integer age) {
        this.name = name;
        this.age = age;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public List<Poetry> getPoetryList() {
        return poetryList;
    }

    public void setPoetryList(List<Poetry> poetryList) {
        this.poetryList = poetryList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", error='" + error + '\'' +
                ", wife=" + wife +
                '}';
    }
}
