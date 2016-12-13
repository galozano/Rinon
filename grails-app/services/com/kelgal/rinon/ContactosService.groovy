package com.kelgal.rinon

import com.kelgal.rinon.exceptions.RinonException

class ContactosService {

    def serviceMethod() 
	{

    }
	
	def darContactosEmpresa(Long idEmpresa)
	{
		Empresa empresa = Empresa.get(idEmpresa);
		List contactos = Contacto.findByEmpresa(empresa);
		return contactos;
	}
	
	def agregarContactoEmpresa(Long idEmpresa, String nombreContacto, double telefonoContacto)
	{
		Contacto nuevoContacto = new Contacto();
		
		if(!nuevoContacto.save())
		{
			def msg = message(code: "error.servicios.contacto.agregar");
			throw new RinonException(msg,nuevoContacto);
		}
	}
	
	def eliminarContactoEmpresa(Long idEmpresa, Long idContacto)
	{
		
	}
}

