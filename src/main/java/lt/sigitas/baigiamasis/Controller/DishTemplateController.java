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
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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
    ///http://localhost:8080/dishtemplate/dishes/getandpost
    @RequestMapping(value = "/dishes/getandpost", method = RequestMethod.GET)
    public String getDishByNameLike(Model model){
        model.addAttribute("key_dish", new Dish());
        model.addAttribute("key_dish_listas", Collections.emptyList());
        return "/Dish/post_get_dishes_th";
    }
    ///http://localhost:8080/dishtemplate/dishes/getandpost
    @RequestMapping(value = "/dishes/getandpost", method = RequestMethod.POST)
    public String postDishByNameLike(Model model, @ModelAttribute(value = "key_dish") Dish dish){
        List<Dish> dishes = dishService.getMyDishByNameLike("%" + dish.getDishName() + "%");
        model.addAttribute("key_dish_listas", dishes);
        return "/Dish/post_get_dishes_th";
    }

}
