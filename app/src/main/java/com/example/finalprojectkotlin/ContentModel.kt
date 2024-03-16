package com.example.finalprojectkotlin
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ContentModel(
    val title: String,
    val image: Int,
    val overview : String,
    val detail: String,
):Parcelable
