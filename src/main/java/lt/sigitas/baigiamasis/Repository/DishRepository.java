package lt.sigitas.baigiamasis.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DishRepository extends CrudRepository<Dish, Integer> {

    Optional<Dish> findByIdDish(int id);
    Optional<Dish> findByDishName(String dishName);
    Iterable<Dish> findByDishNameLike(String ingredientName);
}
