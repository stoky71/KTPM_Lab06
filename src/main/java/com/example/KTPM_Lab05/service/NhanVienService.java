package com.example.KTPM_Lab05.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.KTPM_Lab05.model.NhanVien;


@Service
public interface NhanVienService {
    public List<NhanVien> findNVLuongNhoHon10000();
    public NhanVien findNhanVienByMaNV(String maNV);
    public List<NhanVien> findAllNhanVien();
    public NhanVien saveNhanVien(NhanVien nhanvien);
    public void updateLuongNv(String maNV, Integer luong);
    public void deleteNhanVienById(String maNV);
}
