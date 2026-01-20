package com.aniruddhambarkar.arcprogressmeter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.State
@Composable
fun rememberArcProgressViewController(
    initialProgress: Float = 0f
): ArcProgressViewController {
    return remember {
        ArcProgressViewController().apply {
            setProgress(initialProgress)
        }
    }
}

@Stable
class ArcProgressViewController {
    private val _progress = mutableFloatStateOf(0f)
    val progressState: State<Float> get() = _progress

    fun setProgress(value: Float) {
        _progress.floatValue = value.coerceIn(0f, 1f)
    }
}
