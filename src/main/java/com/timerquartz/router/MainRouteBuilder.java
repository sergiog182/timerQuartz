package com.timerquartz.router;

import org.apache.camel.builder.RouteBuilder;

public class MainRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:fistTimer?period=1m")
		.setHeader("hour", simple("${date:now:yyyy-MM-dd' 'HH:mm:ss}"))
		.log("Mensaje timer cada minuto: ${headers.hour}")
		.to("mock:endRoute");
		
		from("quartz:quartzTimer?trigger.repeatCount=6&trigger.repeatInterval=10000")
		.setHeader("hour", simple("${date:now:yyyy-MM-dd' 'HH:mm:ss}"))
		.log("Mensaje Quartz cada 10 segundos: ${headers.hour}")
		.to("mock:endRoute2");
	}

}
