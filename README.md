# Arc Progress View 🔄

A customizable **semi-circular/arc progress indicator** built with **Jetpack Compose** for Android. Perfect for showing progress towards goals (like steps, tasks, counters) with smooth animation and gradient support.

---

## 🚀 Features

- ✅ **Semi-circular progress view** using Canvas
- 🎨 **Gradient color support**
- 🧠 **Composable and state-driven API**
- ⚡ Animated progress transitions
- 📏 Highly customizable stroke width & colors
- 📦 Ready for reuse in apps or libraries

---

## 📸 Preview

_Add screenshots or GIF here to show the indicator in action_

---

## 📦 Installation

Add the dependency via **JitPack** (or your preferred artifact host):

```groovy
// root level build.gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

// module level build.gradle
dependencies {
    implementation "com.github.aniruddhambarkar:arc-progress-view:TAG"
}
```

## 📦 Usage
    val state = rememberArcProgressState(initialProgress = 0.7f)
    
    ArcProgressIndicator(
        progress = 0.7f,
        state = state,
        gradientColors = listOf(
        Color(0xFF4C1D95),
        Color(0xFF7C3AED),
        Color(0xFFEC4899)
        ),
        backgroundColor = Color(0xFF2A2F4F),
        strokeWidth = 18.dp
        )

## 🧪 Preview in Compose

Use the provided preview composable to visualize in Android Studio:

@Preview(showBackground = true, widthDp = 360, heightDp = 220)
@Composable
fun ProgressScreen() {
    ArcProgressIndicator([README.md](../../Downloads/README.md)
    progress = 0.8f,
    state = rememberArcProgressState(), 
    modifier = Modifier.padding(24.dp)
    )
}

## ✨ API Overview
Parameter	Description
progress	Fraction of progress from 0f to 1f
state	State holder for animation
gradientColors	List of colors for gradient arc
backgroundColor	Arc background color
strokeWidth	Stroke thickness
animationDuration	Animation length in ms