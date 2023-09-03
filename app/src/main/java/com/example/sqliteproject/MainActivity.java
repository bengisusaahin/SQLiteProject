package com.example.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians", MODE_PRIVATE,
                    null);
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (name VARCHAR, age INT)");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}