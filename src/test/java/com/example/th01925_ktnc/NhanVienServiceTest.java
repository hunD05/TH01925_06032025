package com.example.th01925_ktnc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void updateNhanVienHopLe() {
        NhanVien nhanVien = new NhanVien("TH01925","Hung",19,50000.0f,2,"IT");
        nhanVienService.addNhanVien(nhanVien);

        nhanVien.setTen("Q");
        nhanVienService.updateNhanVien(nhanVien);
        assertEquals("Q",nhanVienService.getNhanVien("TH01925").getTen());
    }

    @Test
    void updateNhanVienNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.updateNhanVien(null);
        });
        assertEquals("NhanVien is null", exception.getMessage());
    }

    @Test
    void updateNhanVienEmptyTenNV(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.updateNhanVien(new NhanVien("TH01925","",19,50000.0f,2,"IT"));
        });
        assertEquals("ten is null or empty", exception.getMessage());
    }

    @Test
    void updateNhanVienEmptyPhongBan(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.updateNhanVien(new NhanVien("TH01925","ManhH",19,50000.0f,2,""));
        });
        assertEquals("phongBan is null or empty", exception.getMessage());
    }

    @Test
    void updateNhanVienInvalidTuoi(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.updateNhanVien(new NhanVien("TH01925","Manh Hung",-2,50000.0f,2,""));
        });
        assertEquals("tuoi must > 0", exception.getMessage());
    }



}