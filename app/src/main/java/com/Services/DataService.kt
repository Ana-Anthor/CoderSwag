package com.Services

import android.icu.util.ULocale
import com.Model.Category
import com.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslops Graohic Beanie", "$15", "hat01"),
        Product("Devslops Hat black", "$13", "hat02"),
        Product("Devslops Hat White", "$12", "hat03"),
        Product("Devslops Hat Snapback", "$18", "hat04")
    )

    val hoodies = listOf(
        Product("Devslops Hoodie Grey", "$28", "hoodie01"),
        Product("Devslops Hoodie Red", "$28", "hoodie02"),
        Product("Devslops Grey Hoodie", "$28", "hoodie03"),
        Product("Devslops Black Hoodie", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslops Shirt Black", "$20", "shirt01"),
        Product("Devslops Logo Shirt Red", "$20", "shirt02"),
        Product("Devslops Hustle", "$20", "shirt03"),
        Product("Kickflip Studios", "$20", "shirt04")
    )

}