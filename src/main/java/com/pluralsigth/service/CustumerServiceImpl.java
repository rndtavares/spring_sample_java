package com.pluralsigth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsigth.model.Custumer;
import com.pluralsigth.repository.CustumerRepository;

@Service("custumerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustumerServiceImpl implements CustumerService {

	
	private CustumerRepository custumerRepository;
	
	public CustumerServiceImpl() {
	}

	public CustumerServiceImpl(CustumerRepository custumerRepository) {
		System.out.println("we are using constructor injection");
		this.custumerRepository = custumerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralsigth.service.CustumerService#findAll()
	 */
	@Override
	public List<Custumer> findAll(){
		return custumerRepository.findAll();
	}

	@Autowired
	public void setCustumerRepository(CustumerRepository custumerRepository) {
		System.out.println("we are using setter injection");
		this.custumerRepository = custumerRepository;
	}
}
