package fuentes_henriquez_zazzali;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Connection conn = new Database().getConnection();

        
        System.out.println(conn);
    }
}