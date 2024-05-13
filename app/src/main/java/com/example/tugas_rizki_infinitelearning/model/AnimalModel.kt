package com.example.tugas_rizki_infinitelearning.model

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tugas_rizki_infinitelearning.R

data class AnimalModel(
    @StringRes val nama: Int,
    @StringRes val deskripsi: Int,
    @DrawableRes val image: Int,
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(nama)
        dest.writeInt(deskripsi)
        dest.writeInt(image)
    }

    companion object CREATOR : Parcelable.Creator<AnimalModel> {
        override fun createFromParcel(parcel: Parcel): AnimalModel {
            return AnimalModel(parcel)
        }

        override fun newArray(size: Int): Array<AnimalModel?> {
            return arrayOfNulls(size)
        }
    }
}

class DataSourceAnimal() {
    fun loadAnimal(): List<AnimalModel> {
        return listOf<AnimalModel>(
            AnimalModel(
                nama = R.string.name1,
                deskripsi = R.string.deskripsi1,
                image = R.drawable.image1
            ),
            AnimalModel(
                nama = R.string.name2,
                deskripsi = R.string.deskripsi2,
                image = R.drawable.image2
            ),
            AnimalModel(
                nama = R.string.name3,
                deskripsi = R.string.deskripsi3,
                image = R.drawable.image3
            ),
            AnimalModel(
                nama = R.string.name4,
                deskripsi = R.string.deskripsi4,
                image = R.drawable.image4
            ),
            AnimalModel(
                nama = R.string.name5,
                deskripsi = R.string.deskripsi5,
                image = R.drawable.image5
            ),
            AnimalModel(
                nama = R.string.name6,
                deskripsi = R.string.deskripsi6,
                image = R.drawable.image6
            ),
            AnimalModel(
                nama = R.string.name7,
                deskripsi = R.string.deskripsi7,
                image = R.drawable.image7
            ),
            AnimalModel(
                nama = R.string.name8,
                deskripsi = R.string.deskripsi8,
                image = R.drawable.image8
            ),
            AnimalModel(
                nama = R.string.name9,
                deskripsi = R.string.deskripsi9,
                image = R.drawable.image9
            ),
            AnimalModel(
                nama = R.string.name10,
                deskripsi = R.string.deskripsi10,
                image = R.drawable.image10
            ),
        )
    }
}