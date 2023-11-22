import java.awt.event.ActionEvent;
import java.sql.*;

public class nome {
    public String nome (String nome,int id){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biblioteca", "root", "");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM livros");
            resultSet.next();
             id= resultSet.getInt("id_livro");
             nome= resultSet.getString("N_livro");
            System.out.print(id);
            System.out.println(nome);
            connection.close();




        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return nome;
    }

    public void insert()throws SQLException
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String stng= "INSERT INTO livros (id_livro,N_livro,A_livro)VALUES (3,'Engenharia de Software','Ian Sommerville')";
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biblioteca", "root", "");
            statement = connection.createStatement();
            statement.executeUpdate(stng);

        }catch (Exception e) {
            e.printStackTrace();
        }


        connection.close();
    }


}
