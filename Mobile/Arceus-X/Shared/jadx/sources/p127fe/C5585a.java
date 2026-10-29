package p127fe;

import android.graphics.Bitmap;
import com.google.android.renderscript.Range2d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fe.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"", "function", "Landroid/graphics/Bitmap;", "inputBitmap", "", "alphaAllowed", "", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "a", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "tag", "bitmap", "Lcom/google/android/renderscript/Range2d;", "restriction", "e", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V", "", "sizeX", "sizeY", "d", "(Ljava/lang/String;IILcom/google/android/renderscript/Range2d;)V", "f", "(Landroid/graphics/Bitmap;)I", "renderscript-toolkit_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5585a {

    /* JADX INFO: renamed from: fe.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21389a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21389a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bitmap m25243a(@NotNull Bitmap inputBitmap) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        int width = inputBitmap.getWidth();
        int height = inputBitmap.getHeight();
        Bitmap.Config config = inputBitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static final void m25244b(@NotNull String function, @NotNull Bitmap inputBitmap, boolean z10) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        if (z10) {
            if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888 && inputBitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888 and ALPHA_8 bitmaps. " + inputBitmap.getConfig() + " provided.").toString());
            }
        } else if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888. " + inputBitmap.getConfig() + " provided.").toString());
        }
        if (inputBitmap.getWidth() * m25248f(inputBitmap) == inputBitmap.getRowBytes()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + function + ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + inputBitmap.getRowBytes() + ", width={" + inputBitmap.getWidth() + ", and vectorSize=" + m25248f(inputBitmap) + ".").toString());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m25245c(String str, Bitmap bitmap, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        m25244b(str, bitmap, z10);
    }

    /* JADX INFO: renamed from: d */
    public static final void m25246d(@NotNull String tag, int i10, int i11, @Nullable Range2d range2d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    /* JADX INFO: renamed from: e */
    public static final void m25247e(@NotNull String tag, @NotNull Bitmap bitmap, @Nullable Range2d range2d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        m25246d(tag, bitmap.getWidth(), bitmap.getHeight(), range2d);
    }

    /* JADX INFO: renamed from: f */
    public static final int m25248f(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap.Config config = bitmap.getConfig();
        int i10 = config == null ? -1 : a.f21389a[config.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
