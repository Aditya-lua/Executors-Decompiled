package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B;\b\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmv/l;", BuildConfig.FLAVOR, "Lrv/o;", "delegate", "<init>", "(Lrv/o;)V", BuildConfig.FLAVOR, "maxIdleConnections", BuildConfig.FLAVOR, "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lqv/d;", "taskRunner", "Lrv/g;", "connectionListener", "(IJLjava/util/concurrent/TimeUnit;Lqv/d;Lrv/g;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "a", "()I", "Lrv/o;", "b", "()Lrv/o;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rv.o delegate;

    public l(@NotNull rv.o delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final int a() {
        return this.delegate.d();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final rv.o getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, @NotNull TimeUnit timeUnit, @NotNull qv.d taskRunner, @NotNull rv.g connectionListener) {
        this(new rv.o(taskRunner, i10, j10, timeUnit, connectionListener));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, @NotNull TimeUnit timeUnit) {
        this(i10, j10, timeUnit, qv.d.f30482m, rv.g.INSTANCE.a());
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public l() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
