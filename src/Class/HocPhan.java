
package Class;

public class HocPhan {
    
    /***
     * Mã học phần = maHocPhan;
     * Tên học phần = tenHocPhan;
     * Số tiết = soTiet;
     * Số tín chỉ = soTinChi
     */
    
    //Property
    private String maHocPhan;
    private String tenHocPhan;
    private int soTiet;
    private int soTinChi;

    //Constructor
    public HocPhan(String maHocPhan, String tenHocPhan, int soTiet, int soTinChi) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTiet = soTiet;
        this.soTinChi = soTinChi;
    }
    
    public HocPhan(){
        
    }

    //Getter and setter
    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "HocPhan{" + "maHocPhan=" + maHocPhan + ", tenHocPhan=" + tenHocPhan + ", soTiet=" + soTiet + ", soTinChi=" + soTinChi + '}';
    }
    
}
