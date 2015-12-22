package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getConfigurationInstance() {
		if (sessionFactory == null) {
			AnnotationConfiguration cfg = ConfigurationFactory.getConfigurationInstance();
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
