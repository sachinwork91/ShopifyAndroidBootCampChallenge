package com.shopify.androidbootcamp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

//This is the main class
public class AndroidBootCamp {

	// This class is used to store the Tax Details for the output
	public class TaxDetails {

		String tax_detail_name;
		float tax_percentage;
		float amount;

		public String getTax_detail_name() {
			return tax_detail_name;
		}

		public void setTax_detail_name(String tax_detail_name) {
			this.tax_detail_name = tax_detail_name;
		}

		public float getTax_percentage() {
			return tax_percentage;
		}

		public void setTax_percentage(float tax_percentage) {
			this.tax_percentage = tax_percentage;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}

	}

	// This Class is used to set the Product Details for the Output
	public class OutputDetails {
		int id;
		String name;
		String size;
		float price;
		int tax_code;
		String tax_name;
	}

	// This class is used to store the products
	public class Products {

		int id;
		String name;
		List<Variant> variants;
	}

	// This class is used to store the TaxRate
	public class TaxRate {
		int code;
		String name;
		float rate;

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getRate() {
			return rate;
		}

		public void setRate(float rate) {
			this.rate = rate;
		}

	}

	// This class is used to store passed
	public class Input {
		int product;

		public int getVariant() {
			return variant;
		}

		public void setVariant(int variant) {
			this.variant = variant;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getProduct() {
			return product;
		}

		public void setProduct(int product) {
			this.product = product;
		}

		int variant;
		int quantity;
	}

	// This class is used to store Variant
	public class Variant {

		String size;
		float price;
		int tax_code;

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public int getTax_code() {
			return tax_code;
		}

		public void setTax_code(int tax_code) {
			this.tax_code = tax_code;
		}
	}

	// This method returns the Products in JSON form
	public String getProducts() {

		String products = "[" + " {" + "   \"id\": 1000," + "   \"name\": \"Adult Shoes\"," + "   \"variants\": ["
				+ "     {" + "       \"size\": \"size 6\"," + "       \"price\": 39.99," + "       \"tax_code\": 0"
				+ "     }," + "     {" + "       \"size\": \"size 8\"," + "       \"price\": 39.99,"
				+ "       \"tax_code\": 0" + "     }," + "     {" + "       \"size\": \"size 10\","
				+ "       \"price\": 39.99," + "       \"tax_code\": 0" + "     }" + "   ]" + " }," + " {"
				+ "   \"id\": 2000," + "   \"name\": \"Child Shoes\"," + "   \"variants\": [" + "     {"
				+ "       \"size\": \"size 1\"," + "       \"price\": 19.99," + "       \"tax_code\": 3" + "     },"
				+ "     {" + "       \"size\": \"size 4\"," + "       \"price\": 19.99," + "       \"tax_code\": 3"
				+ "     }," + "     {" + "       \"size\": \"size 7\"," + "       \"price\": 19.99,"
				+ "       \"tax_code\": 0" + "     }" + "   ]" + " }," + " {" + "   \"id\": 3000,"
				+ "   \"name\": \"Eggs\"," + "   \"variants\": [" + "     {" + "       \"size\": \"6\","
				+ "       \"price\": 1.50," + "       \"tax_code\": 7" + "     }," + "     {"
				+ "       \"size\": \"12\"," + "       \"price\": 2.25," + "       \"tax_code\": 7" + "     }" + "   ]"
				+ " }," + " {" + "   \"id\": 3100," + "   \"name\": \"Apples\"," + "   \"variants\": [" + "     {"
				+ "       \"size\": \"1\"," + "       \"price\": 0.30," + "       \"tax_code\": 7" + "     },"
				+ "     {" + "       \"size\": \"10\"," + "       \"price\": 2.50," + "       \"tax_code\": 7"
				+ "     }" + "   ]" + " }," + " {" + "   \"id\": 4000," + "   \"name\": \"Prepared sandwich\","
				+ "   \"variants\": [" + "     {" + "       \"size\": \"Small\"," + "       \"price\": 2.50,"
				+ "       \"tax_code\": 5" + "     }," + "     {" + "       \"size\": \"Large\","
				+ "       \"price\": 4.00," + "       \"tax_code\": 5" + "     }" + "   ]" + " }," + " {"
				+ "   \"id\": 5423," + "   \"name\": \"Book\"," + "   \"variants\": [" + "     {"
				+ "       \"size\": \"Assorted\"," + "       \"price\": 11.00," + "       \"tax_code\": 1" + "     }"
				+ "   ]" + " }," + " {" + "   \"id\": 9999," + "   \"name\": \"Toy\"," + "   \"variants\": [" + "     {"
				+ "       \"size\": \"Various\"," + "       \"price\": 3.99," + "       \"tax_code\": 0" + "     }"
				+ "   ]" + " }" + "]";
			System.out.println(products);
		return products;
	}

