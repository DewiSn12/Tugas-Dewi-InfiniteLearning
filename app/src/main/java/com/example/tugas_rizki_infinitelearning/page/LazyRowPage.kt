package com.example.tugas_rizki_infinitelearning.page
import com.example.tugas_rizki_infinitelearning.component.CardAnimal
import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas_rizki_infinitelearning.model.AnimalModel
import com.example.tugas_rizki_infinitelearning.model.DataSourceAnimal
import com.example.tugas_rizki_infinitelearning.navigation.NavigationScreen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LazyRowPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Lazy Row Page",
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Gray,
                )

            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    vertical = 50.dp,
                    horizontal = 20.dp
                )
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start
        ) {
            ListFoodRow(nameAnimalList = DataSourceAnimal().loadAnimal(), navController)
            ListFoodRow(nameAnimalList = DataSourceAnimal().loadAnimal(), navController)
            ListFoodRow(nameAnimalList = DataSourceAnimal().loadAnimal(), navController)
        }
    }
}

@Composable
fun ListFoodRow(nameAnimalList: List<AnimalModel>, navController: NavController) {
    LazyRow {
        items(nameAnimalList) { nameAnimal ->
            CardAnimal(animalModel = nameAnimal, modifier = Modifier.clickable {
                navController.navigate(
                    route = "${NavigationScreen.Detailpage.name}/${nameAnimal}"
                )
            })
        }
    }
}


@Preview
@Composable
fun PreviewLazyRowPage() {
    LazyRowPage(navController = rememberNavController())
}