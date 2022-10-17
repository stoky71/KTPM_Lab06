package com.example.KTPM_Lab05.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

public class ChungNhanID implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8118334262964867951L;

	@Basic
	@Column(name = "MaNV")
	private String maNV;
	
	@Basic(optional = false)
	@Column(name = "MaMB")
	private Integer maMB;

	
	public String getMaNV() {
		return maNV;
	}


	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}


	public Integer getMaMB() {
		return maMB;
	}


	public void setMaMB(Integer maMB) {
		this.maMB = maMB;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "ChungNhanID [maNV=" + maNV + ", maMB=" + maMB + "]";
	}
	
}
