package com.martinmurillo.IoThings.iothings.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.martinmurillo.IoThings.iothings.entity.Device;
import com.martinmurillo.IoThings.iothings.repository.DeviceRepository;

public class DeviceService {
	
	private DeviceRepository deviceRepository;
	
	@Autowired
	public DeviceService(DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}
	
	
	public List<Device> getAllDevices(){
		
			return deviceRepository.findAll();
	}
	
	
	
	

}
