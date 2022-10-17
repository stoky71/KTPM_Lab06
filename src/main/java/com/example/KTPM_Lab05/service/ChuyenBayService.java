package com.example.KTPM_Lab05.service;

import com.example.KTPM_Lab05.model.ChuyenBay;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface ChuyenBayService {
	public List<ChuyenBay> findCBDiDAD();
	public List<ChuyenBay> findCBDoDai8Toi10();
}
