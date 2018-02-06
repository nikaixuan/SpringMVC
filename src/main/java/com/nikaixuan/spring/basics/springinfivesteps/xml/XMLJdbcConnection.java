package com.nikaixuan.spring.basics.springinfivesteps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by nikaixuan on 5/2/18.
 */

public class XMLJdbcConnection {
    public XMLJdbcConnection(){
        System.out.println("JDBC");
    }
}
