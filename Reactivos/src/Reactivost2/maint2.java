package Reactivost2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class maint2 {
	public static void main(String[] args) {
		List<Product> shoppingCart = List.of(
				new Product("Camisa", new BigDecimal("15.99"), Tax.SUPERREDUCED),
				new Product("Pantalon", new BigDecimal("25.99"), Tax.NORMAL),
				new Product("Zapatos", new BigDecimal("19.99"), Tax.REDUCED)
				);
		
		/*Optional<Double> costeTotal = shoppingCart.stream().map(product -> product.price + ((product.price + product.tax.percent)/100)).reduce((x, y) -> x+y);*/
		
		BigDecimal costeTotal = shoppingCart.stream()
				.map(x -> x.price.add(x.price.multiply(new BigDecimal(x.tax.percent)).divide(new BigDecimal(100))))
				.reduce(BigDecimal.ZERO, (x,y) -> x.add(y)).setScale(2, RoundingMode.CEILING);
		
		System.out.println("Coste total: "+costeTotal);
	}
}
