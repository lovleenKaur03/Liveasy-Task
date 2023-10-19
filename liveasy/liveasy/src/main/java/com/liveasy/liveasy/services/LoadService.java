package com.liveasy.liveasy.services;

import java.util.List;

import com.liveasy.liveasy.entities.Loads;

public interface LoadService {

	public List<Loads> getLoads(long shipperId);
	public Loads getLoad(long loadId);
	public Loads addLoad(Loads load);
	public Loads updateLoad(Loads load,long loadId);
	public void deleteLoad(long loadId);
}
