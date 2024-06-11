package com.example.coin.Controller;

import com.example.coin.Model.PlanoDeContas;
import com.example.coin.Service.PlanoDeContasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contas")
public class PlanoDeContasController {

    @Autowired
    private PlanoDeContasService service;

    @PostMapping("/cadastro")
    public List<String> cadastroContas(@RequestBody PlanoDeContas planoDeContas) {
        return service.cadastroContas(planoDeContas);
    }

    @PutMapping("/editar")
    public List<String> editarDetalhesContas(@RequestBody PlanoDeContas planoDeContas) {
        return service.editarDetalhesContas(planoDeContas);
    }

    @DeleteMapping("/excluir/{id}")
    public List<String> exclusaoContas(@PathVariable int id) {
        return service.exclusaoContas(id);
    }

    @GetMapping("/visualizar")
    public void visualizarContas() {
        service.visualizarContas();
    }
}