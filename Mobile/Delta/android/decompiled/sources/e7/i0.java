package e7;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Looper;
import android.widget.ImageView;
import k6.BitmapImage;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0018\u0010#\u001a\u00020\u0000*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010&\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0018\u0010'\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010%\"\u0018\u0010,\u001a\u00020)*\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "i", "()Z", "Lk6/h0;", "uri", "h", "(Lk6/h0;)Z", "Lk6/n;", "", "k", "(Lk6/n;)V", "Landroid/graphics/ColorSpace;", "a", "Landroid/graphics/ColorSpace;", "c", "()Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "", "Landroid/graphics/Bitmap$Config;", "b", "[Landroid/graphics/Bitmap$Config;", "f", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Landroid/content/res/Configuration;", "", "d", "(Landroid/content/res/Configuration;)I", "nightMode", "Landroid/graphics/drawable/Drawable;", "j", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "g", "(Landroid/graphics/drawable/Drawable;)I", "width", "height", "Landroid/widget/ImageView;", "Ly6/f;", "e", "(Landroid/widget/ImageView;)Ly6/f;", "scale", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final ColorSpace f15193a = null;

    @NotNull
    public static final Bitmap.Config[] b = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Bitmap.Config f15194c = Bitmap.Config.HARDWARE;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15195a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[u.a.values().length];
            try {
                iArr[u.a.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.a.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.a.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.a.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15195a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final Bitmap.Config a() {
        return f15194c;
    }

    public static final int b(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    @Nullable
    public static final ColorSpace c() {
        return f15193a;
    }

    public static final int d(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final y6.f e(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? y6.f.FIT : y6.f.FILL;
    }

    @NotNull
    public static final Bitmap.Config[] f() {
        return b;
    }

    public static final int g(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean h(@NotNull k6.h0 h0Var) {
        return Intrinsics.c(h0Var.getScheme(), "file") && Intrinsics.c(CollectionsKt.firstOrNull(k6.i0.f(h0Var)), "android_asset");
    }

    public static final boolean i() {
        return Intrinsics.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean j(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof p5.f);
    }

    public static final void k(@NotNull k6.n nVar) {
        if (nVar instanceof BitmapImage) {
            ((BitmapImage) nVar).getBitmap().prepareToDraw();
        }
    }
}
