package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p395qu.C10726i;
import p395qu.C10728j;
import p395qu.C10733l0;

/* JADX INFO: renamed from: ku.e1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m31665d2 = {"T", "Lku/d1;", "", "mode", "", "a", "(Lku/d1;I)V", "Lnt/b;", "delegate", "", "undispatched", "d", "(Lku/d1;Lnt/b;Z)V", "e", "(Lku/d1;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7854e1 {
    /* JADX INFO: renamed from: a */
    public static final <T> void m32626a(@NotNull AbstractC7849d1<? super T> abstractC7849d1, int i10) {
        InterfaceC9557b<? super T> interfaceC9557bMo32591c = abstractC7849d1.mo32591c();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC9557bMo32591c instanceof C10726i) || m32627b(i10) != m32627b(abstractC7849d1.resumeMode)) {
            m32629d(abstractC7849d1, interfaceC9557bMo32591c, z10);
            return;
        }
        C10726i c10726i = (C10726i) interfaceC9557bMo32591c;
        AbstractC7888l0 abstractC7888l0 = c10726i.dispatcher;
        CoroutineContext context = c10726i.getContext();
        if (C10728j.m40869d(abstractC7888l0, context)) {
            C10728j.m40868c(abstractC7888l0, context, abstractC7849d1);
        } else {
            m32630e(abstractC7849d1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32627b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m32628c(int i10) {
        return i10 == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m32629d(@NotNull AbstractC7849d1<? super T> abstractC7849d1, @NotNull InterfaceC9557b<? super T> interfaceC9557b, boolean z10) {
        Object objMo32593h;
        Object objMo32595j = abstractC7849d1.mo32595j();
        Throwable thMo32592g = abstractC7849d1.mo32592g(objMo32595j);
        if (thMo32592g != null) {
            C7347n.Companion companion = C7347n.INSTANCE;
            objMo32593h = C7348o.m30469a(thMo32592g);
        } else {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objMo32593h = abstractC7849d1.mo32593h(objMo32595j);
        }
        Object objM30460b = C7347n.m30460b(objMo32593h);
        if (!z10) {
            interfaceC9557b.resumeWith(objM30460b);
            return;
        }
        Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C10726i c10726i = (C10726i) interfaceC9557b;
        InterfaceC9557b<T> interfaceC9557b2 = c10726i.continuation;
        Object obj = c10726i.countOrElement;
        CoroutineContext context = interfaceC9557b2.getContext();
        Object objM40889i = C10733l0.m40889i(context, obj);
        C7876i3<?> c7876i3M32707m = objM40889i != C10733l0.f38295a ? C7878j0.m32707m(interfaceC9557b2, context, objM40889i) : null;
        try {
            c10726i.continuation.resumeWith(objM30460b);
            Unit unit = Unit.f29331a;
        } finally {
            if (c7876i3M32707m == null || c7876i3M32707m.m32690Y0()) {
                C10733l0.m40886f(context, objM40889i);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m32630e(AbstractC7849d1<?> abstractC7849d1) {
        AbstractC7894m1 abstractC7894m1M32587b = C7846c3.f29696a.m32587b();
        if (abstractC7894m1M32587b.m32803i0()) {
            abstractC7894m1M32587b.m32800a0(abstractC7849d1);
            return;
        }
        abstractC7894m1M32587b.m32802e0(true);
        try {
            m32629d(abstractC7849d1, abstractC7849d1.mo32591c(), true);
            do {
            } while (abstractC7894m1M32587b.m32806t0());
        } catch (Throwable th2) {
            try {
                abstractC7849d1.m32594i(th2);
            } finally {
                abstractC7894m1M32587b.m32798X(true);
            }
        }
    }
}
