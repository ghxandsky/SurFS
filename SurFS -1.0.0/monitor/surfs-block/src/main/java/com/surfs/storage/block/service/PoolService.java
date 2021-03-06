/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package com.surfs.storage.block.service;

import java.util.List;
import java.util.Map;

import com.surfs.storage.block.model.ZpoolInfo;

public interface PoolService {

	public String getZpoolInfoJson();
	
	public String getZpoolStatus();
	
	public List<ZpoolInfo> getZpoolInfos();
	
	public String deleteRemoteVol(Map<String, String> args);
	
	public String deleteVol(String zpool, String vol);
	
	public String addVol(String zpool, String vol, String size);
	
	public String addRemoteVol(Map<String, String> args);
	
}
