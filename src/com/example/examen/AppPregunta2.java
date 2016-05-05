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
		preb = (Button) findViewById(R.id.preb);
		preb.setOnClickListener(this);
		prec = (Button) findViewById(R.id.prec);
		prec.setOnClickListener(this);
		pred = (Button) findViewById(R.id.prec);
		pred.setOnClickListener(this);
		
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
		case R.id.preb:
			
			int contador=0;
			if(preb.getId() == R.id.preb){
				contador+=20;
				String a=String.valueOf(contador);
		    	 txt5.setText((a));
		    	 txt6.setText("Respuesta Correcta");
			}else{
				contador=0;
				String a=String.valueOf(contador);
		    	 txt5.setText((a));
				txt6.setText("Respuesta Incorrecta");
			}
			Intent in = new Intent();
			in.setAction(Intent.ACTION_MAIN);
			in.addCategory(Intent.CATEGORY_LAUNCHER);
			in.setComponent(new ComponentName(AppPregunta2.this,AppPregunta3.class));
			Bundle b = new Bundle();
			b.putString("nombre", txt1.getText().toString());
		    b.putString("carrera", txt2.getText().toString());
		    b.putString("puntaje", txt3.getText().toString());
		    b.putString("tipo", txt4.getText().toString());
		    b.putString("puntaje1",txt5.getText().toString());
		    b.putString("tipo1", txt6.getText().toString());
		    in.putExtras(b);
			startActivity(in);
		break;
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
			
		case R.id.prec:
		
			Intent inten = new Intent();
			inten.setAction(Intent.ACTION_MAIN);
			inten.addCategory(Intent.CATEGORY_LAUNCHER);
			inten.setComponent(new ComponentName(AppPregunta2.this,AppPregunta3.class));
			Bundle bun = new Bundle();
			bun.putString("nombre", txt1.getText().toString());
		   // bun.putString("carrera", txt2.getText().toString());
		    bun.putString("puntaje", txt3.getText().toString());
		    bun.putString("tipo", txt4.getText().toString());
		    bun.putString("puntaje1",txt5.getText().toString());
		    bun.putString("tipo1", txt6.getText().toString());
		    inten.putExtras(bun);
			startActivity(inten);
			
			break;
		case R.id.pred:
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_LAUNCHER);
			intent.setComponent(new ComponentName(AppPregunta2.this,AppPregunta3.class));
			Bundle bund = new Bundle();
			bund.putString("nombre", txt1.getText().toString());
		   //bund.putString("carrera", txt2.getText().toString());
		    bund.putString("puntaje", txt3.getText().toString());
		    bund.putString("tipo", txt4.getText().toString());
		    bund.putString("puntaje1",txt5.getText().toString());
		    bund.putString("tipo1", txt6.getText().toString());
		    intent.putExtras(bund);
			startActivity(intent);
			
			
			break;
		}
		
	}

}

