import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class myjbdc {
    public static void main() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biblioteca", "root", "");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM livros");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id_livro"));
                System.out.print(resultSet.getString("N_livro"));
                System.out.println(resultSet.getString("A_livro"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public String result(String nome, String autor){


        return nome;}
}

