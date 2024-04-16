package com.bus.portal.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.bus.portal.model.BusDispatchModel;
import com.bus.portal.pojos.AllocationReqPojo;
import com.bus.portal.pojos.CustomerBookingReqPojo;
import com.bus.portal.pojos.CustomerBookingResp;
import com.bus.portal.pojos.CustomerBusSeatResp;
import com.bus.portal.pojos.RegistrationRespPojo;

public interface SeatBookingSrvc {
	public List<CustomerBookingResp> customerseatbooking(CustomerBookingReqPojo reqpojo);
	public CustomerBusSeatResp fetchbusseatdetails(CustomerBookingResp reqpojo);
	public RegistrationRespPojo allocateseats(AllocationReqPojo reqpojo);
}