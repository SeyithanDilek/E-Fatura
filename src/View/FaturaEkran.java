import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static jdk.nashorn.internal.runtime.Debug.id;
public final class FaturaEkran extends javax.swing.JDialog {
    DefaultTableModel model;
    Faturaİslemleri islemler= new Faturaİslemleri();
    public FaturaEkran(java.awt.Frame parent, boolean modal,int cusId) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) faturaTablo.getModel();
        Faturaİslemleri.customId=cusId;
        faturaGoruntule(cusId);
    }
    public void faturaGoruntule(int cusId){
        model.setRowCount(0);
        ArrayList<Fatura> faturas=new ArrayList<Fatura>();
        faturas=islemler.FaturalariGetir(cusId);
        if(faturas!=null){
            for(Fatura fatura:faturas){
                Object[]eklenecek ={fatura.getRecId(),fatura.getCusId(),fatura.getDate(),fatura.getFirst_index(),fatura.getBrüt(),fatura.getKDV(),fatura.getSum()};
                model.addRow(eklenecek);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        faturaTablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstAlan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        faturaAramaCubuk = new javax.swing.JTextField();
        fatEkle = new javax.swing.JButton();
        mesajyazisi = new javax.swing.JLabel();
        hesapButonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastAlan = new javax.swing.JTextField();
        FatTarih = new javax.swing.JComboBox();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        faturaTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RecId", "CusId", "date", "last", "Brüt", "KDV", "sum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        faturaTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faturaTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(faturaTablo);
        if (faturaTablo.getColumnModel().getColumnCount() > 0) {
            faturaTablo.getColumnModel().getColumn(0).setResizable(false);
            faturaTablo.getColumnModel().getColumn(1).setResizable(false);
            faturaTablo.getColumnModel().getColumn(2).setResizable(false);
            faturaTablo.getColumnModel().getColumn(3).setResizable(false);
            faturaTablo.getColumnModel().getColumn(4).setResizable(false);
            faturaTablo.getColumnModel().getColumn(5).setResizable(false);
            faturaTablo.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("Date:");

        jLabel2.setText("First:");

        fatEkle.setText("Ekle");
        fatEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatEkleActionPerformed(evt);
            }
        });

        mesajyazisi.setForeground(new java.awt.Color(204, 0, 0));

        hesapButonu.setText("Hesap");
        hesapButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapButonuActionPerformed(evt);
            }
        });

        jLabel3.setText("Last:");

        FatTarih.setForeground(new java.awt.Color(0, 0, 204));
        FatTarih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aralık", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fatEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(hesapButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstAlan, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(lastAlan)
                                    .addComponent(FatTarih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesajyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(faturaAramaCubuk, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(faturaAramaCubuk)
                    .addComponent(mesajyazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FatTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstAlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastAlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fatEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hesapButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fatEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatEkleActionPerformed
        int id=Faturaİslemleri.customId;
        mesajyazisi.setText("");
        String date=(String) FatTarih.getSelectedItem();
        int first=Integer.parseInt(firstAlan.getText());
        islemler.faturaEkle(date,first,id);
        FatTarih.removeItem(date);
        faturaGoruntule(id);
        mesajyazisi.setText("Yeni fatura eklendi...");
        
    }//GEN-LAST:event_fatEkleActionPerformed

    private void hesapButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesapButonuActionPerformed
        int id=Faturaİslemleri.customId;
        mesajyazisi.setText("");
        int selectedRow=faturaTablo.getSelectedRow();
        int first_index=(int) model.getValueAt(selectedRow,3);
        int last_index=Integer.parseInt(lastAlan.getText());
        if(last_index<first_index||last_index<0){
            mesajyazisi.setText("İndex hatası...");
            setVisible(false);
            
        }else{
        if(selectedRow==-1){
            if(model.getRowCount()==0){
                mesajyazisi.setText("Fatura Tablosu boş veya girilen index büyük");
            }
            else{
            mesajyazisi.setText("Hesaplanacak faturada index hatası...");
        }}else{
                    int Recid=(int) model.getValueAt(selectedRow,0);
                    islemler.faturaHesap(last_index,first_index,Recid);
                    mesajyazisi.setText("Musteri Tablosu Guncellendi");
                    faturaGoruntule(id);
                    }     
    }//GEN-LAST:event_hesapButonuActionPerformed
    }
    private void faturaTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faturaTabloMouseClicked
        int selectedrow=faturaTablo.getSelectedRow();
        firstAlan.setText(model.getValueAt(selectedrow,3).toString());
        String a=model.getValueAt(selectedrow,2).toString();
        mesajyazisi.setText(a+" Ayı için işlem yapiliyor.");
    }//GEN-LAST:event_faturaTabloMouseClicked
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
            java.util.logging.Logger.getLogger(FaturaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FaturaEkran dialog = new FaturaEkran(new javax.swing.JFrame(), true,1);
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
    private javax.swing.JComboBox FatTarih;
    private javax.swing.JButton fatEkle;
    private javax.swing.JTextField faturaAramaCubuk;
    private javax.swing.JTable faturaTablo;
    private javax.swing.JTextField firstAlan;
    private javax.swing.JButton hesapButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastAlan;
    private javax.swing.JLabel mesajyazisi;
    // End of variables declaration//GEN-END:variables
}
