package com.example.android_lab.features.splash.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.android_lab.features.splash.viewmodel.SplashViewModel

@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    onNavigateToLogin: () -> Unit
) {
    val isFinished = viewModel.isSplashFinished.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.startSplashTimer()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("🚀 MyApp Splash", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(24.dp))

            // Manual navigation button
            Button(onClick = onNavigateToLogin) {
                Text("Go to Login")
            }
        }
    }

    // Auto navigation after timer
    if (isFinished.value) {
        onNavigateToLogin()
    }
}
