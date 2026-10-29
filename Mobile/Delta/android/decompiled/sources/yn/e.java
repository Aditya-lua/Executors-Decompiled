package yn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lyn/e;", "", "<init>", "()V", "Lyn/z;", "appSetIDHelper", "Lyn/k;", "a", "(Lyn/z;)Lyn/k;", "Lyn/r;", "deviceInfoProvider", "Lyn/b;", "c", "(Lyn/r;)Lyn/b;", "Lyn/p;", "deviceIdProvider", "Lyn/a;", "b", "(Lyn/p;)Lyn/a;", "Lyn/t;", "collector", "Lyn/d;", "d", "(Lyn/t;)Lyn/d;", "Lyn/b0;", "monitor", "Lyn/m;", "e", "(Lyn/b0;)Lyn/m;", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {
    @NotNull
    public final k a(@NotNull z appSetIDHelper) {
        Intrinsics.checkNotNullParameter(appSetIDHelper, "appSetIDHelper");
        return appSetIDHelper;
    }

    @NotNull
    public final a b(@NotNull p deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        return deviceIdProvider;
    }

    @NotNull
    public final b c(@NotNull r deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        return deviceInfoProvider;
    }

    @NotNull
    public final d d(@NotNull t collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        return collector;
    }

    @NotNull
    public final m e(@NotNull b0 monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        return monitor;
    }
}
