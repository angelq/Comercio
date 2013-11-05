package com.example.adapter;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dominio.Comercio;
import com.example.comercio.R;


public class ComercioAdapter extends ArrayAdapter<Comercio> {
	
	private Activity activity;
	
	public ComercioAdapter(Activity activity, List<Comercio> objects) {
		super(activity, R.layout.item_tienda, objects);
		
		this.activity = activity;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		// Se reemplaza la implementaci�n por defecto
		//return super.getView(position, convertView, parent);
		
		LayoutInflater inflater = activity.getLayoutInflater();
		View view = inflater.inflate(R.layout.item_tienda, null);
						
		Comercio comercio = getItem(position);
		
		TextView txt = (TextView)view.findViewById(R.id.text_nombre);
		txt.setText(comercio.getNombre());
		
		txt = (TextView)view.findViewById(R.id.text_descripcion);
		txt.setText(comercio.getDescripcion());
		
		
		return view;
	}
}
