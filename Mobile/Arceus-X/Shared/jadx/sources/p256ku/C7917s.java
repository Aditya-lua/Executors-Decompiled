package p256ku;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.s */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m31665d2 = {"Lku/s;", "Lku/c0;", "Lnt/b;", "continuation", "", "cause", "", "handled", "<init>", "(Lnt/b;Ljava/lang/Throwable;Z)V", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7917s extends C7843c0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29801c = AtomicIntegerFieldUpdater.newUpdater(C7917s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C7917s(@NotNull InterfaceC9557b<?> interfaceC9557b, @Nullable Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + interfaceC9557b + " was cancelled normally");
        }
        super(th2, z10);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m32907e() {
        return f29801c.compareAndSet(this, 0, 1);
    }
}
