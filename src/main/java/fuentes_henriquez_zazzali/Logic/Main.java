package fuentes_henriquez_zazzali.Logic;

import java.sql.Connection;

import fuentes_henriquez_zazzali.Domain.Database;

public class Main {

    public static void main(String[] args) {
        Connection conn = new Database().getConnection();
        System.out.println(conn);
    }
}