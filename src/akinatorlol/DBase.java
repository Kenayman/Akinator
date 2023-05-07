package akinatorlol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBase {
    ResultSet rs;
    
    public void Insert(Connection conn, Nodo nodo) throws SQLException{
        PreparedStatement stmt1 = conn.prepareStatement(
                "INSERT INTO arbol (nodo, texto, pregunta) VALUES(?, ?, ?)");
        stmt1.setInt(1, nodo.getId());
        stmt1.setString(2, nodo.getTexto());
        stmt1.setInt(3, nodo.getPregunta());
        stmt1.executeUpdate();
    }
    
    public void Select(Connection conn, Nodo nodo, int id) throws SQLException{
        PreparedStatement stmt1 = conn.prepareStatement(
                "SELECT * FROM arbol WHERE nodo ='"+id+"'  ");
        rs = stmt1.executeQuery();
        if (rs.next()) {
            nodo.setId(rs.getInt(1));
            nodo.setTexto(rs.getString(2));
            nodo.setPregunta(rs.getInt(3));
        }
    }
<<<<<<< HEAD
    
    public void Alter(Connection conn, Nodo nodo, int id) throws SQLException{
        PreparedStatement stmt1 = conn.prepareStatement(
                "UPDATE arbol SET nodo = ?, texto = ?, pregunta = ? WHERE nodo = ?");
        stmt1.setInt(1, nodo.getId());
        stmt1.setString(2, nodo.getTexto());
        stmt1.setInt(3, nodo.getPregunta());
        stmt1.setInt(4, id);
        stmt1.executeUpdate();
    }
=======
>>>>>>> ff1172a8ed5c6276f5bd26d518ba2858ca9abadc
}
