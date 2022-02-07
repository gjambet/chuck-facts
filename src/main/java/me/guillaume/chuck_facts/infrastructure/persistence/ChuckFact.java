package me.guillaume.chuck_facts.infrastructure.persistence;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChuckFact {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String author;

    public ChuckFact() {
        // JPA
    }

    public ChuckFact(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public ChuckFact(String name) {
        this(name, null);
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
