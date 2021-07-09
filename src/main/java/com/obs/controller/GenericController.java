package com.obs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.obs.domain.Country;
import com.obs.helper.GenericServiceHelper;
import com.obs.messages.ResponseListMessage;

@RestController
public class GenericController {

	@Autowired
	private GenericServiceHelper genericServiceHelper;

	@GetMapping("/allcountry")
	public @ResponseBody ResponseListMessage<Country> getAllCountry(HttpServletRequest request,final HttpServletResponse res) {
		return genericServiceHelper.getAllCountry();
	}
}
