package br.com.confidencecambio.javabasico.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class ImcService {
	
	public String calcImc(double peso, double altura) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
	
		return String.valueOf("IMC: "+ formato.format(peso/(altura*altura)));
	}

}
