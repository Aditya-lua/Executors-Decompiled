package p395qu;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7894m1;
import p256ku.C7839b1;
import p256ku.C7846c3;
import p256ku.C7853e0;
import p256ku.C7876i3;
import p256ku.C7878j0;
import p256ku.InterfaceC7850d2;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: qu.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, m31665d2 = {"Lku/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "c", "(Lku/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "d", "(Lku/l0;Lkotlin/coroutines/CoroutineContext;)Z", "T", "Lnt/b;", "Ljt/n;", "result", "b", "(Lnt/b;Ljava/lang/Object;)V", "Lqu/i;", "e", "(Lqu/i;)Z", "Lqu/e0;", "a", "Lqu/e0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10728j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f38284a = new C10719e0("UNDEFINED");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f38285b = new C10719e0("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: b */
    public static final <T> void m40867b(@NotNull InterfaceC9557b<? super T> interfaceC9557b, @NotNull Object obj) throws C7839b1 {
        if (!(interfaceC9557b instanceof C10726i)) {
            interfaceC9557b.resumeWith(obj);
            return;
        }
        C10726i c10726i = (C10726i) interfaceC9557b;
        Object objM32624b = C7853e0.m32624b(obj);
        if (m40869d(c10726i.dispatcher, c10726i.getContext())) {
            c10726i._state = objM32624b;
            c10726i.resumeMode = 1;
            m40868c(c10726i.dispatcher, c10726i.getContext(), c10726i);
            return;
        }
        AbstractC7894m1 abstractC7894m1M32587b = C7846c3.f29696a.m32587b();
        if (abstractC7894m1M32587b.m32803i0()) {
            c10726i._state = objM32624b;
            c10726i.resumeMode = 1;
            abstractC7894m1M32587b.m32800a0(c10726i);
            return;
        }
        abstractC7894m1M32587b.m32802e0(true);
        try {
            InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) c10726i.getContext().get(InterfaceC7850d2.INSTANCE);
            if (interfaceC7850d2 == null || interfaceC7850d2.mo32556b()) {
                InterfaceC9557b<T> interfaceC9557b2 = c10726i.continuation;
                Object obj2 = c10726i.countOrElement;
                CoroutineContext context = interfaceC9557b2.getContext();
                Object objM40889i = C10733l0.m40889i(context, obj2);
                C7876i3<?> c7876i3M32707m = objM40889i != C10733l0.f38295a ? C7878j0.m32707m(interfaceC9557b2, context, objM40889i) : null;
                try {
                    c10726i.continuation.resumeWith(obj);
                    Unit unit = Unit.f29331a;
                    if (c7876i3M32707m == null || c7876i3M32707m.m32690Y0()) {
                        C10733l0.m40886f(context, objM40889i);
                    }
                } catch (Throwable th2) {
                    if (c7876i3M32707m == null || c7876i3M32707m.m32690Y0()) {
                        C10733l0.m40886f(context, objM40889i);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionMo32600m = interfaceC7850d2.mo32600m();
                c10726i.mo32590a(objM32624b, cancellationExceptionMo32600m);
                C7347n.Companion companion = C7347n.INSTANCE;
                c10726i.resumeWith(C7347n.m30460b(C7348o.m30469a(cancellationExceptionMo32600m)));
            }
            while (abstractC7894m1M32587b.m32806t0()) {
            }
        } catch (Throwable th3) {
            try {
                c10726i.m32594i(th3);
            } finally {
                abstractC7894m1M32587b.m32798X(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m40868c(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) throws C7839b1 {
        try {
            abstractC7888l0.mo6246w(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new C7839b1(th2, abstractC7888l0, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m40869d(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull CoroutineContext coroutineContext) throws C7839b1 {
        try {
            return abstractC7888l0.mo6245H(coroutineContext);
        } catch (Throwable th2) {
            throw new C7839b1(th2, abstractC7888l0, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m40870e(@NotNull C10726i<? super Unit> c10726i) {
        Unit unit = Unit.f29331a;
        AbstractC7894m1 abstractC7894m1M32587b = C7846c3.f29696a.m32587b();
        if (abstractC7894m1M32587b.m32804l0()) {
            return false;
        }
        if (abstractC7894m1M32587b.m32803i0()) {
            c10726i._state = unit;
            c10726i.resumeMode = 1;
            abstractC7894m1M32587b.m32800a0(c10726i);
            return true;
        }
        abstractC7894m1M32587b.m32802e0(true);
        try {
            c10726i.run();
            do {
            } while (abstractC7894m1M32587b.m32806t0());
        } catch (Throwable th2) {
            try {
                c10726i.m32594i(th2);
            } finally {
                abstractC7894m1M32587b.m32798X(true);
            }
        }
        return false;
    }
}
