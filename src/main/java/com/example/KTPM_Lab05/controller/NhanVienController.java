package com.example.KTPM_Lab05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTPM_Lab05.model.NhanVien;
import com.example.KTPM_Lab05.service.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {

	@Autowired
	private NhanVienService nhanVienService;
	
    @GetMapping("/cau3")
    public List<NhanVien> getNhanVienLuongNhoHon10000(){
        return nhanVienService.findNVLuongNhoHon10000();
    }

//    1. Read NhanVien: All , findNhanVienByID
    @GetMapping("/nhanviens/{id}")
    public NhanVien getNhanVienByMaNV(@PathVariable("id") String nhanVienID){
        return nhanVienService.findNhanVienByMaNV(nhanVienID);
    }
    @GetMapping("/nhanviens")
    public List<NhanVien> getAllNhanVien(){
        return nhanVienService.findAllNhanVien();
    }

//    2. Create NhanVien:
    @PostMapping("/nhanviens")
     public NhanVien addNhanVien(@RequestBody NhanVien theNhanVien){
        return nhanVienService.saveNhanVien(theNhanVien);
     }

//     3. Update NhanVien biet Id
    @PutMapping("/nhanviens")
    public NhanVien updateLuongNhanVienById(@RequestBody NhanVien nhanvien){
        return nhanVienService.saveNhanVien(nhanvien);
    }

//    4. Delete NhanVien biet Id
    @DeleteMapping("/nhanviens/{id}")
    public String deleteNhanVienById(@PathVariable("id") String nhanVienId){

        nhanVienService.deleteNhanVienById(nhanVienId);
        return "Successfully!";
    }

}
