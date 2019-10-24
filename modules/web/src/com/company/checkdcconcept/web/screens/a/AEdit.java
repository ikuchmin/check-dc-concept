package com.company.checkdcconcept.web.screens.a;

import com.company.checkdcconcept.entity.AManyToManyB;
import com.company.checkdcconcept.entity.B;
import com.company.checkdcconcept.web.screens.b.BBrowse;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.checkdcconcept.entity.A;

import javax.inject.Inject;
import java.util.Collection;

@UiController("checkdcconcept_A.edit")
@UiDescriptor("a-edit.xml")
@EditedEntityContainer("aDc")
@LoadDataBeforeShow
public class AEdit extends StandardEditor<A> {

    @Inject
    protected Screens screens;

    @Inject
    protected DataContext dataContext;

    @Inject
    protected InstanceContainer<A> aDc;

    @Inject
    protected CollectionPropertyContainer<AManyToManyB> bsDc;

    @Subscribe("bsTable.add")
    protected void onBsTableAdd(Action.ActionPerformedEvent event) {

        BBrowse bBrowse = screens.create(BBrowse.class);
        bBrowse.setLookupComponentMultiSelect(true);
        bBrowse.setSelectHandler(this::handleAddingManyToManyRef);
        bBrowse.show();

    }

    protected void handleAddingManyToManyRef(Collection<B> bs) {

        for (B b : bs) {
            AManyToManyB aManyToManyB = dataContext.create(AManyToManyB.class);
            aManyToManyB.setA(aDc.getItem());
            aManyToManyB.setB(b);

            aDc.getItem().getBs().add(aManyToManyB); // throw NPE if a is new
        }
    }

//    @Subscribe("bsTable.exclude")
//    protected void onBsTableExclude(Action.ActionPerformedEvent event) {
//        AManyToManyB toRemove = bsDc.getItem();
//
//        aDc.getItem()
//    }

}