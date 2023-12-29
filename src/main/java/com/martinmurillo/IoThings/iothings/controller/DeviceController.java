package com.martinmurillo.IoThings.iothings.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martinmurillo.IoThings.iothings.entity.Device;
import com.martinmurillo.IoThings.iothings.service.DeviceService;

@RestController
@RequestMapping("/api")
public class DeviceController {
	
	private final DeviceService deviceService;
	
	@Autowired
	public DeviceController(DeviceService deviceService){
		this.deviceService = deviceService;
	}
	
	
	@GetMapping("/devices")
	public ResponseEntity<List<Device>> getAllDevices(@RequestParam(required=false) int DeviceId ){
		List<Device> devices = new ArrayList<>();
		deviceService.getAllDevices().forEach(devices::add);			
		return new ResponseEntity<>(devices, HttpStatus.OK);
		
	}
	
	
	
		

}
