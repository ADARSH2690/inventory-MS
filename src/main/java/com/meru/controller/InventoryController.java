package com.meru.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meru.dto.InventoryDetailDTO;
import com.meru.models.Inventory;
import com.meru.repository.InventoryRepository;
import com.meru.service.InventoryService;


/**
 * 
 * @author Adarsh
 *
 */

@RestController
public class InventoryController {

	@Autowired
	InventoryRepository inventoryRepository;

	@Autowired
	InventoryService inventoryService;
	
	
	@GetMapping("/inventory")
	public Iterable<Inventory> getAllInventory(){
		return inventoryRepository.findAll();
	}
	
	@GetMapping("/inventory/{id}")
	public Optional<Inventory> getInventoryById(@PathVariable("id") String id) {
		return inventoryRepository.findById(Long.parseLong(id));
	}
	
	@PostMapping("/inventory/new/")
	public Inventory addInventory(@RequestBody Inventory inventory) {
		return inventoryRepository.save(inventory);
	}
	
	
	/**
	 * localhost:3333/inventory/check
	 * [{
  			"inventoryId":1,
  			"quantity":9
		},
		{
  			"inventoryId":2,
  			"quantity":200	
		}]
	 * 
	 * 
	 * @param inventoryDetailDTOList
	 * @return
	 */
	
	
	
	@PostMapping("/inventory/check")
	public List<InventoryDetailDTO> checkInventory(@RequestBody List<InventoryDetailDTO> inventoryDetailDTOList){
		return inventoryService.checkForInventory(inventoryDetailDTOList);
	}
	
	/**
	 * localhost:3333/inventory/update
	 * [{
"inventoryId":1,
"quantity":10
},
{
"inventoryId":2,
"quantity":10
},
{
"inventoryId":3,
"quantity":10
}
]

	 * @param inventoryDetailDTOList
	 * @return
	 */
	
	public List<InventoryDetailDTO> updateInventory(@RequestBody List<InventoryDetailDTO> inventoryDetailDTOList){
		return inventoryService.updateInventory(inventoryDetailDTOList);
	}
	
	

}
