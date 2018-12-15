/**
 * 
 */
package com.moviecentral.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecentral.dao.FinancialReportDao;
import com.moviecentral.pojos.User;

/**
 * @author ravitejakommalapati
 *
 */
@Service
public class FinancialReportService {
	
	@Autowired
	FinancialReportDao financialReportDao;
	public List<Object> getuniquesubscriptionusers() {
		List<Object>  resusers = financialReportDao.getuniquesubscriptionusers();
		return resusers;
	}
	
	
	public List<Object> getuniquepayperviewusers() {
		List<Object>  resusers = financialReportDao.getuniquepayperviewusers();
		return resusers;
	}
	
	public List<Object> getuniqueactiveuser() {
		List<Object>  resusers = financialReportDao.getuniqueactiveuser();
		return resusers;
	}
	
	public List<Object> gettotaluniqueusers() {
		List<Object>  resusers = financialReportDao.gettotaluniqueusers();
		return resusers;
	}
	

}
