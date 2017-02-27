package com.huawei.client.provider;

import com.huawei.client.provider.subprovider.ClientSubProvider;

public class MainProvider {
	// #region postHugeData

	public static String postHugeData(String strHugeData) {
		ClientSubProvider.postHugeData(strHugeData);

		return "ok";
	}

	// #endregion

	// #region postSmallData

	public static String postSmallData(String strSmallData) {
		ClientSubProvider.postSmallData(strSmallData);

		return "ok";
	}

	// #endregion
}
