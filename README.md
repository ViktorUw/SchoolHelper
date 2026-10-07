# SchoolHelper

An Android app for students that shows lists of assignments for each subject and the average grade per subject.

## Features

- **Task lists** screen: every list shows the subject, number of tasks and the grade received
- Tap a list to see all its tasks with their content and points
- **Grades** screen: average grade for each subject
- Bottom navigation between the two main screens

> The app uses generated sample data (subjects such as Mathematics, Physics, Electronics, Algorithms) so the UI can be shown without a backend.

## Tech stack

- **Kotlin**
- **Navigation Component** with Safe Args and `BottomNavigationView`
- **RecyclerView** with custom adapters
- View Binding
- Min SDK 28, target SDK 34

## Project structure

```
app/src/main/java/com/example/schoolhelper/
├── MainActivity.kt          # Navigation host + bottom navigation
├── AllTasks.kt              # Screen with all task lists
├── ListOfTask.kt            # Tasks of a selected list
├── Grades.kt                # Average grades per subject
├── *Adapter.kt              # RecyclerView adapters
├── Subject.kt, Exercise.kt, ExerciseList.kt  # Models
└── DataGenerator.kt         # Sample data and average calculation
```

## Getting started

1. Clone the repository:
   ```bash
   git clone https://github.com/ViktorUw/SchoolHelper.git
   ```
2. Open the project in **Android Studio** and let Gradle sync.
3. Run the app on an emulator or a device with Android 9.0 (API 28) or newer.

> The interface is in Polish.

See also: [SchoolHelperCompose](https://github.com/ViktorUw/SchoolHelperCompose), the same app rebuilt with Jetpack Compose.
