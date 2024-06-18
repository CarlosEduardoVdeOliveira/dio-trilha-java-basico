import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoReact = new Curso();
        cursoReact.setTitulo("Curso de Reactjs");
        cursoReact.setDescricao("Descrição do curso de Reactjs.");
        cursoReact.setCargaHoraria(150);

        Mentoria mentoriaReact = new Mentoria();
        mentoriaReact.setTitulo("Mentoria do curso JS");
        mentoriaReact.setDescricao("Descrição da mentoria do curso JS.");
        mentoriaReact.setData(LocalDate.now());

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de javascript");
        cursoJava.setDescricao("Descrição do curso de javascript.");
        cursoJava.setCargaHoraria(120);


        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria do curso Java");
        mentoriaJava.setDescricao("Descrição da mentoria do curso Java.");
        mentoriaJava.setData(LocalDate.now());

        Curso cursoBancoDeDados = new Curso();
        cursoBancoDeDados.setTitulo("Curso de Reactjs");
        cursoBancoDeDados.setDescricao("Descrição do curso de Reactjs.");
        cursoBancoDeDados.setCargaHoraria(150);

        Mentoria mentoriaBancoDeDados = new Mentoria();
        mentoriaBancoDeDados.setTitulo("Mentoria do curso JS");
        mentoriaBancoDeDados.setDescricao("Descrição da mentoria do curso JS.");
        mentoriaBancoDeDados.setData(LocalDate.now());

        Bootcamp fullStack = new Bootcamp();
        fullStack.setNome("Bootcamp Full Stack developer.");
        fullStack.setDescricao("Descrição do bootcamp Full Stack Java e React developer.");

        fullStack.getConteudos().add(cursoReact);
        fullStack.getConteudos().add(mentoriaReact);
        fullStack.getConteudos().add(cursoJava);
        fullStack.getConteudos().add(mentoriaJava);
        fullStack.getConteudos().add(cursoBancoDeDados);
        fullStack.getConteudos().add(mentoriaBancoDeDados);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos Eduardo");
        devCarlos.inscreverBootcamp(fullStack);
        System.out.println("Conteúdos inscritos Carlos: "+devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("Conteúdo conculído Carlos: "+devCarlos.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Carlos: "+devCarlos.getConteudosInscritos());
        System.out.println("XP Carlos: "+devCarlos.calcularTotalXp());
        System.out.println("===================================");
        Dev devIgor = new Dev();
        devIgor.setNome("Igor do Carmo");
        devIgor.inscreverBootcamp(fullStack);
        System.out.println("Contúdos inscritos Igor: "+devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("Conteúdo conculído Igor: "+devIgor.getConteudosConcluidos());
        System.out.println("Contúdos inscritos Igor: "+devIgor.getConteudosInscritos());
        System.out.println("XP Igor: "+devIgor.calcularTotalXp());


    }
}