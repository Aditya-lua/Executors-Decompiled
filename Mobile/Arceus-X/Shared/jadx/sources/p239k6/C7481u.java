package p239k6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p287m6.InterfaceC8441o;

/* JADX INFO: renamed from: k6.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lk6/l$c;", "", "a", "Lk6/l$c;", "bitmapFactoryMaxParallelismKey", "Lm6/o;", "b", "bitmapFactoryExifOrientationStrategyKey", "", "c", "imageDecoderEnabledKey", "", "d", "memoryCacheMaxSizePercentWhileInBackgroundKey", "Lk6/w$a;", "(Lk6/w$a;)I", "bitmapFactoryMaxParallelism", "(Lk6/w$a;)Lm6/o;", "bitmapFactoryExifOrientationStrategy", "(Lk6/w$a;)Z", "imageDecoderEnabled", "(Lk6/w$a;)D", "memoryCacheMaxSizePercentWhileInBackground", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7481u {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Extras.c<Integer> f28787a = new Extras.c<>(4);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Extras.c<InterfaceC8441o> f28788b = new Extras.c<>(InterfaceC8441o.f31120c);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Extras.c<Boolean> f28789c = new Extras.c<>(Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Extras.c<Double> f28790d = new Extras.c<>(Double.valueOf(1.0d));

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8441o m31082a(@NotNull C7483w.Options options) {
        return (InterfaceC8441o) C7473m.m31064c(options.getDefaults().getExtras(), f28788b);
    }

    /* JADX INFO: renamed from: b */
    public static final int m31083b(@NotNull C7483w.Options options) {
        return ((Number) C7473m.m31064c(options.getDefaults().getExtras(), f28787a)).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31084c(@NotNull C7483w.Options options) {
        return ((Boolean) C7473m.m31064c(options.getDefaults().getExtras(), f28789c)).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static final double m31085d(@NotNull C7483w.Options options) {
        return ((Number) C7473m.m31064c(options.getDefaults().getExtras(), f28790d)).doubleValue();
    }
}
