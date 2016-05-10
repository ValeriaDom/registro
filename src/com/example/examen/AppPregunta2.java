package com.example.examen;

import android.os.Bundle;
import android.app.*;
import android.content.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

import java.util.*;

public class AppPregunta2 extends Activity implements OnClickListener {
	public RadioButton preg2;
	Button prea, preb, prec, pred;
	String nombre,carrera,puntaje,tipo;
	TextView txt1,txt2,txt3,txt4,txt5,txt6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_pregunta2);
		prea = (Button) findViewById(R.id.prea);
		prea.setOnClickListener(this);
		
		txt1=(TextView)findViewById(R.id.txtT1);
		txt2=(TextView)findViewById(R.id.txtT2);
		txt3=(TextView)findViewById(R.id.txtT3);
		txt4=(TextView)findViewById(R.id.txtT4);
		txt5=(TextView)findViewById(R.id.txtT5);
		txt6=(TextView)findViewById(R.id.txtT6);
		Bundle bundle = this.getIntent().getExtras();
        txt1.setText( bundle.getString("nombre"));
       // txt2.setText( bundle.getString("carrera"));
        txt3.setText(bundle.getString("puntaje"));
        txt4.setText(bundle.getString("tipo"));
	}


	@Override
	public void onClick(View v) {
		
		int d;
		d=v.getId();
		switch(d){
		
		case R.id.prea:
			Intent inte = new Intent();
			inte.setAction(Intent.ACTION_MAIN);
			inte.addCategory(Intent.CATEGORY_LAUNCHER);
			inte.setComponent(new ComponentName(AppPregunta2.this,AppPregunta3.class));
			Bundle bu = new Bundle();
			bu.putString("nombre", txt1.getText().toString());
		   // bu.putString("carrera", txt2.getText().toString());
		    bu.putString("puntaje", txt3.getText().toString());
		    bu.putString("tipo", txt4.getText().toString());
		    bu.putString("puntaje1",txt5.getText().toString());
		    bu.putString("tipo1", txt6.getText().toString());
		    inte.putExtras(bu);
			startActivity(inte);
			
			break;
			
		
		}
		
	}

}

