public class Manager {
    private  int manİd;
    private String userName;
    private String password;
    private String region;

    public Manager(int manİd, String username, String password, String region) {
        this.manİd = manİd;
        this.userName = username;
        this.password = password;
        this.region = region;
    }
    public Manager() {
    }

    public int getManİd() {
        return manİd;
    }

    public void setManİd(int manİd) {
        this.manİd = manİd;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    
    
    
}
