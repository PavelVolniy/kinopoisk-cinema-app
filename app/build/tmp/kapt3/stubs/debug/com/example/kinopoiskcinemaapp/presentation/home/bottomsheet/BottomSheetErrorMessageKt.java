package com.example.kinopoiskcinemaapp.presentation.home.bottomsheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001ac\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u001a0\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0013\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0003\u00a8\u0006\u0014"}, d2 = {"BottomSheetErrorMessage", "", "title", "", "errorMessage", "isClose", "Lkotlin/Function0;", "padding", "", "selectedScreen", "Lkotlin/Function1;", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "Lkotlin/ParameterName;", "name", "screen", "screenState", "ErrorMessage", "ErrorView", "PreviewErrorView", "TitleText", "app_debug"})
public final class BottomSheetErrorMessageKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void BottomSheetErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> isClose, int padding, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorView(int padding, java.lang.String title, kotlin.jvm.functions.Function0<kotlin.Unit> isClose, java.lang.String errorMessage) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorMessage(java.lang.String errorMessage) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TitleText(java.lang.String title) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void PreviewErrorView() {
    }
}