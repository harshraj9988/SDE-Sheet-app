package com.example.sdesheets

import android.net.Uri


class Problem(val title: String, url: String){
    val url: Uri = Uri.parse(url)
}
