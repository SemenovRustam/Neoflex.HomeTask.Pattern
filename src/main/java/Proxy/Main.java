package Proxy;

public class Main {
    public static void main(String[] args) {
        DataBaseConnectorImpl dataBaseConnector = new DataBaseConnectorImpl();
        DataBaseConnectorImplProxy dataBaseConnectorImplProxy = new DataBaseConnectorImplProxy(dataBaseConnector);
        dataBaseConnectorImplProxy.connect("localhost", "student");
    }
}
