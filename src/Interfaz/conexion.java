/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {

    public String db = "Envio_Paquete.sqlite";
    public String url = "jdbc:sqlite:" + db;
    public String user = "root";
    public String pass = "123";
     Connection link=null;

    public Connection Conectar() {

        try {
            Class.forName("org.sqlite.JDBC");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return link;
    }
    
    public void Insertar() throws SQLException{
    
    String ins = "INSERT INTO contactos (nombre, telefono) VALUES ('Carlos',444444)";
    //String ins2 = "commit;";
        Statement stmt= link.createStatement();
        int u= stmt.executeUpdate(ins);
        //  u= stmt.executeUpdate(ins2);
          
          stmt.close();

}
}
    
  