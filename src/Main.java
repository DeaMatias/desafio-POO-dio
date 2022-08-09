import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Andrea");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos dev " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos dev " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos dev "  + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("---------");

        Dev dev2 = new Dev();
        dev.setNome("Jeferson");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos dev2 " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos dev2 " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos dev2 " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
