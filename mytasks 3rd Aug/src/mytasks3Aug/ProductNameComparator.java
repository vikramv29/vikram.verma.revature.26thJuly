package mytasks3Aug;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

}


