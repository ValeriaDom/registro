package com.example.examen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

	public BaseDatos(Context context) {
		super(context, "appcat.db", null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql="Create table persona(nombre Text, contrasena Text, correo Text, empresa Text);";
		db.execSQL(sql);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		
		
	}

}
