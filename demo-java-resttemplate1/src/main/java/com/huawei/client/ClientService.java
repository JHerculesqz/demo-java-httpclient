package com.huawei.client;

import org.springframework.stereotype.Service;

import com.huawei.client.provider.MainProvider;

@Service
public class ClientService {
	// #region postHugeData

	public String postHugeData(String strRemoteIP) {
		return MainProvider.postHugeData(strRemoteIP);
	}

	// #endregion

	// #region postSmallData

	public String postSmallData(String strRemoteIP) {
		return MainProvider.postSmallData(strRemoteIP);
	}

	// #endregion
}
