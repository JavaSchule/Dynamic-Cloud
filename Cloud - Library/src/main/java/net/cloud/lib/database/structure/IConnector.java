package net.cloud.lib.database.structure;

public class IConnector{

    private String host;
    private int port;
    private String database;
    private String password;

    public IConnector(String host, int port, String database, String password){
        this.host = host;
        this.port = port;
        this.database = database;
        this.password = password;
    }

    public int getPort(){
        return port;
    }

    public String getDatabase(){
        return database;
    }

    public String getHost(){
        return host;
    }

    public String getPassword(){
        return password;
    }
}
