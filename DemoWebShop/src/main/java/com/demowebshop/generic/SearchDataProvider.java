package com.demowebshop.generic;

import org.testng.annotations.DataProvider;

public class SearchDataProvider {

	@DataProvider
public static Object[][]  data(){
	Object[][] values= {
			{"Search"},
			{"Lap"},
			{" "},
			{"nonsense"},
			{"UPPERCASE"},
			{"“@#$%”"},
			{"123"},
			{"Laptop    "},
			{"mobile"},
			{"laptop"},
			{"lap@#"},
			{"t-Shirts"},
			{"Electronics"}
			
	};
	return values;
}
}
