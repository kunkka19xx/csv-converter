package com.csvconverter.utils;

import java.io.InputStream;
import java.util.Properties;

import com.csvconverter.constants.ConfigConstants;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PropertyUtils {
	public static String loadConfig(String property) {

		Properties props = new Properties();
		try {
			InputStream config = PropertyUtils.class.getClassLoader().getResourceAsStream(ConfigConstants.CONFIG_PROP);
			props.load(config);
			return props.getProperty(property);
		} catch (Exception e) {
			log.error("{} is not exist", ConfigConstants.CONFIG_PROP);
		}
		return "";
	}

	public static String loadMessage(String property) {

		Properties props = new Properties();
		try {
			InputStream message = PropertyUtils.class.getClassLoader()
					.getResourceAsStream(ConfigConstants.MESSAGE_PROP);
			props.load(message);
			return props.getProperty(property);
		} catch (Exception e) {
			log.error("{} file is not exist", ConfigConstants.MESSAGE_PROP);
		}
		return "";
	}
}
