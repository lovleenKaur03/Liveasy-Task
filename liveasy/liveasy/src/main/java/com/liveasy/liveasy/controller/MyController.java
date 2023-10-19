package com.liveasy.liveasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.liveasy.entities.Loads;
import com.liveasy.liveasy.services.LoadService;


@RestController
public class MyController {
	
	@Autowired
	private LoadService loadsService;
	
	@GetMapping("/load")
	public List<Loads> getLoads(@RequestParam("shipperId") String shipperId){
		return this.loadsService.getLoads(Long.parseLong(shipperId));
		
	}
	
	@GetMapping("/load/{loadId}")
	public Loads getLoad(@PathVariable String loadId) {
		return this.loadsService.getLoad(Long.parseLong(loadId));
	}
	
	@PostMapping(path="/load",consumes="application/json")
	public Loads addLoad(@RequestBody Loads load) {
		
		return this.loadsService.addLoad(load);
	}
	
	@PutMapping("/load/{loadId}")
	public Loads updateCourse(@RequestBody Loads load,@PathVariable String loadId) {
		return this.loadsService.updateLoad(load,Long.parseLong(loadId));
	};
	
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId) {
		this.loadsService.deleteLoad(Long.parseLong(loadId));
	}
	

}
