import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrção Curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descriçao Curso JS");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsaac = new Dev();
        devIsaac.setNome("Isaac");
        devIsaac.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isaac: "+devIsaac.getConteudosInscritos());
        devIsaac.progredir();
        devIsaac.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Isaac: "+devIsaac.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Isaac: "+devIsaac.getConteudosConcluidos());
        System.out.println("XP: "+devIsaac.calcularTotalXp());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());


    }
}