package com.meru.repository;

import org.springframework.data.repository.CrudRepository;

import com.meru.models.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}
