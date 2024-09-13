import java.sql.Connection; // Importa a classe Connection para gerenciar a conexão com o banco de dados.
import java.sql.DriverManager; // Importa a classe DriverManager para obter a conexão com o banco de dados.
import java.sql.PreparedStatement; // Importa a classe PreparedStatement para executar consultas SQL parametrizadas.
import java.sql.SQLException; // Importa a classe SQLException para tratar erros relacionados ao SQL.

public class ConexaoBancodeDadosTeste { // Declaração da classe principal.
    public static void main(String[] args) { // Método principal onde a execução do programa começa.
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados"; // URL de conexão com o banco de dados MySQL.
        String user = "seu_usuario"; // Nome de usuário para acessar o banco de dados.
        String password = "sua_senha"; // Senha para acessar o banco de dados.

        try { // Bloco try para capturar exceções que possam ocorrer durante a conexão e execução das consultas.
            Connection connection = DriverManager.getConnection(url, user, password); // Estabelece a conexão com o banco de dados.

            // Inserir dados na tabela usuario
            String sqlUsuario = "INSERT INTO usuario (nome, email) VALUES (?, ?)"; // Consulta SQL para inserir dados na tabela usuario.
            PreparedStatement statementUsuario = connection.prepareStatement(sqlUsuario); // Prepara a consulta SQL.
            statementUsuario.setString(1, "Breno"); // Define o valor do primeiro parâmetro (nome).
            statementUsuario.setString(2, "breno@example.com"); // Define o valor do segundo parâmetro (email).
            statementUsuario.executeUpdate(); // Executa a consulta SQL para inserir os dados.

            // Inserir dados na tabela agendamento
            String sqlAgendamento = "INSERT INTO agendamento (nomeUsuario, usuario_id) VALUES (?, ?)"; // Consulta SQL para inserir dados na tabela agendamento.
            PreparedStatement statementAgendamento = connection.prepareStatement(sqlAgendamento); // Prepara a consulta SQL.
            statementAgendamento.setString(1, "Breno"); // Define o valor do primeiro parâmetro (nomeUsuario).
            statementAgendamento.setInt(2, 1); // Define o valor do segundo parâmetro (usuario_id), supondo que o ID do usuário inserido seja 1.
            statementAgendamento.executeUpdate(); // Executa a consulta SQL para inserir os dados.

            System.out.println("Dados inseridos com sucesso!"); // Imprime uma mensagem indicando que os dados foram inseridos com sucesso.

            connection.close(); // Fecha a conexão com o banco de dados.
        } catch (SQLException e) { // Bloco catch para capturar e tratar exceções SQL.
            e.printStackTrace(); // Imprime o stack trace da exceção para ajudar na depuração.
        }
    }
}
