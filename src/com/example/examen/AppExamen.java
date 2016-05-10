package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.RadialGradient;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class AppExamen extends Activity implements OnClickListener {
	Button pre1, pre2, pre3, pre4;
	String nombre,carrera;
	TextView txt1,txt2,txt3,txt4;
	EditText eNombre, eContrasena, eCorreo, eEmpresa;
    TextView tVer;
    Button insertar, ver;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_examen);
		
		
		insertar = (Button)findViewById(R.id.insertar);
        ver = (Button)findViewById(R.id.ver);
        eNombre = (EditText)findViewById(R.id.nombre);
        eContrasena = (EditText)findViewById(R.id.apellido);
        eCorreo = (EditText)findViewById(R.id.correo);
        eEmpresa = (EditText)findViewById(R.id.empresa);
        tVer = (TextView)findViewById(R.id.tver);
		//pre1 = (Button) findViewById(R.id.ver);
		//pre1.setOnClickListener(this);
		//pre2 = (Button) findViewById(R.id.pre2);
		//pre2.setOnClickListener(this);
		//pre3 = (Button) findViewById(R.id.pre3);
		//pre3.setOnClickListener(this);
		//txt1=(TextView)findViewById(R.id.txt1);
		//txt2=(TextView)findViewById(R.id.txt2);
		//txt3=(TextView)findViewById(R.id.txt3);
		//txt4=(TextView)findViewById(R.id.txt4);
		Bundle bundle = this.getIntent().getExtras();
       // txt1.setText( bundle.getString("nombre"));
        //txt2.setText( bundle.getString("carrera"));
	}

	
	 public void Insertar(View v){
	 	   String nombre = eNombre.getText().toString();
	 	   String contrasena = eContrasena.getText().toString();
	 	   String correo = eCorreo.getText().toString(); 
	 	    String empresa = eEmpresa.getText().toString(); 
	 	   Personas p = new Personas(AppExamen.this);
	 	   p.abrirSqlite();
	 	   p.insertar(nombre, contrasena, correo, empresa);
	 	   p.cerrarSqlite();
	    }
	    public void Ver(View v){
	    	Personas p = new Personas(AppExamen.this);
	    	p.abrirSqlite();
	    	String datos = p.ver();
	    	p.cerrarSqlite();
	    	tVer.setText(datos);
	    }


	@Override
	public void onClick(View v) {
		int d;
		d=v.getId();
		switch(d){
		
		case R.id.ver:
			Intent inte = new Intent();
			inte.setAction(Intent.ACTION_MAIN);
			inte.addCategory(Intent.CATEGORY_LAUNCHER);
			inte.setComponent(new ComponentName(AppExamen.this,AppPregunta2.class));
			Bundle bu = new Bundle();
		   // bu.putString("nombre", txt1.getText().toString());
		   // bu.putString("carrera", txt2.getText().toString());
		   // bu.putString("puntaje", txt3.getText().toString());
		   // bu.putString("tipo", txt4.getText().toString());
		    inte.putExtras(bu);
			startActivity(inte);
			break;
			
		
		}
	}	
}


