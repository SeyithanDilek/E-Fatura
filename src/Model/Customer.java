public class Customer {
    
    private int cusId;
    private String cusName;
    private long manId;
    private String manRegion;

    public Customer(int cusId, String cusName, long manId, String manRegion) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.manId = manId;
        this.manRegion = manRegion;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public long getManId() {
        return manId;
    }

    public void setManId(long manId) {
        this.manId = manId;
    }

    public String getManRegion() {
        return manRegion;
    }

    public void setManRegion(String manRegion) {
        this.manRegion = manRegion;
    }
    
    
    
    
    
    
    
    
    
}