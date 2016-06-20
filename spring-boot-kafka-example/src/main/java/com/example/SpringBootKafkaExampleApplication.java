package com.example;

import java.util.concurrent.ExecutionException;

import org.apache.commons.logging.LogFactory;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testng.remote.strprotocol.GenericMessage;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
@ImportResource("classpath:/spring/spring-configuration-json-reader.xml")
public class SpringBootKafkaExampleApplication {

	@Autowired
	MessageChannel inputToKafka;

	@RequestMapping("/vote")
	public Status vote(@RequestBody Vote vote) throws ExecutionException, InterruptedException {

		
		Message<Vote> message = MessageBuilder.withPayload(vote)
				.setHeader("Topic", "votes").build();
		inputToKafka.send(message);
		
		return new Status("ok");
	}
	
	@RequestMapping("/voter")
	public Status vote(@RequestBody Voter voter) throws ExecutionException, InterruptedException {

		
		Message<Voter> message = MessageBuilder.withPayload(voter)
				.setHeader("Topic", "votes").build();
		inputToKafka.send(message);
		
		return new Status("ok");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootKafkaExampleApplication.class, args);

//		MessageChannel in = (MessageChannel) context.getBean("inputToKafka");
//		for (int i = 0; i < 10; i++) {
//			Message<String> message = MessageBuilder.withPayload("#" + i + " Hello").setHeader("foo", "bar")
//					.setHeader("baz", "quxx").build();
//			System.out.println("in loop" + i);
//			in.send(message);
//		}

	}
}
