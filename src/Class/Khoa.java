
package Class;

public class Khoa {
    /**
     * Mã khoa = maKhoa;
     * Tên khoa = tenKhoa;
     */
    
    //Property
    private String maKhoa;
    private String tenKhoa;
    
    //constructor
    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public Khoa() {
        
    }
    
    //Getter and setter
    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "Khoa{" + "maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + '}';
    }
    
}
