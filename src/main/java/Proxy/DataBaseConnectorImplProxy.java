package Proxy;

public class DataBaseConnectorImplProxy implements DataBaseConnector {
    DataBaseConnectorImpl dataBaseConnector;

    public DataBaseConnectorImplProxy(DataBaseConnectorImpl dataBaseConnector) {
        this.dataBaseConnector = dataBaseConnector;
    }

    @Override
    public void connect(String url, String name) {
        String urlConcatName = url+name;
        dataBaseConnector.connect(url, urlConcatName);
    }
}
