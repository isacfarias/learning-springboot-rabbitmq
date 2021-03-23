package producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farias.producerapi.config.AppConfig;
import com.farias.producerapi.dto.PessoaDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PessoaProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	
	public void sendMachineToRabbit(PessoaDTO dto) {
		try {
			String json = new ObjectMapper().writeValueAsString(dto);
			rabbitTemplate.convertAndSend(AppConfig.EXCHANGE_NAME, "", json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
