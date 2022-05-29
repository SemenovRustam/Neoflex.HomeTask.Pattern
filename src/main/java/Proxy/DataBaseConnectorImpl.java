package Proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBaseConnectorImpl implements DataBaseConnector {
    Map<String, String> dataBaseNamesMap = new HashMap<>();
    @Override
    public void connect(String url, String name) {
        System.out.println("Connect to " + name + " database");
        dataBaseNamesMap.put(url, name);
    }
}
