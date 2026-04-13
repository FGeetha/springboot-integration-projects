package com.spring.apacheCamel.EnterpriseIntegration14Patterns.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class XmlRoute extends RouteBuilder {

    @Override
    public void configure() {

        /*
         ENTRY ROUTE
        */
        from("direct:xmlEntry")
            .routeId("xml-entry")
            .log("XML Received: ${body}")

            /*
             Content-Based Routing using XPath
            */
            .choice()
                .when(xpath("/*[local-name()='Document']/*[local-name()='SysEvtNtfctn']/*[local-name()='EvtInf']/*[local-name()='EvtCd']='INSC'"))
                    .log("Routing to Maintenance Queue")
                    .to("jms:queue:maintenance.queue")

                .when(xpath("/*[local-name()='Document']/*[local-name()='SysEvtNtfctn']/*[local-name()='EvtInf']/*[local-name()='EvtCd']='ALRT'"))
                    .log("Routing to Alert Queue")
                    .to("jms:queue:alert.queue")

                .otherwise()
                    .log("Routing to Unknown Queue")
                    .to("jms:queue:unknown.xml.queue")
            .end();


        /*
         CONSUMERS
        */
        from("jms:queue:maintenance.queue")
            .log("Maintenance Processing: ${body}");

        from("jms:queue:alert.queue")
            .log("Alert Processing: ${body}");

        from("jms:queue:unknown.xml.queue")
            .log("Unknown XML Processing: ${body}");
    }
}
