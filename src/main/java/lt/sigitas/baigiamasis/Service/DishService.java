package lt.sigitas.baigiamasis.Service;

import lt.sigitas.baigiamasis.Repository.Dish;
import lt.sigitas.baigiamasis.Repository.DishRepository;
import lt.sigitas.baigiamasis.Repository.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;


    public List<Dish> getAllDishes(){
        return (List<Dish>) dishRepository.findAll();
    }
    public Dish getDishById(Integer dishId){
        return dishRepository.findById(dishId).get();
    }
    public Dish getMyDishById(int id){
        return dishRepository.findByDishNumber(id).get();
    }
    public Dish getMyDishByName(String dishName){
        return dishRepository.findByDishName(dishName).get();
    }
    public List<Dish> getMyDishByNameLike(String dishName){
        return (List<Dish>) dishRepository.findByDishNameLike(dishName);
    }

}
