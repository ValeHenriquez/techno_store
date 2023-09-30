package fuentes_henriquez_zazzali;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private Connection connection;    


    public Database() {
        String url = "jdbc:sqlite:store.db";

        try {
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                DatabaseMetaData meta = connection.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Database connected.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public Connection getConnection() {
        return connection;
    }


    public void setConnection(Connection connection) {
        this.connection = connection;
    } 

    
   
}
