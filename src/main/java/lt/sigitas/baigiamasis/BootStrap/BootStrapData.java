package lt.sigitas.baigiamasis.BootStrap;

import lt.sigitas.baigiamasis.Repository.DishRepository;
import lt.sigitas.baigiamasis.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private DishRepository dishRepository;


    @Override
    public void run(String... args) throws Exception {


        System.out.println("\n------------\n");
        ingredientRepository.findAll().forEach(System.out::println);
        System.out.println("\n------------\n");
        System.out.println(ingredientRepository.findById(2));
        System.out.println("\n------------\n");
        dishRepository.findAll().forEach(System.out::println);
        System.out.println(dishRepository.findById(2));

    }

}
