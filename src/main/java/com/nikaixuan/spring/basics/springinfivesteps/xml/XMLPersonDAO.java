package com.nikaixuan.spring.basics.springinfivesteps.xml;

import com.nikaixuan.spring.basics.springinfivesteps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nikaixuan on 5/2/18.
 */

public class XMLPersonDAO {

    XMLJdbcConnection xmljdbcConnection;

    public XMLJdbcConnection getJdbcConnection() {
        return xmljdbcConnection;
    }

    public void setJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.xmljdbcConnection = jdbcConnection;
    }
}
