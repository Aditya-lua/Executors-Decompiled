package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7850d2;
import p315nt.InterfaceC9557b;
import p617ou.InterfaceC10067q;

/* JADX INFO: renamed from: nu.d0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lnu/d0;", "T", "Lnu/g0;", "Lnu/c;", "Lou/q;", "flow", "Lku/d2;", "job", "<init>", "(Lnu/g0;Lku/d2;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "b", "Lku/d2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9568d0<T> implements InterfaceC9574g0<T>, InterfaceC9565c<T>, InterfaceC10067q<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9574g0<T> f34563a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC7850d2 job;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.g0<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9568d0(@NotNull InterfaceC9574g0<? extends T> interfaceC9574g0, @Nullable InterfaceC7850d2 interfaceC7850d2) {
        this.f34563a = interfaceC9574g0;
        this.job = interfaceC7850d2;
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.f34563a.collect(interfaceC9577i, interfaceC9557b);
    }

    @Override // p617ou.InterfaceC10067q
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC9575h<T> mo37711e(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return C9578i0.m37761e(this, context, capacity, onBufferOverflow);
    }
}
