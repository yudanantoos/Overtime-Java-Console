package com.vcnc.overtimejavaconsole.controller;

import com.vcnc.overtimejavaconsole.model.Model;
import com.vcnc.overtimejavaconsole.view.Page;

public class Controller {

    private Page page;
    private Model model;

    public Controller(Page page, Model model) {
        this.page = page;
        this.model = model;
    }

    public void controlShowMenuPage(){
        this.page.showMenuPage();
    }
}
