package com.yhq.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yhq.service.IXService;

@Service(version = "1.0")
public class XService implements IXService {

	@Override
	public String show() {
		return "provider1提供";
	}

}
