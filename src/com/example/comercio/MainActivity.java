package com.example.comercio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn = (Button) findViewById(R.id.btn_menu);
		btn.setOnClickListener(this);
		
		Button btn2 = (Button) findViewById(R.id.btn_lista);
		btn2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent;
		
		switch (v.getId()) {
		case R.id.btn_inicio:
			
			break;
		
		case R.id.btn_lista:
			intent = new Intent(this, ListaComercios.class );
			this.startActivity(intent);
			break;
		default:
			break;
		}
		
	}

}
