/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belediyehizmetleriprojesi;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author akifkilic
 * 
 *  * 
 * Vapur Hattı:
 * Haliç-Üsküdar --- Eminönü KAdıköy--Beşiktaş Çengelköy
 * 
 * Metro Hattı:
 * Yenikapı Kirazlı--Yanikapı Atatürk--Tanikapı HAcıosman
 * 
 * Metrobüs Hattı
 * Beylikdüzü Avcılar--Avcılar Zincirlikuyu--Zincirlikuyu Söğütlüçeşme
 * 
 * 
 * 
 */
public class Bilgi_Edinme extends javax.swing.JFrame {

     DefaultListModel model;
    /**
     * Creates new form Bilgi_Edinme
     */
    public Bilgi_Edinme() {
        initComponents();
          model=new DefaultListModel();
          isthatbilgi.setModel(model);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combobox = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnsil = new javax.swing.JButton();
        btnsorgula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        isthatbilgi = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapur Hattı", "Metro Hattı", "Metrobüs Hattı" }));

        btnupdate.setText("Güncelle");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Hat Türü Seçiniz");

        btnsil.setText("Sil");
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });

        btnsorgula.setText("Sorgula");
        btnsorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgulaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(isthatbilgi);

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnupdate)
                                .addGap(26, 26, 26)
                                .addComponent(btnsorgula)
                                .addGap(26, 26, 26)
                                .addComponent(btnsil))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jButton1)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate)
                    .addComponent(btnsorgula)
                    .addComponent(btnsil))
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

       isthatbilgi.setEnabled(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgulaActionPerformed

        
        int itemNO=combobox.getSelectedIndex();
        
        if(itemNO==0) {
            model.clear();
           model.addElement("Haliç-Üsküdar Hattı" + " -- "+ "Saatte bir kalkmaktadır.");
             model.addElement("Eminönü-Kadıköy Hattı"+ "-- "+ "Yarım saatte bir kalkmaktadır.");
              model.addElement("Beşiktaş-Çengelköy Hattı"+ "-- "+ "Haftasonları yarım saatte bir kalkmaktadır.");
            
        }
        else if(itemNO==1) {
            model.clear();
            model.addElement("Yenikapı-Kirazlı Hattı" + "--"+ "15 dakika aralıklarla kalkmaktadır.");
             model.addElement("Yenikapı-Atatürk Hattı"+ "-- "+ "15 dakika aralıklarla kalkmaktadır.");
              model.addElement("Yenikapı-Hacıosman Hattı"+ "-- "+ "15 dakika aralıklarla kalkmaktadır.");
            
            
        }
        else if(itemNO==2) {
            model.clear();
            model.addElement("Beylikdüzü-Avcılar Hattı"+ "-- "+ "10 dakika aralıklarla kalkmaktadır.");
             model.addElement("Avcılar-Zincirlikuyu Hattı"+ "-- "+ "10 dakika aralıklarla kalkmaktadır.");
              model.addElement("Zincirlikuyu-Söğütlüçeşme Hattı"+ "-- "+ "10 dakika aralıklarla kalkmaktadır.");
              
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_btnsorgulaActionPerformed

    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed
 
        model.removeAllElements();
        
    


        // TODO add your handling code here:
    }//GEN-LAST:event_btnsilActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing



        
//             JFrame2.dispose();  //Remove JFrame 1
//      JFrame1.setVisible(true) //Show other frame
//              RegScreen.this.setVisible(false);
//
//    new MainScreen().setVisible(true);


//    JFrame1.dispose();  //Remove JFrame 1
//      JFrame2.setVisible(true) //Show other frame
//  
    
//      this.dispose();
        new BelediyeHizmetleri().setVisible(true);
//       
   


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

new BelediyeHizmetleri().setVisible(true);
        setVisible(false);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bilgi_Edinme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bilgi_Edinme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bilgi_Edinme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bilgi_Edinme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bilgi_Edinme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsil;
    private javax.swing.JButton btnsorgula;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JList<String> isthatbilgi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
