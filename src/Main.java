import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pesssoa = Arrays.asList(
                new Pessoa("Alicia", 12),
                new Pessoa("Will", 22),
                new Pessoa("Rosa", 17)

        );

        pesssoa.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);


    }
}