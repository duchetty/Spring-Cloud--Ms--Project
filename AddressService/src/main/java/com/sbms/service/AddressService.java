package com.sbms.service;

import java.util.List;

import com.sbms.dto.AddressDto;
import com.sbms.entity.Address;

public interface AddressService {
	
	public Address saveAddress(AddressDto AddressDto);
	public AddressDto fetchAddress(int id);
	public List<Address> fetchAllAddress();
	public Address updateAddress(int id, AddressDto customerDto);
	public void deleteAddress(int id);
	public AddressDto getAddressDetails(int custId);
}
