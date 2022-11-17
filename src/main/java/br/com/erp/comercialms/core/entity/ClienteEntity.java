package br.com.erp.comercialms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteEntity {

    private Long id;
    private String nome;
    private String telefone;
    private String rg;
    private String cpf;
    private String cnpj;
    private EnderecoEntity endereco;
    private String email;
    private LocalDate dataNasc;
    private String sexo;




}
