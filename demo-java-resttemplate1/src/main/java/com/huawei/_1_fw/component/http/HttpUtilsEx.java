package com.huawei._1_fw.component.http;

import com.huawei._1_fw.component.http.provider.rest_template.RestTemplateProvider;
import com.huawei._1_fw.core.ioc.IOCUtils;

public class HttpUtilsEx {
	// #region getRestTemplateProvider

	public static RestTemplateProvider getProvider() {
		RestTemplateProvider oRestTemplateProvider = IOCUtils.getInstance().getBean(RestTemplateProvider.class);
		return oRestTemplateProvider;
	}

	// #endregion
}
