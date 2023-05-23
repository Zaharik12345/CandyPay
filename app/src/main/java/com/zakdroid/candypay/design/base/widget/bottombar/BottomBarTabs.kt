package com.zakdroid.candypay.design.base.widget.bottombar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.zakdroid.candypay.R

sealed class BottomBarTabs(@StringRes val title: Int, @DrawableRes val icon: Int, val route: String) {
    object Main : BottomBarTabs(R.string.main_title, R.drawable.ic_main, "home")
    object Profile : BottomBarTabs(R.string.profile_title, R.drawable.ic_profile, "profile")
}
