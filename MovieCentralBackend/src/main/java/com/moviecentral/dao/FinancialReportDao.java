/**
 * 
 */
package com.moviecentral.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.moviecentral.pojos.PlayHistory;
import com.moviecentral.pojos.User;

/**
 * @author ravitejakommalapati
 *
 */

@Repository
@Transactional
@Component
public class FinancialReportDao {
	@PersistenceContext
	private EntityManager entityManager;
	public List<Object> getuniquesubscriptionusers() {
		List<Object> resusers= new ArrayList<Object>();
		Query query = entityManager.createNamedQuery("UserSubscription.getusers");
		
		List<Object> res = query.getResultList();
		if(res!=null&&res.size()>0)
		for(Object i:res) {
			System.out.println("Here in subscriptions"+i);
			Object ls = entityManager.find(User.class, i);
			resusers.add(ls);
		}
		
		entityManager.flush();
		
		
		
		return resusers;
	}
	
	
	public List<Object> getuniquepayperviewusers() {
		List<Object> resusers= null;
		Query query = entityManager.createNamedQuery("PayPerview.getpayperviewusers");
		
		resusers = query.getResultList();
		entityManager.flush();
		
		
		
		return resusers;
	}
	
	public List<Object> getuniqueactiveuser() {
		List<Object> resusers= null;
		Query query = entityManager.createNamedQuery("PayPerview.getpayperviewusers");
		
		resusers = query.getResultList();
		entityManager.flush();
		
		
		
		return resusers;
	}
	
	public List<Object> gettotaluniqueusers() {
		List<Object> resusers= null;
		Query query = entityManager.createNamedQuery("PayPerview.getpayperviewusers");
		
		resusers = query.getResultList();
		entityManager.flush();
		
		
		
		return resusers;
	}
	
}
