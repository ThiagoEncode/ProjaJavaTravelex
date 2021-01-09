package br.com.confidencecambio.javabasico.model;

public class Individuo {

	
	private String nome;

	public Individuo(String nome) throws Exception {

		boolean isEmpty = nome == null || nome.trim().length() == 0 || nome.substring(0, 1).contains(" ")
				|| nome.substring(nome.length() - 1, nome.length()).contains(" ");

		if (isEmpty) {
			throw new Exception("nome inválido");
		}

		this.nome = nome;

	}

	public String getFirstName() {

		String[] nome = this.nome.split(" ");

		return nome[0].trim();
	}

	public String getLastName() {

		String[] nome = this.nome.split(" ");
			
		return this.nome.replace(nome[0], "").replaceAll("^\\s+", "").replaceAll("\\s+$", "");
	}

	public String getNameUperCase() {

		return nome.toUpperCase();
	}

	public String getShortName() {

		String[] nome = this.nome.split(" ");

		return this.nome.replace(nome[1], nome[1].substring(0, 1)+".");
	}

}
