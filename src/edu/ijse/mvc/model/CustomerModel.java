/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author anjanathrishakya
 */
public class CustomerModel {
    
    private final Connection CONNECTION;

    public CustomerModel() throws Exception {
        CONNECTION = DBConnection.getInstance().getConnection();
    }
    
    
    
    // save 
    // update
    // delete
    // id -> customer
    // all Customer
    
    public String saveCustomer(CustomerDto customerDto) throws SQLException{
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = CONNECTION.prepareStatement(sql);
        
        statement.setString(1, customerDto.getId());
        statement.setString(2, customerDto.getTitle());
        statement.setString(3, customerDto.getName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getZip());
        
        if(statement.executeUpdate() > 0){
            return "Succes";
        } else {
            return "Fail";
        }
    }
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = CONNECTION.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        while (rst.next()) {            
            CustomerDto dto = new CustomerDto();
            dto.setId(rst.getString("CustID"));
            dto.setTitle(rst.getString("CustTitle"));
            dto.setName(rst.getString("CustName"));
            dto.setDob(rst.getString("DOB"));
            dto.setSalary(rst.getDouble("salary"));
            dto.setAddress(rst.getString("CustAddress"));
            dto.setCity(rst.getString("City"));
            dto.setProvince(rst.getString("Province"));
            dto.setZip(rst.getString("PostalCode"));
            
            customerDtos.add(dto);
        }
        return customerDtos;
    }
    
}
