
package com.example.comercio;
import java.util.ArrayList;

import com.example.adapter.ComercioAdapter;
import com.example.datos.ComercioStub;
import com.example.dominio.Comercio;
import android.os.Bundle;
import android.app.ListActivity;

public class ListaComercios extends ListActivity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ArrayList<Comercio> items = ComercioStub.getDatos();
		
		ComercioAdapter adapter = new ComercioAdapter(this, items);
		
		getListView().setAdapter(adapter);
		
	}
}
