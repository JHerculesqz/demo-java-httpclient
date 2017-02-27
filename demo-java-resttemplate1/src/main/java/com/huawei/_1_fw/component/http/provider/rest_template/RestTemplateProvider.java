package com.huawei._1_fw.component.http.provider.rest_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.huawei._1_fw.component.http.provider.rest_template.vo.ConfigRestTemplateVo;

@Component
public class RestTemplateProvider {
	// #region Fields

	@Autowired
	private ConfigRestTemplateVo configRestTemplateVo;

	@Autowired
	private RestTemplate restTemplate4Sys;

	@Autowired
	private RestTemplate restTemplate4Bu;

	@Bean
	public ConfigRestTemplateVo configRestTemplateVo() {
		return new ConfigRestTemplateVo();
	}

	@Bean
	public RestTemplate restTemplate4Sys() {
		// 1.set timeout
		HttpComponentsClientHttpRequestFactory oRequestFactory = new HttpComponentsClientHttpRequestFactory();
		oRequestFactory.setConnectionRequestTimeout(configRestTemplateVo.getHttpRestTimeout4ReqSys());
		oRequestFactory.setConnectTimeout(configRestTemplateVo.getHttpRestTimeout4ConSys());
		oRequestFactory.setReadTimeout(configRestTemplateVo.getHttpRestTimeout4ReadSys());

		// JacksonConverter??

		return new RestTemplate(oRequestFactory);
	}

	@Bean
	public RestTemplate restTemplate4Bu() {
		// 1.set timeout
		HttpComponentsClientHttpRequestFactory oRequestFactory = new HttpComponentsClientHttpRequestFactory();
		oRequestFactory.setConnectionRequestTimeout(configRestTemplateVo.getHttpRestTimeout4ReqBu());
		oRequestFactory.setConnectTimeout(configRestTemplateVo.getHttpRestTimeout4ConBu());
		oRequestFactory.setReadTimeout(configRestTemplateVo.getHttpRestTimeout4ReadBu());

		// JacksonConverter??

		return new RestTemplate(oRequestFactory);
	}

	// #endregion

	// #region post

	public <T> T post4Sys(String strUrl, Object oParams, Class<T> oClazz) {
		T oRes = restTemplate4Sys.postForObject(strUrl, oParams, oClazz);
		return oRes;
	}

	public <T> T post4Bu(String strUrl, Object oParams, Class<T> oClazz) {
		T oRes = restTemplate4Bu.postForObject(strUrl, oParams, oClazz);
		return oRes;
	}

	// #endregion
}
