package p096e7;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Looper;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.BitmapImage;
import p239k6.C7466h0;
import p239k6.C7468i0;
import p239k6.InterfaceC7474n;
import p352p5.C10164f;
import p568y6.EnumC13107f;

/* JADX INFO: renamed from: e7.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0018\u0010#\u001a\u00020\u0000*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010&\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0018\u0010'\u001a\u00020\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010%\"\u0018\u0010,\u001a\u00020)*\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m31665d2 = {"", "i", "()Z", "Lk6/h0;", "uri", "h", "(Lk6/h0;)Z", "Lk6/n;", "", "k", "(Lk6/n;)V", "Landroid/graphics/ColorSpace;", "a", "Landroid/graphics/ColorSpace;", "c", "()Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "", "Landroid/graphics/Bitmap$Config;", "b", "[Landroid/graphics/Bitmap$Config;", "f", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Landroid/content/res/Configuration;", "", "d", "(Landroid/content/res/Configuration;)I", "nightMode", "Landroid/graphics/drawable/Drawable;", "j", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "g", "(Landroid/graphics/drawable/Drawable;)I", "width", "height", "Landroid/widget/ImageView;", "Ly6/f;", "e", "(Landroid/widget/ImageView;)Ly6/f;", "scale", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4863i0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static final ColorSpace f19550a = null;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Bitmap.Config[] f19551b = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Bitmap.Config f19552c = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: e7.i0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19553a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f19554b;

        static {
            int[] iArr = new int[InterfaceC4875u.a.values().length];
            try {
                iArr[InterfaceC4875u.a.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC4875u.a.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC4875u.a.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC4875u.a.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC4875u.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19553a = iArr;
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
            f19554b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config m23455a() {
        return f19552c;
    }

    /* JADX INFO: renamed from: b */
    public static final int m23456b(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final ColorSpace m23457c() {
        return f19550a;
    }

    /* JADX INFO: renamed from: d */
    public static final int m23458d(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final EnumC13107f m23459e(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f19554b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? EnumC13107f.FIT : EnumC13107f.FILL;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] m23460f() {
        return f19551b;
    }

    /* JADX INFO: renamed from: g */
    public static final int m23461g(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m23462h(@NotNull C7466h0 c7466h0) {
        return Intrinsics.m31980c(c7466h0.getScheme(), "file") && Intrinsics.m31980c(CollectionsKt.firstOrNull(C7468i0.m31027f(c7466h0)), "android_asset");
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m23463i() {
        return Intrinsics.m31980c(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m23464j(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof C10164f);
    }

    /* JADX INFO: renamed from: k */
    public static final void m23465k(@NotNull InterfaceC7474n interfaceC7474n) {
        if (interfaceC7474n instanceof BitmapImage) {
            ((BitmapImage) interfaceC7474n).getBitmap().prepareToDraw();
        }
    }
}
