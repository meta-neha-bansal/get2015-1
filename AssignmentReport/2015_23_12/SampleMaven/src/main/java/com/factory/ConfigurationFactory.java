package com.factory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ConfigurationFactory {
	private static AnnotationConfiguration cfg;

	public static AnnotationConfiguration getConfigurationInstance() {
		if (cfg == null) {
			cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
		}
		return cfg;
	}
}
