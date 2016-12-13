package com.kelgal.rinon

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;





class ContactosController 
{
    def index() { }
	
	ContactosService servicioContactos;
	
	def darContactos(Long idEmpresa)
	{
		List contactos = servicioContactos.darContactosEmpresa(idEmpresa);
		
		
	}
}

