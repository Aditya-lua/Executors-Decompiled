package p563y1;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.InterfaceC7897n;

/* JADX INFO: renamed from: y1.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Ly1/g;", "T", "Ljava/lang/Runnable;", "Lne/x;", "futureToObserve", "Lku/n;", "continuation", "<init>", "(Lne/x;Lku/n;)V", "", "run", "()V", "a", "Lne/x;", "getFutureToObserve", "()Lne/x;", "b", "Lku/n;", "getContinuation", "()Lku/n;", "concurrent-futures-ktx"}, m31666k = 1, m31667mv = {1, 4, 0})
public final class RunnableC13001g<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceFutureC9440x<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7897n<T> continuation;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ku.n<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC13001g(@NotNull InterfaceFutureC9440x<T> futureToObserve, @NotNull InterfaceC7897n<? super T> continuation) {
        Intrinsics.m31982e(futureToObserve, "futureToObserve");
        Intrinsics.m31982e(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            InterfaceC7897n.a.m32819a(this.continuation, null, 1, null);
            return;
        }
        try {
            InterfaceC7897n<T> interfaceC7897n = this.continuation;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(AbstractC12995a.m48293r(this.futureToObserve)));
        } catch (ExecutionException e10) {
            InterfaceC7897n<T> interfaceC7897n2 = this.continuation;
            Throwable thM48323c = C12999e.m48323c(e10);
            C7347n.Companion companion2 = C7347n.INSTANCE;
            interfaceC7897n2.resumeWith(C7347n.m30460b(C7348o.m30469a(thM48323c)));
        }
    }
}
