/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.controller.OrderController;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anjanathrishakya
 */
public class OrderView extends javax.swing.JFrame {

    private ItemController itemController;
    private CustomerController customerController;
    private OrderController orderController;

    private ArrayList<OrderDetailDto> orderDetailDtos;

    /**
     * Creates new form OrderForm
     */
    public OrderView() throws Exception {
        itemController = new ItemController();
        customerController = new CustomerController();
        orderController = new OrderController();
        orderDetailDtos = new ArrayList<>();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblCustId = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        btnSearchCustomer = new javax.swing.JButton();
        lblCustData = new javax.swing.JLabel();
        lblItemId = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnSearchItem = new javax.swing.JButton();
        lblItemData = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        lblDis = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnAddToTable = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order ");

        lblOrderId.setText("Order Id");

        lblCustId.setText("Customer Id");

        btnSearchCustomer.setText("Search");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });

        lblItemId.setText("Item Id");

        btnSearchItem.setText("Search");
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });

        lblQty.setText("Qty");

        lblDis.setText("Discount");

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblOrderDetail);

        btnAddToTable.setText("Add");
        btnAddToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToTableActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblItemId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCustId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddToTable)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCustData, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addComponent(lblItemData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustId)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCustomer)
                    .addComponent(lblCustData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemId)
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchItem)
                    .addComponent(lblItemData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQty)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDis)
                    .addComponent(btnAddToTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPlaceOrder)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemActionPerformed
        seachItem();
    }//GEN-LAST:event_btnSearchItemActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void btnAddToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToTableActionPerformed
        addtoTable();
    }//GEN-LAST:event_btnAddToTableActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        placeOrder();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrderForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToTable;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustData;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblDis;
    private javax.swing.JLabel lblItemData;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
    public void seachItem() {
        try {
            String itemId = txtItemId.getText();
            ItemDto itemDto = itemController.searchItem(itemId);
            if (itemDto != null) {
                lblItemData.setText(itemDto.getId() + " | " + itemDto.getDescription() + " | " + itemDto.getQoh() + " | " + itemDto.getUnitPrice());

            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error at search item");
        }
    }

    public void searchCustomer() {
        try {
            String custId = txtCustId.getText();
            CustomerDto customerDto = customerController.searchCustomer(custId);
            if (customerDto != null) {
                lblCustData.setText(customerDto.getName() + " | " + customerDto.getAddress());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error at search Customer");
        }
    }

    private void loadTable() {
        String columns[] = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tblOrderDetail.setModel(dtm);
    }

    private void addtoTable() {
        OrderDetailDto orderDetailDto = new OrderDetailDto();
        orderDetailDto.setItemId(txtItemId.getText());
        orderDetailDto.setQty(Integer.parseInt(txtQty.getText()));
        orderDetailDto.setDiscount(Double.parseDouble(txtDiscount.getText()));

        orderDetailDtos.add(orderDetailDto);

        Object[] rowData = {orderDetailDto.getItemId(), orderDetailDto.getQty(), orderDetailDto.getDiscount()};
        DefaultTableModel dtm = (DefaultTableModel) tblOrderDetail.getModel();
        dtm.addRow(rowData);
        clearItem();
    }

    private void clearItem() {
        txtItemId.setText("");
        txtQty.setText("");
        txtDiscount.setText("");
        lblItemData.setText("");
    }

    private void placeOrder() {
        try {
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderId(txtId.getText());
            orderDto.setCustId(txtCustId.getText());

            // yyyy-MM-dd -> 2024-01-07
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            orderDto.setDate(date);

            String resp = orderController.placeOrder(orderDto, orderDetailDtos);
            JOptionPane.showMessageDialog(this, resp);
                    
                    
        } catch (Exception ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
