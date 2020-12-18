import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class Main {
    static Pokemon[] pokemons = new Pokemon[1000];;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of pokemons");
        Integer pokemonsNumber = scanner.nextInt();
        for (int i = 0 ; i < pokemonsNumber ; i++) {
            insertPokemon(i);
        }
        System.out.println("Choose your fighters");
        Pokemon first = pokemons[scanner.nextInt() + 1];
        Pokemon second = pokemons[scanner.nextInt() + 1];
        if (first.getHealth() > second.getHealth()) {
            System.out.println(first.getName() + " Won");
        }
        else if (first.getHealth() < second.getHealth()) {
            System.out.println(second.getName() + " Won");
        }
        else {
            System.out.println("Draw");
        }
    }
    private static void insertPokemon(Integer id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert pokemon's name and health");
        String name = scanner.next();
        Integer health = scanner.nextInt();
        pokemons[id] = new Pokemon(health, name);
    }
}
