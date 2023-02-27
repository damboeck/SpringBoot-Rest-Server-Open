package at.ac.htlstp.demo.springbootrestserveropen.configuration;

import at.ac.htlstp.demo.springbootrestinterface.endpoints.RestEndpoints;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfiguration implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    public void customize(ConfigurableServletWebServerFactory factory){
        factory.setPort(RestEndpoints.ServerPort);
    }

}
