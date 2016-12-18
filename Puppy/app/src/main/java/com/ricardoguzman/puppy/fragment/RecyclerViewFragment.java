package com.ricardoguzman.puppy.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ricardoguzman.puppy.Mascota;
import com.ricardoguzman.puppy.R;
import com.ricardoguzman.puppy.adapter.MascotaAdaptador;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {
    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        mascotas = new ArrayList<Mascota>();

        rvMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this,2);

        rvMascotas.setLayoutManager(llm);
        initListaContactos();
        initAdapatador();

        return view;
    }



    public void initListaContactos(){
        mascotas.add(new Mascota("Lucky", ((int) (Math.random() *10 ) + 1) ,false, R.drawable.perro1));
        mascotas.add(new Mascota("Rocky", ((int) (Math.random() *10 ) + 1) ,false,R.drawable.perro2));
        mascotas.add(new Mascota("Chop", ((int) (Math.random() *10 ) + 1) ,false,R.drawable.perro3));
        mascotas.add(new Mascota("Rex", ((int) (Math.random() *10 ) + 1) ,false,R.drawable.perro4));
        mascotas.add(new Mascota("Lobo", ((int) (Math.random() *10 ) + 1) ,false,R.drawable.perro6));
        mascotas.add(new Mascota("Puppy", ((int) (Math.random() *10 ) + 1) ,false,R.drawable.perro5));
    }

    public void initAdapatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity(),true);
        rvMascotas.setAdapter(adaptador);
    }

}
