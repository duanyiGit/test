package cn.com.common;

import org.apache.log4j.Logger;

public class Log {
	private static Logger logger;
	
	public static void log(Object obj, String msg){
		logger=Logger.getLogger(obj.getClass());
		logger.info(msg);
	}
}
