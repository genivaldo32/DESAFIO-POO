import java.time.LocalDate;

import comt.genivaldo.orientadoobjeto.Curso;
import comt.genivaldo.orientadoobjeto.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao("Descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("Descricao curso javascript");
    curso2.setCargaHoraria(1);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria java");
    mentoria.setDescricao("descricao mentoria  java");
    mentoria.setData(LocalDate.now());

        System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
  }
}
