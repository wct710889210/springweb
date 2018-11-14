package com.web.converter;

import org.springframework.core.convert.converter.Converter;

public class LongConverter implements Converter<Long,String> {
    @Override
    public String convert(Long source) {
        return source.toString();
    }
}
