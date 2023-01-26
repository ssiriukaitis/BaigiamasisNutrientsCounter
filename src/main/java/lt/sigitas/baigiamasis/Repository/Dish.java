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
    @Column(name = "recipe")
    private String recipe;

}
