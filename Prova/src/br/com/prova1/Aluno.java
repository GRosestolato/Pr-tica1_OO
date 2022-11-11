package br.com.prova1;

public class Aluno extends Pessoa {

    
    int period;
    int turma;
    public Aluno(String nome, String email, String senha, int period, int turma) {
        super(nome, email, senha);
        this.period = period;
        this.turma = turma;
    }
    public int getPeriod() {
        return period;
    }
    public void setPeriod(int period) {
        this.period = period;
    }
    public int getTurma() {
        return turma;
    }
    public void setTurma(int turma) {
        this.turma = turma;
    }
     
    public String mostraAluno
        (String nome, String email, String senha, int period, int turma){
        System.out.println("Nome: "+ nome + "email: " + email + "periodo: " + "turma " + turma);
        }
    }
    

