package com.example.addressservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressservice.entity.Address;
import com.example.addressservice.model.AddressResponse;
import com.example.addressservice.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmpId(int empId) {
		
		Address address = addressRepo.findAddressByEmpId(empId);
		AddressResponse map = modelMapper.map(address, AddressResponse.class);
		
		return map;		
		
	}

}
