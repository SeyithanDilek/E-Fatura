
import java.util.Date;

public class Fatura {
    private int RecId;
    private int CusId;
    private String date;
    private int first_index;
    private int Brüt;
    private int KDV;
    private int Sum;

    public Fatura(int RecId, int CusId, String date,int first_index, int Brüt, int KDV, int Sum) {
        this.RecId = RecId;
        this.CusId = CusId;
        this.date = date;
        this.first_index = first_index;
        this.Brüt = Brüt;
        this.KDV = KDV;
        this.Sum = Sum;
    }

    Fatura(String date, int first_index) {
        this.date=date;
        this.first_index=first_index;
    }

    public int getRecId() {
        return RecId;
    }

    public void setRecId(int RecId) {
        this.RecId = RecId;
    }

    public int getCusId() {
        return CusId;
    }

    public void setCusId(int CusId) {
        this.CusId = CusId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFirst_index() {
        return first_index;
    }

    public void setFirst_index(int first_index) {
        this.first_index = first_index;
    }

    public int getBrüt() {
        return Brüt;
    }

    public void setBrüt(int Brüt) {
        this.Brüt = Brüt;
    }

    public int getKDV() {
        return KDV;
    }

    public void setKDV(int KDV) {
        this.KDV = KDV;
    }

    public int getSum() {
        return Sum;
    }

    public void setSum(int Sum) {
        this.Sum = Sum;
    }
    
    
    
    
    
    
    
}
