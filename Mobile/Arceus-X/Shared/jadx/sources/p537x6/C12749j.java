package p537x6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import androidx.p616lifecycle.AbstractC0966l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.ImageViewTarget;
import p070d7.C4465b;
import p070d7.InterfaceC4467d;
import p096e7.C4863i0;
import p239k6.C7473m;
import p239k6.Extras;
import p239k6.InterfaceC7479s;

/* JADX INFO: renamed from: x6.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d\"\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d\"\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001d\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001d\"\u0015\u0010-\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u00100\u001a\u00020\u0014*\u00020*8F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u0014*\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u00109\u001a\u0004\u0018\u00010 *\u0002018G¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u0010<\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010?\u001a\u0004\u0018\u00010#*\u00020*8F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0015\u0010A\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b$\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b(\u0010@\"\u0015\u0010B\u001a\u00020\u0018*\u0002018F¢\u0006\u0006\u001a\u0004\bC\u0010;\"\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c*\u0002048F¢\u0006\u0006\u001a\u0004\b&\u00106¨\u0006D"}, m31665d2 = {"Lx6/g$a;", "Landroid/widget/ImageView;", "imageView", "q", "(Lx6/g$a;Landroid/widget/ImageView;)Lx6/g$a;", "", "durationMillis", "d", "(Lx6/g$a;I)Lx6/g$a;", "Lk6/s$a;", "c", "(Lk6/s$a;I)Lk6/s$a;", "Ld7/d$a;", "p", "(I)Ld7/d$a;", "factory", "s", "(Lx6/g$a;Ld7/d$a;)Lx6/g$a;", "r", "(Lk6/s$a;Ld7/d$a;)Lk6/s$a;", "Landroid/graphics/Bitmap$Config;", "config", "b", "(Lx6/g$a;Landroid/graphics/Bitmap$Config;)Lx6/g$a;", "", "enable", "a", "(Lx6/g$a;Z)Lx6/g$a;", "Lk6/l$c;", "Lk6/l$c;", "transitionFactoryKey", "bitmapConfigKey", "Landroid/graphics/ColorSpace;", "colorSpaceKey", "premultipliedAlphaKey", "Landroidx/lifecycle/l;", "e", "lifecycleKey", "f", "allowHardwareKey", "g", "allowRgb565Key", "Lx6/g;", "o", "(Lx6/g;)Ld7/d$a;", "transitionFactory", "i", "(Lx6/g;)Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lx6/p;", "j", "(Lx6/p;)Landroid/graphics/Bitmap$Config;", "Lk6/l$c$a;", "k", "(Lk6/l$c$a;)Lk6/l$c;", "l", "(Lx6/p;)Landroid/graphics/ColorSpace;", "colorSpace", "n", "(Lx6/p;)Z", "premultipliedAlpha", "m", "(Lx6/g;)Landroidx/lifecycle/l;", "lifecycle", "(Lx6/g;)Z", "allowHardware", "allowRgb565", "h", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12749j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Extras.c<InterfaceC4467d.a> f45459a = new Extras.c<>(InterfaceC4467d.a.f18504b);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Extras.c<Bitmap.Config> f45460b = new Extras.c<>(C4863i0.m23455a());

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Extras.c<ColorSpace> f45461c = new Extras.c<>(C4863i0.m23457c());

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Extras.c<Boolean> f45462d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Extras.c<AbstractC0966l> f45463e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Extras.c<Boolean> f45464f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Extras.c<Boolean> f45465g;

    static {
        Boolean bool = Boolean.TRUE;
        f45462d = new Extras.c<>(bool);
        f45463e = new Extras.c<>(null);
        f45464f = new Extras.c<>(bool);
        f45465g = new Extras.c<>(Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ImageRequest.a m47584a(@NotNull ImageRequest.a aVar, boolean z10) {
        aVar.m47530h().m31060b(f45464f, Boolean.valueOf(z10));
        return aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ImageRequest.a m47585b(@NotNull ImageRequest.a aVar, @NotNull Bitmap.Config config) {
        aVar.m47530h().m31060b(f45460b, config);
        return aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC7479s.a m47586c(@NotNull InterfaceC7479s.a aVar, int i10) {
        return m47601r(aVar, m47599p(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ImageRequest.a m47587d(@NotNull ImageRequest.a aVar, int i10) {
        return m47602s(aVar, m47599p(i10));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m47588e(@NotNull ImageRequest imageRequest) {
        return ((Boolean) C7473m.m31062a(imageRequest, f45464f)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Extras.c<Boolean> m47589f(@NotNull Extras.c.Companion companion) {
        return f45465g;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m47590g(@NotNull ImageRequest imageRequest) {
        return ((Boolean) C7473m.m31062a(imageRequest, f45465g)).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m47591h(@NotNull Options options) {
        return ((Boolean) C7473m.m31063b(options, f45465g)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Bitmap.Config m47592i(@NotNull ImageRequest imageRequest) {
        return (Bitmap.Config) C7473m.m31062a(imageRequest, f45460b);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Bitmap.Config m47593j(@NotNull Options options) {
        return (Bitmap.Config) C7473m.m31063b(options, f45460b);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Extras.c<Bitmap.Config> m47594k(@NotNull Extras.c.Companion companion) {
        return f45460b;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final ColorSpace m47595l(@NotNull Options options) {
        return (ColorSpace) C7473m.m31063b(options, f45461c);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final AbstractC0966l m47596m(@NotNull ImageRequest imageRequest) {
        return (AbstractC0966l) C7473m.m31062a(imageRequest, f45463e);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m47597n(@NotNull Options options) {
        return ((Boolean) C7473m.m31063b(options, f45462d)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final InterfaceC4467d.a m47598o(@NotNull ImageRequest imageRequest) {
        return (InterfaceC4467d.a) C7473m.m31062a(imageRequest, f45459a);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC4467d.a m47599p(int i10) {
        if (i10 <= 0) {
            return InterfaceC4467d.a.f18504b;
        }
        return new C4465b.a(i10, false, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final ImageRequest.a m47600q(@NotNull ImageRequest.a aVar, @NotNull ImageView imageView) {
        return aVar.m47543v(new ImageViewTarget(imageView));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final InterfaceC7479s.a m47601r(@NotNull InterfaceC7479s.a aVar, @NotNull InterfaceC4467d.a aVar2) {
        aVar.getExtras().m31060b(f45459a, aVar2);
        return aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final ImageRequest.a m47602s(@NotNull ImageRequest.a aVar, @NotNull InterfaceC4467d.a aVar2) {
        aVar.m47530h().m31060b(f45459a, aVar2);
        return aVar;
    }
}
