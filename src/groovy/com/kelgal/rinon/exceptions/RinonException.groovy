package com.kelgal.rinon.exceptions


class RinonException extends RuntimeException
{
	String message;
	Object invalido;
	
	RinonException(String message)
	{
		super(message);
		this.message = message;
	}
	
	RinonException(String message,Object invalido)
	{
		super(message);
		this.message = message;
		this.invalido = invalido;
	}
}
