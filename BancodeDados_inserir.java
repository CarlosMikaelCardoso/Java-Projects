import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

public class BancodeDados_inserir {
    private static final String URL = "jdbc:sqlite:C:/Users/Administrator/Documents/Codes/Banco de Dados/livros.db";
    Scanner scanner = new Scanner(System.in);
    public void inserir(){
        // Criação de uma conexão com o banco de dados
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("Nome do livro: ");
                String titulo = scanner.nextLine();
                System.out.println("Nome do Autor: ");
                String autor = scanner.nextLine();
                System.out.println("Ano da publicação: ");
                int anoPublicacao = scanner.nextInt();

                inserirLivro(conn, titulo, autor, anoPublicacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }

    public void buscar() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                String sql = "SELECT titulo, autor, ano_publicacao FROM livros"; // Corrigido
    
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    ResultSet rs = pstmt.executeQuery(); // Execute a consulta
    
                    // Processar o ResultSet
                    while (rs.next()) {
                        String titulo = rs.getString("titulo");
                        String autor = rs.getString("autor");
                        int anoPublicacao = rs.getInt("ano_publicacao");
    
                        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
                    }
                } catch (SQLException e) {
                    System.out.println("Erro ao buscar livros: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }
    

    private static void inserirLivro(Connection conn, String titulo, String autor, int anoPublicacao) {
        String sql = "INSERT INTO livros(titulo, autor, ano_publicacao) VALUES(?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.setInt(3, anoPublicacao);
            pstmt.executeUpdate();
            System.out.println("Livro inserido: " + titulo);
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro: " + e.getMessage());
        }
    }
}
