# kmm-ktor-starter

This repository provides a Kotlin Multiplatform Mobile starter project with a Ktor backend. The project includes:

- **shared**: A Kotlin Multiplatform library containing shared business logic and networking code.
- **androidApp**: An Android application that depends on the shared module.
- **iosApp**: A placeholder iOS application target. You can use the shared module as a dependency in your SwiftUI app.
- **backend**: A Ktor backend with minimal endpoints to handle login for Google and Facebook tokens.

## Running the backend locally

To start the Ktor backend, ensure you have Java 17 installed, then run:

```bash
./gradlew :backend:run
```

The server will start on port 8080 and expose simple endpoints:

- `GET /` – health check.
- `POST /login/google` – accepts a Google token.
- `POST /login/facebook` – accepts a Facebook token.

## Running the Android app

Open the project in Android Studio (Arctic Fox or newer) and run the **androidApp** module on an emulator or device. The Android app depends on the shared module and includes the sample authentication dependencies.

## Running the iOS app

The `iosApp` folder is a placeholder for an Xcode project. To create an iOS app:

1. Run `./gradlew :shared:podspec` to generate a CocoaPods specification for the shared module.
2. In the `iosApp` directory, create an Xcode project (App or SwiftUI App) and integrate the generated `shared` pod using CocoaPods.
3. Use the shared module in your Swift code and implement the UI as needed.

## Continuous integration

This repository includes a GitHub Actions workflow configured to run on every push. It checks out the code, sets up JDK 17, and builds the shared, Android, and backend modules using Gradle.

## Facebook/Google authentication dependencies

The project includes dependencies for Google Play Services Auth and Facebook Android SDK in the shared and Android modules. The shared module exposes simple functions to send tokens to the backend. You will need to configure the actual authentication flows and provide your OAuth credentials when building a real application.

---

This starter aims to save you time when starting a new multiplatform project. Feel free to expand on it by adding UI, persistence, and more sophisticated backend logic.
