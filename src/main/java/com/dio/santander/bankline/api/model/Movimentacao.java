package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
	private Integer id;
	private LocalDateTime dataHora;
	private String descrcao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescrcao() {
		return descrcao;
	}
	public void setDescrcao(String descrcao) {
		this.descrcao = descrcao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	
	
}
