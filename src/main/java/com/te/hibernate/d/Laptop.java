package com.te.hibernate.d;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Laptop {
	@Id
	private Integer laptopId;
	private String laptopName;
	
	@OneToOne
	private Student student;
}
