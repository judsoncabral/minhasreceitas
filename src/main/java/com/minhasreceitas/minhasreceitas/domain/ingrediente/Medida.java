package com.minhasreceitas.minhasreceitas.domain.ingrediente;

public enum Medida {
	LITRO("L"),
	QUILOGRAMA("Kg"),
	GRAMA("G"),
	MILILITRO("Ml"),
	XICARA("Xícara"),
	COLHER_DE_SOPA("Colher de Sopa"),
	COLHER_DE_CHA("Colher de Chá"),
	COPO("Copo"),
	FIO_DE_OLEO("Fio de Óleo"),
	PITADA("Pitada"),
	UNIDADE("Unidade"),
	FATIA("Fatia");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	private Medida(String descricao) {
		this.descricao = descricao;
	}	

}
