package com.marcosval.loginregisgterapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcosval.loginregisgterapp.R
import com.marcosval.loginregisgterapp.components.ButtonComponent
import com.marcosval.loginregisgterapp.components.ClickableLoginTextComponent
import com.marcosval.loginregisgterapp.components.DividerTextComponent
import com.marcosval.loginregisgterapp.components.HeadingTextComponent
import com.marcosval.loginregisgterapp.components.MyTextFieldComponent
import com.marcosval.loginregisgterapp.components.NormalTextComponent
import com.marcosval.loginregisgterapp.components.PasswordTextFieldComponent
import com.marcosval.loginregisgterapp.components.UnderlineTextComponent

@Composable
fun LoginScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(28.dp)
    ){
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.email)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.padlock)
            )
            Spacer(modifier = Modifier.height(40.dp))
            UnderlineTextComponent(value = stringResource(R.string.forgot_password))

            Spacer(modifier = Modifier.height(80.dp))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(false, onTextSelected = {

            })
        }

    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}