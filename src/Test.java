/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tmmor
 */

import java.util.ArrayList;
import java.sql.*;
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ArrayList<Book> result = Book.getBooksByGenre(1, "dystopian");
        
        for(Book b : result){
            System.out.println(b.toString());
            System.out.println("----------------------------------");
        }

    }
    
}
