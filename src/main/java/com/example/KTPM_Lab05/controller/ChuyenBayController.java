package com.example.KTPM_Lab05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTPM_Lab05.model.ChuyenBay;
import com.example.KTPM_Lab05.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {

	@Autowired
	private ChuyenBayService chuyenBayService;
	
	 @GetMapping("/cau1")
	    public List<ChuyenBay> getChuyenBayTuDAD(){
	        return chuyenBayService.findCBDiDAD();
	    }

	    @GetMapping("/cau4")
	    public List<ChuyenBay> getChuyenBayDoDaiTu8To10(){
	        return chuyenBayService.findCBDoDai8Toi10();
	    }
}
