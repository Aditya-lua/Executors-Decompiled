package p395qu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7832a;
import p256ku.C7839b1;
import p256ku.C7853e0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: qu.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lqu/a0;", "T", "Lku/a;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lnt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V", "", "state", "", "P", "(Ljava/lang/Object;)V", "X0", "()V", "T0", "d", "Lnt/b;", "getCallerFrame", "()Lpt/e;", "callerFrame", "", "s0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C10711a0<T> extends AbstractC7832a<T> implements InterfaceC10343e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<T> uCont;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10711a0(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        super(coroutineContext, true, true);
        this.uCont = interfaceC9557b;
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: P */
    public void mo32584P(@Nullable Object state) throws C7839b1 {
        C10728j.m40867b(C10046b.m38803c(this.uCont), C7853e0.m32623a(state, this.uCont));
    }

    @Override // p256ku.AbstractC7832a
    /* JADX INFO: renamed from: T0 */
    public void mo32551T0(@Nullable Object state) {
        InterfaceC9557b<T> interfaceC9557b = this.uCont;
        interfaceC9557b.resumeWith(C7853e0.m32623a(state, interfaceC9557b));
    }

    /* JADX INFO: renamed from: X0 */
    public void mo32689X0() {
    }

    @Override // pt.InterfaceC10343e
    @Nullable
    public final InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<T> interfaceC9557b = this.uCont;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: s0 */
    public final boolean mo32642s0() {
        return true;
    }
}
