package com.example.myapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PontoTuristico implements Parcelable {

    private int imagem;

    public PontoTuristico(int imagem) {
        this.imagem = imagem;
    }

    protected PontoTuristico(Parcel in) {
        imagem = in.readInt();
    }

    public static final Creator<PontoTuristico> CREATOR = new Creator<PontoTuristico>() {
        @Override
        public PontoTuristico createFromParcel(Parcel in) {
            return new PontoTuristico(in);
        }

        @Override
        public PontoTuristico[] newArray(int size) {
            return new PontoTuristico[size];
        }
    };

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagem);
    }
}
