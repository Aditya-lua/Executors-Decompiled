package l6;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll6/l$c;", BuildConfig.FLAVOR, "a", "Ll6/l$c;", "bitmapFactoryMaxParallelismKey", "Ln6/o;", "b", "bitmapFactoryExifOrientationStrategyKey", BuildConfig.FLAVOR, "c", "imageDecoderEnabledKey", BuildConfig.FLAVOR, "d", "memoryCacheMaxSizePercentWhileInBackgroundKey", "Ll6/w$a;", "(Ll6/w$a;)I", "bitmapFactoryMaxParallelism", "(Ll6/w$a;)Ln6/o;", "bitmapFactoryExifOrientationStrategy", "(Ll6/w$a;)Z", "imageDecoderEnabled", "(Ll6/w$a;)D", "memoryCacheMaxSizePercentWhileInBackground", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Integer> f21937a = new Extras.c<>(4);

    @NotNull
    public static final Extras.c<n6.o> b = new Extras.c<>(n6.o.f25441c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f21938c = new Extras.c<>(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Double> f21939d = new Extras.c<>(Double.valueOf(1.0d));

    @NotNull
    public static final n6.o a(@NotNull w.Options options) {
        return (n6.o) m.c(options.getDefaults().getExtras(), b);
    }

    public static final int b(@NotNull w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f21937a)).intValue();
    }

    public static final boolean c(@NotNull w.Options options) {
        return ((Boolean) m.c(options.getDefaults().getExtras(), f21938c)).booleanValue();
    }

    public static final double d(@NotNull w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f21939d)).doubleValue();
    }
}
