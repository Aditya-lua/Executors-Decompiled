package eu;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Leu/a;", "Leu/d;", "<init>", "()V", "", "bitCount", "b", "(I)I", "f", "()I", "until", "g", "", "c", "()D", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC5215a extends AbstractC5218d {
    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: b */
    public int mo24170b(int bitCount) {
        return C5219e.m24186f(mo24174i().nextInt(), bitCount);
    }

    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: c */
    public double mo24171c() {
        return mo24174i().nextDouble();
    }

    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: f */
    public int mo24172f() {
        return mo24174i().nextInt();
    }

    @Override // eu.AbstractC5218d
    /* JADX INFO: renamed from: g */
    public int mo24173g(int until) {
        return mo24174i().nextInt(until);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract Random mo24174i();
}
