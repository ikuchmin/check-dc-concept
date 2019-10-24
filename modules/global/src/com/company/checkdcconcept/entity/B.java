package com.company.checkdcconcept.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "CHECKDCCONCEPT_B")
@Entity(name = "checkdcconcept_B")
public class B extends StandardEntity {
    private static final long serialVersionUID = -2325281315944855669L;

    @Column(name = "NAME")
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}