package org.example.baseDatos;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class Conexion {
        //Atributos de Conexion
    /*private static String URL = "jdbc:mysql://<hostname>:<port>/<database>?serverTimezone=America/Bogota";*/  //Los elementos en <> se deben cambiar, incluyendo al operador diamante
    private static String serverTimezone = TimeZone.getDefault().getID();   //Aquí pega la zona horaria localmente
    private static String URL = ("jdbc:mysql://localhost:3306/estancias_exterior?serverTimezone=").concat(serverTimezone);
    private static String USERNAME = "root";
    private static String PASSWORD = "sasa";
    private static java.sql.Connection Connection;
    private static BasicDataSource Pool;


    //Constructores de Conexion
    //Asignadores de atributos de Conexion (setter)
    //Lectores de atributos de Conexion (getter)
        //Métodos de Conexion
    public static BasicDataSource getInstance() throws SQLException {
        if (Pool == null) {
            Pool = new BasicDataSource();
            Pool.setUrl(URL);
            Pool.setUsername(USERNAME);
            Pool.setPassword(PASSWORD);

            Pool.setInitialSize(3);
            Pool.setMinIdle(3);
            Pool.setMaxIdle(8);
            Pool.setMaxTotal(8);
        }
        return Pool;
    }

    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}

