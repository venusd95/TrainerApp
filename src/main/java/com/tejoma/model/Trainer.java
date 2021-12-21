package com.tejoma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="trainers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trainer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int exp;
	private String domain;
	

}
