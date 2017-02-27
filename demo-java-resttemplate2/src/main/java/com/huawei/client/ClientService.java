package com.huawei.client;

import org.springframework.stereotype.Service;

import com.huawei.client.provider.MainProvider;

@Service
public class ClientService {
	// #region postHugeData

	public String postHugeData(String strHugeData) {
		return MainProvider.postHugeData(strHugeData);
	}

	// #endregion

	// #region postSmallData

	public String postSmallData(String strSmallData) {
		return MainProvider.postSmallData(strSmallData);
	}

	// #endregion
}
