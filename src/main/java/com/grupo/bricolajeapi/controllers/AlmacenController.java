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

import com.grupo.bricolajeapi.entity.models.Almacen;
import com.grupo.bricolajeapi.entity.services.IAlmacenService;

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AlmacenController {

	@Autowired
	private IAlmacenService almacenService;
	
	@PostMapping("/almacen")
	public void agregarAlmacen(Almacen almacen) {
		almacenService.agregarAlmacen(almacen);
	}
	
	@PutMapping("/almacen")
	public void actulizarAlmacen(Almacen almacen) {
		almacenService.actualizarAlmacen(almacen);
	}
	
	@DeleteMapping("/almacen")
	public void eliminarAlmacen(@RequestParam("numero") long numero) {
		almacenService.eliminarAlmacen(numero);
	}
	
	@GetMapping("/almacenes")
	public List<Almacen> obtenerAlmacenes() {
		return almacenService.obtenerAlmacenes();
	}
}
