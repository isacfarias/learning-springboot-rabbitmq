package com.farias.rabbitmq.tutorialone.sender;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class TutorialOneSender {
	
    @Autowired 
    private RabbitTemplate template;
    private int counts = 0;

    @Autowired 
    private Queue queue;

    @Scheduled (fixedDelay = 1000, initialDelay = 500) 
    public  void  sendOne ()  {
        String message = "Olá, mundo!." + counts++;
        this .template.convertAndSend (queue.getName (), message);
        System.out.println ("[x] Enviado '" + message + "'" );
    }
    
    AtomicInteger dots = new AtomicInteger(0);

    AtomicInteger count = new AtomicInteger(0);
    
    @Scheduled (fixedDelay = 1000, initialDelay = 500) 
    public  void  sendTwo ()  {
    	StringBuilder builder = new StringBuilder("Hello");
        if (dots.incrementAndGet() == 4) {
            dots.set(1);
        }
        for (int i = 0; i < dots.get(); i++) {
            builder.append('.');
        }
        builder.append(count.incrementAndGet());
        String message = builder.toString();
        template.convertAndSend(queue.getName(), message);
        System.out.println("[x] Sent '" + message + "'");
    }

}
