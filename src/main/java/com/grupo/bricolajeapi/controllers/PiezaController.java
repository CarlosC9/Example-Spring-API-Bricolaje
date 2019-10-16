package com.grupo.bricolajeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.bricolajeapi.entity.models.Pieza;
import com.grupo.bricolajeapi.entity.services.IPiezaService;

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PiezaController {

	@Autowired
	private IPiezaService piezaService;
	
	@PostMapping("/nuevaPieza")
	public void crearPieza(Pieza pieza) {
		piezaService.agregarPieza(pieza);
	}
	
	@PutMapping("/actualizarPieza")
	public void actulizarPieza(Pieza pieza) {
		piezaService.actualizarPieza(pieza);
	}
	
	@GetMapping("/piezas")
	public List<Pieza> obtenerPiezas() {
		return piezaService.obtenerPiezas();
	}
	
	@DeleteMapping("/eliminarPieza")
	public void eliminarPieza(@RequestParam("clave") String clave) {
		piezaService.eliminarPieza(clave);
	}
}
