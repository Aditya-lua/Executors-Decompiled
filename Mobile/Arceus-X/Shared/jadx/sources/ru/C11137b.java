package ru;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7739h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7839b1;
import p256ku.C7843c0;
import p256ku.C7856e3;
import p256ku.C7885k2;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10711a0;
import p395qu.C10733l0;
import pt.AbstractC10339a;
import pt.C10346h;

/* JADX INFO: renamed from: ru.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a[\u0010\u0011\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)V", "Lqu/a0;", "block", "d", "(Lqu/a0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "", "alwaysRethrow", "f", "(Lqu/a0;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "cause", "b", "(Lqu/a0;Ljava/lang/Throwable;)Z", "Lku/b1;", "", "a", "(Lqu/a0;Lku/b1;)Ljava/lang/Void;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11137b {
    /* JADX INFO: renamed from: a */
    public static final Void m41911a(C10711a0<?> c10711a0, C7839b1 c7839b1) throws Throwable {
        c10711a0.m32758w0(new C7843c0(c7839b1.getCause(), false, 2, null));
        throw c7839b1.getCause();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m41912b(C10711a0<?> c10711a0, Throwable th2) {
        return ((th2 instanceof C7856e3) && ((C7856e3) th2).coroutine == c10711a0) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final <R, T> void m41913c(@NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2, R r8, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        InterfaceC9557b interfaceC9557bM39671a = C10346h.m39671a(interfaceC9557b);
        try {
            CoroutineContext context = interfaceC9557bM39671a.getContext();
            Object objM40889i = C10733l0.m40889i(context, null);
            try {
                C10346h.m39672b(interfaceC9557bM39671a);
                Object objM38804d = !(function2 instanceof AbstractC10339a) ? C10046b.m38804d(function2, r8, interfaceC9557bM39671a) : ((Function2) C7739h0.m32040e(function2, 2)).invoke(r8, interfaceC9557bM39671a);
                C10733l0.m40886f(context, objM40889i);
                if (objM38804d != C10047c.m38805e()) {
                    interfaceC9557bM39671a.resumeWith(C7347n.m30460b(objM38804d));
                }
            } catch (Throwable th2) {
                C10733l0.m40886f(context, objM40889i);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof C7839b1) {
                th = ((C7839b1) th).getCause();
            }
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC9557bM39671a.resumeWith(C7347n.m30460b(C7348o.m30469a(th)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T, R> Object m41914d(@NotNull C10711a0<? super T> c10711a0, R r8, @NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        return m41916f(c10711a0, true, r8, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T, R> Object m41915e(@NotNull C10711a0<? super T> c10711a0, R r8, @NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        return m41916f(c10711a0, false, r8, function2);
    }

    /* JADX INFO: renamed from: f */
    public static final <T, R> Object m41916f(C10711a0<? super T> c10711a0, boolean z10, R r8, Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2) throws Throwable {
        Object c7843c0;
        Object objM32759x0;
        try {
            c7843c0 = !(function2 instanceof AbstractC10339a) ? C10046b.m38804d(function2, r8, c10711a0) : ((Function2) C7739h0.m32040e(function2, 2)).invoke(r8, c10711a0);
        } catch (C7839b1 e10) {
            m41911a(c10711a0, e10);
            throw new C7334d();
        } catch (Throwable th2) {
            c7843c0 = new C7843c0(th2, false, 2, null);
        }
        if (c7843c0 != C10047c.m38805e() && (objM32759x0 = c10711a0.m32759x0(c7843c0)) != C7885k2.f29753b) {
            c10711a0.mo32689X0();
            if (!(objM32759x0 instanceof C7843c0)) {
                return C7885k2.m32789h(objM32759x0);
            }
            if (z10 || m41912b(c10711a0, ((C7843c0) objM32759x0).cause)) {
                throw ((C7843c0) objM32759x0).cause;
            }
            if (c7843c0 instanceof C7843c0) {
                throw ((C7843c0) c7843c0).cause;
            }
            return c7843c0;
        }
        return C10047c.m38805e();
    }
}
