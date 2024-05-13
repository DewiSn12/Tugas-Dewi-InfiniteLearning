package com.example.tugas_rizki_infinitelearning.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_rizki_infinitelearning.R
import com.example.tugas_rizki_infinitelearning.model.AnimalModel

@Composable
fun CardAnimal(
    animalModel: AnimalModel,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.height(225.dp)
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = animalModel.image),
                contentDescription = stringResource(
                    animalModel.nama
                ),
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(animalModel.nama),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall,
                fontSize = 18.sp
            )
        }
    }
}

@Preview
@Composable
fun CardAnimalPreview() {
    CardAnimal(
        animalModel = AnimalModel(
            R.string.name1,
            R.string.deskripsi1,
            R.drawable.image1
        ),
    )
}