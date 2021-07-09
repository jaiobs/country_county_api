package com.obs.util;

import java.util.ResourceBundle;

public class CommonProperties {

	private CommonProperties() {
	}

	private static ResourceBundle commonBundle = getResourceBundle();
	public static final String COMMON = "application";

	private static ResourceBundle getResourceBundle() {
		return getResourceBundle(COMMON);
	}

	private static ResourceBundle getResourceBundle(String bundleName) {
		ResourceBundle bundle = null;
		bundle = ResourceBundle.getBundle(bundleName);
		return ResourceBundle.getBundle(bundleName + "-" + bundle.getString("spring.profiles.active"));
	}

	private static String getString(String key) {
		return commonBundle.getString(key);
	}

	public static String getBaseURL() {
		return getString("baseURL");
	}

	public static String getContextPath() {
		return getString("contextPath");
	}
}
