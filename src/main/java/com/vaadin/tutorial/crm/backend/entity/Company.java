package com.vaadin.tutorial.crm.backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Company extends AbstractEntity {
    private String name;

    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private List<Contact> employees = new LinkedList<>();

    public Company() {
    }

    public Company(String name) {
        this();
        setName(name);
    }
}

