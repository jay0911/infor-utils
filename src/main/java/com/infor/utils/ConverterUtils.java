package com.infor.utils;

import java.math.BigDecimal;

public class ConverterUtils {
	
	
	/**
	 * this method is user to convert any instance to String value
	 * @param objectToConvert
	 * @return
	 */
	public static String convertToString(Object objectToConvert){
		String retValue = "";
		if(objectToConvert == null){
			retValue = "";
		}else if(objectToConvert instanceof Integer){
			retValue = Integer.toString((Integer)objectToConvert);
		}else if(objectToConvert instanceof BigDecimal){
			retValue = objectToConvert.toString();
		}else if(objectToConvert instanceof Double){
			retValue = String.valueOf((Double)objectToConvert);
		}else if(objectToConvert instanceof Boolean){
			retValue = String.valueOf((Boolean) objectToConvert);
		}else if(objectToConvert instanceof Character){
			retValue = String.valueOf((Character) objectToConvert);
		}else if(objectToConvert instanceof String){
			retValue = (String) objectToConvert;
		}else{
			retValue = "";
		}
		return retValue;
	}
	
	/**
	 * this method is user to convert any instance to integer value
	 * @param objectToConvert
	 * @return
	 */
	public static int convertToInteger(Object objectToConvert){
		int retValue = 0;
		if(objectToConvert == null){
			retValue = 0;
		}else if(objectToConvert instanceof Integer){
			retValue = Integer.valueOf((Integer)objectToConvert);
		}else if(objectToConvert instanceof BigDecimal){
			retValue = ((BigDecimal) objectToConvert).intValue();
		}else if(objectToConvert instanceof Double){
			retValue = ((Double)objectToConvert).intValue();
		}else if(objectToConvert instanceof Boolean){
			if((Boolean) objectToConvert == true){
				retValue = 0;
			}else{
				retValue = 1;
			}
		}else if(objectToConvert instanceof String){
			retValue = Integer.valueOf((String)objectToConvert);
		}else{
			retValue = 0;
		}
		
		return retValue;
	}

}



