package com.sbms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
	private int id;
	private int custId;
	private String street;
	private String city;
	private String state;
	private Long pinCode;
}
