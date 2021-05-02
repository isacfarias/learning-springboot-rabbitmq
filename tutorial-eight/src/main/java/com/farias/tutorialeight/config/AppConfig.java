package com.farias.tutorialeight.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialeight.receiver.TutorialEightReceiver;

@Configuration
public class AppConfig {
	
	@Bean
    public TopicExchange topic() {
        return new TopicExchange("tut.topic");
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
    public Binding bindingA(TopicExchange topic, Queue autoDeleteQueue1) {
        return BindingBuilder.bind(autoDeleteQueue1)
        		             .to(topic)
        		             .with("*.orange.*");
    }

    @Bean
    public Binding bindingB(TopicExchange topic, Queue autoDeleteQueue2) {
        return BindingBuilder.bind(autoDeleteQueue2)
        		             .to(topic)
        		             .with("*.*.rabbit");
    }
    
    @Bean
    public Binding bindingC(TopicExchange topic, Queue autoDeleteQueue1) {
        return BindingBuilder.bind(autoDeleteQueue1)
        		             .to(topic)
        		             .with("lazy.#");
    }
    
    @Bean
    public TutorialEightReceiver receiver() {
        return new TutorialEightReceiver();
    }

}
