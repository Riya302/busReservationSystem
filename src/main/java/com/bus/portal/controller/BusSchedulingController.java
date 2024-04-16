package com.bus.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus.portal.pojos.BusSchedulingReqPojo;
import com.bus.portal.pojos.RegistrationReqPojo;
import com.bus.portal.pojos.RegistrationRespPojo;
import com.bus.portal.service.BusSchedulingSrvc;
@RestController
public class BusSchedulingController {
	@Autowired
	BusSchedulingSrvc schsrvc;
	@PostMapping("/schedulebus")
	public RegistrationRespPojo schedulebus(@RequestBody BusSchedulingReqPojo busschrep)
	{
		return(schsrvc.schedulebusrequest(busschrep));
	}

}
