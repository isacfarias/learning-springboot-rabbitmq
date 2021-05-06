package com.farias.tutorialten.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialten.receiver.TutorialTenReceiver;

@Configuration
public class AppConfig {
	
    @Bean
    public Queue queue() {
        return new Queue("tut.rpc.requests");
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("tut.rpc");
    }

    @Bean
    public Binding binding(DirectExchange exchange,
        Queue queue) {
        return BindingBuilder.bind(queue)
            .to(exchange)
            .with("rpc");
    }

    @Bean
    public TutorialTenReceiver sender() {
        return new TutorialTenReceiver();
    }

}
