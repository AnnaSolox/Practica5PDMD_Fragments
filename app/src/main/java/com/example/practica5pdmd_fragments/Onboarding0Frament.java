package com.example.practica5pdmd_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.practica5pdmd_fragments.databinding.FragmentOnboarding0Binding;

public class Onboarding0Frament extends Fragment {

    private FragmentOnboarding0Binding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentOnboarding0Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        binding.botonStart.setOnClickListener(view1 -> navController.navigate(R.id.action_onboarding0Frament_to_onboarding1Fragment));
        binding.skip.setOnClickListener(view1 -> navController.navigate(R.id.action_onboarding0Frament_to_homeFragment));
    }
}