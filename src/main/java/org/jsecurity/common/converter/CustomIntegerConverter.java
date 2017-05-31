package org.jsecurity.common.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

public class CustomIntegerConverter implements Converter<String, Integer> {


    public CustomIntegerConverter() {
    }
	
	public Integer convert(String source) {
		 if(!StringUtils.hasLength(source)) {
             return null;
		 }
		 return Integer.parseInt(source);
	}
}
