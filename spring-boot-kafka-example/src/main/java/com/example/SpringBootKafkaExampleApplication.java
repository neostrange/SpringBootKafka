package com.example;

import org.apache.commons.logging.LogFactory;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.testng.remote.strprotocol.GenericMessage;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:/spring/spring-configuration.xml")
public class SpringBootKafkaExampleApplication {

	//private Log log = LogFactory.getLog(getClass());


	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringBootKafkaExampleApplication.class, args);
		

		
		MessageChannel in = (MessageChannel) context.getBean("inputToKafka");
		for(int i=0;i<10;i++){
			Message<String> message = MessageBuilder.withPayload("#"+i+" Hello")
					.setHeader("foo", "bar")
					.setHeader("baz", "quxx")
					.build();
			System.out.println("in loop"+ i);
			in.send(message);
		}
		
		
	}
}
