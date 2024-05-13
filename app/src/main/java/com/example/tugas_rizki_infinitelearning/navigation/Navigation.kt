package com.example.tugas_rizki_infinitelearning.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas_rizki_infinitelearning.page.DetailPage
import com.example.tugas_rizki_infinitelearning.page.HalamanBottom
import com.example.tugas_rizki_infinitelearning.page.LazyColumnPage


@Composable
fun Navigations() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationScreen.HalamanBottom.name
    ) {
        composable(NavigationScreen.HalamanBottom.name) {
            HalamanBottom()
        }
        composable(NavigationScreen.LazyColumnPage.name) {
            LazyColumnPage(navController = navController)
        }
        composable(NavigationScreen.Detailpage.name + "/{animalId}") { backStackEntry ->
            val animalId = backStackEntry.arguments?.getString("animalId")
            DetailPage(navController = navController, animalId = animalId)
        }
    }
}