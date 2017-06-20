package com.infor.utils;

import com.infor.dto.MaintenanceDTO;
import com.infor.dto.SlotsDTO;

public class InstantationUtil {
	/**
	 * creates dto instance
	 * @return
	 */
	public static MaintenanceDTO createDTOinstance(){
		return new MaintenanceDTO();
	}
	
	public static SlotsDTO createSlotsDTOInstance(){
		return new SlotsDTO();
	}
}
