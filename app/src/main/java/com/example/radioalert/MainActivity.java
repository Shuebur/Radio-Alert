package com.example.radioalert;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button;
String selectedGender="male";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.but);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOptionDialog();


            }
        });


    }

    private void showOptionDialog() {
String[] genders = {"Male", "Female","Others" };
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this,R.style.CustomDialog);
       builder.setTitle("Gender");


       builder.setSingleChoiceItems(genders, 0, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
selectedGender=genders[which];
               Toast.makeText(MainActivity.this,"You just Clicked;"+selectedGender,Toast.LENGTH_SHORT);
           }
       });
       builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
           }
       });
       builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
           }
       });
     //   builder.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
builder.show();


    }
}

