package org.ow2.bonita.connector.core;

import java.util.List;

public abstract class ProcessConnector {
    protected abstract List<ConnectorError> validateValues();

    protected abstract void executeConnector() throws Exception;
}
