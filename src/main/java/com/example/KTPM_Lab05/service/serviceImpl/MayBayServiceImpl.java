package com.example.KTPM_Lab05.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTPM_Lab05.model.MayBay;
import com.example.KTPM_Lab05.respository.MayBayRepository;
import com.example.KTPM_Lab05.service.MayBayService;
@Service
public class MayBayServiceImpl implements MayBayService{
	@Autowired
	private MayBayRepository MayBayRepo;
	
	@Override
	public List<MayBay> findMBTamBayHon10000() {
		return MayBayRepo.findMayBayCoTamBayLonHon10k();
	}

}
