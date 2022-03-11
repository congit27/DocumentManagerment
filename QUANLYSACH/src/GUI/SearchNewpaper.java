/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Models.Newpaper;
import Services.Services;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class SearchNewpaper extends javax.swing.JFrame {
    Services searchNewpaper;

    /**
     * Creates new form SearchBook
     */
    public SearchNewpaper() {
        initComponents();
        searchOutput.setVisible(false);
        jLabel1.setVisible(false);
        NewpCodeTextField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchNewpTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NewpCodeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        searchOutput = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        getAllmgzBtn = new javax.swing.JButton();
        getWithCodeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchNewpTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        searchNewpTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchNewpTitle.setText("Tìm Báo");

        jLabel1.setText("Nhập mã báo:");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(resultTable);

        searchOutput.setText("Kết quả");
        searchOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOutputActionPerformed(evt);
            }
        });

        backBtn.setText("Quay lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        getAllmgzBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getAllmgzBtn.setText("Hiển thị tất cả tạp chí");
        getAllmgzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllmgzBtnActionPerformed(evt);
            }
        });

        getWithCodeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getWithCodeBtn.setText("Tìm theo mã tạp chí");
        getWithCodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getWithCodeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchNewpTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NewpCodeTextField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(searchOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(getAllmgzBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(getWithCodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(searchNewpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAllmgzBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getWithCodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewpCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOutputActionPerformed
        searchNewpaper = new Services();
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        resultTable.setModel(defaultTableModel);
        
        
        defaultTableModel.addColumn("Mã Báo");
        defaultTableModel.addColumn("Nhà Xuất Bản");
        defaultTableModel.addColumn("Số Bản Phát Hành ");
        defaultTableModel.addColumn("Ngày Phát Hành");
        
        List<Newpaper> newpapers = searchNewpaper.getNewpaper(NewpCodeTextField.getText());
        for (Newpaper newpaper: newpapers ) {
            defaultTableModel.addRow(new Object[] {
            newpaper.getNpCode(),
            newpaper.getPublisher(),
            newpaper.getQuantity(),
            newpaper.getPublishDate(),
            });
        }
    }//GEN-LAST:event_searchOutputActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void getAllmgzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllmgzBtnActionPerformed

        searchNewpaper = new Services();
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        resultTable.setModel(defaultTableModel);
        
        
        defaultTableModel.addColumn("Mã Báo");
        defaultTableModel.addColumn("Nhà Xuất Bản");
        defaultTableModel.addColumn("Số Bản Phát Hành ");
        defaultTableModel.addColumn("Ngày Phát Hành");
        
        List<Newpaper> newpapers = searchNewpaper.getAllNewpapers(NewpCodeTextField.getText());
        for (Newpaper newpaper: newpapers ) {
            defaultTableModel.addRow(new Object[] {
            newpaper.getNpCode(),
            newpaper.getPublisher(),
            newpaper.getQuantity(),
            newpaper.getPublishDate(),
            });
        }
    }//GEN-LAST:event_getAllmgzBtnActionPerformed

    private void getWithCodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getWithCodeBtnActionPerformed
        // TODO add your handling code here:
        searchOutput.setVisible(true);
        jLabel1.setVisible(true);
        NewpCodeTextField.setVisible(true);
    }//GEN-LAST:event_getWithCodeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NewpCodeTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton getAllmgzBtn;
    private javax.swing.JButton getWithCodeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel searchNewpTitle;
    private javax.swing.JButton searchOutput;
    // End of variables declaration//GEN-END:variables
}
