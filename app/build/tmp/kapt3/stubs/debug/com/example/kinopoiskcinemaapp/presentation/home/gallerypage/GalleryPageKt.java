package com.example.kinopoiskcinemaapp.presentation.home.gallerypage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\t\u001a\u00020\u00072!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\bH\u0003\u001aS\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u0019H\u0007\u001aA\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001a\b\u0010!\u001a\u00020\u0001H\u0007\u001a\b\u0010\"\u001a\u00020\u0001H\u0007\u00a8\u0006#"}, d2 = {"BottomsRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "imagesGroup", "", "Lkotlin/Pair;", "", "", "isChecked", "checkItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "GalleryButton", "imageType", "listSize", "GalleryPagePreview", "galleryPageViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/home/gallerypage/GalleryPageViewModel;", "filmId", "onClickBack", "Lkotlin/Function0;", "selectedScreen", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "screen", "screenState", "ImagesGrid", "imagesList", "Lcom/example/kinopoiskcinemaapp/entity/images/ItemFilmImages;", "onClickImage", "imagePath", "PreviewGalleryPage", "PreviewImages", "app_debug"})
public final class GalleryPageKt {
    
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    @android.annotation.SuppressLint(value = {"RememberReturnType"})
    @androidx.compose.runtime.Composable()
    public static final void GalleryPagePreview(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.presentation.home.gallerypage.GalleryPageViewModel galleryPageViewModel, int filmId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    private static final void ImagesGrid(androidx.compose.ui.Modifier modifier, java.util.List<com.example.kinopoiskcinemaapp.entity.images.ItemFilmImages> imagesList, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickImage) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void BottomsRow(androidx.compose.ui.Modifier modifier, java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> imagesGroup, java.lang.String isChecked, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> checkItem) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void GalleryButton(java.lang.String imageType, int listSize) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewGalleryPage() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewImages() {
    }
}