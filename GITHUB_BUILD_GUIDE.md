# Build Vocabulary Wallpaper APK with GitHub Actions

This project includes a GitHub Actions workflow at `.github/workflows/android-apk.yml`.
It builds the debug APK in GitHub's hosted runner and uploads it as a downloadable artifact.

## 1. Create a GitHub repository

1. Sign in to GitHub and create a **New repository** named `VocabularyWallpaper`.
2. Choose Public or Private.
3. Do not initialize it with a README, license, or `.gitignore` because this project already contains project files.
4. Create the repository and copy its HTTPS URL.

## 2. Upload the project using Git Bash

1. Extract this ZIP file on your computer.
2. Open the extracted `VocabularyWallpaper_Phase1` folder.
3. Open Git Bash in that folder.
4. Run these commands, replacing `YOUR_USERNAME` with your GitHub username:

```bash
git init
git add .
git commit -m "Add Vocabulary Wallpaper Phase 1"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/VocabularyWallpaper.git
git push -u origin main
```

If Git asks you to sign in, complete GitHub's browser authentication flow.

## 3. Run the workflow

1. Open your repository on GitHub.
2. Select the **Actions** tab.
3. Open **Build Vocabulary Wallpaper APK**.
4. A build starts automatically after you push to `main`.
   You can also select **Run workflow** to start one manually.
5. Open the completed workflow run. A green check means the build job succeeded.
6. Under **Artifacts**, select `VocabularyWallpaper-debug-apk` to download the APK ZIP.
7. Extract the downloaded artifact ZIP. It contains `app-debug.apk`.

## Notes

- This workflow currently produces a **debug APK**, not a signed release APK.
- The workflow uses JDK 17, Gradle 8.13, Android SDK platform 36, and build-tools 36.0.0 to match this project's configuration.
- The workflow does not require a Gradle wrapper because it installs Gradle directly on the GitHub runner.
- This is the Phase 1 dashboard project. The live wallpaper service and later application features are not implemented in Phase 1 yet.
