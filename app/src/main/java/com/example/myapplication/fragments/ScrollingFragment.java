package com.example.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.interfaces.Comunicador;
import com.example.myapplication.model.PontoTuristico;

public class ScrollingFragment extends Fragment {

    private Button buttonPernambuco, buttonNatal, buttonAngra;
    private Comunicador comunicador;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scrolling, container, false);

        buttonPernambuco = view.findViewById(R.id.buttonPernambuco);
        buttonNatal = view.findViewById(R.id.buttonNatal);
        buttonAngra = view.findViewById(R.id.buttonAngra);

        buttonPernambuco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PontoTuristico pontoTuristico = new PontoTuristico(R.drawable.praia_pernambuco);
                comunicador.comunicacao(pontoTuristico);

            }
        });

        buttonNatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PontoTuristico pontoTuristico = new PontoTuristico(R.drawable.praia_natal);
                comunicador.comunicacao(pontoTuristico);

            }
        });

        buttonAngra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PontoTuristico pontoTuristico = new PontoTuristico(R.drawable.praia_angra);
                comunicador.comunicacao(pontoTuristico);

            }
        });
        return view;
    }
}