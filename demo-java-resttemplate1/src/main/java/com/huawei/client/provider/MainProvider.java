package com.huawei.client.provider;

import com.huawei.client.provider.subprovider.ClientSubProvider;

public class MainProvider {
	// #region postHugeData

	public static String postHugeData(String strRemoteIP) {
		ClientSubProvider.postHugeData(strRemoteIP);

		return "ok";
	}

	// #endregion

	// #region postSmallData

	public static String postSmallData(String strRemoteIP) {
		ClientSubProvider.postSmallData(strRemoteIP);

		return "ok";
	}

	// #endregion
}
