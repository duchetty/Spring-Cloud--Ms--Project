package com.sbms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
		Optional<Address> findByCustId(int custId);
}
