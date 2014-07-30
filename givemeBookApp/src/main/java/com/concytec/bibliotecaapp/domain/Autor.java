package com.concytec.bibliotecaapp.domain;

// Generated 28/07/2014 06:43:13 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Autor generated by hbm2java
 */
@Entity
@Table(name = "autor", catalog = "biblioteca")
public class Autor implements java.io.Serializable {

	private Integer codAut;
	private String nomAut;
	private String apeAut;
	private Set<Recurso> recursos = new HashSet<Recurso>(0);

	public Autor() {
	}

	public Autor(String nomAut, String apeAut, Set<Recurso> recursos) {
		this.nomAut = nomAut;
		this.apeAut = apeAut;
		this.recursos = recursos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codAut", unique = true, nullable = false)
	public Integer getCodAut() {
		return this.codAut;
	}

	public void setCodAut(Integer codAut) {
		this.codAut = codAut;
	}

	@Column(name = "nomAut", length = 30)
	public String getNomAut() {
		return this.nomAut;
	}

	public void setNomAut(String nomAut) {
		this.nomAut = nomAut;
	}

	@Column(name = "apeAut", length = 60)
	public String getApeAut() {
		return this.apeAut;
	}

	public void setApeAut(String apeAut) {
		this.apeAut = apeAut;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "autor_recurso", catalog = "biblioteca", joinColumns = { @JoinColumn(name = "codAut", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ideRec", nullable = false, updatable = false) })
	public Set<Recurso> getRecursos() {
		return this.recursos;
	}

	public void setRecursos(Set<Recurso> recursos) {
		this.recursos = recursos;
	}

}
