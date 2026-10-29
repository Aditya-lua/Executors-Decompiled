package ku;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lku/g;", "T", "Lku/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lku/m1;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lku/m1;)V", "", "state", "", "P", "(Ljava/lang/Object;)V", "X0", "()Ljava/lang/Object;", "d", "Ljava/lang/Thread;", "e", "Lku/m1;", "", "s0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final m1 eventLoop;

    public g(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable m1 m1Var) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = m1Var;
    }

    @Override // ku.j2
    public void P(@Nullable Object state) {
        if (Intrinsics.c(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        c.a();
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T X0() throws Throwable {
        c.a();
        try {
            m1 m1Var = this.eventLoop;
            if (m1Var != null) {
                m1.f0(m1Var, false, 1, null);
            }
            while (true) {
                try {
                    m1 m1Var2 = this.eventLoop;
                    long jR0 = m1Var2 != null ? m1Var2.r0() : Long.MAX_VALUE;
                    if (d()) {
                        break;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jR0);
                    if (Thread.interrupted()) {
                        S(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    m1 m1Var3 = this.eventLoop;
                    if (m1Var3 != null) {
                        m1.Y(m1Var3, false, 1, null);
                    }
                    throw th2;
                }
            }
            m1 m1Var4 = this.eventLoop;
            if (m1Var4 != null) {
                m1.Y(m1Var4, false, 1, null);
            }
            c.a();
            T t8 = (T) k2.h(l0());
            c0 c0Var = t8 instanceof c0 ? (c0) t8 : null;
            if (c0Var == null) {
                return t8;
            }
            throw c0Var.cause;
        } catch (Throwable th3) {
            c.a();
            throw th3;
        }
    }

    @Override // ku.j2
    public boolean s0() {
        return true;
    }
}
