package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Seller;

//Vou ter pronto operações de inserir, buscar, deletar, etc pelo framework JpaRepository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