	// This method gives the TaxRates in JSON format
	public String getTaxRatesfromJSON() {
		String tax_rates = "[" + " {" + "   \"code\": 0," + "   \"name\": \"HST\"," + "   \"rate\": 0.13" + " }," + " {"
				+ "   \"code\": 1," + "   \"name\": \"HST - Books\"," + "   \"rate\": 0.05" + " }," + " {"
				+ "   \"code\": 3," + "   \"name\": \"HST - Children's Clothing\"," + "   \"rate\": 0.05" + " }," + " {"
				+ "   \"code\": 4," + "   \"name\": \"HST - Children's footwear\"," + "   \"rate\": 0.05" + " }," + " {"
				+ "   \"code\": 5," + "   \"name\": \"HST - Prepared food < $4\"," + "   \"rate\": 0.05" + " }," + " {"
				+ "   \"code\": 7," + "   \"name\": \"EXEMPT - Food\"," + "   \"rate\": 0" + " }" + "]";

		return tax_rates;
	}

	// This method gets the Test Input 1 in JSON format
	public String getTestInput1FromJSON() {

		String testInput1 = "[" +
				" {" +
				"   \"product\": 1000," +
				"   \"variant\": 0," +
				"   \"quantity\": 1" +
				" }," +
				" {" +
				"   \"product\": 2000," +
				"   \"variant\": 1," +
				"   \"quantity\": 10" +
				" }," +
				" {" +
				"   \"product\": 3000," +
				"   \"variant\": 0," +
				"   \"quantity\": 6" +
				" }," +
				" {" +
				"   \"product\": 4000," +
				"   \"variant\": 0," +
				"   \"quantity\": 1" +
				" }" +
				"]";

		
		return testInput1;

	}

	// This method gets the Test Input 2 in JSON format
	public String getTestInput2FromJSON() {

		String testInput2 = "[" +
				" {" +
				"   \"product\": 3000," +
				"   \"variant\": 0," +
				"   \"quantity\": 4" +
				" }," +
				" {" +
				"   \"product\": 4000," +
				"   \"variant\": 0," +
				"   \"quantity\": 1" +
				" }," +
				" {" +
				"   \"product\": 2000," +
				"   \"variant\": 1," +
				"   \"quantity\": 8" +
				" }," +
				" {" +
				"   \"product\": 5423," +
				"   \"variant\": 0," +
				"   \"quantity\": 9" +
				" }," +
				" {" +
				"   \"product\": 1000," +
				"   \"variant\": 1," +
				"   \"quantity\": 1" +
				" }," +
				" {" +
				"   \"product\": 9999," +
				"   \"variant\": 0," +
				"   \"quantity\": 3" +
				" }" +
				"]";

		
		return testInput2;

	}

	// Get the Total Products from the Input
	Products[] getProductsGson() {
		Gson gson = new Gson();
		Products[] products = gson.fromJson(getProducts(), Products[].class);
		return products;
	}

	// Get TaxRates
	TaxRate[] getTaxRatesGson() {
		Gson gson = new Gson();
		TaxRate[] taxRates = gson.fromJson(getTaxRatesfromJSON(), TaxRate[].class);
		return taxRates;
	}

