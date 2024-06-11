package com.example.coin.Repository;

import com.example.coin.Model.PlanoDeContas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoDeContasRepository extends JpaRepository<PlanoDeContas, Integer> {
}