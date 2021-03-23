package com.farias.producerapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

	private Long id;
	private String nome;
	private String cpf;
	
}
