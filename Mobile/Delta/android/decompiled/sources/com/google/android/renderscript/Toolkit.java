package com.google.android.renderscript;

import android.graphics.Bitmap;
import ee.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "<init>", "()V", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "a", "(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;", "b", "J", "renderscript-toolkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Toolkit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Toolkit f8381a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long nativeHandle;

    static {
        Toolkit toolkit = new Toolkit();
        f8381a = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            nativeHandle = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static /* synthetic */ Bitmap b(Toolkit toolkit, Bitmap bitmap, float[] fArr, Range2d range2d, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            range2d = null;
        }
        return toolkit.a(bitmap, fArr, range2d);
    }

    private final native long createNative();

    private final native void nativeConvolveBitmap(long nativeHandle2, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);

    @NotNull
    public final Bitmap a(@NotNull Bitmap inputBitmap, @NotNull float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        a.c("convolve", inputBitmap, false, 4, null);
        if (coefficients.length == 9 || coefficients.length == 25) {
            a.e("convolve", inputBitmap, restriction);
            Bitmap bitmapA = a.a(inputBitmap);
            nativeConvolveBitmap(nativeHandle, inputBitmap, bitmapA, coefficients, restriction);
            return bitmapA;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
    }
}
