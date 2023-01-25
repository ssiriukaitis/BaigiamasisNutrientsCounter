package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Ingredient;
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

    ////http://localhost:8080/ingredientmapping/ingredient/all
    @GetMapping(path = "/ingredient/all")
    public @ResponseBody List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();

    }
    ////http://localhost:8080/ingredientmapping/ingredient/7
    @GetMapping(path = "/ingredient/{id}")
    public @ResponseBody Ingredient getIngredientByID(@PathVariable int id) {
        return ingredientService.getIngredientById(id);

    }


}
