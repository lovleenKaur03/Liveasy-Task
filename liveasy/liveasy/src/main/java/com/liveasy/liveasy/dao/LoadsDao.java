package com.liveasy.liveasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasy.liveasy.entities.Loads;

public interface LoadsDao extends JpaRepository<Loads, Long>{
	List<Loads> findAllByShipperId(long shipperId);
}
