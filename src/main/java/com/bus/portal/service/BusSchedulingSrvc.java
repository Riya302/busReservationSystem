package com.bus.portal.service;

import com.bus.portal.pojos.BusSchedulingReqPojo;
import com.bus.portal.pojos.RegistrationRespPojo;

public interface BusSchedulingSrvc {
	Boolean schedulebus(BusSchedulingReqPojo schbusreqpojo);
	RegistrationRespPojo schedulebusrequest(BusSchedulingReqPojo schbusreqpojo);

}