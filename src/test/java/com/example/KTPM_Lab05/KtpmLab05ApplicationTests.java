package com.example.KTPM_Lab05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.KTPM_Lab05.model.NhanVien;
import com.example.KTPM_Lab05.service.ChuyenBayService;
import com.example.KTPM_Lab05.service.MayBayService;
import com.example.KTPM_Lab05.service.NhanVienService;

@SpringBootTest
class KtpmLab05ApplicationTests {

	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@Autowired
	private MayBayService mayBayService;
	
	@Autowired 
	private NhanVienService nhanVienService;
	
	@Test
    void chuyenBayTuDAD1() {
        chuyenBayService.findCBDiDAD().forEach(System.out::println);
    }

    @Test
    void mayBayTamBayHon10000(){
        mayBayService.findMBTamBayHon10000().forEach(System.out::println);
    }

    @Test
    void nhanVienLuongNhoHon10000(){
        nhanVienService.findNVLuongNhoHon10000().forEach(System.out::println);
    }

    @Test
    void getNhanVienById(){
        NhanVien nv = nhanVienService.findNhanVienByMaNV("011564812");
        System.out.println(nv);
    }

    @Test
    void updateNhanVienById(){
        nhanVienService.updateLuongNv("011564812", 153974);
    }

}
