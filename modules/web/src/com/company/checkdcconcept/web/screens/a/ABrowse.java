package com.company.checkdcconcept.web.screens.a;

import com.haulmont.cuba.gui.screen.*;
import com.company.checkdcconcept.entity.A;

@UiController("checkdcconcept_A.browse")
@UiDescriptor("a-browse.xml")
@LookupComponent("asTable")
@LoadDataBeforeShow
public class ABrowse extends StandardLookup<A> {
}