package com.example.examen;

import java.util.*;
import android.os.*;
import android.app.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.content.*;

public class AppPregunta3 extends Activity implements OnClickListener {

String nombre,carrera,puntaje,tipo,puntaje1,tipo1;
TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
 Button preuno, predos, pretres, precuatro;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_pregunta3);
		
		preuno=(Button)findViewById(R.id.preuno);
		preuno.setOnClickListener(this);
		predos=(Button)findViewById(R.id.predos);
		predos.setOnClickListener(this);
		pretres=(Button)findViewById(R.id.pretres);
		pretres.setOnClickListener(this);
		precuatro=(Button)findViewById(R.id.precuatro);
		precuatro.setOnClickListener(this);
		
		txt1=(TextView)findViewById(R.id.tT1);
		txt2=(TextView)findViewById(R.id.tT2);
		txt3=(TextView)findViewById(R.id.tT3);
		txt4=(TextView)findViewById(R.id.tT4);
		txt5=(TextView)findViewById(R.id.tT5);
		txt6=(TextView)findViewById(R.id.tT6);
		txt7=(TextView)findViewById(R.id.tT7);
		txt8=(TextView)findViewById(R.id.tT8);
		Bundle bundle = this.getIntent().getExtras();
        txt1.setText( bundle.getString("nombre"));
       // txt2.setText( bundle.getString("carrera"));
        txt3.setText(bundle.getString("puntaje"));
        txt4.setText(bundle.getString("tipo"));
        txt5.setText(bundle.getString("puntaje1"));
        txt6.setText(bundle.getString("tipo1"));
	}

	@Override
	public void onClick(View v) {
		int d;
		d=v.getId();
		switch(d){
		case R.id.precuatro:
			
			int contador=0;
			if(precuatro.getId() == R.id.precuatro){
				contador+=20;
				String a=String.valueOf(contador);
		    	 txt7.setText((a));
		    	 txt8.setText("Respuesta Correcta");
			}else{
				contador=0;
				String a=String.valueOf(contador);
		    	 txt7.setText((a));
				txt8.setText("Respuesta Incorrecta");
			}
			Intent in = new Intent();
			in.setAction(Intent.ACTION_MAIN);
			in.addCategory(Intent.CATEGORY_LAUNCHER);
			in.setComponent(new ComponentName(AppPregunta3.this,AppPregunta4.class));
			Bundle b = new Bundle();
			b.putString("nombre", txt1.getText().toString());
		  //  b.putString("carrera", txt2.getText().toString());
		    b.putString("puntaje", txt3.getText().toString());
		    b.putString("tipo", txt4.getText().toString());
		    b.putString("puntaje1",txt5.getText().toString());
		    b.putString("tipo1", txt6.getText().toString());
		    b.putString("puntaje2",txt7.getText().toString());
		    b.putString("tipo2", txt8.getText().toString());
		    in.putExtras(b);
			startActivity(in);
			
		break;
		case R.id.preuno:
			Intent inte = new Intent();
			inte.setAction(Intent.ACTION_MAIN);
			inte.addCategory(Intent.CATEGORY_LAUNCHER);
			inte.setComponent(new ComponentName(AppPregunta3.this,AppPregunta4.class));
			Bundle bu = new Bundle();
			bu.putString("nombre", txt1.getText().toString());
		   // bu.putString("carrera", txt2.getText().toString());
		    bu.putString("puntaje", txt3.getText().toString());
		    bu.putString("tipo", txt4.getText().toString());
		    bu.putString("puntaje1",txt5.getText().toString());
		    bu.putString("tipo1", txt6.getText().toString());
		    bu.putString("puntaje2",txt7.getText().toString());
		    bu.putString("tipo2", txt8.getText().toString());
		    inte.putExtras(bu);
			startActivity(inte);
			break;
			
		case R.id.predos:
			Intent inten = new Intent();
			inten.setAction(Intent.ACTION_MAIN);
			inten.addCategory(Intent.CATEGORY_LAUNCHER);
			inten.setComponent(new ComponentName(AppPregunta3.this,AppPregunta4.class));
			Bundle bun = new Bundle();
			bun.putString("nombre", txt1.getText().toString());
		   // bun.putString("carrera", txt2.getText().toString());
		    bun.putString("puntaje", txt3.getText().toString());
		    bun.putString("tipo", txt4.getText().toString());
		    bun.putString("puntaje1",txt5.getText().toString());
		    bun.putString("tipo1", txt6.getText().toString());
		    bun.putString("puntaje2",txt7.getText().toString());
		    bun.putString("tipo2", txt8.getText().toString());
		    inten.putExtras(bun);
			startActivity(inten);
			break;
		case R.id.pretres:
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_LAUNCHER);
			intent.setComponent(new ComponentName(AppPregunta3.this,AppPregunta4.class));
			Bundle bund = new Bundle();
			bund.putString("nombre", txt1.getText().toString());
		   // bund.putString("carrera", txt2.getText().toString());
		    bund.putString("puntaje", txt3.getText().toString());
		    bund.putString("tipo", txt4.getText().toString());
		    bund.putString("puntaje1",txt5.getText().toString());
		    bund.putString("tipo1", txt6.getText().toString());
		    bund.putString("puntaje2",txt7.getText().toString());
		    bund.putString("tipo2", txt8.getText().toString());
		    intent.putExtras(bund);
			startActivity(intent);
			break;
		}
		
	}


}
