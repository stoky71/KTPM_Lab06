package com.example.KTPM_Lab05.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTPM_Lab05.model.ChuyenBay;
import com.example.KTPM_Lab05.respository.ChuyenBayRepository;
import com.example.KTPM_Lab05.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> findCBDiDAD() {
		return chuyenBayRepository.findChuyenBaystoGaDiDAD();
	}

	@Override
	public List<ChuyenBay> findCBDoDai8Toi10() {
		return chuyenBayRepository.findChuyenBayDoDaiHon8VaNhoHon10();
	}
	
}
