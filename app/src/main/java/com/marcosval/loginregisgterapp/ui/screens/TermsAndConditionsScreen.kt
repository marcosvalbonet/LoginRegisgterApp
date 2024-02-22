package com.marcosval.loginregisgterapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcosval.loginregisgterapp.R
import com.marcosval.loginregisgterapp.components.HeadingTextComponent
import com.marcosval.loginregisgterapp.navigation.NavigationAppRouter
import com.marcosval.loginregisgterapp.navigation.Screen
import com.marcosval.loginregisgterapp.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)
    ){
        HeadingTextComponent(value = stringResource(id = R.string.terms_conditions))
    }

    SystemBackButtonHandler {
        NavigationAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}