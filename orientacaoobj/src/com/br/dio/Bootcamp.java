package com.br.dio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp{
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo>conteudos = new HashSet<>();

    public Bootcamp(String nome, String descricao, Set<Dev> devInscritos, Set<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.devInscritos = devInscritos;
        this.conteudos = conteudos;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devInscritos=" + devInscritos +
                ", conteudos=" + conteudos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Bootcamp)) return false;
        if (!super.equals(object)) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return java.util.Objects.equals(nome, bootcamp.nome) && java.util.Objects.equals(descricao, bootcamp.descricao) && java.util.Objects.equals(dataInicial, bootcamp.dataInicial) && java.util.Objects.equals(dataFinal, bootcamp.dataFinal) && java.util.Objects.equals(devInscritos, bootcamp.devInscritos) && java.util.Objects.equals(conteudos, bootcamp.conteudos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }
}
