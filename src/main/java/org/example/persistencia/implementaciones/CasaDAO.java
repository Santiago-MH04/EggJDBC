package org.example.persistencia.implementaciones;

import org.example.baseDatos.Conexion;
import org.example.entidades.Casa;
import org.example.persistencia.CRUD_DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CasaDAO implements CRUD_DAO<Casa> {
    //Atributos de CasaDAO
    //Constructores de CasaDAO
    //Asignadores de atributos de CasaDAO (setters)
    //Lectores de atributos de CasaDAO (getters)
        //Métodos de CasaDAO
    private Connection getConnection() throws SQLException {
        return Conexion.getConnection();
    }

    @Override
    public List<Casa> listar() {
        List<Casa> casas = new ArrayList<>();
            //Obtener la conexión
        try (Connection Conn = getConnection();
             Statement Stmt = Conn.createStatement();
             ResultSet RS = Stmt.executeQuery("SELECT * from casas")){
                //Recorrer el cursor
            while(RS.next()){
                Casa casa = crearCasa(RS);
                    //Poblar la lista
                casas.add(casa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return casas;
    }

    @Override
    public Optional<Casa> porID(Long id) {
        Casa casa = null;

        try (Connection Conn = getConnection();
             PreparedStatement PS = Conn.prepareStatement("SELECT c.* from casas where c.id=?")){
            PS.setLong(1, id);
            //Ejecutar la consulta
            try (ResultSet RS = PS.executeQuery()) {
                //Recorrer el cursor
                if (RS.next()) {
                        //Crear objeto de tipo Producto
                    casa = crearCasa(RS);
                }
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(casa);
    }

    @Override
    public void guardar(Casa casa) {
            //Preparar parámetros
        String SQL;
        if (casa.getIdCasa() != null && casa.getIdCasa() > 0) {
            SQL = "UPDATE casas SET fecha_desde = ?, fecha_hasta = ?, precio_habitacion = ? WHERE id_casa = ?";
        } else {
            SQL = "INSERT INTO casas (fecha_desde, fecha_hasta, precio_habitacion, calle, numero, codigo_postal, ciudad, pais, tipo_vivienda) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
            //Obtener la conexión
        try (Connection Conn = getConnection();
             PreparedStatement PS= Conn.prepareStatement(SQL)){
                //Asignar parámetros
            PS.setDate(1, Date.valueOf(casa.getFechaDesde()));
            PS.setDate(2, Date.valueOf(casa.getFechaHasta()));
            PS.setFloat(3, casa.getPrecioHabitacion());

            if (casa.getIdCasa() != null && casa.getIdCasa() > 0){
                PS.setLong(4, casa.getIdCasa());    //Actualizar la tabla
            } else {
                PS.setString(4, casa.getCalle());
                PS.setInt(5, casa.getNumero());
                PS.setString(6, casa.getCodigoPostal());
                PS.setString(7, casa.getCiudad());
                PS.setString(8, casa.getPais());
                PS.setString(9, casa.getTipoVivienda());
            }
                //Actualizar la base de datos
            PS.executeUpdate();

                //Jugar con el ID de la casa recién guardada
            if (!(casa.getIdCasa() != null && casa.getIdCasa() > 0)) {
                    // Obtener el ID generado automáticamente
                try (ResultSet generatedKeys = PS.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        casa.setIdCasa(generatedKeys.getLong(1));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Long id) {

    }

    private static Casa crearCasa(ResultSet RS) throws SQLException {
        Casa c = new Casa();
            c.setIdCasa(RS.getLong("id_casa"));
            c.setCalle(RS.getString("calle"));
            c.setNumero(RS.getInt("numero"));
            c.setCodigoPostal(RS.getString("codigo_postal"));
            c.setCiudad(RS.getString("ciudad"));
            c.setPais(RS.getString("pais"));
            c.setFechaDesde(RS.getDate("fecha_desde").toLocalDate());
            c.setFechaHasta(RS.getDate("fecha_hasta").toLocalDate());
            c.setTiempoMinimo(RS.getInt("tiempo_minimo"));
            c.setTiempoMaximo(RS.getInt("tiempo_maximo"));
            c.setPrecioHabitacion(RS.getFloat("precio_habitacion"));
            c.setTipoVivienda(RS.getString("tipo_vivienda"));
        return c;
    }
}
