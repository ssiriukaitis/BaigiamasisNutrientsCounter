package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Dish;
import lt.sigitas.baigiamasis.Repository.DishRepository;
import lt.sigitas.baigiamasis.Repository.Ingredient;
import lt.sigitas.baigiamasis.Repository.IngredientRepository;
import lt.sigitas.baigiamasis.Service.DishService;
import lt.sigitas.baigiamasis.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/dishtemplate" )
public class DishTemplateController {

    @Autowired
    private DishService dishService;
    @Autowired
    private DishRepository dishRepository;

    //http://localhost:8080/dishtemplate/dishpage/dish/id/2
    @GetMapping(path = "/dishpage/dish/id/{id}" )
    public String getDishWithDishPage(Model model, @PathVariable int id) {

        Dish dish = dishService.getMyDishById(id);

        model.addAttribute("dish_Name", dish.getDishName());
        model.addAttribute("recipe", dish.getRecipe());

        return "/Files/Dishpage";
    }

    //http://localhost:8080/dishtemplate/dishallpage/dish/all
    @GetMapping(path = "/dishallpage/dish/all" )
    public String getAllDishes(Model model) {
        List<Dish> dishesList = dishService.getAllDishes();
        model.addAttribute("key_dishes_list", dishesList);
        return "/Files/Dish_all_page";
    }


}
