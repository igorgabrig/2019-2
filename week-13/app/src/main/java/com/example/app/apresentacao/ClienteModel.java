package com.example.app.apresentacao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteModel {

    private int id;
    private String nome;
    private int idade;
    private double limiteCredito;
    private String telefone;
    
    
    

}
