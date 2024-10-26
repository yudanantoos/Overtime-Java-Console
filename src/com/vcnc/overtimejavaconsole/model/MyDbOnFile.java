package com.vcnc.overtimejavaconsole.model;

import java.util.Date;

public abstract class MyDbOnFile implements MyDatabase{

    private Date date;
    private Double hour;
    private String descriptin;

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setOvertimeHour(Double overtimeHour) {
        this.hour = overtimeHour;
    }

    @Override
    public Double getOvertimeHour() {
        return hour;
    }

    @Override
    public void setDescription(String description) {
        this.descriptin = description;
    }

    @Override
    public String getDescription() {
        return descriptin;
    }
}
