package elements;
import org.testng.annotations.Test;

import java.sql.*;


// JDBC (Java Database Connectivity) is a programming interface that lets Java applications access a relational database.
// Selenium can perform only UI validations. Database validations can be performed using language APIs such as JDBC in Java.



// Cerinta SQL_1: Afisati in consola toti clientii ce au orderdetails.quantityOrdered intre 30 si 40.


public class DBFirstExercise {

    @Test
    public void executeFirstQuery() throws SQLException, ClassNotFoundException {

        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "2569abc");
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("SELECT orderdetails.quantityOrdered, orderdetails.orderNumber, customers.customerName\n" +
                "FROM (( orderdetails\n" +
                "INNER JOIN orders ON orderdetails.orderNumber = orders.orderNumber)\n" +
                "INNER JOIN customers ON orders.customerNumber = customers.customerNumber)\n" +
                "WHERE orderdetails.quantityOrdered BETWEEN 30 AND 40;");
        // handle results
        while (rs.next()) {
            System.out.println(rs.getString("customerName"));
        }
        // close connection
        con.close();
    }
}
