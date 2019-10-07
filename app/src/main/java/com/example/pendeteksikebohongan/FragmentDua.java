package com.example.pendeteksikebohongan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentDua extends Fragment {

    View tampilan;
    Button buttoniklan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tampilan = inflater.inflate(R.layout.activity_fragment_dua,container,false);
        buttoniklan = tampilan.findViewById(R.id.button2);

        buttoniklan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kemdikbud.go.id/"));
                startActivity(intent);
            }
        });

        return tampilan;
    }
}
