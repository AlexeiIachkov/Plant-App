package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@Route(value = "new-view")
@PageTitle("NewView")
@AnonymousAllowed
public class NewView extends HorizontalLayout {

    public NewView() {
        add(new H1("This is NewView"));
    }

}
