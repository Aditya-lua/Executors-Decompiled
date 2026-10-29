package p440t3;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t3.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lt3/b;", "", "", "initialValue", "<init>", "(I)V", "c", "()I", "a", "b", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11476b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger delegate;

    public C11476b(int i10) {
        this.delegate = new AtomicInteger(i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m42956a() {
        return this.delegate.decrementAndGet();
    }

    /* JADX INFO: renamed from: b */
    public final int m42957b() {
        return this.delegate.get();
    }

    /* JADX INFO: renamed from: c */
    public final int m42958c() {
        return this.delegate.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public final int m42959d() {
        return this.delegate.incrementAndGet();
    }
}
