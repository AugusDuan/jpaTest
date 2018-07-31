package com.jpa.vo;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Poetry implements Serializable {

    private static final long serialVersionUID = -2743230230981482358L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String title;
    private String summary;
    private String content;

    @ManyToOne
    @JoinColumn(name = "authorCN_id")
    @JsonBackReference
    private Author author;

    public Poetry() {
    }

    public Poetry(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Poetry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                '}';
    }
}