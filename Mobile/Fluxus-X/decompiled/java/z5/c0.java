package z5;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz5/c0;", "T", "Ljava/lang/Runnable;", "Lpe/x;", "futureToObserve", "Lav/n;", "continuation", "<init>", "(Lpe/x;Lav/n;)V", BuildConfig.FLAVOR, "run", "()V", "a", "Lpe/x;", "getFutureToObserve", "()Lpe/x;", "b", "Lav/n;", "getContinuation", "()Lav/n;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pe.x<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final av.n<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@NotNull pe.x<T> futureToObserve, @NotNull av.n<? super T> continuation) {
        Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            av.n.a.a(this.continuation, null, 1, null);
            return;
        }
        try {
            av.n<T> nVar = this.continuation;
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(s1.e(this.futureToObserve)));
        } catch (ExecutionException e10) {
            av.n<T> nVar2 = this.continuation;
            zt.n.Companion companion2 = zt.n.INSTANCE;
            nVar2.resumeWith(zt.n.b(zt.o.a(s1.f(e10))));
        }
    }
}
