/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894547;

import java.awt.Dialog.ModalityType;

/**
 *
 * @author jools
 */
public class OrderForm extends javax.swing.JFrame {
    
    private Order order;

    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        order = new Order();
        update(); 
    }
    
    //private void createNewOrder() {
    //    Order newOrder = new Order();
    //    this.order = newOrder;
    //}
    
    public Order getOrder() {
        return this.order;
    }
    public void setOrder(Order newOrder) {
        this.order = newOrder;
    }
    
    private void update() {
        orderSummaryTextArea.setText(order.returnInfo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newPizzaButton = new javax.swing.JButton();
        modifyPizzaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderSummaryTextArea = new javax.swing.JTextArea();
        totalCostLabel = new javax.swing.JLabel();
        totalCostField = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newPizzaButton.setText("New Pizza");
        newPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPizzaButtonActionPerformed(evt);
            }
        });

        modifyPizzaButton.setText("Edit/Delete Pizza");
        modifyPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPizzaButtonActionPerformed(evt);
            }
        });

        orderSummaryTextArea.setColumns(20);
        orderSummaryTextArea.setRows(5);
        jScrollPane1.setViewportView(orderSummaryTextArea);

        totalCostLabel.setText("Total Order Cost");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newPizzaButton)
                        .addGap(18, 18, 18)
                        .addComponent(modifyPizzaButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalCostLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(totalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPizzaButton)
                    .addComponent(modifyPizzaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCostLabel)
                    .addComponent(closeButton)
                    .addComponent(totalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_closeButtonActionPerformed

    private void newPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPizzaButtonActionPerformed
        // New pizza button
        NewPizzaDialog pizzaform1 = new NewPizzaDialog(this, true);
        pizzaform1.setVisible(true);
        
        if(pizzaform1.getKeep()){
            order.addPizza(pizzaform1.getPizza());
        }
        update();
    }//GEN-LAST:event_newPizzaButtonActionPerformed

    private int modifyPizza(int selectedPizza) {
        ModifyPizzaDialog modifyForm = new ModifyPizzaDialog(this, true);
        this.order.selectPizza(0);
        modifyForm.setOrder(getOrder());
        modifyForm.setPizza(getOrder().getPizza());
        modifyForm.update();
        modifyForm.setVisible(true);
        
        this.order = modifyForm.getOrder();
        return modifyForm.getStatus();
    }
    
    private void modifyPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPizzaButtonActionPerformed
        
        int status = modifyPizza(0);
        if(status == 1) {
            
        } else if(status == 2) {
            order.deletePizza();
        }
        
        
    }//GEN-LAST:event_modifyPizzaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyPizzaButton;
    private javax.swing.JButton newPizzaButton;
    private javax.swing.JTextArea orderSummaryTextArea;
    private javax.swing.JTextField totalCostField;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
