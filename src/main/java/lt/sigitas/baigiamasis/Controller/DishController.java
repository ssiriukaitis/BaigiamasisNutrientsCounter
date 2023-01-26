package lt.sigitas.baigiamasis.Controller;

import lt.sigitas.baigiamasis.Repository.Dish;
import lt.sigitas.baigiamasis.Service.DishService;
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
    public @ResponseBody List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }

    ////http://localhost:8080/dishmapping/dish/id/2
    @GetMapping(path = "/dish/id/{id}")
    public @ResponseBody Dish getDishByID(@PathVariable int id) {
        return dishService.getDishById(id);
    }

    ////http://localhost:8080/dishmapping/mydish/id/2
    @GetMapping(path = "/mydish/id/{id}")
    public @ResponseBody Dish getMyDishByID(@PathVariable int id) {
        return dishService.getMyDishById(id);
    }

    //   http://localhost:8080/dishmapping/mydish/name/Daržovių%20glotnutis
    @GetMapping(path = "/mydish/name/{name}")
    public @ResponseBody Dish getMyDishByName(@PathVariable String name) {
        return dishService.getMyDishByName(name);
    }

    //   http://localhost:8080/dishmapping/mydish/Like/tor
    @GetMapping(path = "/mydish/Like/{name}")
    public @ResponseBody List<Dish> getMyDishByNameLike(@PathVariable String name) {
        return dishService.getMyDishByNameLike("%" + name + "%");
    }
}
