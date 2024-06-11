package com.example.coin.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class PlanoDeContas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConta;

    private String conta;
    private String tipo;
    private String descricao;

    @OneToMany(mappedBy = "planoDeContas", cascade = CascadeType.ALL)
    private List<Boleto> boletos;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;


        public int getidConta() {
            return idConta;
        }
        
        public void setidConta(int idConta) {
            this.idConta = idConta;
        }
        
        public String getConta() {
            return conta;
        }
        
        public void setConta(String conta) {
            this.conta = conta;
        }
        
        public String getTipo() {
            return tipo;
        }
        
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        
        public String getDescricao() {
            return descricao;
        }
        
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        
        public List<Boleto> getBoletos() {
            return boletos;
        }
        
        public void setBoletos(List<Boleto> boletos) {
            this.boletos = boletos;
        }

}