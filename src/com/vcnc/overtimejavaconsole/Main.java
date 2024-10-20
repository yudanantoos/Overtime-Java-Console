package com.vcnc.overtimejavaconsole;

import com.vcnc.overtimejavaconsole.controller.Controller;
import com.vcnc.overtimejavaconsole.model.ConnectDB;
import com.vcnc.overtimejavaconsole.view.Home;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Home(), new ConnectDB());
        controller.controlShowMenuPage();
    }
}
