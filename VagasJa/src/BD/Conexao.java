package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
    public String porta = "8080"; // Porta padrão do PostgreSQL
    public String nomServidor = "localhost"; // Nome do servidor PostgreSQL
    public String db = "dbvagasja"; // Nome do banco de dados
    public String user = "postgres"; // Nome de usuário do banco de dados
    public String pass = "12345"; // Senha do usuário
    Connection conn = null;
    
    public Connection conectar() {
        try {
            String ruta = "jdbc:postgresql://";
            String servidor = nomServidor + ":" + porta + "/";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(ruta + servidor + db, user, pass);
            if (conn != null) {
                System.out.println("Conexão ao Banco de Dados.");
            } else if (conn == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Seu registro está errado. error: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Seu registro está errado. error: " + e.getMessage());
        } finally {
            return conn;
        }
    }
    
    public void desconectar() {
        conn = null;
        System.out.println("Desconectado...!!!");
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }
}