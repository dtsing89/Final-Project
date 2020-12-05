import java.io.IOException;
import java.util.Observer;

public class Main {
	public static void main(String[] args) throws IOException {

		CarFactory carFactory = new CarFactory();

		Car car1 = CarFactory.getCar("sedan");
		car1.setMake("toyota");
		car1.setModel("Corolla");
		car1.setColor("Black");
		car1.setMileage(19981);
		car1.setYear(2020);
		car1.setPrice(17999.99);

		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getYear());
		System.out.println(car1.getPrice());
		System.out.println(car1.getMileage());

		Salesperson salesperson = new Salesperson();
		Store store = new Store("store1");
		store.addObserver(salesperson);
		store.decrement("sedan");

		Extra test = new Extra("enkei", 50);
		Rims rims1 = new Rims(test);
		System.out.println("The cost for the rims is " + rims1.getCost());
		
		/////////////////////////////////////////////////////////////////////

		Car car2 = CarFactory.getCar("coupe");
		car2.setMake("Honda");
		car2.setModel("Accord");
		car2.setColor("Black");
		car2.setMileage(19981);
		car2.setYear(2018);
		car2.setPrice(17999.99);

		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getYear());
		System.out.println(car2.getPrice());
		System.out.println(car2.getMileage());

		Salesperson salesperson1 = new Salesperson();
		Store store1 = new Store("store2");
		store.addObserver(salesperson1);
		store.decrement("coupe");

		Extra etest = new Extra("Sony", 120);
		Stereo mtest = new Stereo(etest);
		System.out.println("The cost for the stereo is " + mtest.getCost());
		
		/////////////////////////////////////////////////////////////////////

		Car car3 = CarFactory.getCar("coupe");
		car3.setMake("Honda");
		car3.setModel("Civic");
		car3.setColor("Blue");
		car3.setMileage(12981);
		car3.setYear(2012);
		car3.setPrice(13999.99);

		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getYear());
		System.out.println(car3.getPrice());
		System.out.println(car3.getMileage());
		
		Salesperson salesperson2 = new Salesperson();
		Store store2 = new Store("store3");
		store.addObserver(salesperson2);
		store.decrement("coupe");
		
		/////////////////////////////////////////////////////////////////////

		Car car4 = CarFactory.getCar("truck");
		car4.setMake("Toyota");
		car4.setModel("Tacoma");
		car4.setColor("Blue");
		car4.setMileage(24981);
		car4.setYear(2019);
		car4.setPrice(23999.99);
		
		Salesperson salesperson3 = new Salesperson();
		Store store3 = new Store("store4");
		store.addObserver(salesperson3);
		store.decrement("truck");
		
		/////////////////////////////////////////////////////////////////////
		Car car5 = CarFactory.getCar("sportscar");
		car5.setMake("Audi");
		car5.setModel("R8");
		car5.setColor("Red");
		car5.setMileage(0);
		car5.setYear(2021);
		car5.setPrice(10999.99);
		
		Salesperson salesperson4 = new Salesperson();
		Store store4 = new Store("store5");
		store.addObserver(salesperson4);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car6 = CarFactory.getCar("truck");
		car6.setMake("Dodge");
		car6.setModel("Ram");
		car6.setColor("Silver");
		car6.setMileage(55981);
		car6.setYear(2018);
		car6.setPrice(14599.99);
		
		Salesperson salesperson5 = new Salesperson();
		Store store5 = new Store("store6");
		store.addObserver(salesperson5);
		store.decrement("truck");
		
		/////////////////////////////////////////////////////////////////////

		Car car7 = CarFactory.getCar("sportscar");
		car7.setMake("Porsche");
		car7.setModel("Cayman");
		car7.setColor("Blue");
		car7.setMileage(1981);
		car7.setYear(2019);
		car7.setPrice(89999.99);
		
		Salesperson salesperson6 = new Salesperson();
		Store store6 = new Store("store7");
		store.addObserver(salesperson6);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car8 = CarFactory.getCar("hatchback");
		car8.setMake("Subaru");
		car8.setModel("Outback");
		car8.setColor("Brown");
		car8.setMileage(76121);
		car8.setYear(2012);
		car8.setPrice(8999.99);
		
		Salesperson salesperson7 = new Salesperson();
		Store store7 = new Store("store8");
		store.addObserver(salesperson7);
		store.decrement("hatchback");
		
		/////////////////////////////////////////////////////////////////////

		Car car9 = CarFactory.getCar("SUV");
		car9.setMake("Jeep");
		car9.setModel("Grand Cherokee");
		car9.setColor("Tan");
		car9.setMileage(38903);
		car9.setYear(2016);
		car9.setPrice(13999.99);
		
		Salesperson salesperson8 = new Salesperson();
		Store store8 = new Store("store9");
		store.addObserver(salesperson8);
		store.decrement("SUV");
		
		/////////////////////////////////////////////////////////////////////

		Car car10 = CarFactory.getCar("Sportscar");
		car10.setMake("Nissan");
		car10.setModel("370z");
		car10.setColor("Silver");
		car10.setMileage(2799);
		car10.setYear(2019);
		car10.setPrice(29999.99);
		
		Salesperson salesperson9 = new Salesperson();
		Store store9 = new Store("store10");
		store.addObserver(salesperson9);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car11 = CarFactory.getCar("sportscar");
		car11.setMake("BMW");
		car11.setModel("M6");
		car11.setColor("White");
		car11.setMileage(981);
		car11.setYear(2020);
		car11.setPrice(67999.99);
		
		Salesperson salesperson10 = new Salesperson();
		Store store10 = new Store("store11");
		store.addObserver(salesperson10);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////
		
		Car car12 = CarFactory.getCar("sportscar");
		car12.setMake("Nissan");
		car12.setModel("GTR");
		car12.setColor("Black");
		car12.setMileage(43);
		car12.setYear(2020);
		car12.setPrice(89999.99);
		
		Salesperson salesperson11 = new Salesperson();
		Store store11 = new Store("store12");
		store.addObserver(salesperson11);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////
		Car car13 = CarFactory.getCar("sportscar");
		car13.setMake("Mitsubishi");
		car13.setModel("Evolution XIII");
		car13.setColor("Red");
		car13.setMileage(9822);
		car13.setYear(2019);
		car13.setPrice(30999.99);
		
		Salesperson salesperson12 = new Salesperson();
		Store store12 = new Store("store13");
		store.addObserver(salesperson12);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		
		Car car14 = CarFactory.getCar("sportscar");
		car14.setMake("BMW");
		car14.setModel("M3");
		car14.setColor("Blue");
		car14.setMileage(43988);
		car14.setYear(2017);
		car14.setPrice(47999.99);
		
		Salesperson salesperson13 = new Salesperson();
		Store store13 = new Store("store14");
		store.addObserver(salesperson13);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car15 = CarFactory.getCar("sportscar");
		car15.setMake("Toyota");
		car15.setModel("Supra");
		car15.setColor("Black");
		car15.setMileage(0);
		car15.setYear(2021);
		car15.setPrice(41999.99);
		
		Salesperson salesperson14 = new Salesperson();
		Store store14 = new Store("store15");
		store.addObserver(salesperson14);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////
		
		Car car16 = CarFactory.getCar("sportscar");
		car16.setMake("Porsche");
		car16.setModel("911");
		car16.setColor("BLue");
		car16.setMileage(0);
		car16.setYear(2021);
		car16.setPrice(98999.99);
		
		Salesperson salesperson15 = new Salesperson();
		Store store15 = new Store("store16");
		store.addObserver(salesperson15);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car17 = CarFactory.getCar("sportscar");
		car17.setMake("Acura");
		car17.setModel("NSX");
		car17.setColor("Red");
		car17.setMileage(0);
		car17.setYear(2021);
		car17.setPrice(155999.99);
		
		Salesperson salesperson16 = new Salesperson();
		Store store16 = new Store("store17");
		store.addObserver(salesperson16);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car18 = CarFactory.getCar("sportscar");
		car18.setMake("Subaru");
		car18.setModel("BRZ");
		car18.setColor("Blue");
		car18.setMileage(0);
		car18.setYear(2021);
		car18.setPrice(26999.99);
		
		Salesperson salesperson17 = new Salesperson();
		Store store17 = new Store("store18");
		store.addObserver(salesperson17);
		store.decrement("sportscar");
		
		/////////////////////////////////////////////////////////////////////

		Car car19 = CarFactory.getCar("sportscar");
		car19.setMake("Aston Martin");
		car19.setModel("DB11");
		car19.setColor("Silver");
		car19.setMileage(12485);
		car19.setYear(2019);
		car19.setPrice(201999.99);
		
		Salesperson salesperson18 = new Salesperson();
		Store store18 = new Store("store19");
		store.addObserver(salesperson18);
		store.decrement("sportscar");

	}
}
