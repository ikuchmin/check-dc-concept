package com.company.checkdcconcept.web.screens.b;

import com.haulmont.cuba.gui.screen.*;
import com.company.checkdcconcept.entity.B;

@UiController("checkdcconcept_B.browse")
@UiDescriptor("b-browse.xml")
@LookupComponent("bsTable")
@LoadDataBeforeShow
public class BBrowse extends StandardLookup<B> {
}