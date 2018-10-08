package com.example.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity(name="girl") 
public class Girl implements Serializable{
	
	 @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Integer id;
	 
	 @Column(name="age")
	 private Integer age;
	 
	 @Column(name="cup_size")
	 private String cupSize;
	 
	 

}
