package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.myapplication.fragments.PraiaFragment;
import com.example.myapplication.fragments.ScrollingFragment;
import com.example.myapplication.interfaces.Comunicador;
import com.example.myapplication.model.PontoTuristico;

public class MainActivity extends AppCompatActivity implements Comunicador {

    private ScrollingFragment scrollingFragment = new ScrollingFragment();
    public static final String PRAIA_KEY = "praia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(R.id.containerButton, scrollingFragment);

    }


    @Override
    public void comunicacao(PontoTuristico pontoTuristico) {

        Bundle bundle = new Bundle();
        bundle.putParcelable(PRAIA_KEY, pontoTuristico);
        Fragment fragment = new PraiaFragment();
        fragment.setArguments(bundle);

        replaceFragment(R.id.container, fragment);

    }

    public void replaceFragment(int container, Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}
