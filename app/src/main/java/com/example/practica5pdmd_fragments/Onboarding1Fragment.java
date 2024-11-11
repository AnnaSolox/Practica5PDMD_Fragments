package com.example.practica5pdmd_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.practica5pdmd_fragments.databinding.FragmentOnboarding1Binding;

public class Onboarding1Fragment extends Fragment {

    private FragmentOnboarding1Binding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentOnboarding1Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        binding.botonSiguiente.setOnClickListener(view1 ->navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment));
        binding.skip.setOnClickListener(view1 -> navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment));
    }
}