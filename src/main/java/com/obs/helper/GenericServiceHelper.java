package com.obs.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.domain.Country;
import com.obs.messages.MessageConstants;
import com.obs.messages.ResponseListMessage;
import com.obs.messages.ResponseStatus;
import com.obs.messages.ResponseStatusCode;
import com.obs.repository.CountryRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GenericServiceHelper {
	
	@Autowired
	private CountryRepository countryRepository;

	public ResponseListMessage<Country> getAllCountry() {
		ResponseStatus status = null;
		List<Country> country = null;
		try {
			country = countryRepository.findAll();
			if (country != null && !country.isEmpty()) {
				status = new ResponseStatus(ResponseStatusCode.STATUS_OK, MessageConstants.SUCCESS);
			} else {
				status = new ResponseStatus(ResponseStatusCode.STATUS_NORECORD, MessageConstants.NORECORD);
				return new ResponseListMessage<>(status, country);
			}
		} catch (Exception e) {
			log.error(e.toString());
			}
		return new ResponseListMessage<>(status, country);
	}	
}
