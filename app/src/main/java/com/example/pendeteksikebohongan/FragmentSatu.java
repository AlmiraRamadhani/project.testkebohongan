package com.example.pendeteksikebohongan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View tampilan;
    EditText editText;
    TextView textView;
    Button buttonsubmit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tampilan = inflater.inflate(R.layout.activity_fragment_satu,container,false);
        editText = tampilan.findViewById(R.id.edittext1);
        textView = tampilan.findViewById(R.id.tv1);
        buttonsubmit = tampilan.findViewById(R.id.button1);

        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tampungan = editText.getText().toString();

                String[] arrayTampungan = tampungan.split(" ");
                String hasil = "";
                for (int m = arrayTampungan.length-1; m>0 ; m--){
                    if (arrayTampungan[m].equals("bohong")) {
                        if (arrayTampungan[m - 1].equals("bohong")) {
                            arrayTampungan[m - 1] = "jujur";
                        } else if(arrayTampungan[m - 1].equals("jujur")){
                            arrayTampungan[m - 1] = "bohong";
                        }
                    }
                }
                hasil = arrayTampungan[0];
                textView.setText(hasil);
            }
        });

        return tampilan;
    }
}