	// Get Test Input 1
	Input[] getTestInput1() {
		Gson gson = new Gson();
		Input[] input = gson.fromJson(getTestInput1FromJSON(), Input[].class);
		return input;
	}

	// Get Test Input 2
	Input[] getTestInput2() {
		Gson gson = new Gson();
		Input[] input = gson.fromJson(getTestInput2FromJSON(), Input[].class);
		return input;
	}

	// This method is used to get the variant from the list of variants
	public Variant getVariant(List<Variant> v, int variant_number) {

		Variant variant = v.get(variant_number);
		return variant;

	}

	// Get the Output Details for Products
	public OutputDetails getDetails(Products[] products, int product_id, int quantity, int variant_number) {
		OutputDetails output = new OutputDetails();
		for (Products p : products) {
			if (p.id == product_id) {
				output.id = product_id;
				output.name = p.name;
				List<Variant> variants = p.variants;
				Variant variant = getVariant(variants, variant_number);
				output.size = variant.getSize();
				output.price = variant.getPrice();
				output.tax_code = variant.getTax_code();

			}
		}

		return output;
	}

	// Get the output Details for the Tax
	public TaxRate getSpecificTaxRate(TaxRate[] taxrate, int tax_code) {

		for (TaxRate t : taxrate) {
			if (t.code == tax_code) {
				return t;
			}
		}

		return null;

	}

	// This method prints the final result for the inputs passed
	public void getResults(Input[] inputs, AndroidBootCamp solution, Products[] products) {
		
		System.out.println("===============================================================================");
		System.out.println("                    Coding Challenge Store                                      ");
		System.out.println("===============================================================================");

		LinkedHashMap<String, TaxDetails> tax_totals = new LinkedHashMap<String, TaxDetails>();
		
		float sub_total = 0;

		System.out.println("Quantity    DESCRIPTION                TaxCode       Amount");

		for (Input input : inputs) {

			OutputDetails output = solution.getDetails(products, input.product, input.quantity, input.variant);

			System.out.printf("%-10s %-30s %-10s %-20s\n", input.quantity, output.name + "-" + output.size,
					output.tax_code,  String.format("%.2f", input.quantity * output.price));

			sub_total += input.quantity * output.price;

			TaxRate taxrate = solution.getSpecificTaxRate(solution.getTaxRatesGson(), output.tax_code);

			String taxDetailedName = taxrate.code + "-" + taxrate.name;

			// Check if the entry for the tax already exists
			if (tax_totals.containsKey(taxDetailedName)) {
				// get the TaxDetails with the associated entry
				TaxDetails taxdetails = tax_totals.get(taxDetailedName);
				taxdetails.amount += input.quantity * output.price;
				tax_totals.put(taxDetailedName, taxdetails);
			} else {
				// Create a New Entry For Tax Details
				// Initializing inner class
				AndroidBootCamp.TaxDetails temp = solution.new TaxDetails();
				temp.setTax_detail_name(taxDetailedName);
				temp.setAmount(input.quantity * output.price);
				temp.setTax_percentage(taxrate.rate);
				tax_totals.put(taxDetailedName, temp);

			}

		}

		System.out.println("              SUBTOTAL:     $" + String.format("%.2f", sub_total));

		// Printing the Tax Part
		for (String key : tax_totals.keySet()) {

			TaxDetails result = tax_totals.get(key);

			System.out.printf("%-40s %-11s %-20s\n", key, (int) (result.tax_percentage * 100) + "%",
					String.format("%.2f", ((result.tax_percentage) * result.amount)));

			sub_total += (result.tax_percentage) * result.amount;
		}

		System.out.println("                    Total:      $" + String.format("%.2f", sub_total));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AndroidBootCamp solution = new AndroidBootCamp();
		Products[] products = solution.getProductsGson();
		TaxRate[] taxRates = solution.getTaxRatesGson();

		// Get the Test Input 1
		Input[] inputs = solution.getTestInput1();

		// Get the Test Input 2
		Input[] input2 = solution.getTestInput2();

		
		solution.getResults(inputs, solution, products);
		solution.getResults(input2, solution, products);

	}

}
