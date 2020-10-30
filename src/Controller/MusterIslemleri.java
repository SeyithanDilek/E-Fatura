import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class MusterIslemleri {
    private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    public static int manid ;
    public int girisYap(String username,String password){
        String sorgu;
        sorgu = "Select * From managers where manUsname = ? and password = ? ";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                MusterIslemleri.manid=rs.getInt(1);
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }
    public MusterIslemleri(){
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException var4) {
            System.out.println("Driver Bulunamadı....");
        }

        try {
            this.con = DriverManager.getConnection(url,Database.kullanici_adi,Database.parola);
            System.out.println("Bağlantı Başarılı...");
        } catch (SQLException var3) {
            System.out.println("Bağlantı Başarısız...");
        }
        
    }
    public void faturaAc(int id){
        FaturaEkran faturaEkran=new FaturaEkran(null, true, id);
        faturaEkran.setVisible(true);
      
    }
    public void musteriSil(int id){
        int yesorno=JOptionPane.showConfirmDialog(null,"Silmek istediğinizden emin misiniz?","Sil",JOptionPane.YES_NO_OPTION);
        if(yesorno==0){
        String sorgu="Delete from customers where cusId=?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            
        }
    }
    }
    public void musteriEkle(String name,int id){
        int yesorno=JOptionPane.showConfirmDialog(null,"Eklemek istediğinizden emin misiniz?","Ekle",JOptionPane.YES_NO_OPTION);
        if(yesorno==0){
        String bolge;String bolge1="Avrupa";String bolge2="Anadolu";
        if(id==1){
             bolge=bolge1;
        }
        else{
            bolge=bolge2;
        }
        String sorgu="Insert Into customers (cusName,manRegion,manId) VALUES(?,?,?)";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, bolge);
            preparedStatement.setInt(3,id);
            preparedStatement.executeUpdate();
        } catch (SQLException var3) {
            JOptionPane.showMessageDialog(null,var3);
        }    
        
      }
    }
    public void musteriGuncelle(String name,int cusId){
        int yesorno=JOptionPane.showConfirmDialog(null,"Güncellemek istediğinizden emin misiniz?","Guncel",JOptionPane.YES_NO_OPTION);
        if(yesorno==0){
        
        String sorgu="Update customers set cusName=? where cusId=? ";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, cusId);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }}
    public ArrayList<Customer> musterileriGetir(int manId){
        ArrayList<Customer> cikti=new ArrayList<>();
        try {
            String sorgu;
            sorgu = "Select * From customers where manId=?";
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1,manId);
            ResultSet rs =preparedStatement.executeQuery();
            while(rs.next()) {                
                int id=rs.getInt("cusId");
                String ad=rs.getString("cusName");
                String region=rs.getString("manRegion");
                cikti.add(new Customer(id,ad,manId,region));
            }
            return cikti;
        } catch (SQLException var2) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null,var2);
            return null;
        }
    }
}

