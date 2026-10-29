package p617ou;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: ou.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lou/a0;", "T", "Lnt/b;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lnt/b;Lkotlin/coroutines/CoroutineContext;)V", "Ljt/n;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "a", "Lnt/b;", "b", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lpt/e;", "callerFrame", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10049a0<T> implements InterfaceC9557b<T>, InterfaceC10343e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<T> uCont;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10049a0(@NotNull InterfaceC9557b<? super T> interfaceC9557b, @NotNull CoroutineContext coroutineContext) {
        this.uCont = interfaceC9557b;
        this.context = coroutineContext;
    }

    @Override // pt.InterfaceC10343e
    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<T> interfaceC9557b = this.uCont;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // p315nt.InterfaceC9557b
    public void resumeWith(@NotNull Object result) {
        this.uCont.resumeWith(result);
    }
}
