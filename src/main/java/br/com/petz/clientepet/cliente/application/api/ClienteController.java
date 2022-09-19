package br.com.petz.clientepet.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {	
		log.info("[inicia] Clientecontroller - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] Clientecontroller - postCliente");
		return clienteCriado;
	}

}
