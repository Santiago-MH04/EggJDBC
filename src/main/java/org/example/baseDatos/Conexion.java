package org.example.baseDatos;

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


    //Constructores de Conexion
    //Asignadores de atributos de Conexion (setter)
    //Lectores de atributos de Conexion (getter)
        //Métodos de Conexion
    public static Connection getInstance() throws SQLException {
        if(Connection == null){/**/
            Connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return Connection;
    }
}
