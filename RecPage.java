/*
Can use a regular scanner? Use that to ask the user what show the user wants.
 */
package com.example.exampleui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecPage extends AppCompatActivity {

    Map<String, String> showData;
    Set<String> keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_page);
    }
    public RecPage(){
        showData = new HashMap<String, String>();
        keys = new HashSet<String>();
        showData.put("Cobra Kai", "The rating is 92.");
        showData.put("RiverDale", "The rating is 51."); //Create a new array/map with mid shows. THis is midshow.
        showData.put("Stranger Things", "The rating is 91.");
        showData.put("The Witcher", "The rating is 76.");
        showData.put("The Legacies", "The rating is 78.");
        showData.put("The Legacies", "The rating is 82.");
        showData.put("3%", "The rating is 82.");
        showData.put("You", "The rating is 91.");
        showData.put("Elite", "The rating is 73.");
        showData.put("Alone", "The rating is 86.");
        showData.put("The Sinner", "The rating is 73.");
        showData.put("Lost in Space", "The rating is 78.");
        showData.put("Maid", "The rating is 87.");
        showData.put("On my block", "The rating is 78.");
        showData.put("Emily in Paris", "The rating is 47."); //Again a below average show
        showData.put("Money Heist", "The rating is 78.");
        showData.put("Attack on Titan", "The rating is 95."); //Maybe a rating system with four categories: Bad,
        //Decent, Good, Exceptional
        showData.put("Peaky Blinders", "The rating is 94.");
        showData.put("The Blacklist", "The rating is 80.");
        showData.put("The Silent Sea", "The rating is 70.");
        showData.put("Dark", "The rating is 95.");
        showData.put("The Last Kingdom", "The rating is 96.");
        showData.put("One Piece", "The rating is 87.");
        showData.put("All American", "The rating is 63.");
        showData.put("Unbelievable", "The rating is 89.");
        showData.put("Outer Banks", "The rating is 79.");
        showData.put("Demon Slayer", "The rating is 64.");
        showData.put("Good Girls", "The rating is 74.");
        showData.put("Selling Sunset", "The rating is 78.");
        showData.put("The Stranger", "The rating is 73.");
        showData.put("Manifest", "The rating is 72.");
        showData.put("Midnight Mass", "The rating is 77.");
        showData.put("Arcane", "The rating is 97.");
        showData.put("Queen of the South", "The rating is 89.");
        showData.put("The Umbrella Academy", "The rating is 87.");
        showData.put("13 Reasons Why", "The rating is 57.");
        showData.put("Queer Eye", "The rating is 83.");
        showData.put("The 100", "The rating is 66.");
        showData.put("Ginny and Georgia", "The rating is 68.");
        showData.put("Outlander", "The rating is 90.");
        showData.put("Daredevil", "The rating is 88.");
        showData.put("The Flash", "The rating is 65.");
        showData.put("Cowboy Bebop", "The rating is 59.");
        showData.put("Castlevania", "The rating is 89.");
        showData.put("Mindhunter", "The rating is 95.");
        showData.put("Locke and Key", "The rating is 66.");
    }

    public void rateShow(View v) {
        TextView t = findViewById(R.id.editText);
        String input = t.getText().toString();

        //Now use the input variable and then connect it to the map data structure to produce the toaster notification of the rating
        //of the show.

        keys = showData.keySet();
        String x = "";
        for (int i = 0; i < keys.size(); i++) {
            if (keys.contains(input)) {
                x = showData.get(input);
            }
        }

        Toast.makeText(this, x, Toast.LENGTH_LONG).show();
    }
}