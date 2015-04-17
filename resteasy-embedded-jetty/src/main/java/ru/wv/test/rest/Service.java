package ru.wv.test.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class Service extends Application
{
    private Set<Class<?>> services = new HashSet<Class<?>>();

    public  Service() {
        services.add(RestService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return services;
    }
}
