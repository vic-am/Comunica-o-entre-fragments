package com.example.myapplication.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.model.PontoTuristico;

import static com.example.myapplication.MainActivity.PRAIA_KEY;

/**
 * A simple {@link Fragment} subclass.
 */
public class PraiaFragment extends Fragment {

    private ImageView imagem;

    public PraiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_praia, container, false);

        imagem = view.findViewById(R.id.containerImagem);

        if (!getArguments().isEmpty()){
            PontoTuristico pontoTuristico = getArguments().getParcelable(PRAIA_KEY);
            if (pontoTuristico != null){
                Drawable drawable = getResources().getDrawable(pontoTuristico.getImagem());
                imagem.setImageDrawable(drawable);
            }
        }

        return view;
    }
}
