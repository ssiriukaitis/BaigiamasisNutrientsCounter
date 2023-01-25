package lt.sigitas.baigiamasis.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "dishes")
public class Dish {

    @Id
    @Column(name = "iddish")
    private Integer idDish;
    @Column(name = "dishname")
    private String dishName;
    @Column(name = "ingredients")
    private String ingredients;
    @Column(name = "ingredientportion")
    private Integer ingredientPortion;
    @Column(name = "ingredientunit")
    private String ingredientUnit;
    @Column(name = "recipe")
    private String recipe;
    @Column(name = "carbstotal")
    private Integer carbsTotal;
    @Column(name = "proteinstotal")
    private Integer proteinsTotal;

    @Column(name = "ingredients_idingredient")
    private Integer ingredients_idIngredient;


}
