package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


// To avoid passing arguments in a wrong order we use resource annotations( Start with @)
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {

}