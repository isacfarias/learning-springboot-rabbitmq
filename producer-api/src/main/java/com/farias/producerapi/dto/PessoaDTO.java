package com.farias.producerapi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cpfCnpj;

}
