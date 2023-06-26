package com.myproject.marketorder;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.marketorder.model.Product;
import com.myproject.marketorder.model.repository.MarketRepository;

@SpringBootApplication
public class MarketOrderApplication implements CommandLineRunner{

	private final MarketRepository marketRepository;

	

	public MarketOrderApplication(MarketRepository marketRepository) {
		this.marketRepository = marketRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MarketOrderApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = Product.builder().name("IPhone X")
		.price(4500.0)
		.quantity(50).build();

		Product product2 = Product.builder().name("Samsung S22")
		.price(2500.0)
		.quantity(40).build();

		Product product3 = Product.builder().name("IPhone 13")
		.price(7500.0)
		.quantity(30).build();
		
		marketRepository.saveAll(Arrays.asList(product1,product2,product3));
		
	}

}
