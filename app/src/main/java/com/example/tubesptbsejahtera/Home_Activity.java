package com.example.tubesptbsejahtera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RCModel> modelArrayList;
    RCAdapter rcAdapter;

    String[] title = new String[]{
            "Juara 3 UIUX Pekan Andalas ",
            "Peserta Lomba Hackathon Universitas Indonesia",
            "Peserta Lomba Gimnastik 2022",
            "Juara 1 Lomba Poster Sumarak Teknik Unand",
            "Juara 3 UIUX Pekan Andalas ",
            "Peserta Lomba Hackathon Universitas Indonesia",
            "Peserta Lomba Gimnastik 2022",
            "Juara 1 Lomba Poster Sumarak Teknik Unand"
    };

    int[] image = new int[]{
            R.drawable.sertif1, R.drawable.sertif2,
            R.drawable.sertif3, R.drawable.sertif4,
            R.drawable.sertif5, R.drawable.sertif1,
            R.drawable.sertif2, R.drawable.sertif3,
            R.drawable.sertif4, R.drawable.sertif5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        modelArrayList = new ArrayList<>();
        rcAdapter = new RCAdapter(this, modelArrayList);
        recyclerView.setAdapter(rcAdapter);

        for (int i = 0; i< title.length; i++){
            RCModel rcModel = new RCModel(title[i], image[i]);
            modelArrayList.add(rcModel);
        }

        rcAdapter.notifyDataSetChanged();

        ImageView tambahPostButton = findViewById(R.id.tambahpost);

        tambahPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, PostPrestasi_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}