import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionBD {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/InventarioComputadoras"; // Reemplaza 'InventarioComputadoras' con el nombre de tu base de datos
        String usuario = "tu_usuario"; // Reemplaza 'tu_usuario' con tu nombre de usuario de la base de datos
        String contraseña = "tu_contraseña"; // Reemplaza 'tu_contraseña' con tu contraseña de la base de datos

        try {
            // Cargar el controlador JDBC (no es necesario en versiones modernas de JDBC)
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("Conexión exitosa a la base de datos.");

            // Aquí puedes realizar operaciones con la base de datos (consultas, inserciones, etc.)

            // Cerrar la conexión cuando hayas terminado
            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ConexionBD []";
    }

    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}