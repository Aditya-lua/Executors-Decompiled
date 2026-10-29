package p617ou;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7739h0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10733l0;
import pt.AbstractC10339a;
import pt.C10346h;

/* JADX INFO: renamed from: ou.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"T", "Lnu/h;", "Lou/e;", "b", "(Lnu/h;)Lou/e;", "Lnu/i;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;)Lnu/i;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lnt/b;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10056f {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> AbstractC10055e<T> m38821b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        AbstractC10055e<T> abstractC10055e = interfaceC9575h instanceof AbstractC10055e ? (AbstractC10055e) interfaceC9575h : null;
        if (abstractC10055e == null) {
            return new C10058h(interfaceC9575h, null, 0, null, 14, null);
        }
        return abstractC10055e;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, V> Object m38822c(@NotNull CoroutineContext coroutineContext, V v5, @NotNull Object obj, @NotNull Function2<? super V, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        Object objM40889i = C10733l0.m40889i(coroutineContext, obj);
        try {
            C10049a0 c10049a0 = new C10049a0(interfaceC9557b, coroutineContext);
            Object objM38804d = !(function2 instanceof AbstractC10339a) ? C10046b.m38804d(function2, v5, c10049a0) : ((Function2) C7739h0.m32040e(function2, 2)).invoke(v5, c10049a0);
            C10733l0.m40886f(coroutineContext, objM40889i);
            if (objM38804d == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM38804d;
        } catch (Throwable th2) {
            C10733l0.m40886f(coroutineContext, objM40889i);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m38823d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, InterfaceC9557b interfaceC9557b, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = C10733l0.m40887g(coroutineContext);
        }
        return m38822c(coroutineContext, obj, obj2, function2, interfaceC9557b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9577i<T> m38824e(InterfaceC9577i<? super T> interfaceC9577i, CoroutineContext coroutineContext) {
        return ((interfaceC9577i instanceof C10076z) || (interfaceC9577i instanceof C10069s)) ? interfaceC9577i : new C10053c0(interfaceC9577i, coroutineContext);
    }
}
