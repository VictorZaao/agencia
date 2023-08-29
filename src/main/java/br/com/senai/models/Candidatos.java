package br.com.senai.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;

public class Candidatos {
    
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero;
    public String nacionalidade;  
    public String naturalidade;
    public Endereco endereco;
    public List <Escolaridade> escolaridades = new ArrayList<>();
}
