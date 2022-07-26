import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria do java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane ");
        devTatiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        devTatiane.progredir();
        devTatiane.progredir();


        System.out.println("-");
        System.out.println("-------");
        System.out.println("Conteúdos Concluídos Tatiane:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXp());
        Dev devKaio = new Dev();
        devKaio.setNome("Kaio");
        devKaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kaio:" + devKaio.getConteudosInscritos());
        devKaio.progredir();
        devKaio.progredir();
        devKaio.progredir();
        System.out.println("-");
        System.out.println("-------");

        System.out.println("Conteúdos Concluídos Kaio:" + devKaio.getConteudosConcluidos());
        System.out.println("XP: " + devKaio.calcularTotalXp());
    }

}