package com.vcnc.overtimejavaconsole.model;

import java.util.HashMap;

public interface Model {
    String URL_MARIADB = "jdbc:mariadb://localhost:3306/database_name";
    String USER = "user";
    String PASSWORD = "password";
    void connectToDB();
    void closeDB();
    void createDB();
    void createTableDB();
}
