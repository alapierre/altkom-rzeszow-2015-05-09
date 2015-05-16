/*
 * Copyright 2015 Administrator.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.altkom.jpr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class JdbcPreparedStatementEx {
    
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", 
                    "app", 
                    "app");
            
            PreparedStatement stmt = conn.prepareStatement("select * from customer where customer_id = ?");
            
            stmt.setInt(1, 1);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                
                System.out.println(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JdbcPreparedStatementEx.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
