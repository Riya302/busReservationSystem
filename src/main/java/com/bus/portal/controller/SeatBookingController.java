package com.bus.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus.portal.model.BusDispatchModel;
import com.bus.portal.pojos.AllocationReqPojo;
import com.bus.portal.pojos.CustomerBookingReqPojo;
import com.bus.portal.pojos.CustomerBookingResp;
import com.bus.portal.pojos.CustomerBusSeatResp;
import com.bus.portal.pojos.RegistrationRespPojo;
import com.bus.portal.service.SeatBookingSrvc;


@RestController
public class SeatBookingController {
	@Autowired
	SeatBookingSrvc seatbooksrvc;
	@PostMapping("/customerseatbooking")
	public List<CustomerBookingResp> customerseatbooking(@RequestBody CustomerBookingReqPojo reqpojo)
	{
		return(seatbooksrvc.customerseatbooking(reqpojo));
	}
	@PostMapping("/fetchbusseatdetails")
	public CustomerBusSeatResp fetchbusseatdetails(@RequestBody CustomerBookingResp reqpojo)
	{
		return(seatbooksrvc.fetchbusseatdetails(reqpojo));
	}
	@PostMapping("/allocateseats")
	public RegistrationRespPojo allocateseats(@RequestBody AllocationReqPojo reqpojo)
	{
		return(seatbooksrvc.allocateseats(reqpojo));
	}

}