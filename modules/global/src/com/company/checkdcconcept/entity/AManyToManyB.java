package com.company.checkdcconcept.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "CHECKDCCONCEPT_A_MANY_TO_MANY_B")
@Entity(name = "checkdcconcept_AManyToManyB")
public class AManyToManyB extends StandardEntity {
    private static final long serialVersionUID = 1089922577994525977L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "A_ID")
    protected A a;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "B_ID")
    protected B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}