package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ku.v2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lku/v2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lku/l0;", "dispatcher", "Lku/n;", "", "continuation", "<init>", "(Lku/l0;Lku/n;)V", "run", "()V", "a", "Lku/l0;", "b", "Lku/n;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class RunnableC7932v2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7897n<Unit> continuation;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC7932v2(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull InterfaceC7897n<? super Unit> interfaceC7897n) {
        this.dispatcher = abstractC7888l0;
        this.continuation = interfaceC7897n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.mo32818x(this.dispatcher, Unit.f29331a);
    }
}
