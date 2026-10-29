package y1;

import java.util.concurrent.ExecutionException;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.n;
import me.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly1/g;", "T", "Ljava/lang/Runnable;", "Lme/x;", "futureToObserve", "Lku/n;", "continuation", "<init>", "(Lme/x;Lku/n;)V", "", "run", "()V", "a", "Lme/x;", "getFutureToObserve", "()Lme/x;", "b", "Lku/n;", "getContinuation", "()Lku/n;", "concurrent-futures-ktx"}, k = 1, mv = {1, 4, 0})
public final class g<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull x<T> futureToObserve, @NotNull n<? super T> continuation) {
        Intrinsics.e(futureToObserve, "futureToObserve");
        Intrinsics.e(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            n.a.a(this.continuation, null, 1, null);
            return;
        }
        try {
            n<T> nVar = this.continuation;
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(a.r(this.futureToObserve)));
        } catch (ExecutionException e10) {
            n<T> nVar2 = this.continuation;
            Throwable thC = e.c(e10);
            jt.n.Companion companion2 = jt.n.INSTANCE;
            nVar2.resumeWith(jt.n.b(o.a(thC)));
        }
    }
}
