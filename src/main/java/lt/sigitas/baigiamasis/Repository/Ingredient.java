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
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @Column(name = "idingredient")
    private Integer idIngredient;
    @Column(name = "ingredientname")
    private String ingredientName;
    @Column(name = "foodcategory")
    private String foodCategory;
    @Column(name = "portion")
    private Integer portion;
    @Column(name = "unit")
    private String unit;
    @Column(name = "carbstotalinportion")
    private Integer carbsTotalInPortion;
    @Column(name = "proteinstotalinportion")
    private Integer proteinsTotalInPortion;

    @Override
    public String toString() {
        return "Ingredientas{" +
                "Ingrediento id=" + idIngredient +
                ", Pavadinimas='" + ingredientName + '\'' +
                ", Maisto kategorija='" + foodCategory + '\'' +
                ", Kiekis=" + portion +
                ", Mato vienetas='" + unit + '\'' +
                ", viso angliavandenų (g.)=" + carbsTotalInPortion +
                ", viso baltymų (g.)=" + proteinsTotalInPortion +
                '}';
    }
}

