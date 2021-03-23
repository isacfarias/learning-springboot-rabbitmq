package com.farias.producerapi.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farias.producerapi.config.AppConfig;
import com.farias.producerapi.dto.PessoaDTO;
import com.farias.producerapi.entities.Pessoa;
import com.farias.producerapi.repository.PessoaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import producers.PessoaProducer;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public PessoaDTO save(PessoaDTO dto) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome(dto.getNome());
		pessoa.setCpf(dto.getCpfCnpj());
		pessoa = pessoaRepository.save(pessoa);

		dto.setId(pessoa.getId());
		
		sendMachineToRabbit(pessoa);
		return dto;
	}
	
	
	
	public void sendMachineToRabbit(Pessoa pessoa) {
		try {
			String json = new ObjectMapper().writeValueAsString(pessoa);
			rabbitTemplate.convertAndSend(AppConfig.EXCHANGE_NAME, "", json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
