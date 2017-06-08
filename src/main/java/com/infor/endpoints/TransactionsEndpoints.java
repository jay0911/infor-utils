package com.infor.endpoints;

public interface TransactionsEndpoints {
	public static final String CHECK_IF_REGISTERED_FOR_PARKING = "http://transaction-service/checkregisteredforparking";
	public static final String BEGIN_TRANSACTION = "http://transaction-service/begintransaction";
	public static final String END_TRANSACTION = "http://transaction-service/endtransaction";
}
