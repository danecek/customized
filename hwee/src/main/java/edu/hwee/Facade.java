/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hwee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//@Stateless
@RequestScoped
public class Facade {

    @Resource(name = "jdbc/sample")
    private javax.sql.DataSource myDB;
    private Connection con;

    @PostConstruct
    void init() {
        try {
            con = myDB.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String x() {
        return con.toString();
        
    }

}
