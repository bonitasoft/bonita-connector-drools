package org.ow2.bonita.connector.core;

public class ConnectorError {
    private Object field;
    private Object error;

    public ConnectorError(String paramName, IllegalArgumentException e) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public Object getField() {
        return field;
    }

    public Object getError() {
        return error;
    }
}
