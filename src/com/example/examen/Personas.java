package com.example.examen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Personas {

	Context contextoEjecucion;
	BaseDatos creador;
	SQLiteDatabase mDatos;
	

public Personas (Context c){
	contextoEjecucion = c;
}
public Personas abrirSqlite(){
	creador = new BaseDatos (contextoEjecucion);
	mDatos = creador.getWritableDatabase();
	return this;
}
public long insertar(String nombre, String contrasena, String correo, String empresa){
	ContentValues c = new ContentValues();
	c.put ("nombre", nombre);
	c.put ("contrasena", contrasena);
	c.put("correo", correo);
	c.put("empresa", empresa);
	return mDatos.insert("persona", null, c);
}
public String ver(){
	String datos="";
	creador = new BaseDatos (contextoEjecucion);
	mDatos = creador.getReadableDatabase();
	String sql = ("Select * from persona");
	Cursor cur = mDatos.rawQuery(sql, null);
	int i=0;
	cur.moveToFirst();
	do{
		datos+= cur.getString(0) + "\t" + cur.getString(1) + "\t " + cur.getString(2) + "\t"+ cur.getString(3) + "\n";
	}while (cur.moveToNext());
	return datos;
		
	}
public void cerrarSqlite(){
	
	creador.close();
	
}
}
