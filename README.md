# Arc Progress View 🔄

A customizable **semi‑circular / arc progress indicator** built with **Jetpack Compose** for Android.  
Ideal for visualizing goal-based progress such as **steps, fitness goals, tasks, or counters** with smooth animations and gradient support.

---

## 🚀 Features

- ✅ Semi‑circular / arc progress using `Canvas`
- 🎨 Gradient color support
- 🧠 State‑driven Compose API
- ⚡ Smooth animated progress updates
- 📏 Customizable stroke width & colors
- 📦 Designed as a reusable Compose library

---

## 📸 Preview

> Add screenshots or GIFs here to visually demonstrate the progress view.

---

## 📦 Installation

### Using JitPack

#### 1. Add JitPack repository

```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

#### 2. Add dependency

```gradle
dependencies {
    implementation "com.github.aniruddhambarkar:arc-progress-view:TAG"
}
```

Replace `TAG` with the latest release version (e.g. `v1.0.0`).

---

## 🧠 Usage

### Basic Example

```kotlin
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
```

---

### Steps / Goal Example

```kotlin
ArcProgressIndicator(
    progress = steps / goal.toFloat(),
    state = rememberArcProgressState(),
    steps = steps,
    goal = 10_000
)
```

---

## 🧪 Compose Preview

```kotlin
@Preview(showBackground = true, widthDp = 360, heightDp = 220)
@Composable
fun ProgressPreview() {
    ArcProgressIndicator(
        progress = 0.8f,
        state = rememberArcProgressState(),
        steps = 8000,
        modifier = Modifier.padding(24.dp)
    )
}
```

---

## ✨ API Overview

| Parameter | Description |
|---------|-------------|
| `progress` | Progress value between `0f..1f` |
| `state` | Compose state holder |
| `gradientColors` | Gradient colors for arc |
| `backgroundColor` | Background arc color |
| `strokeWidth` | Thickness of arc |
| `animationDuration` | Animation duration in ms |

---

## 📁 Required Dependencies

```gradle
implementation "androidx.compose.ui:ui"
implementation "androidx.compose.foundation:foundation"
implementation "androidx.compose.animation:animation"
```

---

## 🛠 Customization

You can customize:
- Gradient colors
- Animation duration
- Stroke width
- Start & sweep angles
- Goal / step calculations

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch (`feature/your-feature`)
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

✨ Built with ❤️ using Jetpack Compose  
👨‍💻 Author: **Aniruddh Ambarkar**
