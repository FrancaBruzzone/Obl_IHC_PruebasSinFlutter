package com.example.obl_ihc_pruebassinflutter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    public void navigateFromLoginToRegister(View view) {
        navController.navigate(R.id.action_loginFragment_to_registerFragment);
    }

    public void navigateFromRegisterToLogin(View view) {
        navController.navigate(R.id.action_registerFragment_to_loginFragment);
    }

    public void navigateFromLoginToHome(View view) {
        navController.navigate(R.id.action_loginFragment_to_homeFragment);
    }

    public void navigateFromHomeToArticles(View view) {
        navController.navigate(R.id.action_homeFragment_to_articlesFragment);
    }

    public void navigateFromHomeToProduct(View view) {
        navController.navigate(R.id.action_homeFragment_to_productFragment);
    }

    public void navigateFromHomeToProfile(View view) {
        navController.navigate(R.id.action_homeFragment_to_profileFragment);
    }

    public void navigateFromArticlesToHome(View view) {
        navController.navigate(R.id.action_articlesFragment_to_homeFragment);
    }

    public void navigateFromProfileToHome(View view) {
        navController.navigate(R.id.action_profileFragment_to_homeFragment);
    }

    public void navigateFromProductToHome(View view) {
        navController.navigate(R.id.action_productFragment_to_homeFragment);
    }
}