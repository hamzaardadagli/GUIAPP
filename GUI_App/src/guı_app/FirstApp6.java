/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guı_app;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FirstApp6 extends javax.swing.JFrame {
    ArrayList<String>metin=new ArrayList<>();

    /**
     * Creates new form FirstApp6
     */
    public FirstApp6() {
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

        cb_bilisim = new javax.swing.JCheckBox();
        cb_bilgisayar = new javax.swing.JCheckBox();
        lbl_ekran = new javax.swing.JLabel();
        cb_yazilim = new javax.swing.JCheckBox();
        cb_yapay = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_bilisim.setText("bilişim");
        cb_bilisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bilisimActionPerformed(evt);
            }
        });

        cb_bilgisayar.setText("BİLGİSAYAR");
        cb_bilgisayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bilgisayarActionPerformed(evt);
            }
        });

        lbl_ekran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cb_yazilim.setText("yazılım");
        cb_yazilim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_yazilimActionPerformed(evt);
            }
        });

        cb_yapay.setText("yapay zeka");
        cb_yapay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_yapayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_ekran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(cb_bilgisayar))
                                .addComponent(cb_bilisim))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_yapay)
                                .addComponent(cb_yazilim))))
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(lbl_ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_bilgisayar)
                        .addComponent(cb_yazilim))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_bilisim)
                        .addComponent(cb_yapay))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_bilisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bilisimActionPerformed
             if(cb_bilisim.isSelected()){
            metin.add(cb_bilisim.getText());
        }
        else{
            metin.remove(cb_bilisim.getText());
        }
        
        String ifade = "";
        for(String item : metin){
            ifade += item + " ";
        }
        lbl_ekran.setText(ifade);
        
         checkboxrun(cb_bilisim);
         // TODO add your handling code here:
    }//GEN-LAST:event_cb_bilisimActionPerformed

    private void cb_bilgisayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bilgisayarActionPerformed
     if(cb_bilgisayar.isSelected()){
         metin.add(cb_bilgisayar.getText());// TODO add your handling code here:
    }//GEN-LAST:event_cb_bilgisayarActionPerformed
     else{
         metin.remove(cb_bilgisayar.getText());
     }
     String ifade ="";
    Iterable<String> metin = null;
     for(String item:metin){
         ifade+=item+" ";
     }
     lbl_ekran.setText(ifade);
     checkboxrun(cb_bilgisayar);
    }
    private void cb_yazilimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_yazilimActionPerformed
     if(cb_yazilim.isSelected()){
         metin.add(cb_yazilim.getText());// TODO add your handling code here:
    }//GEN-LAST:event_cb_yazilimActionPerformed
     else{
         metin.remove(cb_yazilim.getText());
     }
     String ifade="";
    Iterable<String> metin = null;
     for(String item:metin){
         ifade+=item+" ";
         lbl_ekran.setText(ifade);
     }
}
      public void checkboxrun(javax.swing.JCheckBox cb){
     if(cb.isSelected()){
        metin.add(cb.getText());
        }
        else {
            metin.remove(cb.getText());
        }
        String ifade="";
    Iterable<String> metin = null;
        for(String item:metin){
        ifade+=item+" ";}
        lbl_ekran.setText(ifade);
    }

    
    private void cb_yapayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_yapayActionPerformed
             if(cb_yapay.isSelected()){
            metin.add(cb_yapay.getText());
        }
        else{
            metin.remove(cb_yapay.getText());
        }
        
        String ifade = "";
    Iterable<String> metin = null;
        for(String item : metin){
            ifade += item + " ";
        }
        lbl_ekran.setText(ifade);
        
         checkboxrun(cb_yapay);
          // TODO add your handling code here:
    }//GEN-LAST:event_cb_yapayActionPerformed

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
            java.util.logging.Logger.getLogger(FirstApp6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstApp6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstApp6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstApp6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstApp6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_bilgisayar;
    private javax.swing.JCheckBox cb_bilisim;
    private javax.swing.JCheckBox cb_yapay;
    private javax.swing.JCheckBox cb_yazilim;
    private javax.swing.JLabel lbl_ekran;
    // End of variables declaration//GEN-END:variables
}