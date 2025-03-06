package com.example.th01925_ktnc;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> listNhanVien = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {
        if(nhanVien == null){
            throw new IllegalArgumentException("NhanVien is null");
        }
        listNhanVien.add(nhanVien);
    }

    public void updateNhanVien(NhanVien nhanVien) {
        if(nhanVien == null){
            throw new IllegalArgumentException("NhanVien is null");
        }
        for (int i = 0; i < listNhanVien.size(); i++) {
            if(listNhanVien.get(i).equals(nhanVien.getMaNV())){
                listNhanVien.set(i, nhanVien);
                return;
            }
        }
    }

    public NhanVien getNhanVien(String maNV) {
        for(NhanVien nhanVien : listNhanVien){
            if(nhanVien.getMaNV().equals(maNV)){
                return nhanVien;
            }
        }
        return null;
    }
}
