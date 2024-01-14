package com.bpsc.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fullName;
	
	private String fatherName;
	
	private String husbandName;
	
	private String motherName;
	private String idType;
	private String idNo;
	private String citizenIndia;
	private String permanentResident;

	private String stateNames;
	private String district;
	private String pin;
	private String certificateNo;
	private String reservedCategory;
	private String categoryCode;
	private String casteCertificateDetails;
	private String qualification;
	private String maritalStatus;
	private String gender;
	private String freedomFighter;
	
	private String qualificationCatogory;
	private String address;

	private String mobileNo;

	private String email;
	private String password;
	
	private String role;

	
	
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}



	public String getCitizenIndia() {
		return citizenIndia;
	}

	public void setCitizenIndia(String citizenIndia) {
		this.citizenIndia = citizenIndia;
	}

	public String getPermanentResident() {
		return permanentResident;
	}

	public void setPermanentResident(String permanentResident) {
		this.permanentResident = permanentResident;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}



	public String getReservedCategory() {
		return reservedCategory;
	}

	public void setReservedCategory(String reservedCategory) {
		this.reservedCategory = reservedCategory;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCasteCertificateDetails() {
		return casteCertificateDetails;
	}

	public void setCasteCertificateDetails(String casteCertificateDetails) {
		this.casteCertificateDetails = casteCertificateDetails;
	}




	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFreedomFighter() {
		return freedomFighter;
	}

	public void setFreedomFighter(String freedomFighter) {
		this.freedomFighter = freedomFighter;
	}


	public String getQualificationCatogory() {
		return qualificationCatogory;
	}

	public void setQualificationCatogory(String qualificationCatogory) {
		this.qualificationCatogory = qualificationCatogory;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStateNames() {
		return stateNames;
	}

	public void setStateNames(String stateNames) {
		this.stateNames = stateNames;
	}
	
	

}