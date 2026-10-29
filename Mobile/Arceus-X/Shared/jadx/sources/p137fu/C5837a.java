package p137fu;

import eu.AbstractC5215a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lfu/a;", "Leu/a;", "<init>", "()V", "", "from", "until", "h", "(II)I", "", "d", "(D)D", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5837a extends AbstractC5215a {
    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: d */
    public double mo24178d(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: h */
    public int mo24180h(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // eu.AbstractC5215a
    @NotNull
    /* JADX INFO: renamed from: i */
    public Random mo24174i() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
