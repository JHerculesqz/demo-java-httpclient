package com.huawei.client.provider.subprovider;

import com.huawei._1_fw.component.http.HttpUtilsEx;

public class ClientSubProvider {
	// #region postHugeData

	public static void postHugeData(String strRemoteIP) {
		String strUrl = "http://" + strRemoteIP.replaceAll("\"", "") + ":7001/postHugeData";
		// TODO:generate strHugeData
		String strHugeData = "HugeData";
		String strRes = HttpUtilsEx.getProvider().post4Bu(strUrl, strHugeData, String.class);
		System.out.println("client recieve for postHugeData:" + strRes);
	}

	// #endregion

	// #region postSmallData

	public static void postSmallData(String strRemoteIP) {
		String strUrl = "http://" + strRemoteIP.replaceAll("\"", "") + ":7001/postSmallData";
		String strSmallData = "SmallData";
		String strRes = HttpUtilsEx.getProvider().post4Sys(strUrl, strSmallData, String.class);
		System.out.println("client recieve for postSmallData:" + strRes);
	}

	// #endregion
}
