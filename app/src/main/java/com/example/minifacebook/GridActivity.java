package com.example.minifacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    GridView simpleGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        simpleGrid = findViewById(R.id.simpleGridView);

        ArrayList<String> logos = new ArrayList<String>();

        try {


            JSONObject jsonObj = new JSONObject(getIntent().getStringExtra("data"));

            JSONArray jarray = jsonObj.getJSONArray("data");
            for(int i = 0; i < jarray.length(); i++) {
            JSONObject oneAlbum = jarray.getJSONObject(i);
            Log.d("Album",oneAlbum.toString());
            Log.d("name", oneAlbum.getString("name"));
            logos.add(oneAlbum.getString("name"));
            }

            MyAdapter customAdapter = new MyAdapter(getApplicationContext(), logos);
            simpleGrid.setAdapter(customAdapter);



        } catch (JSONException e) {
            e.printStackTrace();
        }




//        for(int i = 0; i < data.length(); i++) {
//
//            JSONObject oneAlbum = data.getJSONObject(i);
//            Log.d("Album",oneAlbum.toString());
//        }




    }
}
