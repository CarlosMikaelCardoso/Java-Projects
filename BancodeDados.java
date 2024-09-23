import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class BancodeDados {
    public void iniciaBanco() {
        // URL do banco de dados SQLite
        String url = "jdbc:sqlite:C:/Users/Administrator/Documents/Codes/Banco de Dados/livros.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conectado ao banco de dados SQLite.");

                // Criação de uma tabela de exemplo
                String sql = "CREATE TABLE IF NOT EXISTS Livros ("
                           + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                           + " titulo TEXT NOT NULL,"
                           + " autor TEXT NOT NULL,"
                           + " ano_publicacao INTEGER NOT NULL"
                           + ");";
                
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
                System.out.println("Tabela 'Livros' criada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
