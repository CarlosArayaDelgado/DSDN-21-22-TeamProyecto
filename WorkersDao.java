package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("WorkersDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/WorkersDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")


public class WorkersDao	extends OntimizeJdbcDaoSupport {

		 public static final String ATTR_ID = "WORKER_ID";
		 public static final String ATTR_NAME = "WORKER_NAME";
		 public static final String ATTR_SURNAME = "WORKER_SURNAME";
}
