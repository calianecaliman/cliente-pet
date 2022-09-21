package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.clientepet.cliente.domain.Sexo;

public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;	
	private Sexo sexo;
	private String cpf;	
	private String email;
	private LocalDateTime dataHoraDoCadastro;
	
}
