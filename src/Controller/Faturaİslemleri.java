import com.mysql.jdbc.Statement;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Faturaİslemleri {
    private Connection con = null;
    private final Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public static int customId;
    public static Date tarih;
    public static int index;
    public ArrayList<Fatura> FaturalariGetir(int cusId) {
        Faturaİslemleri.customId=cusId;
        ArrayList<Fatura> cikti = new ArrayList<Fatura>();
        try {
            String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException var4) {
                System.out.println("Driver Bulunamadı....");
            }

            try {
                this.con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
                System.out.println("Bağlantı Başarılı...");
            } catch (SQLException var3) {
                System.out.println("Bağlantı Başarısız...");
            }
            String sorgu;
            sorgu = "Select * From fatura where cusId=?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,customId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int RecId=rs.getInt("RecId");
                int CusId=rs.getInt("CusId");
                int Brüt=rs.getInt("Brüt");
                int KDV=rs.getInt("KDV");
                int sum=rs.getInt("Sum");
                String date = rs.getString("date");
                int first_index = rs.getInt("first_index");
                cikti.add(new Fatura(RecId,cusId,date,first_index,Brüt,KDV,sum ));
            }
            return cikti;
        } catch (SQLException var3) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null, var3);
            return null;
        }
    }
    public void faturaGuncelle(String date,int first_index,int id){
        String sorgu="Update fatura set date=?,first_index=? where RecId=? ";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1,date);
            preparedStatement.setInt(2,first_index);
            preparedStatement.setInt(3,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void faturaSil(int id){
        String sorgu="Delete from fatura where Recid=?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Faturaİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void faturaHesap(int last_index,int first_index,int RecId){
        int brüt=(last_index-first_index)*5;
        int kdv=brüt*18/100;
        int sum=brüt+kdv;
        first_index=last_index;
        String sorgu="Update fatura set first_index=?,Brüt=?,KDV=?,sum=? where RecId=? ";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setInt(1,last_index);
            preparedStatement.setInt(2,brüt);
            preparedStatement.setInt(3,kdv);
            preparedStatement.setInt(4, sum);
            preparedStatement.setInt(5,RecId);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void faturaEkle(String date,int first,int customId) {
       String sorgu="Insert Into fatura (date,first_index,CusId) VALUES(?,?,?)";
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1,date);
            preparedStatement.setInt(2,first);
            preparedStatement.setInt(3,customId);
            preparedStatement.executeUpdate();
        } catch (SQLException var3) {
            Logger.getLogger(MusterIslemleri.class.getName()).log(Level.SEVERE, null, var3);
        }
}
}
