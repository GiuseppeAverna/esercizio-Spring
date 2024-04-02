package Back.end.S5.L1.esercizio;

import Back.end.S5.L1.esercizio.entities.Menu;
import Back.end.S5.L1.esercizio.entities.MenuItem;
import Back.end.S5.L1.esercizio.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		Menu menu = ctx.getBean(Menu.class);
		System.out.println("Menu:");
		for (MenuItem item : menu.getItems()) {
			System.out.println(item.getName() + " - €" + item.getPrice());
			if (item instanceof Pizza) {
				System.out.println("Toppings:");
				for (String topping : ((Pizza) item).getToppings()) {
					System.out.println("- " + topping);
				}
			}
		}
	}
}
