package com.huawei.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	// #region Fields

	@Autowired
	private ClientService clientService;

	// #endregion

	// #region postHugeData

	@RequestMapping("/postHugeData")
	@ResponseBody
	public String postHugeData(@RequestBody String strRemoteIP) {
		return this.clientService.postHugeData(strRemoteIP);
	}

	// #endregion

	// #region hello2

	@RequestMapping("/postSmallData")
	@ResponseBody
	public String postSmallData(@RequestBody String strRemoteIP) {
		return this.clientService.postSmallData(strRemoteIP);
	}

	// #endregion
}
