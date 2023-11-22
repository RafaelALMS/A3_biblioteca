import java.sql.ResultSet;
import java.sql.SQLException;

public class canaction {
    myjbdc banco = new myjbdc();

    public static void main(String[] args) throws SQLException {
       nome n = new nome();
       // n.nome("a",1);
        n.insert();
    }
}

