package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"Lew/o;", "Lew/m0;", "delegate", "<init>", "(Lew/m0;)V", "j", "(Lew/m0;)Lew/o;", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)Lew/m0;", BuildConfig.FLAVOR, "e", "()Z", "c", "()J", "deadlineNanoTime", "d", "(J)Lew/m0;", "b", "()Lew/m0;", "a", BuildConfig.FLAVOR, "f", "()V", "Lew/m0;", "i", "setDelegate", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class o extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public m0 delegate;

    public o(@NotNull m0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // ew.m0
    @NotNull
    public m0 a() {
        return this.delegate.a();
    }

    @Override // ew.m0
    @NotNull
    public m0 b() {
        return this.delegate.b();
    }

    @Override // ew.m0
    public long c() {
        return this.delegate.c();
    }

    @Override // ew.m0
    @NotNull
    public m0 d(long deadlineNanoTime) {
        return this.delegate.d(deadlineNanoTime);
    }

    @Override // ew.m0
    /* JADX INFO: renamed from: e */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // ew.m0
    public void f() throws InterruptedIOException {
        this.delegate.f();
    }

    @Override // ew.m0
    @NotNull
    public m0 g(long timeout, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.delegate.g(timeout, unit);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final m0 getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final o j(@NotNull m0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
