package com.example.ipadresstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class IpAdressTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpAdressTestApplication.class, args);
    }

    @GetMapping("ip")
    public ClientInformation ip(HttpServletRequest servletRequest) throws UnknownHostException {
        ClientInformation ci = new ClientInformation();
        ci.setIp(servletRequest.getRemoteAddr());
        ci.setSessionId(servletRequest.getSession().getId());

        InetAddress ia = Inet4Address.getByName(servletRequest.getRemoteAddr());
        ci.setHostName(ia.getHostName());
        ci.setCanonicalHostName(ia.getCanonicalHostName());

        return ci;
    }

}
