package com.api.tcc.adapter.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "RLMT_HOSP_MED")
public class HospitalMedicoEntity implements Serializable {

	private static final long serialVersionUID = -7757615914744998509L;

	@AttributeOverrides(value = {
			@AttributeOverride(	name = "idMedico",
							   	column = @Column(name = "ID_MEDICO")),
			
			@AttributeOverride(	name = "idHospital",
								column = @Column(name = "ID_HOSPTAL")),
			
	})
	@EmbeddedId
	private HospitalMedicoEntityPK pk;
	
	@Column(name = "MEDICO_DISPONIVEL")
	private Boolean flagMedicoDisponivel;
}
