package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Ingredient;
import lt.sigitas.baigiamasis.Repository.IngredientRepository;
import lt.sigitas.baigiamasis.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/ingredientmapping")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private IngredientRepository ingredientRepository;

    ////http://localhost:8080/ingredientmapping/ingredient/all
    @GetMapping(path = "/ingredient/all")
    public @ResponseBody List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();

    }

    ////http://localhost:8080/ingredientmapping/ingredient/id/7
    @GetMapping(path = "/ingredient/id/{id}")
    public @ResponseBody Ingredient getIngredientByID(@PathVariable int id) {
        return ingredientService.getIngredientById(id);

    }

    ////http://localhost:8080/ingredientmapping/myingredient/7
    @GetMapping(path = "/myingredient/{id}")
    public @ResponseBody Ingredient getMyIngredientByID(@PathVariable int id) {
        return ingredientService.getMyIngredientById(id);

    }

    //   http://localhost:8080/ingredientmapping/myingredient/name/Agurkas
    @GetMapping(path = "/myingredient/name/{name}")
    public @ResponseBody Ingredient getMyIngredientByName(@PathVariable String name) {
        return ingredientService.getMyIngredientByName(name);
    }

    //   http://localhost:8080/ingredientmapping/myingredient/Like/ag
    @GetMapping(path = "/myingredient/Like/{name}")
    public @ResponseBody List<Ingredient> getMyIngredientByNameLike(@PathVariable String name) {
        return ingredientService.getMyIngredientByNameLike("%" + name + "%");
    }
}
