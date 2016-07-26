package org.apache.cmueller.sample;

import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ApplicationScoped
@Startup
@ContextName("ebook-context")
public class EBookRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:welcomeMessage").routeId("welcomeMessage")
            .process(new Processor() {
                @Override
                public void process(Exchange exchange) throws Exception {
                    exchange.getOut().setBody("We rock!");
                }
            });
    }
}