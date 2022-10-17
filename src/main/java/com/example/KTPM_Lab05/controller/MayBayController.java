package com.example.KTPM_Lab05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTPM_Lab05.model.MayBay;
import com.example.KTPM_Lab05.service.MayBayService;

@RestController
@RequestMapping("/api")
public class MayBayController {

	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/cau2")
    public List<MayBay> getMayBayHon10000(){
        return mayBayService.findMBTamBayHon10000();
    }
}
