package com.example.finalv2.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalv2.R;
import com.example.finalv2.activities.SplashActivity;
import com.google.firebase.auth.FirebaseAuth;


public class LogoutFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(requireContext(), SplashActivity.class));

        if(getActivity() != null){
            getActivity().finish();
        }

        View root = inflater.inflate(R.layout.fragment_logout,container,false);
        return root;
    }
}