package y6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import c7.ImageViewTarget;
import com.github.luben.zstd.BuildConfig;
import f7.i0;
import l6.Extras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d\"\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d\"\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001d\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001d\"\u0015\u0010-\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u00100\u001a\u00020\u0014*\u00020*8F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u0014*\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u00109\u001a\u0004\u0018\u00010 *\u0002018G¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u0010<\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010?\u001a\u0004\u0018\u00010#*\u00020*8F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0015\u0010A\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b$\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b(\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\bC\u0010;\"\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b&\u00106¨\u0006D"}, d2 = {"Ly6/g$a;", "Landroid/widget/ImageView;", "imageView", "q", "(Ly6/g$a;Landroid/widget/ImageView;)Ly6/g$a;", BuildConfig.FLAVOR, "durationMillis", "d", "(Ly6/g$a;I)Ly6/g$a;", "Ll6/s$a;", "c", "(Ll6/s$a;I)Ll6/s$a;", "Le7/d$a;", "p", "(I)Le7/d$a;", "factory", "s", "(Ly6/g$a;Le7/d$a;)Ly6/g$a;", "r", "(Ll6/s$a;Le7/d$a;)Ll6/s$a;", "Landroid/graphics/Bitmap$Config;", "config", "b", "(Ly6/g$a;Landroid/graphics/Bitmap$Config;)Ly6/g$a;", BuildConfig.FLAVOR, "enable", "a", "(Ly6/g$a;Z)Ly6/g$a;", "Ll6/l$c;", "Ll6/l$c;", "transitionFactoryKey", "bitmapConfigKey", "Landroid/graphics/ColorSpace;", "colorSpaceKey", "premultipliedAlphaKey", "Landroidx/lifecycle/l;", "e", "lifecycleKey", "f", "allowHardwareKey", "g", "allowRgb565Key", "Ly6/g;", "o", "(Ly6/g;)Le7/d$a;", "transitionFactory", "i", "(Ly6/g;)Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ly6/p;", "j", "(Ly6/p;)Landroid/graphics/Bitmap$Config;", "Ll6/l$c$a;", "k", "(Ll6/l$c$a;)Ll6/l$c;", "l", "(Ly6/p;)Landroid/graphics/ColorSpace;", "colorSpace", "n", "(Ly6/p;)Z", "premultipliedAlpha", "m", "(Ly6/g;)Landroidx/lifecycle/l;", "lifecycle", "(Ly6/g;)Z", "allowHardware", "allowRgb565", "h", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<e7.d.a> f37664a = new Extras.c<>(e7.d.a.b);

    @NotNull
    public static final Extras.c<Bitmap.Config> b = new Extras.c<>(i0.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<ColorSpace> f37665c = new Extras.c<>(i0.c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f37666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Extras.c<androidx.p000lifecycle.l> f37667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f37668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f37669g;

    static {
        Boolean bool = Boolean.TRUE;
        f37666d = new Extras.c<>(bool);
        f37667e = new Extras.c<>(null);
        f37668f = new Extras.c<>(bool);
        f37669g = new Extras.c<>(Boolean.FALSE);
    }

    @NotNull
    public static final ImageRequest.a a(@NotNull ImageRequest.a aVar, boolean z10) {
        aVar.h().b(f37668f, Boolean.valueOf(z10));
        return aVar;
    }

    @NotNull
    public static final ImageRequest.a b(@NotNull ImageRequest.a aVar, @NotNull Bitmap.Config config) {
        aVar.h().b(b, config);
        return aVar;
    }

    @NotNull
    public static final l6.s.a c(@NotNull l6.s.a aVar, int i10) {
        return r(aVar, p(i10));
    }

    @NotNull
    public static final ImageRequest.a d(@NotNull ImageRequest.a aVar, int i10) {
        return s(aVar, p(i10));
    }

    public static final boolean e(@NotNull ImageRequest imageRequest) {
        return ((Boolean) l6.m.a(imageRequest, f37668f)).booleanValue();
    }

    @NotNull
    public static final Extras.c<Boolean> f(@NotNull Extras.c.Companion companion) {
        return f37669g;
    }

    public static final boolean g(@NotNull ImageRequest imageRequest) {
        return ((Boolean) l6.m.a(imageRequest, f37669g)).booleanValue();
    }

    public static final boolean h(@NotNull Options options) {
        return ((Boolean) l6.m.b(options, f37669g)).booleanValue();
    }

    @NotNull
    public static final Bitmap.Config i(@NotNull ImageRequest imageRequest) {
        return (Bitmap.Config) l6.m.a(imageRequest, b);
    }

    @NotNull
    public static final Bitmap.Config j(@NotNull Options options) {
        return (Bitmap.Config) l6.m.b(options, b);
    }

    @NotNull
    public static final Extras.c<Bitmap.Config> k(@NotNull Extras.c.Companion companion) {
        return b;
    }

    @Nullable
    public static final ColorSpace l(@NotNull Options options) {
        return (ColorSpace) l6.m.b(options, f37665c);
    }

    @Nullable
    public static final androidx.p000lifecycle.l m(@NotNull ImageRequest imageRequest) {
        return (androidx.p000lifecycle.l) l6.m.a(imageRequest, f37667e);
    }

    public static final boolean n(@NotNull Options options) {
        return ((Boolean) l6.m.b(options, f37666d)).booleanValue();
    }

    @NotNull
    public static final e7.d.a o(@NotNull ImageRequest imageRequest) {
        return (e7.d.a) l6.m.a(imageRequest, f37664a);
    }

    public static final e7.d.a p(int i10) {
        if (i10 <= 0) {
            return e7.d.a.b;
        }
        return new e7.b.a(i10, false, 2, null);
    }

    @NotNull
    public static final ImageRequest.a q(@NotNull ImageRequest.a aVar, @NotNull ImageView imageView) {
        return aVar.v(new ImageViewTarget(imageView));
    }

    @NotNull
    public static final l6.s.a r(@NotNull l6.s.a aVar, @NotNull e7.d.a aVar2) {
        aVar.getExtras().b(f37664a, aVar2);
        return aVar;
    }

    @NotNull
    public static final ImageRequest.a s(@NotNull ImageRequest.a aVar, @NotNull e7.d.a aVar2) {
        aVar.h().b(f37664a, aVar2);
        return aVar;
    }
}
