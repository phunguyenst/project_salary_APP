/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author admin
 */
public class PhanCongCN extends javax.swing.JPanel {

    /**
     * Creates new form PhanCongCN
     */
    public PhanCongCN() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        myButton4 = new custom_button.MyButton();
        myButton5 = new custom_button.MyButton();
        myButton2 = new custom_button.MyButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Ph??n C??ng C??ng Nh??n");
        add(jLabel1);
        jLabel1.setBounds(573, 7, 203, 21);

        jLabel2.setText("M?? Ph??n C??ng");
        add(jLabel2);
        jLabel2.setBounds(504, 37, 79, 16);

        jLabel3.setText("M?? C??ng Nh??n");
        add(jLabel3);
        jLabel3.setBounds(504, 77, 81, 16);

        jLabel4.setText("M?? C??ng ??o???n");
        add(jLabel4);
        jLabel4.setBounds(504, 117, 80, 16);
        add(jTextField1);
        jTextField1.setBounds(681, 34, 122, 22);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(682, 74, 121, 22);

        add(jComboBox2);
        jComboBox2.setBounds(682, 114, 121, 22);

        jLabel5.setText("T??n Ph??n C??ng");
        add(jLabel5);
        jLabel5.setBounds(870, 37, 81, 16);

        jLabel6.setText("T??n Nh??n Vi??n");
        add(jLabel6);
        jLabel6.setBounds(870, 77, 77, 16);

        jLabel7.setText("S??? L?????ng C???n L??m");
        add(jLabel7);
        jLabel7.setBounds(870, 117, 100, 16);

        add(jComboBox3);
        jComboBox3.setBounds(1037, 34, 158, 22);

        add(jComboBox4);
        jComboBox4.setBounds(1037, 74, 158, 22);
        add(jLabel8);
        jLabel8.setBounds(1037, 114, 158, 0);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaSP", "TenSP", "ThuongHieu", "So Luong"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(7, 7, 452, 313);
        add(jLabel9);
        jLabel9.setBounds(1037, 114, 158, 0);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(477, 7, 13, 313);

        jLabel10.setText("C??ng ??o???n: ");
        add(jLabel10);
        jLabel10.setBounds(518, 219, 66, 16);

        jLabel11.setText("_");
        add(jLabel11);
        jLabel11.setBounds(647, 213, 135, 29);

        jLabel12.setText("Tr???ng Th??i: ");
        add(jLabel12);
        jLabel12.setBounds(842, 212, 80, 16);

        jTextField2.setText("_");
        add(jTextField2);
        jTextField2.setBounds(982, 213, 64, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaPC", "MaCN", "TenCN", "MaCD", "TenCD"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(7, 351, 1200, 396);
        add(jSeparator2);
        jSeparator2.setBounds(1, 320, 1209, 10);

        myButton4.setText("Ph??n C??ng");
        myButton4.setBorderColor(new java.awt.Color(102, 102, 102));
        myButton4.setColorhover(new java.awt.Color(0, 255, 255));
        myButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myButton4.setRadius(30);
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });
        add(myButton4);
        myButton4.setBounds(570, 270, 110, 40);

        myButton5.setText("X??a");
        myButton5.setBorderColor(new java.awt.Color(102, 102, 102));
        myButton5.setColorhover(new java.awt.Color(0, 255, 255));
        myButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myButton5.setRadius(30);
        myButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton5ActionPerformed(evt);
            }
        });
        add(myButton5);
        myButton5.setBounds(790, 270, 110, 40);

        myButton2.setText("S???a");
        myButton2.setBorderColor(new java.awt.Color(102, 102, 102));
        myButton2.setColorhover(new java.awt.Color(0, 255, 255));
        myButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myButton2.setRadius(30);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        add(myButton2);
        myButton2.setBounds(1010, 270, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton4ActionPerformed

    private void myButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton5ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private custom_button.MyButton myButton2;
    private custom_button.MyButton myButton4;
    private custom_button.MyButton myButton5;
    // End of variables declaration//GEN-END:variables
}
