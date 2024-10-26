package com.vcnc.overtimejavaconsole.view;

import com.vcnc.overtimejavaconsole.controller.MyControl;

import java.util.Date;
import java.util.List;

public interface MyView {

    void WelcomePage();
    void FormPage(Date date, Double overtimeHour, String Description);
    List<MyControl> myControl();
}
