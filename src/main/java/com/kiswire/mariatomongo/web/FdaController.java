package com.kiswire.mariatomongo.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.mariatomongo.rdb.domain.Fda001;
import com.kiswire.mariatomongo.rdb.domain.Fda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Machine001;
import com.kiswire.mariatomongo.rdb.domain.Machine001Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class FdaController {
	
	private final Fda001Repository fda001Repository;
	private final Machine001Repository machine001Repository;

	// 더미데이터 생성
	@PostMapping("/001")
	public String save() {
		Machine001 machine = machine001Repository.findById(1L).get();
		
		List<Fda001> datas = new ArrayList<>();
 		for(int i=0; i<1000000; i++) {
			Fda001 f = new Fda001();
			f.setFda001R0037("data"+i);
			f.setFda001R0038("data"+i);
			f.setFda001R0039("data"+i);
			f.setFda001R0040("data"+i);
			f.setMachine(machine);
			datas.add(f);
		}
 		fda001Repository.saveAll(datas);
		
		return "ok";
	}
	
	@GetMapping("/001")
	public List<Fda001> findAll(){
		return fda001Repository.findAll();
	}
}
