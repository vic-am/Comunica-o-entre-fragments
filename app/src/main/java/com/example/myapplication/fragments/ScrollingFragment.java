package com.example.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.interfaces.Comunicador;
import com.example.myapplication.model.PontoTuristico;

public class ScrollingFragment extends Fragment implements View.OnClickListener {

    private Button buttonPernambuco, buttonNatal, buttonAngra, buttonAmazonas, buttonNoruega,
            buttonSaoPaulo;
    private Comunicador comunicador;
    private PontoTuristico pontoTuristico = new PontoTuristico(R.drawable.fundo_branco);

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

        initViews(view);

        startClicks(view);

        return view;
    }

    public void initViews(View view) {
        buttonPernambuco = view.findViewById(R.id.buttonPernambuco);
        buttonNatal = view.findViewById(R.id.buttonNatal);
        buttonAngra = view.findViewById(R.id.buttonAngra);
        buttonAmazonas = view.findViewById(R.id.buttonAmazonia);
        buttonNoruega = view.findViewById(R.id.buttonNoruega);
        buttonSaoPaulo = view.findViewById(R.id.buttonSaoPaulo);
    }

    public void startClicks(View view) {
        buttonPernambuco.setOnClickListener(this);
        buttonNatal.setOnClickListener(this);
        buttonAngra.setOnClickListener(this);
        buttonAmazonas.setOnClickListener(this);
        buttonNoruega.setOnClickListener(this);
        buttonSaoPaulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonPernambuco:
                pontoTuristico.setImagem(R.drawable.praia_pernambuco);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou a praia de Pernambuco",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonNatal:
                pontoTuristico.setImagem(R.drawable.praia_natal);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou a praia de Natal",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonAngra:
                pontoTuristico.setImagem(R.drawable.praia_angra);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou a praia de Angra dos Reis",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonAmazonia:
                pontoTuristico.setImagem(R.drawable.rio_manaus);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou os rios do Amazonas",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonNoruega:
                pontoTuristico.setImagem(R.drawable.foto_noruega);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou as montanhas norueguesas",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonSaoPaulo:
                pontoTuristico.setImagem(R.drawable.foto_sp);
                comunicador.comunicacao(pontoTuristico);
                Toast.makeText(getContext(), "Você selecionou o parque Ibirapuera",
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}