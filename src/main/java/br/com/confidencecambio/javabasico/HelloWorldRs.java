package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.service.HelloService;
import br.com.confidencecambio.javabasico.service.ImcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRs {

   
    @Autowired
    private ImcService imcService; 
     
    @RequestMapping(value="/imc/{peso}/{altura}", method = RequestMethod.GET)
    public ResponseEntity<String> getImc(@PathVariable double peso, @PathVariable double altura){
    	
    	var retorno = imcService.calcImc(peso, altura);
    	
    	return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
    
}
