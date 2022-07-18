package com.br.dio;

public class Main {
    public static void main(String[] args) {

        Curso c1  = new Curso();
        c1.setTitulo = ("Curso de Java");
        c1.setDescricao = ("Descrição do cueso de java");
        c1.setCargaHoraria(8);

        Curso c2  = new Curso();
        c2.setTitulo = ("Curso de JS");
        c2.setDescricao = ("Descrição do cueso de js);
        c1.setCargaHoraria(4);

        Mentoria m1 = new Mentoria();
        m1.setTitulo = ("Mentoria de java");
        m1.setDescricao = ("Descrição da mentoria js");
        m1.setData(LocalDate.now());

        Bootcamp boot = new Bootcamp();
        boot.setTitulo = ("Mentoria de java");
        boot.setDescricao = ("Descrição da mentoria js");
        boot.getConteudos().add(c1);
        boot.getConteudos().add(c2);
        boot.getConteudos().add(m2);


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devCamila.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos MAria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

        System.out.println("**************************************************");

        Dev devMario= new Dev();
        devMario.setNome("Mario Neto");
        devMario.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Mario Neto:" + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        devMario.progredir();
        System.out.println("***************");
        System.out.println("Conteúdos Inscritos Mario Neto:" + devMario.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mario Neto:" + devMario.getConteudosConcluidos());
        System.out.println("XP:" + devMario.calcularTotalXp());





    }
    
}
