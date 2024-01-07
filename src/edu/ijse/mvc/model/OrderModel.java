/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anjanathrishakya
 */
public class OrderModel {

    private final Connection CONNECTION;

    public OrderModel() throws Exception{
        this.CONNECTION = DBConnection.getInstance().getConnection();
    }

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws SQLException {
        try {
            CONNECTION.setAutoCommit(false);
            String orderSql = "INSERT INTO Orders VALUES(?,?,?)";
            PreparedStatement orderStatement = CONNECTION.prepareStatement(orderSql);
            orderStatement.setString(1, orderDto.getOrderId());
            orderStatement.setString(2, orderDto.getDate());
            orderStatement.setString(3, orderDto.getCustId());

            boolean isOrderSave = orderStatement.executeUpdate() > 0;
            if (isOrderSave) {

                boolean isOrderDetaiSaved = true;

                String orderDetailSql = "INSERT INTO orderDetail VALUES(?,?,?,?)";
                for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                    PreparedStatement orderDetailStatemet = CONNECTION.prepareStatement(orderDetailSql);
                    orderDetailStatemet.setString(1, orderDto.getOrderId());
                    orderDetailStatemet.setString(2, orderDetailDto.getItemId());
                    orderDetailStatemet.setInt(3, orderDetailDto.getQty());
                    orderDetailStatemet.setDouble(4, orderDetailDto.getDiscount());

                    if (!(orderDetailStatemet.executeUpdate() > 0)) {
                        isOrderDetaiSaved = false;
                    }
                }

                if (isOrderDetaiSaved) {

                    boolean isItemUpdate = true;

                    String itemUpdateSql = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                    for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                        PreparedStatement itemStatement = CONNECTION.prepareStatement(itemUpdateSql);
                        itemStatement.setInt(1, orderDetailDto.getQty());
                        itemStatement.setString(2, orderDetailDto.getItemId());

                        if (!(itemStatement.executeUpdate() > 0)) {
                            isItemUpdate = false;
                        }
                    }

                    if (isItemUpdate) {
                        CONNECTION.commit();
                        return "Sucess";
                    } else {
                        CONNECTION.rollback();
                        return "Item Update Error";
                    }

                } else {
                    CONNECTION.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                CONNECTION.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            CONNECTION.rollback();
            e.printStackTrace();
            return e.getMessage();

        } finally {
            CONNECTION.setAutoCommit(true);
        }
    }

}
