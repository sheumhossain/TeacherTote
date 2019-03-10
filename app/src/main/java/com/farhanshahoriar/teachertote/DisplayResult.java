package com.farhanshahoriar.resultcalculator;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayResult extends AppCompatActivity {

    private TextView keyText;
    private String key = null;
    String cls = "";
    String fileName = null;
    public String inputcsvLine = null;
    private RecyclerView fRecyclerView;
    private ResultViewAdapter resultViewAdapter;

    ArrayList<IndividualResult> resultList ;
    File file1;
    //public IndividualResult[] resultData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        keyText = (TextView) findViewById(R.id.search_key);
        fRecyclerView = (RecyclerView) findViewById(R.id.rv_food_menu);

        Intent searchIntent = getIntent();
        key = "";

        if (searchIntent.hasExtra("Class")) {
            cls = searchIntent.getStringExtra("Class");
            if (cls.equals("1")) {
                fileName = "resultdata.csv";
                keyText.setText("Class One Result:\n");
            }
            //Toast.makeText(this,key, Toast.LENGTH_LONG).show();

        }
    }
}