package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL{
    //variable tipo conecction
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //enlace hacia la BD 
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa.");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion."+e.getMessage());
            
        }
        return conectar;
    }
}
