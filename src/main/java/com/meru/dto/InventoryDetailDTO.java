package com.meru.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InventoryDetailDTO {
	
	private Long inventoryId;
	private Integer quantity;
	private Integer availableQuantity;
	private BigInteger unitPrice;
	private Integer taxRate;
	private Boolean availability;

}
