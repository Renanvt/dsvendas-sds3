package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

//Vou ter pronto operações de inserir, buscar, deletar, etc pelo framework JpaRepository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
