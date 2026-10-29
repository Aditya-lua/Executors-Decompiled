package p256ku;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lku/g;", "T", "Lku/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lku/m1;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lku/m1;)V", "", "state", "", "P", "(Ljava/lang/Object;)V", "X0", "()Ljava/lang/Object;", "d", "Ljava/lang/Thread;", "e", "Lku/m1;", "", "s0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7862g<T> extends AbstractC7832a<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final AbstractC7894m1 eventLoop;

    public C7862g(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable AbstractC7894m1 abstractC7894m1) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = abstractC7894m1;
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: P */
    public void mo32584P(@Nullable Object state) {
        if (Intrinsics.m31980c(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        C7842c.m32577a();
        LockSupport.unpark(thread);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final T m32641X0() throws Throwable {
        C7842c.m32577a();
        try {
            AbstractC7894m1 abstractC7894m1 = this.eventLoop;
            if (abstractC7894m1 != null) {
                AbstractC7894m1.m32797f0(abstractC7894m1, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC7894m1 abstractC7894m2 = this.eventLoop;
                    long jMo32805r0 = abstractC7894m2 != null ? abstractC7894m2.mo32805r0() : Long.MAX_VALUE;
                    if (mo32598d()) {
                        break;
                    }
                    C7842c.m32577a();
                    LockSupport.parkNanos(this, jMo32805r0);
                    if (Thread.interrupted()) {
                        m32732S(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    AbstractC7894m1 abstractC7894m3 = this.eventLoop;
                    if (abstractC7894m3 != null) {
                        AbstractC7894m1.m32796Y(abstractC7894m3, false, 1, null);
                    }
                    throw th2;
                }
            }
            AbstractC7894m1 abstractC7894m4 = this.eventLoop;
            if (abstractC7894m4 != null) {
                AbstractC7894m1.m32796Y(abstractC7894m4, false, 1, null);
            }
            C7842c.m32577a();
            T t8 = (T) C7885k2.m32789h(m32750l0());
            C7843c0 c7843c0 = t8 instanceof C7843c0 ? (C7843c0) t8 : null;
            if (c7843c0 == null) {
                return t8;
            }
            throw c7843c0.cause;
        } catch (Throwable th3) {
            C7842c.m32577a();
            throw th3;
        }
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: s0 */
    public boolean mo32642s0() {
        return true;
    }
}
