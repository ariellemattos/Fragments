package br.com.senaijandira.fragments.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.senaijandira.fragments.R;

public class Fragment1 extends Fragment{

//    No fragment vc pode usar o comando
//    getContext() para obter o contexto
//    Ex: Toast.makeText(getContext()."oii", Toast.LENGTH_SHORT).show();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_layout1, container, false);


        return v;
    }
}
