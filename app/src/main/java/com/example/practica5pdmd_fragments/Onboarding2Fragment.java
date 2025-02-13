package com.example.practica5pdmd_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.practica5pdmd_fragments.databinding.FragmentOnboarding2Binding;


public class Onboarding2Fragment extends Fragment {

    private FragmentOnboarding2Binding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentOnboarding2Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        //navegar a homeFragment
        binding.botonFinalizar.setOnClickListener(view1 -> navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment));
    }
}