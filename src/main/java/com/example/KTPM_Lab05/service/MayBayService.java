package com.example.KTPM_Lab05.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.KTPM_Lab05.model.MayBay;


@Service
public interface MayBayService {
	public List<MayBay> findMBTamBayHon10000();
}
