package com.marcosval.loginregisgterapp.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


sealed class Screen(){

    data object SignUpScreen : Screen()
    data object TermsAndConditionsScreen : Screen()

}

object NavigationAppRouter {

    var currentScreen : MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination : Screen){
        currentScreen.value = destination
    }
}