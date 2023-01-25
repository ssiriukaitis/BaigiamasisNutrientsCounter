package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Dish;
import lt.sigitas.baigiamasis.Repository.Ingredient;
import lt.sigitas.baigiamasis.Service.DishService;
import lt.sigitas.baigiamasis.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/dishmapping")
public class DishController {

    @Autowired
    private DishService dishService;

    ////http://localhost:8080/dishmapping/dish/all
    @GetMapping(path = "/dish/all")
    public @ResponseBody List<Dish> getAllDishes(){
        return dishService.getAllDishes();

    }
    ////http://localhost:8080/dishmapping/dish/7
    @GetMapping(path = "/dish/{id}")
    public @ResponseBody Dish getDishByID(@PathVariable int id) {
        return dishService.getDishById(id);
    }
}
