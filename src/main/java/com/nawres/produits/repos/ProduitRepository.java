package com.nawres.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawres.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
