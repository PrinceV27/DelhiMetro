/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Yash Verma 1
 */
public class SELECT11 extends javax.swing.JFrame {

    /**
     * Creates new form SELECT11
     */
    public SELECT11() {
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
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        item2 = new javax.swing.JComboBox();
        item3 = new javax.swing.JComboBox();
        bu3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ENTER THE STATION FOR GETTING FARES");

        jLabel3.setText("SOURCE STATION");

        jLabel4.setText("DESTINATION STATION");

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        item2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NEW DELHI", "HUDA CITY CENTRE", "HAUZ KHAS", "QUTUB MINAR", "AIIMS", "IP", "HAZRAT NIZAMUDDIN", "MG ROAD", "SAKET", "AIRPORT" }));
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        item3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NEW DELHI", "HUDA CITY CENTRE", "HAUZ KHAS", "QUTUB MINAR", "AIIMS", "IP", "HAZRAT NIZAMUDDIN", "MG ROAD", "SAKET", "AIRPORT" }));

        bu3.setText("CLEAR");
        bu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu3))
                .addGap(13, 13, 13)
                .addComponent(jButton2)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="NEW DELHI" || item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="MG ROAD" || item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="AIRPORT" ||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="AIIMS" )
            t1.setText("0 Rs.");
        else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="HAUZ KHAS" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="SAKET" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="AIIMS"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="AIRPORT"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="HAUZ KHAS" )
            t1.setText("10 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="SAKET" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="AIIMS" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="AIRPORT"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="HAUZ KHAS" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="SAKET" )
            t1.setText("20 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="AIIMS" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="QUTUB MINAR" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="AIRPORT"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="SAKET" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="AIIMS" )
            t1.setText("30 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="QUTUB MINAR" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="AIRPORT" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="AIMMS" ||item2.getSelectedItem().toString()=="HUDA CITY CENRE" && item3.getSelectedItem().toString()=="QUTUB MINAR" )
            t1.setText("40 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="AIRPORT" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="IP" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="AIIMS"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="QUTUB MINAR" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="AIRPORT" )
            t1.setText("50 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="IP" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="MG ROAD"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="AIIMS"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="AIRPORT" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="IP" )
            t1.setText("60 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="MG ROAD" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="AIIMS"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="AIRPORT"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="IP" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" )
            t1.setText("70 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="MG ROAD" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="HAUZ KHAS"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="SAKET"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="AIIMS"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="QUTUB MINAR"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="AIRPORT"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="IP"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="MG ROAD" )
            t1.setText("80 Rs.");
         else if (item2.getSelectedItem().toString()=="NEW DELHI" && item3.getSelectedItem().toString()=="HUDA CITY CENTRE" || item2.getSelectedItem().toString()=="HAUZ KHAS" && item3.getSelectedItem().toString()=="NEW DELHI" || item2.getSelectedItem().toString()=="SAKET" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="AIIMS" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="QUTUB MINAR" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="AIRPORT" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="IP" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="HAZRAT NIZAMUDDIN" && item3.getSelectedItem().toString()=="NEW DELHI"||item2.getSelectedItem().toString()=="MG ROAD" && item3.getSelectedItem().toString()=="NEW DELHI" ||item2.getSelectedItem().toString()=="HUDA CITY CENTRE" && item3.getSelectedItem().toString()=="NEW DELHI" )
            t1.setText("90 Rs.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu3ActionPerformed
  t1.setText("");           // TODO add your handling code here:
    }//GEN-LAST:event_bu3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
trainstatus obj=new trainstatus();
obj.setVisible(true);// TODO add your handling code here:
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SELECT11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELECT11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELECT11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELECT11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECT11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu3;
    private javax.swing.JComboBox item2;
    private javax.swing.JComboBox item3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
