package com.au.challenge.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> getProductList() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("APPLE_IPAD_PRO","Electronic Device","Apple ipad pro 2017",320.50));
		products.add(new Product("APPLE_IPHONE_8","Electronic Device","Apple iphone 8 2017",820.50));
		products.add(new Product("APPLE_IMAC_PRO","Electronic Device","Apple iMac Pro 2017",2320.50));
		products.add(new Product("APPLE_TV","Electronic Device","Apple Tv 2017",120.50));
		
		products.add(new Product("GOOGLE_PIXEL","Electronic Device","Apple ipad pro 2017",620.50));
		products.add(new Product("GOOGLE_Nexus","Electronic Device","Apple ipad pro 2017",320.50));
		products.add(new Product("GOOGLE_HOME","Electronic Device","Apple ipad pro 2017",120.50));
		
		products.add(new Product("SAMSUNG_GALAXY_8","Electronic Device","Apple ipad pro 2017",720.50));
		products.add(new Product("SAMSUNG_TV","Electronic Device","Apple ipad pro 2017",920.50));
		products.add(new Product("SAMSUNG_SOUND_BAR","Electronic Device","Apple ipad pro 2017",820.50));
		products.add(new Product("SAMSUNG_WATCH","Electronic Device","Samsung watch for Android mobiles",120.50));
		
		return products;
		
	}

}
