package com.dicoding.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    int randNum;
    final int min = 1;
    final int max = 20;

    public void makeToast (String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void onClick (View view) {

        EditText numInput = (EditText) findViewById(R.id.noInput);


        if (numInput.getText().toString().isEmpty()) {
            makeToast("Must be filled a number !!");

        }else {
            int converted = Integer.parseInt(numInput.getText().toString());
            if (converted > 20) {
                makeToast("Your input is : " +converted+" cannot be higher than 20");
            } else {
                System.out.println("Random : " + randNum);
                if (randNum == converted) {
                    makeToast("Thats right , same number");
                } else if (randNum != converted) {
                    if (converted < randNum)
                    {
                        makeToast("To higher number");
                    } else {
                        makeToast("To lower number");
                    }
                }
                Random ranNum = new Random();
                randNum= ranNum.nextInt(max) + min;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ranNum = new Random();
        randNum= ranNum.nextInt(max) + min;
    }
}