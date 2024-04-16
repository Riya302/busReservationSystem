package com.bus.portal.service;

import java.io.PrintWriter;

import com.bus.portal.pojos.RegistrationReqPojo;
import com.bus.portal.pojos.RegistrationRespPojo;

public interface RegistrationSrvc {
	public Boolean savebusdetails(RegistrationReqPojo regpojo);
	public RegistrationRespPojo registersinglebusdetails(RegistrationReqPojo regpojo);
	public RegistrationRespPojo checkusername(String username);
}