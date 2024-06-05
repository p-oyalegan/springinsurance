package com.lic.Springbootinsurancemanagementplatform.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Claim {
	
	@Id
	@Column(name="claimId")
	private int claimId;
	
	@Column(name="claimNumber")
	private long claimNumber;
	
	@Column(name="claimDescription")
	private String claimDescription;
	
	@Column(name="claimDate")
	private String claimDate;
	
	@Column(name="claimStatus")
	private String claimStatus;
	
	@OneToOne
	@JoinColumn(name="policyId")
	private InsurancePolicy insurancePolicy;

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public long getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(long claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getClaimDescription() {
		return claimDescription;
	}

	public void setClaimDescription(String claimDescription) {
		this.claimDescription = claimDescription;
	}

	public String getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}
	
	
}
