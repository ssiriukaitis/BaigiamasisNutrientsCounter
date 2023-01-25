package lt.sigitas.baigiamasis.Service;

import lt.sigitas.baigiamasis.Repository.Ingredient;
import lt.sigitas.baigiamasis.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;


    public List<Ingredient> getAllIngredients(){
        return (List<Ingredient>) ingredientRepository.findAll();
    }
    public Ingredient getIngredientById(Integer ingredientId){
        return ingredientRepository.findById(ingredientId).get();
    }

}
