/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.das.group.assignment.store;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author testing
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        MyCartBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("FRUITE STORE");

        SearchField.setToolTipText("");
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        MyCartBtn.setText("My Cart");
        MyCartBtn.setToolTipText("");
        MyCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyCartBtnActionPerformed(evt);
            }
        });

        ProductsPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProductsPanel.setAutoscrolls(true);

        javax.swing.GroupLayout ProductsPanelLayout = new javax.swing.GroupLayout(ProductsPanel);
        ProductsPanel.setLayout(ProductsPanelLayout);
        ProductsPanelLayout.setHorizontalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        ProductsPanelLayout.setVerticalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ProductsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MyCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void SearchFieldActionPerformed(ActionEvent evt) {
    }


    protected void SearchBtnActionPerformed(ActionEvent evt) {
        String searchText = SearchField.getText();

        if (searchText.trim().isEmpty()) {
            myStoreItemList.forEach(item -> {
                searchedStoreItemList.add(item);
            });
        }

        searchedStoreItemList = new LinkedList<StoreItem>();
        for (StoreItem item : myStoreItemList) {
            if (item.Name.toUpperCase().contains(searchText.toUpperCase())) {
                searchedStoreItemList.add(item);
            }
        }

        loadItems();

    }

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SearchBtnMouseClicked
        // TODO add your handling code here:
    }

    private void jTextField1ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton15ActionPerformed

    private void MyCartBtnActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        cartFrame.setVisible(true);
        this.setVisible(false);
        cartFrame.loadItems();
    }// GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    public void loadItems() {
        ProductsPanel.removeAll();
        GridLayout experimentLayout = new GridLayout(0, 3);
        experimentLayout.setHgap(25);
        experimentLayout.setVgap(25);

        ProductsPanel.setLayout(experimentLayout);

        searchedStoreItemList.forEach(item -> {
            final ProductItemPanel firstItem = new ProductItemPanel(item, myCartList, MyCartBtn);
            ProductsPanel.add(firstItem);

        });
        ProductsPanel.revalidate();
        ProductsPanel.repaint();

    }

    public MyCart cartFrame;
    public LinkedList<StoreItem> myCartList;
    public LinkedList<StoreItem> myStoreItemList;
    public LinkedList<StoreItem> searchedStoreItemList;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton MyCartBtn;
    private javax.swing.JPanel ProductsPanel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

class ProductItemPanel extends javax.swing.JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton showCartBtn;
    JButton AddToCartBtn = new JButton();
    JLabel ProductNameLbl = new JLabel();
    JLabel PriceLbl = new JLabel();
    JSpinner CounterSpin;
    JPanel PicturePnl = new JPanel();
    StoreItem storeItem;
    public LinkedList<StoreItem> myCartList;

    ProductItemPanel(StoreItem _storeItem, LinkedList<StoreItem> _myCartList, JButton _showCarButton) {
        super();
        storeItem = _storeItem;
        myCartList = _myCartList;
        showCartBtn = _showCarButton;

        setMaximumSize(new Dimension(200, 400));

        SpinnerNumberModel model1 = new SpinnerNumberModel(1, 0, 10, 1);
        CounterSpin = new JSpinner(model1);
        this.setLayout(new FlowLayout());
        // this.setBorder(new LineBorder(Color.BLACK));

        this.setBackground(new java.awt.Color(255, 255, 255));
        this.setPreferredSize(new java.awt.Dimension(200, 266));
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        AddToCartBtn.setText("Add to Cart");

        ProductNameLbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ProductNameLbl.setText(storeItem.Name);

        PriceLbl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        PriceLbl.setText(storeItem.Price + " RM");

        CounterSpin.setValue(storeItem.Unit);

        setItemsLayout();

    }

    void setItemsLayout() {
        javax.swing.GroupLayout PicturePnlLayout = new javax.swing.GroupLayout(PicturePnl);
        PicturePnl.setLayout(PicturePnlLayout);
        PicturePnlLayout.setHorizontalGroup(PicturePnlLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 119, Short.MAX_VALUE));
        PicturePnlLayout.setVerticalGroup(PicturePnlLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 118, Short.MAX_VALUE));

        final GroupLayout ProductItemPanelLayout = new javax.swing.GroupLayout(this);
        setLayout(ProductItemPanelLayout);
        ProductItemPanelLayout.setHorizontalGroup(ProductItemPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductItemPanelLayout.createSequentialGroup().addContainerGap()
                        .addGroup(ProductItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ProductItemPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ProductItemPanelLayout.createSequentialGroup()
                                        .addComponent(ProductNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PriceLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 62,
                                                Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CounterSpin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        ProductItemPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PicturePnl, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)));
        ProductItemPanelLayout.setVerticalGroup(ProductItemPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductItemPanelLayout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(PicturePnl, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProductItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CounterSpin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PriceLbl).addComponent(ProductNameLbl,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)));

        AddToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemToCartOnClick(evt);
            }
        });

    }

    private void addItemToCartOnClick(java.awt.event.ActionEvent evt) {
        int unit = (Integer) CounterSpin.getValue();
        int idx = myCartList.indexOf(storeItem);
        if (idx != -1) {
            StoreItem existingItem = myCartList.get(idx);
            existingItem.Unit += unit;
        } else {
            storeItem.Unit = unit;
            myCartList.add(storeItem);
        }
        showCartBtn.setText("My Cart " + (myCartList.size() > 0 ? "[" + myCartList.size() + "]" : ""));
    }
}