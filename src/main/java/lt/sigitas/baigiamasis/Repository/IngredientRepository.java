package lt.sigitas.baigiamasis.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    Optional<Ingredient> findByIngredientNumber(int id);
    Optional<Ingredient> findByIngredientName(String ingredientName);
    Iterable<Ingredient> findByIngredientNameLike(String ingredientName);

}
