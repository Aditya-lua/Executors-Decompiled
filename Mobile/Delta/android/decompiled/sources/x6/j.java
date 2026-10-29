package x6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import b7.ImageViewTarget;
import e7.i0;
import k6.Extras;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d\"\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d\"\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001d\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001d\"\u0015\u0010-\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u00100\u001a\u00020\u0014*\u00020*8F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u0014*\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u00109\u001a\u0004\u0018\u00010 *\u0002018G¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u0010<\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010?\u001a\u0004\u0018\u00010#*\u00020*8F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0015\u0010A\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b$\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b(\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\bC\u0010;\"\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b&\u00106¨\u0006D"}, d2 = {"Lx6/g$a;", "Landroid/widget/ImageView;", "imageView", "q", "(Lx6/g$a;Landroid/widget/ImageView;)Lx6/g$a;", "", "durationMillis", "d", "(Lx6/g$a;I)Lx6/g$a;", "Lk6/s$a;", "c", "(Lk6/s$a;I)Lk6/s$a;", "Ld7/d$a;", "p", "(I)Ld7/d$a;", "factory", "s", "(Lx6/g$a;Ld7/d$a;)Lx6/g$a;", "r", "(Lk6/s$a;Ld7/d$a;)Lk6/s$a;", "Landroid/graphics/Bitmap$Config;", "config", "b", "(Lx6/g$a;Landroid/graphics/Bitmap$Config;)Lx6/g$a;", "", "enable", "a", "(Lx6/g$a;Z)Lx6/g$a;", "Lk6/l$c;", "Lk6/l$c;", "transitionFactoryKey", "bitmapConfigKey", "Landroid/graphics/ColorSpace;", "colorSpaceKey", "premultipliedAlphaKey", "Landroidx/lifecycle/l;", "e", "lifecycleKey", "f", "allowHardwareKey", "g", "allowRgb565Key", "Lx6/g;", "o", "(Lx6/g;)Ld7/d$a;", "transitionFactory", "i", "(Lx6/g;)Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lx6/p;", "j", "(Lx6/p;)Landroid/graphics/Bitmap$Config;", "Lk6/l$c$a;", "k", "(Lk6/l$c$a;)Lk6/l$c;", "l", "(Lx6/p;)Landroid/graphics/ColorSpace;", "colorSpace", "n", "(Lx6/p;)Z", "premultipliedAlpha", "m", "(Lx6/g;)Landroidx/lifecycle/l;", "lifecycle", "(Lx6/g;)Z", "allowHardware", "allowRgb565", "h", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<d7.d.a> f35120a = new Extras.c<>(d7.d.a.b);

    @NotNull
    public static final Extras.c<Bitmap.Config> b = new Extras.c<>(i0.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<ColorSpace> f35121c = new Extras.c<>(i0.c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f35122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Extras.c<androidx.p000lifecycle.l> f35123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f35124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f35125g;

    static {
        Boolean bool = Boolean.TRUE;
        f35122d = new Extras.c<>(bool);
        f35123e = new Extras.c<>(null);
        f35124f = new Extras.c<>(bool);
        f35125g = new Extras.c<>(Boolean.FALSE);
    }

    @NotNull
    public static final ImageRequest.a a(@NotNull ImageRequest.a aVar, boolean z10) {
        aVar.h().b(f35124f, Boolean.valueOf(z10));
        return aVar;
    }

    @NotNull
    public static final ImageRequest.a b(@NotNull ImageRequest.a aVar, @NotNull Bitmap.Config config) {
        aVar.h().b(b, config);
        return aVar;
    }

    @NotNull
    public static final k6.s.a c(@NotNull k6.s.a aVar, int i10) {
        return r(aVar, p(i10));
    }

    @NotNull
    public static final ImageRequest.a d(@NotNull ImageRequest.a aVar, int i10) {
        return s(aVar, p(i10));
    }

    public static final boolean e(@NotNull ImageRequest imageRequest) {
        return ((Boolean) k6.m.a(imageRequest, f35124f)).booleanValue();
    }

    @NotNull
    public static final Extras.c<Boolean> f(@NotNull Extras.c.Companion companion) {
        return f35125g;
    }

    public static final boolean g(@NotNull ImageRequest imageRequest) {
        return ((Boolean) k6.m.a(imageRequest, f35125g)).booleanValue();
    }

    public static final boolean h(@NotNull Options options) {
        return ((Boolean) k6.m.b(options, f35125g)).booleanValue();
    }

    @NotNull
    public static final Bitmap.Config i(@NotNull ImageRequest imageRequest) {
        return (Bitmap.Config) k6.m.a(imageRequest, b);
    }

    @NotNull
    public static final Bitmap.Config j(@NotNull Options options) {
        return (Bitmap.Config) k6.m.b(options, b);
    }

    @NotNull
    public static final Extras.c<Bitmap.Config> k(@NotNull Extras.c.Companion companion) {
        return b;
    }

    @Nullable
    public static final ColorSpace l(@NotNull Options options) {
        return (ColorSpace) k6.m.b(options, f35121c);
    }

    @Nullable
    public static final androidx.p000lifecycle.l m(@NotNull ImageRequest imageRequest) {
        return (androidx.p000lifecycle.l) k6.m.a(imageRequest, f35123e);
    }

    public static final boolean n(@NotNull Options options) {
        return ((Boolean) k6.m.b(options, f35122d)).booleanValue();
    }

    @NotNull
    public static final d7.d.a o(@NotNull ImageRequest imageRequest) {
        return (d7.d.a) k6.m.a(imageRequest, f35120a);
    }

    public static final d7.d.a p(int i10) {
        if (i10 <= 0) {
            return d7.d.a.b;
        }
        return new d7.b.a(i10, false, 2, null);
    }

    @NotNull
    public static final ImageRequest.a q(@NotNull ImageRequest.a aVar, @NotNull ImageView imageView) {
        return aVar.v(new ImageViewTarget(imageView));
    }

    @NotNull
    public static final k6.s.a r(@NotNull k6.s.a aVar, @NotNull d7.d.a aVar2) {
        aVar.getExtras().b(f35120a, aVar2);
        return aVar;
    }

    @NotNull
    public static final ImageRequest.a s(@NotNull ImageRequest.a aVar, @NotNull d7.d.a aVar2) {
        aVar.h().b(f35120a, aVar2);
        return aVar;
    }
}
