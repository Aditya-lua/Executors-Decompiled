package com.google.android.renderscript;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p127fe.C5585a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "<init>", "()V", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "a", "(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;", "b", "J", "renderscript-toolkit_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Toolkit {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Toolkit f10772a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long nativeHandle;

    static {
        Toolkit toolkit = new Toolkit();
        f10772a = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            nativeHandle = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Bitmap m13353b(Toolkit toolkit, Bitmap bitmap, float[] fArr, Range2d range2d, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            range2d = null;
        }
        return toolkit.m13354a(bitmap, fArr, range2d);
    }

    private final native long createNative();

    private final native void nativeConvolveBitmap(long nativeHandle2, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Bitmap m13354a(@NotNull Bitmap inputBitmap, @NotNull float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        C5585a.m25245c("convolve", inputBitmap, false, 4, null);
        if (coefficients.length == 9 || coefficients.length == 25) {
            C5585a.m25247e("convolve", inputBitmap, restriction);
            Bitmap bitmapM25243a = C5585a.m25243a(inputBitmap);
            nativeConvolveBitmap(nativeHandle, inputBitmap, bitmapM25243a, coefficients, restriction);
            return bitmapM25243a;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
    }
}
