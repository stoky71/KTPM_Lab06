package com.example.KTPM_Lab05.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.KTPM_Lab05.model.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	@Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
	public List<MayBay> findMayBayCoTamBayLonHon10k();
	
	@Query(value = "select count(MaMB) from maybay where Loai like '%Boeing%'", nativeQuery = true)
	public int findMayBayLoaiBoeing();
	
	
}
