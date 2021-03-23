package com.farias.consomerapi.consomers;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.farias.consomerapi.config.AppConfig;
import com.farias.consomerapi.config.PessoaWebSocketConfiguration;

@Component
public class MachineConsumer {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RabbitListener(queues = AppConfig.QUEUE)
    public void consumer(Message message) {
      simpMessagingTemplate.convertAndSend(PessoaWebSocketConfiguration.BROKER, new String(message.getBody()));
    }
}