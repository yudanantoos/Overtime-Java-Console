package com.vcnc.overtimejavaconsole.model;

import java.util.Date;

public interface MyDatabase {
    void setDate(Date date);
    Date getDate();
    void setOvertimeHour(Double overtimeHour);
    Double getOvertimeHour();
    void setDescription(String description);
    String getDescription();
}
