package com.example.android_lab.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android_lab.features.splash.presentation.SplashScreen
import com.example.android_lab.features.splash.viewmodel.SplashViewModel
import com.example.android_lab.features.authentication.presentation.ui.LoginScreen
import com.example.android_lab.features.authentication.presentation.ui.SignupScreen
import org.koin.androidx.compose.koinViewModel

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Signup : Screen("signup")
    object Home : Screen("home")
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        // Splash
        composable(Screen.Splash.route) {
            val splashViewModel: SplashViewModel = koinViewModel() // inject ViewModel
            SplashScreen(
                viewModel = splashViewModel,
                onNavigateToLogin = {
                    navController.navigate(Screen.Login.route) {
//                        popUpTo(Screen.Splash.route) { inclusive = true }
//                        launchSingleTop = true
                    }
                }
            )
        }

        // Login
        composable(Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = {
//                    navController.navigate(Screen.Home.route) {
//                        popUpTo(Screen.Login.route) { inclusive = true }
//                        launchSingleTop = true
//                    }
                },
                onNavigateToSignup = {
//                    navController.navigate(Screen.Signup.route)
                }
            )
        }

        // Signup
        composable(Screen.Signup.route) {
            SignupScreen(
                onSignupSuccess = {
//                    navController.navigate(Screen.Home.route) {
//                        popUpTo(Screen.Signup.route) { inclusive = true }
//                        launchSingleTop = true
//                    }
                },
                onNavigateToLogin = {
//                    navController.popBackStack()
                }
            )
        }

        // Home
        composable(Screen.Home.route) {
            Text(
                text = "🏠 Home Screen",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}
