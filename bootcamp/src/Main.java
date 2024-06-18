import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de javascript");
        cursoJS.setDescricao("Descrição do curso de javascript.");
        cursoJS.setCargaHoraria(40);

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de javascript");
        cursoJava.setDescricao("Descrição do curso de javascript.");
        cursoJava.setCargaHoraria(120);

        Mentoria mentoriaJS = new Mentoria();
        mentoriaJS.setTitulo("Mentoria do curso JS");
        mentoriaJS.setDescricao("Descrição da mentoria do curso JS.");
        mentoriaJS.setData(LocalDate.now(ZoneId.of("America/Sao_Paulo")));

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria do curso Java");
        mentoriaJava.setDescricao("Descrição da mentoria do curso Java.");
        mentoriaJava.setData(LocalDate.now(ZoneId.of("America/Sao_Paulo")));

        System.out.println(mentoriaJS);


    }
}