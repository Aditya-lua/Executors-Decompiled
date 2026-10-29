package k6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lk6/l$c;", "", "a", "Lk6/l$c;", "bitmapFactoryMaxParallelismKey", "Lm6/o;", "b", "bitmapFactoryExifOrientationStrategyKey", "", "c", "imageDecoderEnabledKey", "", "d", "memoryCacheMaxSizePercentWhileInBackgroundKey", "Lk6/w$a;", "(Lk6/w$a;)I", "bitmapFactoryMaxParallelism", "(Lk6/w$a;)Lm6/o;", "bitmapFactoryExifOrientationStrategy", "(Lk6/w$a;)Z", "imageDecoderEnabled", "(Lk6/w$a;)D", "memoryCacheMaxSizePercentWhileInBackground", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Integer> f22220a = new Extras.c<>(4);

    @NotNull
    public static final Extras.c<m6.o> b = new Extras.c<>(m6.o.f23991c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f22221c = new Extras.c<>(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Double> f22222d = new Extras.c<>(Double.valueOf(1.0d));

    @NotNull
    public static final m6.o a(@NotNull w.Options options) {
        return (m6.o) m.c(options.getDefaults().getExtras(), b);
    }

    public static final int b(@NotNull w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f22220a)).intValue();
    }

    public static final boolean c(@NotNull w.Options options) {
        return ((Boolean) m.c(options.getDefaults().getExtras(), f22221c)).booleanValue();
    }

    public static final double d(@NotNull w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f22222d)).doubleValue();
    }
}
