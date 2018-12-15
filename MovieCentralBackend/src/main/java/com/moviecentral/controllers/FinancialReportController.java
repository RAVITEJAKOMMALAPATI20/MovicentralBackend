/**
 * 
 */
package com.moviecentral.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviecentral.pojos.User;
import com.moviecentral.services.FinancialReportService;

/**
 * @author ravitejakommalapati
 *
 */


@RestController
@RequestMapping("/finacialreport")
public class FinancialReportController {

	
	@Autowired
	FinancialReportService financialReportService;
	
	@GetMapping("/uniquesubscriptionusers")
	public List<Object> getuniquesubscriptionusers() {
		List<Object>  resusers = financialReportService.getuniquesubscriptionusers();
		return resusers;
	}
	
	@GetMapping("/uniquepayperviewusers")
	public List<Object> getuniquepayperviewusers() {
		List<Object>  resusers = financialReportService.getuniquepayperviewusers();
		System.out.println("here");
		return resusers;
	}
	@GetMapping("/uniqueactiveuser")
	public List<Object> getuniqueactiveuser() {
		List<Object>  resusers = financialReportService.getuniqueactiveuser();
		return resusers;
	}
	@GetMapping("/totaluniqueusers")
	public List<Object> gettotaluniqueusers() {
		List<Object>  resusers = financialReportService.gettotaluniqueusers();
		return resusers;
	}
	
	
}
