package com.obs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="country")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" , nullable = false )
	private Long id;
	
	@Column(name="name")
	private String countryName;
	
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="dail_code")
	private String countryDialCode;
	
	@Column(name="currency_numeric")
	private String currencyNumeric;
	
	@Column(name="iso")
	private String iso;
	
	@Column(name="country_code_three_letter")
	private String countryCodeThreeLetter;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="total_number")
	private int totalNumber;
	
	@Column(name="phone_format")
	private String phoneFormat;
	
	@Column(name="multiple_format",columnDefinition="tinyint(1) default 1")
	private boolean multipleFormat;
	
	@Column(name = "active",columnDefinition="tinyint(1) default 1")
	private boolean active;	
}
