package com.bus.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bus.portal.model.BusDispatchModel;
import com.bus.portal.pojos.BusDetailsRespPojo;
import com.bus.portal.pojos.RegistrationRespPojo;
import com.bus.portal.repository.BusDetailsRepo;

public interface FetchBusDetailsSrvc {
	BusDetailsRespPojo fetchbusdetails(String busid);
	Boolean validatebusid(String busid);
	List<BusDispatchModel> fetchuncompletedtrip(String busid);
	List<BusDispatchModel> fetchcompletedtrip(String busid);
}
