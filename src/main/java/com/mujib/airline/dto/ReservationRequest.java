package com.mujib.airline.dto;

public class ReservationRequest {
	
	private Long flightId;
	private String passangerFirstName;
	private String passangerLastName;
	private String passangerMiddleName;
	private String passangerEmail;
	private String passangerPhone;

	private String nameOnTheCard;
	private String cardNumber;
	private String expirayDate;
	private String cvv;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getPassangerFirstName() {
		return passangerFirstName;
	}

	public void setPassangerFirstName(String passangerFirstName) {
		this.passangerFirstName = passangerFirstName;
	}

	public String getPassangerLastName() {
		return passangerLastName;
	}

	public void setPassangerLastName(String passangerMiddleName) {
		this.passangerMiddleName = passangerMiddleName;
	}
	
	public String getPassangerMiddleName() {
		return passangerMiddleName;
	}

	public void setPassangerMiddleName(String passangerLastName) {
		this.passangerLastName = passangerLastName;
	}

	public String getPassangerEmail() {
		return passangerEmail;
	}

	public void setPassangerEmail(String passangerEmaiName) {
		this.passangerEmail = passangerEmaiName;
	}

	public String getPassangerPhone() {
		return passangerPhone;
	}

	public void setPassangerPhone(String passangerPhone) {
		this.passangerPhone = passangerPhone;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirayDate() {
		return expirayDate;
	}

	public void setExpirayDate(String expirayDate) {
		this.expirayDate = expirayDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId + ", passangerFirstName=" + passangerFirstName
				+ ", passangerLastName=" + passangerLastName + ", passangerEmail=" + passangerEmail
				+ ", passangerPhone=" + passangerPhone + ", nameOnTheCard=" + nameOnTheCard + ", cardNumber="
				+ cardNumber + ", expirayDate=" + expirayDate + ", cvv=" + cvv + "]";
	}

}
