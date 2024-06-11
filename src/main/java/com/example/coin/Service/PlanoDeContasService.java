package com.example.coin.Service;

import com.example.coin.Model.PlanoDeContas;
import com.example.coin.Repository.PlanoDeContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class PlanoDeContasService {

    @Autowired
    private PlanoDeContasRepository repository;

    public List<String> cadastroContas(PlanoDeContas planoDeContas) {
        repository.save(planoDeContas);
        return List.of("Conta cadastrada com sucesso");
    }

    public List<String> editarDetalhesContas(PlanoDeContas planoDeContas) {
        repository.save(planoDeContas);
        return List.of("Conta editada com sucesso");
    }

    public List<String> exclusaoContas(Integer idConta) {
        repository.deleteById(idConta);
        return List.of("Conta excluída com sucesso");
    }

    public void visualizarContas() {
        List<PlanoDeContas> contas = repository.findAll();
        contas.forEach(System.out::println);
    }
}