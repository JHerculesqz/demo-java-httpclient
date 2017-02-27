package com.huawei.client.provider.subprovider;

public class ClientSubProvider {
	// #region postHugeData

	public static void postHugeData(String strHugeData) {
		System.out.println("server recieve:" + strHugeData);
	}

	// #endregion

	// #region postSmallData

	public static void postSmallData(String strSmallData) {
		System.out.println("server recieve:" + strSmallData);
	}

	// #endregion
}
