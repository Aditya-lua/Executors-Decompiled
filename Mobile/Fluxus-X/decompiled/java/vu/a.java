package vu;

import com.github.luben.zstd.BuildConfig;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvu/a;", "Luu/a;", "<init>", "()V", BuildConfig.FLAVOR, "from", "until", "h", "(II)I", BuildConfig.FLAVOR, "d", "(D)D", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends uu.a {
    @Override // uu.d
    public double d(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // uu.d
    public int h(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // uu.a
    @NotNull
    public Random i() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
