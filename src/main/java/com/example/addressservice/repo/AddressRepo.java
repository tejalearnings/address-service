package com.example.addressservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.addressservice.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	// address based on id

	@Query(nativeQuery = true,value ="SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip FROM teja.address ea"
			+ " join teja.employee e on e.id = ea.employee_id where ea.employee_id=:empId")
	Address findAddressByEmpId(@Param("empId") int empId);

}
