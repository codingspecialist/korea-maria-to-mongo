package com.kiswire.mariatomongo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.mariatomongo.rdb.domain.Fda001;
import com.kiswire.mariatomongo.rdb.domain.Fda001Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class FdaController {
	
	private final Fda001Repository fda001Repository;
	
	@PostMapping("/001")
	public String save(@RequestBody Fda001 fda001) {
		System.out.println(fda001);
		fda001Repository.save(fda001);
		return "ok";
	}
}
