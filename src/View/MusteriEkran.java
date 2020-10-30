import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;
import javax.swing.table.TableRowSorter;
public final class MusteriEkran extends javax.swing.JDialog {
    DefaultTableModel model;
    MusterIslemleri islemler=new MusterIslemleri();
    public MusteriEkran(java.awt.Frame parent, boolean modal,int  manId) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel)musteriTablo.getModel();
        musteriGoruntule(manId);
    }
    public  void musteriGoruntule(int manId) {
        model.setRowCount(0);
        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers=islemler.musterileriGetir(manId);
        if(customers!=null){
            for(Customer customer:customers){
                Object[]eklenecek ={customer.getCusId(),customer.getCusName(),customer.getManRegion()};
                model.addRow(eklenecek);
            }
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        musteriTablo = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        adAlan = new javax.swing.JTextField();
        mesajyazisi = new javax.swing.JLabel();
        MusteriEkleButon = new javax.swing.JButton();
        silmeButonu = new javax.swing.JButton();
        guncelleButonu = new javax.swing.JButton();
        FaturaButon = new javax.swing.JButton();
        mesajyazisi2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 400, 0, 0));

        musteriTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "Name", "Region"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        musteriTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musteriTablo);
        if (musteriTablo.getColumnModel().getColumnCount() > 0) {
            musteriTablo.getColumnModel().getColumn(0).setResizable(false);
            musteriTablo.getColumnModel().getColumn(1).setResizable(false);
            musteriTablo.getColumnModel().getColumn(2).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        mesajyazisi.setForeground(new java.awt.Color(255, 0, 0));

        MusteriEkleButon.setText("Ekle");
        MusteriEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriEkleButonActionPerformed(evt);
            }
        });

        silmeButonu.setText("Sil");
        silmeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silmeButonuActionPerformed(evt);
            }
        });

        guncelleButonu.setText("Güncelle");
        guncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonuActionPerformed(evt);
            }
        });

        FaturaButon.setText("Fatura");
        FaturaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaturaButonActionPerformed(evt);
            }
        });

        mesajyazisi2.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MusteriEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(silmeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(guncelleButonu))
                    .addComponent(FaturaButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesajyazisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(mesajyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adAlan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MusteriEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silmeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FaturaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesajyazisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara=arama_cubugu.getText();
        dinamikAra(ara);    
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void MusteriEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriEkleButonActionPerformed
      int manId;
        manId = MusterIslemleri.manid;
      mesajyazisi.setText("");
      String ad=adAlan.getText();
      islemler.musteriEkle(ad,manId);
      musteriGoruntule(manId);
      mesajyazisi.setText("Yeni Musteri Eklendi");
      
    }//GEN-LAST:event_MusteriEkleButonActionPerformed

    private void silmeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silmeButonuActionPerformed
        int ide=MusterIslemleri.manid;
        mesajyazisi.setText("");
        int selectedrow=musteriTablo.getSelectedRow();
        if(selectedrow==-1){
            if(model.getRowCount()==0){
                mesajyazisi.setText("Musteri tablosu şuanda boş");
                
            }else{
                mesajyazisi.setText("Lütfen silinecek bir müsteri seçin");
            }
        }else{
            int id=(int)model.getValueAt(selectedrow,0);
            islemler.musteriSil(id);
            musteriGoruntule(ide);
            mesajyazisi.setText("seçili musteri silindi");
        }  

    }//GEN-LAST:event_silmeButonuActionPerformed

    private void guncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonuActionPerformed
        int ide=MusterIslemleri.manid;
        mesajyazisi.setText("");
        int selectedRow=musteriTablo.getSelectedRow();
        String ad=adAlan.getText();
        if(selectedRow==-1){
            if(model.getRowCount()==0){
                mesajyazisi.setText("Musteri Tablosu boş");
            }
            else{
            mesajyazisi.setText("Lutfen guncellenecek musteri seçin");
        }}
            else{
                    int id=(int) model.getValueAt(selectedRow,0);
                    islemler.musteriGuncelle(ad,id);
                    mesajyazisi.setText("Musteri Tablosu Guncellendi");
                    musteriGoruntule(ide);
                    }
    }//GEN-LAST:event_guncelleButonuActionPerformed

    private void FaturaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaturaButonActionPerformed
        mesajyazisi.setText("");
        int selectedRow=musteriTablo.getSelectedRow();
        if(selectedRow==-1){
            if(model.getRowCount()==0){
                mesajyazisi.setText("Musteri Tablosu boş...");
        }else{
                mesajyazisi.setText("Lütfen faturasi istenen musteri seçin");
            }
        }else{
            int id=(int) model.getValueAt(selectedRow,0);
            islemler.faturaAc(id);
            mesajyazisi.setText("Musteri Fatura islemi tamamlandi...");
        }   
    }//GEN-LAST:event_FaturaButonActionPerformed

    private void musteriTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriTabloMouseClicked
        int selectedrow=musteriTablo.getSelectedRow();
        adAlan.setText(model.getValueAt(selectedrow,1).toString());
        String name=model.getValueAt(selectedrow,1).toString();
        mesajyazisi2.setText(name+" isimli müsteri için işlem yapıllıyor.");
        
    }//GEN-LAST:event_musteriTabloMouseClicked
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<>(model);
        musteriTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));   
    }
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
            java.util.logging.Logger.getLogger(MusteriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MusteriEkran dialog = new MusteriEkran(new javax.swing.JFrame(), true,1);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FaturaButon;
    private javax.swing.JButton MusteriEkleButon;
    private javax.swing.JTextField adAlan;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton guncelleButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesajyazisi;
    private javax.swing.JLabel mesajyazisi2;
    private javax.swing.JTable musteriTablo;
    private javax.swing.JButton silmeButonu;
    // End of variables declaration//GEN-END:variables
}
