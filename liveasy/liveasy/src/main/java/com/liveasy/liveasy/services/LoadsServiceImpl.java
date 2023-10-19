package com.liveasy.liveasy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.liveasy.dao.LoadsDao;
import com.liveasy.liveasy.entities.Loads;

@Service
public class LoadsServiceImpl implements LoadService {

	@Autowired
	private LoadsDao loadsDao;
	public LoadsServiceImpl() {
		
	}
	
	
	@Override
	public List<Loads> getLoads(long shipperId) {
		return loadsDao.findAllByShipperId(shipperId);
	}


	@Override
	public Loads getLoad(long loadId) {
		return loadsDao.getOne(loadId);
	}


	@Override
	public Loads addLoad(Loads load) {
		loadsDao.save(load);
		return load;
	}


	@Override
	public Loads updateLoad(Loads load, long loadId) {
		loadsDao.save(load);
		return load;
	}


	@Override
	public void deleteLoad(long loadId) {
		Loads load = loadsDao.getOne(loadId);
		loadsDao.delete(load);
	}

}
