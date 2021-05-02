package com.farias.tutorialsix.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialsix.receiver.TutorialSixReceiver;

@Configuration
public class AppConfig {
	
	@Bean
    public DirectExchange direct() {
        return new DirectExchange("tut.direct");
    }
	
    @Bean
    public Queue autoDeleteQueue1() {
        return new AnonymousQueue();
    }

    @Bean
    public Queue autoDeleteQueue2() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding binding1a(DirectExchange direct, Queue autoDeleteQueue1) {
        return BindingBuilder.bind(autoDeleteQueue1).to(direct).with("orange");
    }

    @Bean
    public Binding binding1b(DirectExchange direct, Queue autoDeleteQueue2) {
        return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("black");
    }
    
    @Bean
    public Binding binding2a(DirectExchange direct, Queue autoDeleteQueue1) {
        return BindingBuilder.bind(autoDeleteQueue1).to(direct).with("green");
    }
    
    @Bean
    public Binding binding2b(DirectExchange direct, Queue autoDeleteQueue2) {
        return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("black");
    }

    @Bean
    public TutorialSixReceiver receiver() {
        return new TutorialSixReceiver();
    }

}
