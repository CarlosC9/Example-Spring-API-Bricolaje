package com.grupo.bricolajeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.bricolajeapi.entity.models.Estanteria;
import com.grupo.bricolajeapi.entity.models.EstanteriaId;
import com.grupo.bricolajeapi.entity.services.IEstanteriaService;

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EstanteriaController {

		@Autowired
		private IEstanteriaService estanteriaService;
		
		@PostMapping("/estanteria")
		public void crearPieza(Estanteria estanteria) {
			estanteriaService.agregarEstanteria(estanteria);
		}
		
		@PutMapping("/estanteria")
		public void actulizarPieza(Estanteria estanteria) {
			estanteriaService.actualizarEstanteria(estanteria);
		}
		
		@GetMapping("/estanterias")
		public List<Estanteria> obtenerPiezas() {
			return estanteriaService.obtenerEstanterias();
		}
		
		@DeleteMapping("/estanteria")
		public void eliminarPieza(EstanteriaId id) {
			estanteriaService.eliminarEstanteria(id);
		}
}
