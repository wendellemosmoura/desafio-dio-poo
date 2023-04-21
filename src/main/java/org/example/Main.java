package org.example;

import org.example.br.com.dio.desafio.dominio.Bootcamp;
import org.example.br.com.dio.desafio.dominio.Curso;
import org.example.br.com.dio.desafio.dominio.Dev;
import org.example.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mantoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco PAN Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Banco PAN Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWendel = new Dev();
        devWendel.setNome("Wendel");
        devWendel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Wendel:" + devWendel.getConteudosInscritos());
        devWendel.progredir();
        devWendel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Wendel:" + devWendel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Wendel:" + devWendel.getConteudosConcluidos());
        System.out.println("XP: " + devWendel.calcularTotalXp());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}