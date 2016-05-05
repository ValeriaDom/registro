package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.AdapterView.*;
import java.lang.*;

public class Resultados extends Activity {
	TextView nom,carr;
	TextView Aciertos,Errores;
	TextView res1,res2,res3,res4,res5;
	TextView punta1,punta2,punta3,punta4,punta5;
	int Res=0;
	String nombre,carrera,puntaje,tipo,puntaje1,tipo1,puntaje2,tipo2,puntaje3,tipo3,puntaje4,tipo4;
	//Bundle b;
	@Override
	 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resul);
        nom=(TextView)findViewById(R.id.textView1);
        carr=(TextView)findViewById(R.id.textView2);
        punta1=(TextView)findViewById(R.id.sttt1);
        punta2=(TextView)findViewById(R.id.sttt2);
        punta3=(TextView)findViewById(R.id.sttt3);
        punta4=(TextView)findViewById(R.id.sttt4);
        punta5=(TextView)findViewById(R.id.sttt5);
        res1=(TextView)findViewById(R.id.textView3);
        res2=(TextView)findViewById(R.id.textView4);
        res3=(TextView)findViewById(R.id.textView5);
        res4=(TextView)findViewById(R.id.textView6);
        res5=(TextView)findViewById(R.id.textView7);
        Aciertos=(TextView)findViewById(R.id.textView8);
        Errores=(TextView)findViewById(R.id.textView9);

        try
		{
        	
		Bundle bundle = this.getIntent().getExtras();
        nom.setText("nombre " + bundle.getString("nombre"));
        carr.setText("carrera " + bundle.getString("carrera"));
        punta1.setText(bundle.getString("puntaje"));
        res1.setText("1 "+bundle.getString("tipo"));
        punta2.setText(bundle.getString("puntaje1"));
        res2.setText("2 "+bundle.getString("tipo1"));
        punta3.setText(bundle.getString("puntaje2"));
        res3.setText("3 "+bundle.getString("tipo2"));
        punta4.setText(bundle.getString("puntaje3"));
        res4.setText("4 "+bundle.getString("tipo3"));
        punta5.setText(bundle.getString("puntaje4"));
        res5.setText("5 "+bundle.getString("tipo4"));
        int num1=0,num2=0,num3=0,num4=0,num5=0;
        num1=Integer.parseInt(punta1.getText().toString());
        num2=Integer.parseInt(punta2.getText().toString());
        num3=Integer.parseInt(punta3.getText().toString());
        num4=Integer.parseInt(punta4.getText().toString());
        num5=Integer.parseInt(punta5.getText().toString());
        Res=num1+num2+num3+num4+num5;
        if(Res==100){
        	Aciertos.setText("Aciertos: "+Res+"%" );
        	Errores.setText("  Errores: 0");
        	Toast.makeText(this, "Conocimiento General",Toast.LENGTH_LONG).show();
        }else if((Res<100)&&(Res==80)&&(Res>60)){
        	Aciertos.setText("Aciertos: "+Res+"%" );
        	Errores.setText("  Errores: 1");
        	Toast.makeText(this, "Estudia más",Toast.LENGTH_LONG).show();
        }else if(Res==60){
        	Aciertos.setText("Aciertos: "+Res +"%");
        	Errores.setText("  Errores: 2");
        	Toast.makeText(this, "Debes Investigar",Toast.LENGTH_LONG).show();
        }else if(Res==40){
        	Aciertos.setText("Aciertos: "+Res +"%");
        	Errores.setText("  Errores: 3");
        	Toast.makeText(this, "Mal Conocimiento ",Toast.LENGTH_LONG).show();
        }else if(Res==20){
        	Aciertos.setText("Aciertos: "+Res +"%");
        	Errores.setText("  Errores: 4");
        	Toast.makeText(this, "Tienes muchos errores",Toast.LENGTH_LONG).show();
        }else if(Res==0){
        	Aciertos.setText("Aciertos: 0 " );
        	Errores.setText("  Errores: 5");
        	Toast.makeText(this, "Deberías leer",Toast.LENGTH_LONG).show();
        }
		}catch(Exception e){
			nom.setText("Incorrecto");
			carr.setText("incorrecto");
		}
        

	}
	
}
