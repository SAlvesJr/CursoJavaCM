package com.SAlvesjr.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SAlvesjr.cursomc.domain.Pedido;
import com.SAlvesjr.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	PedidoService pedidoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Long id) {
		Pedido obj = pedidoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
