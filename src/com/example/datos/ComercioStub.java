package com.example.datos;

import java.util.ArrayList;
import com.example.dominio.Comercio;

public class ComercioStub {

	private static ArrayList<Comercio> items;
	
	public static ArrayList<Comercio> getDatos () {	
		if(items == null) {
			items = new ArrayList<Comercio>();
			
			items.add(new Comercio("Mar�a Dolores", "computadoras"));
			items.add(new Comercio("Jorge Luis", "electronica"));
			items.add(new Comercio("Mariano Dario", "supermercado"));
		}
		
		return items;
	}
}
