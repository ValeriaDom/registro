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


public class MainActivity extends Activity implements OnClickListener{
//AppExamen
Button sal;
ImageButton com;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        com=(ImageButton)findViewById(R.id.imageButton1);
        sal=(Button)findViewById(R.id.button2);
        sal.setOnClickListener(this);
        com.setOnClickListener(this);
     
    }
	@Override
	public void onClick(View arg0) {
		int d;
		d=arg0.getId();
		switch(d){
		case R.id.imageButton1:
			 
		
			Intent in = new Intent();
			in.setAction(Intent.ACTION_MAIN);
			in.addCategory(Intent.CATEGORY_LAUNCHER);
			in.setComponent(new ComponentName(MainActivity.this,AppExamen.class));
			Bundle b = new Bundle();
		    //b.putString("nombre", nombr.getText().toString());
		   // b.putString("carrera", lista.toString());
		    in.putExtras(b);
			startActivity(in);

		break;
		case R.id.button2:			
			Intent intent = new Intent(Intent.ACTION_MAIN); finish();
		break;
		}	
		
	}

}
