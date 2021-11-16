package com.company.kuda;

import com.company.kuda.farmer.Farmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Farmer> farmerList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        //varibles

        Farmer farmer = new Farmer();
        Farmer farmer1 = new Farmer();


        //assigning values to varibles for farmer
        farmer.setIdNumber("18-2422001-B-47");
        farmer.setName("Kudakwashe");
        farmer.setSurname("Muparuri");
        farmer.setVillage("Makunde");
        farmer.setDateOfBirth(LocalDate.now());
        farmer.setWard(21);

        //assigning values to varibles for farmer
        farmer1.setIdNumber("63145532");
        farmer1.setName("Allen");
        farmer1.setSurname("Mangwanya");
        farmer1.setWard(22);

        //Data Structure

        //function to add farmer to DB

        saveFarmer(farmer);
        saveFarmer(farmer1);


        //functions
        //TODO functions are used to process data/task
        //algorithm ...series steps to follow

        //TODO -Add a function that get data in farmer list and print them to console

    }

    public static void saveFarmer(Farmer murimi){

        System.out.println("Adding farmer to database " +murimi.toString());
        farmerList.add(murimi);
        System.out.println("Added ");

    }
}
