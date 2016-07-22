/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.customers.bussines;

import edu.customers.model.Customer;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Singleton;
import javax.sql.DataSource;

@Singleton
public class Facade {
    
    @Resource(name = "jdbc/sample")
    DataSource db;
    Connection conn;
    
    Map<Integer, Customer> custs = new HashMap<>();
    private PreparedStatement addPs;
    
    @PostConstruct
    void init() {
        try {
            conn = db.getConnection();
            
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, "CUSTS", null);
            if (!rs.next()) {
                
                Statement stm = conn.createStatement();
                stm.executeUpdate("CREATE TABLE CUSTS"
                        + "(ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
                        + "NAME   VARCHAR(50),"
                        + "PRIMARY KEY (ID))");
                LOG.info("CREATE TABLE BOOKS");
                
            }
            addPs = conn.prepareStatement("INSERT INTO CUSTS VALUES(DEFAULT,?)");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
    private static final Logger LOG = Logger.getLogger(Facade.class.getName());
    
    public List<Customer> all() {
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM CUSTS ");
            List<Customer> custs = new ArrayList<>();
            while (rs.next()) {
                custs.add(new Customer(rs.getInt(1), rs.getString(2)));
            }
            return custs;
            //   return new ArrayList<Customer>(custs.values());
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
    
    public void add(Customer c) {
        LOG.info(c.toString());
        try {
            Statement stm = conn.createStatement();
//            addPs.setString(1, c.getName());
//            addPs.execute();
            stm.executeUpdate("INSERT INTO CUSTS VALUES(DEFAULT,'" + c.getName() + "')");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
}
