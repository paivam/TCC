package com.api.tcc.adapter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HospitalMedicoEntityPK implements Serializable {

	private static final long serialVersionUID = -3842508976502883324L;
	
	@Column(name = "ID_MEDICO")
	private String idMedico;
	
	@Column(name = "ID_HOSPTAL")
	private String idHospital;
	
}
