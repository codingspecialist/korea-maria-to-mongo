package com.kiswire.mariatomongo.rdb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "fda001")
public class Fda001 {
	// 필드 ~~~~!!
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, name = "FDA001_R0037")
	private String FDA001R0037;
	
	@Column(length = 20, name = "FDA001_R0038")
	private String FDA001R0038;
	
	@Column(length = 20, name = "FDA001_R0039")
	private String FDA001R0039;
	
	@Column(length = 20, name = "FDA001_R0040")
	private String FDA001R0040;
}
