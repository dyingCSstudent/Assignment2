/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Skyrim
 */
public class Database {
    
    
    Connection conn = null;
    String url = "jdbc:derby://localhost:1527/RolePlayingGame";
    String username = "vmd6421";
    String password = "123";
    Statement statement;
    public void autoConnectDatabase(){
    
        try {
        
            conn = DriverManager.getConnection(url,username,password);
            statement = (Statement) conn.createStatement();
            statement.executeUpdate("CREATE TABLE ITEMS (ITEMID INT, ITEM_NAME VARCHAR(50), TYPE VARCHAR(20), PRICE INT, DAMAGE INT, ARMOUR INT  )");
            statement.executeUpdate("INSERT INTO ITEMS VALUES "
                    + "(1, 'Sword', 'Weapon', 25, 4, 0),\n"
                    + "(2, 'Breastplate', 'Armour', 50, 0, 10)");
        
        
        }catch(Throwable ex){
            System.err.println("SQL EXCEPTION" + ex.getMessage());
        }
    
    
    
    
    }
}
