import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.forEach(s -> System.out.println(s));

		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
