package com.martinmurillo.IoThings.iothings.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Devices")
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="DeviceName")
	private String DeviceName;
	
	@Column(name="Fuctionalities")
	private String Fuctionalities;
	
	public Device(String DeviceName, String Fuctionalities) {
		this.DeviceName=DeviceName;
		this.Fuctionalities=Fuctionalities;
	}

	public long getId() {
		return Id;
	}

	public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public String getFuctionalities() {
		return Fuctionalities;
	}

	public void setFuctionalities(String fuctionalities) {
		Fuctionalities = fuctionalities;
	}

	@Override
	public String toString() {
		return "Device [Id=" + Id + ", DeviceName=" + DeviceName + ", Fuctionalities=" + Fuctionalities + "]";
	}
	
	

}
