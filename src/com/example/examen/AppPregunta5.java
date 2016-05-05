package com.example.examen;

import java.util.*;
import android.os.*;
import android.app.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.content.*;

import java.lang.*;

public class AppPregunta5 extends Activity implements OnClickListener{

String nombre,carrera,puntaje,tipo,puntaje1,tipo1,puntaje2,tipo2,puntaje3,tipo3;
TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12;
Button preune, predoe, prethreee, prefoure;
	@Override//r17
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_pregunta5);
		
		preune=(Button)findViewById(R.id.preune);
		preune.setOnClickListener(this);
		predoe=(Button)findViewById(R.id.predoe);
		predoe.setOnClickListener(this);
		prethreee=(Button)findViewById(R.id.prethreee);
		prethreee.setOnClickListener(this);
		prefoure=(Button)findViewById(R.id.prefoure);
		prefoure.setOnClickListener(this);
		
		txt1=(TextView)findViewById(R.id.texT1);
		txt2=(TextView)findViewById(R.id.texT2);
		txt3=(TextView)findViewById(R.id.texT3);
		txt4=(TextView)findViewById(R.id.texT4);
		txt5=(TextView)findViewById(R.id.texT5);
		txt6=(TextView)findViewById(R.id.texT6);
		txt7=(TextView)findViewById(R.id.texT7);
		txt8=(TextView)findViewById(R.id.texT8);
		txt9=(TextView)findViewById(R.id.texT9);
		txt10=(TextView)findViewById(R.id.texT10);
		txt11=(TextView)findViewById(R.id.texT11);
		txt12=(TextView)findViewById(R.id.texT12);
		Bundle bundle = this.getIntent().getExtras();
        txt1.setText( bundle.getString("nombre"));
        //txt2.setText( bundle.getString("carrera"));
        txt3.setText(bundle.getString("puntaje"));
        txt4.setText(bundle.getString("tipo"));
        txt5.setText(bundle.getString("puntaje1"));
        txt6.setText(bundle.getString("tipo1"));
        txt7.setText(bundle.getString("puntaje2"));
        txt8.setText(bundle.getString("tipo2"));
        txt9.setText(bundle.getString("puntaje3"));
        txt10.setText(bundle.getString("tipo3"));
	}
	@Override
	public void onClick(View v) {
		int d;
		d=v.getId();
		switch(d){
		case R.id.predoe:
			
			int contador=0;
			if(predoe.getId() == R.id.predoe){
				contador+=20;
				String a=String.valueOf(contador);
		    	 txt11.setText((a));
		    	 txt12.setText("Respuesta Correcta");
			}else{
				contador=0;
				String a=String.valueOf(contador);
		    	 txt11.setText((a));
				txt12.setText("Respuesta Incorrecta");
			}
			Intent in = new Intent();
			in.setAction(Intent.ACTION_MAIN);
			in.addCategory(Intent.CATEGORY_LAUNCHER);
			in.setComponent(new ComponentName(AppPregunta5.this,Resultados.class));
			Bundle b = new Bundle();
			b.putString("nombre", txt1.getText().toString());
		   // b.putString("carrera", txt2.getText().toString());
		    b.putString("puntaje", txt3.getText().toString());
		    b.putString("tipo", txt4.getText().toString());
		    b.putString("puntaje1",txt5.getText().toString());
		    b.putString("tipo1", txt6.getText().toString());
		    b.putString("puntaje2",txt7.getText().toString());
		    b.putString("tipo2", txt8.getText().toString());
		    b.putString("puntaje3",txt9.getText().toString());
		    b.putString("tipo3", txt10.getText().toString());
		    b.putString("puntaje4",txt11.getText().toString());
		    b.putString("tipo4", txt12.getText().toString());
		    
		    in.putExtras(b);
			startActivity(in);
		break;
		case R.id.preune:
			Intent inte = new Intent();
			inte.setAction(Intent.ACTION_MAIN);
			inte.addCategory(Intent.CATEGORY_LAUNCHER);
			inte.setComponent(new ComponentName(AppPregunta5.this,Resultados.class));
			Bundle bu = new Bundle();
			bu.putString("nombre", txt1.getText().toString());
		   // bu.putString("carrera", txt2.getText().toString());
		    bu.putString("puntaje", txt3.getText().toString());
		    bu.putString("tipo", txt4.getText().toString());
		    bu.putString("puntaje1",txt5.getText().toString());
		    bu.putString("tipo1", txt6.getText().toString());
		    bu.putString("puntaje2",txt7.getText().toString());
		    bu.putString("tipo2", txt8.getText().toString());
		    bu.putString("puntaje3",txt9.getText().toString());
		    bu.putString("tipo3", txt10.getText().toString());
		    bu.putString("puntaje4",txt11.getText().toString());
		    bu.putString("tipo4", txt12.getText().toString());
		    
		    inte.putExtras(bu);
			startActivity(inte);
			break;
		case R.id.prethreee:
			Intent inten = new Intent();
			inten.setAction(Intent.ACTION_MAIN);
			inten.addCategory(Intent.CATEGORY_LAUNCHER);
			inten.setComponent(new ComponentName(AppPregunta5.this,Resultados.class));
			Bundle bun = new Bundle();
			bun.putString("nombre", txt1.getText().toString());
		    //bun.putString("carrera", txt2.getText().toString());
		    bun.putString("puntaje", txt3.getText().toString());
		    bun.putString("tipo", txt4.getText().toString());
		    bun.putString("puntaje1",txt5.getText().toString());
		    bun.putString("tipo1", txt6.getText().toString());
		    bun.putString("puntaje2",txt7.getText().toString());
		    bun.putString("tipo2", txt8.getText().toString());
		    bun.putString("puntaje3",txt9.getText().toString());
		    bun.putString("tipo3", txt10.getText().toString());
		    bun.putString("puntaje4",txt11.getText().toString());
		    bun.putString("tipo4", txt12.getText().toString());
		    
		    inten.putExtras(bun);
			startActivity(inten);
			break;
		case R.id.prefoure:
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_LAUNCHER);
			intent.setComponent(new ComponentName(AppPregunta5.this,Resultados.class));
			Bundle bund = new Bundle();
			bund.putString("nombre", txt1.getText().toString());
		   // bund.putString("carrera", txt2.getText().toString());
		    bund.putString("puntaje", txt3.getText().toString());
		    bund.putString("tipo", txt4.getText().toString());
		    bund.putString("puntaje1",txt5.getText().toString());
		    bund.putString("tipo1", txt6.getText().toString());
		    bund.putString("puntaje2",txt7.getText().toString());
		    bund.putString("tipo2", txt8.getText().toString());
		    bund.putString("puntaje3",txt9.getText().toString());
		    bund.putString("tipo3", txt10.getText().toString());
		    bund.putString("puntaje4",txt11.getText().toString());
		    bund.putString("tipo4", txt12.getText().toString());
		    
		    intent.putExtras(bund);
			startActivity(intent);
			break;
		}
		
	}

}
