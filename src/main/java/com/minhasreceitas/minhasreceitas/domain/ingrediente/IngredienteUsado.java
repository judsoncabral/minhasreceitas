package com.minhasreceitas.minhasreceitas.domain.ingrediente;

import com.minhasreceitas.minhasreceitas.domain.receita.Receita;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="ingredienteUsado")
@Table(name="ingredienteUsado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class IngredienteUsado {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="ingrediente_id")
	private Ingrediente ingrediente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="receita_id")
	private Receita receita;

	@Enumerated(EnumType.STRING)
	private Medida medida;
	
	private double quantidade;
	
}
