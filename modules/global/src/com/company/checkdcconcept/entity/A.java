package com.company.checkdcconcept.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "CHECKDCCONCEPT_A")
@Entity(name = "checkdcconcept_A")
public class A extends StandardEntity {
    private static final long serialVersionUID = 7823713881115959767L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @OneToMany(mappedBy = "a")
    protected List<AManyToManyB> bs;

    public List<AManyToManyB> getBs() {
        return bs;
    }

    public void setBs(List<AManyToManyB> bs) {
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}