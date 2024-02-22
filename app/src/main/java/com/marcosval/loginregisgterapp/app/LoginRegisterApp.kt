package com.marcosval.loginregisgterapp.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.marcosval.loginregisgterapp.navigation.NavigationAppRouter
import com.marcosval.loginregisgterapp.navigation.Screen
import com.marcosval.loginregisgterapp.ui.screens.SignUpScreen
import com.marcosval.loginregisgterapp.ui.screens.TermsAndConditionsScreen

@Composable
fun LoginRegisterApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){

        Crossfade(targetState = NavigationAppRouter.currentScreen) { currentState ->
            when(currentState.value){
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
            }
        }
    }
}