package org.ow2.bonita.connector.core;

import java.util.List;

public abstract class Connector {
    protected abstract void executeConnector() throws Exception;

    protected abstract List<ConnectorError> validateValues();

    public abstract void execute() throws Exception;
}
