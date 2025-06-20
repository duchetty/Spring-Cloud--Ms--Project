package com.sbms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
	private Long id;
	private int custId;
	private String name;
	private int age;
	private String mobileNo;
	private String email;
}
