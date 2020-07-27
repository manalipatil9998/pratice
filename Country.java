package com.edureka.spring.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
public class Country {
public static final Integer VALUE = 100;
	
	@Autowired
	State state;
	
	@Value("${country.countryname}")
	String name;
	
	@Value("#{22}")
	Integer language;
	
	@Value("#{true}")
	Boolean democratic;
	
	@Value("#{T(com.edureka.spring.assignment.Country).VALUE}")
 	Integer value;
}
