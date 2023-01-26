package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Ingredient;
import lt.sigitas.baigiamasis.Repository.IngredientRepository;
import lt.sigitas.baigiamasis.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(path = "/ingredienttemplate" )
public class IngredientTemplateController {

    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private IngredientRepository ingredientRepository;

    //http://localhost:8080/ingredienttemplate/ingredientpage/ingredient/id/7
    @GetMapping(path = "/ingredientpage/ingredient/id/{id}" )
    public String getIngredientWithIngredientPage(Model model, @PathVariable int id) {

        Ingredient ingredient = ingredientService.getMyIngredientById(id);

        model.addAttribute("ingredient_name", ingredient.getIngredientName());
        model.addAttribute("food_Category", ingredient.getFoodCategory());
        model.addAttribute("portion", ingredient.getPortion());
        model.addAttribute("unit", ingredient.getUnit());
        model.addAttribute("sugars_total_in_portion", ingredient.getSugarsTotalInPortion());
        model.addAttribute("proteins_total_in_portion", ingredient.getProteinsTotalInPortion());

        return "/Files/Ingredientpage";
    }

    //http://localhost:8080/ingredienttemplate/ingredientpage/ingredient/all
    @GetMapping(path = "/ingredientpage/ingredient/all" )
    public String getAllIngredients(Model model) {
        List<Ingredient> ingredientsList = ingredientService.getAllIngredients();
        model.addAttribute("key_ingredients_list", ingredientsList);
        return "/Files/ingredient_all_page";
    }
    ///http://localhost:8080/ingredienttemplate/ingredients/getandpost
    @RequestMapping(value = "/ingredients/getandpost", method = RequestMethod.GET)
    public String getIngredientByNameLike(Model model){
        model.addAttribute("key_ingredient", new Ingredient());
        model.addAttribute("key_ingredient_listas", Collections.emptyList());
        return "/Ingredient/post_get_ingredients_th";
    }
    ///http://localhost:8080/ingredienttemplate/ingredients/getandpost
    @RequestMapping(value = "/ingredients/getandpost", method = RequestMethod.POST)
    public String postIngredientByNameLike(Model model, @ModelAttribute(value = "key_ingredient") Ingredient ingredient){
        List<Ingredient> ingredients= ingredientService.getMyIngredientByNameLike("%" + ingredient.getIngredientName() + "%");
        model.addAttribute("key_ingredient_listas", ingredients);
        return "/Ingredient/post_get_ingredients_th";
    }



}
