/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author computador
 */
public class ConnectionFactory {

    public Connection getConnection;
    
    public Connection GetConnection(){
        
        try {
            
            return  DriverManager.getConnection("jdbc:mysql://127.0.0.1/Produtos","Usuario","senha");
          
            
        } catch (Exception erro) {
           
            throw new RuntimeException(erro);
        }
    
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
