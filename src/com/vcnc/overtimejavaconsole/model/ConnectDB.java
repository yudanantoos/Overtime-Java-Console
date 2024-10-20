package com.vcnc.overtimejavaconsole.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class ConnectDB implements Model{

    private Connection connection;

    /**
     *
     */
    @Override
    public void connectToDB() {
        try {
            this.connection = DriverManager.getConnection(
                    URL_MARIADB,
                    USER,
                    PASSWORD
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     */
    @Override
    public void closeDB() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     */
    @Override
    public void createDB() {

    }

    /**
     *
     */
    @Override
    public void createTableDB() {

    }
}
