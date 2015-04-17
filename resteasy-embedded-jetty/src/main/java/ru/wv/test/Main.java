package ru.wv.test;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

public class Main {
    public static void main (String []args) {
        Logger logger = Logger.getLogger(Main.class);

        Server server = new Server(8080);

        HttpServletDispatcher dispatcher = new HttpServletDispatcher();
        ServletHolder holder = new ServletHolder(dispatcher);
        ServletContextHandler context = new ServletContextHandler();
        context.setInitParameter("javax.ws.rs.Application", "ru.wv.test.rest.Service");
        context.addServlet(holder, "/");

        server.setHandler(context);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
