package com.br.dio;

public class Curso extends Conteudo{

    private int CargaHoraria;

public double calculaXp(){
    return XP_PADRAO * cargaHoraria;
}

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "CargaHoraria=" + CargaHoraria +
                '}';
    }
}