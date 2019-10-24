package com.company.checkdcconcept.web.screens.b;

import com.haulmont.cuba.gui.screen.*;
import com.company.checkdcconcept.entity.B;

@UiController("checkdcconcept_B.edit")
@UiDescriptor("b-edit.xml")
@EditedEntityContainer("bDc")
@LoadDataBeforeShow
public class BEdit extends StandardEditor<B> {
}