/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author anjanathrishakya
 */
public class ItemModel {

    private final Connection CONNECTION;

    public ItemModel() throws Exception {
        this.CONNECTION = DBConnection.getInstance().getConnection();
    }

    public String saveItem(ItemDto itemDto) throws Exception {
        String sql = "INSERT INTO item VALUES (?,?,?,?,?)";
        PreparedStatement statement = CONNECTION.prepareStatement(sql);
        statement.setString(1, itemDto.getId());
        statement.setString(2, itemDto.getDescription());
        statement.setString(3, itemDto.getPackSize());
        statement.setDouble(4, itemDto.getUnitPrice());
        statement.setInt(5, itemDto.getQoh());

        if (statement.executeUpdate() > 0) {
            return "Sucess";
        } else {
            return "False";
        }
    }

    public ItemDto searchItem(String itemId) throws Exception {
        String sql = "SELECT * FROM item WHERE ItemCode = ?";
        PreparedStatement statement = CONNECTION.prepareStatement(sql);
        statement.setString(1, itemId);
        ResultSet rst = statement.executeQuery();
        
        while (rst.next()) {            
            ItemDto dto = new ItemDto();
            dto.setId(rst.getString("ItemCode"));
            dto.setDescription(rst.getString("Description"));
            dto.setPackSize(rst.getString("PackSize"));
            dto.setQoh(rst.getInt("QtyOnHand"));
            dto.setUnitPrice(rst.getDouble("UnitPrice"));
            
            return dto;
        }
        
        return null;
    }

}
