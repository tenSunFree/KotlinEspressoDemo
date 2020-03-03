package com.home.kotlinespressodemo

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.home.kotlinespressodemo.common.test.CommonMainTest
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(
    sdk = [Build.VERSION_CODES.P]
)
class UnitMainTest : CommonMainTest()
