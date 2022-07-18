package com.br.dio;

public class Dev {
    private String nome;
    private Set<Conteudo>conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo>conteudoConcluidos = new LinkedHashSet<>();

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Dev)) return false;
        if (!super.equals(object)) return false;
        Dev dev = (Dev) object;
        return java.util.Objects.equals(nome, dev.nome) && java.util.Objects.equals(conteudoInscritos, dev.conteudoInscritos) && java.util.Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, conteudoInscritos, conteudoConcluidos);
    }
}
