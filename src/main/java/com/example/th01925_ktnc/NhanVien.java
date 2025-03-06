package com.example.th01925_ktnc;

public class NhanVien {
    private String maNV;
    private String ten;
    private Integer tuoi;
    private Float luong;
    private Integer soNamLamViec;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, Integer tuoi, Float luong, Integer soNamLamViec, String phongBan) {
        this.maNV = maNV;
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null  ||  ten.isEmpty()){
            throw new IllegalArgumentException("ten is null or empty");
        }
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        if(tuoi == null){
            throw new IllegalArgumentException("tuoi is null");
        }else if(tuoi < 0){
            throw new IllegalArgumentException("tuoi must > 0");
        }
        this.tuoi = tuoi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        if(luong == null){
            throw new IllegalArgumentException("luong is null");
        }
        this.luong = luong;
    }

    public Integer getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(Integer soNamLamViec) {
        if(soNamLamViec == null){
            throw new IllegalArgumentException("soNamLamViec is null");
        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if(phongBan == null  ||  phongBan.isEmpty()){
            throw new IllegalArgumentException("phongBan is null or empty");
        }
        this.phongBan = phongBan;
    }
}
