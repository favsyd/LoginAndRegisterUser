package com.appnucleus.loginandregisteruser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class TableFragment extends Fragment {
    Activity context;
    public TableFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        View rootView = inflater.inflate(R.layout.fragment_connect1, container, false);

        return rootView;
    }
    public void onStart(){
        super.onStart();
        Button bt=(Button)context.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getActivity(),
                        MainActivitycrud.class);
                startActivity(intent);
            }

        });
    }
}
