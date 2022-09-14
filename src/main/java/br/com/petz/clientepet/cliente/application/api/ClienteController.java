package br.com.petz.clientepet.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {	
		log.info("[inicia] Clientecontroller - postCliente");
		log.info("[finaliza] Clientecontroller - postCliente");
		return null;
	}

}
