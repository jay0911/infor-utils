package com.infor.endpoints;

public interface SlotsEndpoints {
	public static final String GET_UNASSIGNEDSLOTS = "http://slot-service/getUnassignedSlots";
	public static final String GET_ASSIGNEDSLOTS = "http://slot-service/getAssignedSlots";
	public static final String GET_ALLSLOTS = "http://slot-service/getAllSlots";
	
	public static final String GET_UNAVAILSLOTS = "http://slot-service/getUnAvailSlot";	
	public static final String GET_AVAILSLOTS = "http://slot-service/getAvailSlot";
	
	public static final String GET_CONDITIONALSLOTS = "http://slot-service/getAllSlotsConditional";
}
