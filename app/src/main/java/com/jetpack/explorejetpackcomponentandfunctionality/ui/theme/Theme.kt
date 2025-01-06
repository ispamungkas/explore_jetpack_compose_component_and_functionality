package com.jetpack.explorejetpackcomponentandfunctionality.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorDark
import com.jetpack.explorejetpackcomponentandfunctionality.errorDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorLight
import com.jetpack.explorejetpackcomponentandfunctionality.errorLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.errorLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceDark
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceLight
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseOnSurfaceLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inversePrimaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceDark
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceLight
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.inverseSurfaceLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onBackgroundLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorDark
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorLight
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onErrorLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onPrimaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSecondaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceDark
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceLight
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantDark
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantLight
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onSurfaceVariantLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.onTertiaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineDark
import com.jetpack.explorejetpackcomponentandfunctionality.outlineDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineLight
import com.jetpack.explorejetpackcomponentandfunctionality.outlineLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantDark
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantLight
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.outlineVariantLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.primaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.primaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.primaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.scrimDark
import com.jetpack.explorejetpackcomponentandfunctionality.scrimDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.scrimDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.scrimLight
import com.jetpack.explorejetpackcomponentandfunctionality.scrimLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.scrimLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.secondaryLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceBrightLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerHighestLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceContainerLowestLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceDimLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantDark
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantLight
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.surfaceVariantLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerDark
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerLight
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryContainerLightMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryDark
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryDarkHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryDarkMediumContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryLight
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryLightHighContrast
import com.jetpack.explorejetpackcomponentandfunctionality.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    background = surfaceDark,
    onBackground = onSurfaceDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun ExploreJetpackComponentAndFunctionalityTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}