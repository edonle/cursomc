package com.prodesp.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.prodesp.cursomc.domain.Cliente;
import com.prodesp.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
