package com.example.clonetuturu.component.data

import androidx.annotation.DrawableRes
import com.example.clonetuturu.R

val serviceTypes = listOf(
    ServiceType(1, "Hostels", R.drawable.bed),
    ServiceType(2, "Planes", R.drawable.flight),
    ServiceType(3, "Trains", R.drawable.train),
    ServiceType(4, "Electric Trains", R.drawable.electotrain),
    ServiceType(5, "Auto buses", R.drawable.autobuse),
    ServiceType(6, "Tours", R.drawable.tree),
    ServiceType(7, "Adventure", R.drawable.change),
    ServiceType(8, "Mission", R.drawable.mission),
    ServiceType(9, "Aero express", R.drawable.star),
)

data class ServiceType(var id: Int, var name:String, @DrawableRes var imageId: Int)