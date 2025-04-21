/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transfusionsanguine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transfusion {

    // Method to establish a connection to the database
    public static Connection conn() {
        // URL of the MySQL database
        String url = "jdbc:mysql://localhost:3306/transfusion";
        String username = "root";
        String password = "787898";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
           Connection connection = DriverManager.getConnection(url, username, password);

            // Return the established connection
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("Le driver JDBC n'a pas été trouvé : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }

        return null;
    }

    public static void main(String[] args) {
        // Attempt to connect to the database
        Connection connection = conn();

        // Check if the connection was successful
        if (connection != null) {
            System.out.println("Connexion réussie à la base de données MySQL!");
        } else {
            System.out.println("Échec de la connexion à la base de données.");
        }
    }
}
