
package Class;


public class Diem {
    /***
     * Số thứ tự = stt;
     * Mã sinh viên = maSV;
     * Tên học phần = tenHP;
     * Điểm = diem;
     * Điểm trung bình = diemTB;
     * Kết quả = ketQua;
     */
    //Property
    private int stt;
    private String maSV;
    private String maHP;
    private String tenHP;
    private double diem;
    private double diemTB;
    private String ketQua;
    
    //Constructor
    public Diem(int stt,String maSV, String maHP, String tenHP, double diem, double diemTB, String ketQua) {
        this.stt=stt;
        this.maSV = maSV;
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.diem = diem;
        this.diemTB = diemTB;
        this.ketQua = ketQua;
    }

    public Diem() {
    }
    
    //Getter and setter
    public int getSTT() {
        return stt;
    }

    public void setSTT(int STT) {
        this.stt = STT;
    }

    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }
    
    
}
