package com.example.ipaddresstest;

public class ClientInformation {

    private String ip;
    private String sessionId;
    private String hostName;
    private String canonicalHostName;
    private String servletRequestInstance;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getCanonicalHostName() {
        return canonicalHostName;
    }

    public void setCanonicalHostName(String canonicalHostName) {
        this.canonicalHostName = canonicalHostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getServletRequestInstance() {
        return servletRequestInstance;
    }

    public void setServletRequestInstance(String servletRequestInstance) {
        this.servletRequestInstance = servletRequestInstance;
    }
}
