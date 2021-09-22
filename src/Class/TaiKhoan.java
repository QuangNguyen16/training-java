
package Class;


public class TaiKhoan {
    
    //Property
    private String user="";
    private String pass="";
    
    //Constructor
    public TaiKhoan(String user,String pass){
        this.user=user;
        this.pass=pass;
    }

    //Getter and setter
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
