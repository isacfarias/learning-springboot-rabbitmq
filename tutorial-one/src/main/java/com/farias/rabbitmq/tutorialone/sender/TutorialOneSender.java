package com.farias.rabbitmq.tutorialone.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class TutorialOneSender {
	
    @Autowired 
    private RabbitTemplate template;
    private int count = 0;

    @Autowired 
    private Queue queue;

    @Scheduled (fixedDelay = 1000, initialDelay = 500) 
    public  void  send ()  {
        String message = "Olá, mundo!" + count++;
        this .template.convertAndSend (queue.getName (), message);
        System.out.println ( "[x] Enviado '" + message + "'" );
    }

}
