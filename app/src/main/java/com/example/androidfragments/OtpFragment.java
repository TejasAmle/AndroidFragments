package com.example.androidfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class OtpFragment extends Fragment {

    View v;
    EditText etPass;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.fragment_otp, container, false);
       etPass = (EditText) v.findViewById(R.id.editTextNumberPassword);
       return v;
    }

    @Override
    public void onResume(){
        super.onResume();
        etPass.setText("");
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}