package com.farias.producerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farias.producerapi.dto.PessoaDTO;
import com.farias.producerapi.entities.Pessoa;
import com.farias.producerapi.repository.PessoaRepository;

import producers.PessoaProducer;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaProducer pessoaProducer;

	public PessoaDTO save(PessoaDTO dto) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome(dto.getNome());
		pessoa.setCpf(dto.getCpfCnpj());
		pessoa = pessoaRepository.save(pessoa);

		dto.setId(pessoa.getId());
		
		pessoaProducer.sendMachineToRabbit(dto);
		return dto;
	}

}
