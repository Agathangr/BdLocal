package com.example.bdlocal.database


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DatabaseHelper (context: Context) : SQLiteOpenHelper(
   context,"loja.db", null, 1
) {



    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "CREATE TABLE IF NOT EXISTS produtos(" +
                "id_produto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "título VARCHAR (60)," +
                "descricao TEXT" +
                ");"

        try {
            db?.execSQL(sql)
            Log.i("info_db", "Sucesso ao criar a Tabela")
        }catch (e: Exception){
            Log.i("info_db", "Erro ao criar a Tabela")

        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        Log.i("info_db", "Executou onUpgrade")
    }
}