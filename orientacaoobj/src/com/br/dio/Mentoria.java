package com.br.dio;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Overraide
    public double calcularXp(){
        return XP_PADRAO + 20;
    }
    public Mentoria(){}
    public LocaDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }
    public String toString(){
        return "Mentoria{"+
                "titulo='" + getTitulo + '\'' +
                ", descricao'" + getDescricao() + '\'' +
                ", data=" +data+ '}';
    }
}
