import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.sort(Comparator.comparing(String::length));
//		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		palavras.forEach(System.out::println);

		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
