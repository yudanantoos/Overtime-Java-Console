package com.vcnc.overtimejavaconsole;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Home(), new ConnectDB());
        controller.controlShowMenuPage();
    }
}
