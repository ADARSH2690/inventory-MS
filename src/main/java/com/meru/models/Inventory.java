package com.meru.models;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author Adarsh
 *
 */
@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Inventory implements Serializable{

	private static final long serialVersionUID = 8776618884424135493L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="QUANTITY")
	private Integer quantity;


	@Column(name="UNIT_PRICE", nullable= true)
	private BigInteger unitPrice;

	@Column(name="PURCHASE_PRICE", nullable= true)
	private Double purchasePrice;

	@Column(name="TAX_RATE")
	private Integer taxRate;

	@Column(name="BRAND_NAME",nullable=true)
	private String brandName;


}
