package Back.end.S5.L1.esercizio;

import Back.end.S5.L1.esercizio.entities.Bevande;
import Back.end.S5.L1.esercizio.entities.Menu;
import Back.end.S5.L1.esercizio.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {


    @Bean
    public Pizza margherita() {
        Pizza margherita = new Pizza("Margherita", 7.0);
        margherita.addTopping("Mozzarella");
        margherita.addTopping("Pomodoro");
        return margherita;
    }


    @Bean
    public Bevande cocacola() {
        return new Bevande("Coca Cola", 2.0, "Piccola");
    }


    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addItem(margherita());
        menu.addItem(cocacola());
        return menu;
    }
}