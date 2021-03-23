package com.farias.producerapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farias.producerapi.dto.PessoaDTO;
import com.farias.producerapi.service.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@PostMapping
	public ResponseEntity<PessoaDTO> save(@RequestBody PessoaDTO dto) {
		dto = pessoaService.save(dto);
		return ResponseEntity.ok(dto);
	}

}
