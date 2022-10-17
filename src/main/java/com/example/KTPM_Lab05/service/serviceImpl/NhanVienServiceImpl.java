package com.example.KTPM_Lab05.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTPM_Lab05.model.NhanVien;	
import com.example.KTPM_Lab05.respository.NhanVienRepository;
import com.example.KTPM_Lab05.service.NhanVienService;
@Service
public class NhanVienServiceImpl implements NhanVienService{
	@Autowired
	private NhanVienRepository nhanVienRepo;

	@Override
	public List<NhanVien> findNVLuongNhoHon10000() {
		return nhanVienRepo.findNhanVienLuongItHon10k();
	}

	@Override
	public NhanVien findNhanVienByMaNV(String maNV) {
		// TODO Auto-generated method stub
		return nhanVienRepo.findNhanVienByMaNV(maNV);
	}

	@Override
	public List<NhanVien> findAllNhanVien() {
		// TODO Auto-generated method stub
		return nhanVienRepo.findAllNhanVien();
	}

	@Override
	public NhanVien saveNhanVien(NhanVien nhanvien) {
		// TODO Auto-generated method stub
		return nhanVienRepo.save(nhanvien);
	}

	@Override
	public void updateLuongNv(String maNV, Integer luong) {
		nhanVienRepo.updateNhanVienById(maNV, luong);
	}

	@Override
	public void deleteNhanVienById(String maNV) {
		nhanVienRepo.deleteNhanVienById(maNV);
	}
	
	
}
