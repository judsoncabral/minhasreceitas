package com.minhasreceitas.minhasreceitas.domain.receita;

import java.sql.Date;
import java.util.List;

import com.minhasreceitas.minhasreceitas.domain.etapa.Etapa;
import com.minhasreceitas.minhasreceitas.domain.ingrediente.IngredienteUsado;
import com.minhasreceitas.minhasreceitas.domain.porcao.Porcao;
import com.minhasreceitas.minhasreceitas.domain.usuario.Usuario;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "receita")
@Table(name = "receita")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private List<Etapa> etapas;

	@OneToMany(mappedBy = "receita", targetEntity = IngredienteUsado.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<IngredienteUsado> ingredientes;

	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	private String titulo;

	private Date tempoDePreparo;

	private Porcao porcoes;

	private Boolean publica;

}
