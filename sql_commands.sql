CREATE SCHEMA nutrientscounter;

DROP TABLE dishes,ingredients;

SELECT * FROM nutrientscounter.ingredients;


INSERT INTO ingredients (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`) VALUES (1,'Grikių miltai','Miltai',100,'g.',70.6,12.6);
INSERT INTO `ingredients` (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`)  VALUES (2,'Migdolų miltai','Miltai',100,'g.',16.2,26.2);
INSERT INTO `ingredients` (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`) VALUES (3,'Kokosų miltai','Miltai',100,'g.',60,20);
INSERT INTO `ingredients` (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`)  VALUES (4,'Vištos kiaušinis','Kiaušiniai',50,'g.',0.48,6.24);
INSERT INTO `ingredients` (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`) VALUES (5,'Kakava Beatos','Kakava',100,'g.',45,19.9);
INSERT INTO `ingredients` (`idIngredient`,`ingredientName`,`foodCategory`,`portion`,`unit`,`carbsTotalInPortion`,`proteinsTotalInPortion`)  VALUES (6,'Stevia Alvo','Saldiklis',100,'g.',0,0);
