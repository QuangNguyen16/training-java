
package Class;

public class LopCoDinh {
    /**
     *Mã lớp cố định = maLopCD;
     * Năm học  = namHoc;
     * Mã khoa = maKhoa;
     */
    
    //Property
    private String maLopCD;
    private String namHoc;
    private String maKhoa;

    //Constructor
    public LopCoDinh() {
    }

    public LopCoDinh(String maLopCD, String namHoc, String MaKhoa) {
        this.maLopCD = maLopCD;
        this.namHoc = namHoc;
        this.maKhoa = MaKhoa;
    }

    //Getter and setter
    public String getMaLopCD() {
        return maLopCD;
    }

    public void setMaLopCD(String maLopCD) {
        this.maLopCD = maLopCD;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.maKhoa = MaKhoa;
    }

    @Override
    public String toString() {
        return "LopCoDinh{" + "maLopCD=" + maLopCD + ", namHoc=" + namHoc + ", maKhoa=" + maKhoa + '}';
    }
    
    
}
