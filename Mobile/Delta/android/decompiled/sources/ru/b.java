package ru;

import jt.d;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.h0;
import ku.b1;
import ku.c0;
import ku.e3;
import ku.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.h;
import qu.a0;
import qu.l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a[\u0010\u0011\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)V", "Lqu/a0;", "block", "d", "(Lqu/a0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "", "alwaysRethrow", "f", "(Lqu/a0;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "cause", "b", "(Lqu/a0;Ljava/lang/Throwable;)Z", "Lku/b1;", "", "a", "(Lqu/a0;Lku/b1;)Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final Void a(a0<?> a0Var, b1 b1Var) throws Throwable {
        a0Var.w0(new c0(b1Var.getCause(), false, 2, null));
        throw b1Var.getCause();
    }

    public static final boolean b(a0<?> a0Var, Throwable th2) {
        return ((th2 instanceof e3) && ((e3) th2).coroutine == a0Var) ? false : true;
    }

    public static final <R, T> void c(@NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2, R r8, @NotNull nt.b<? super T> bVar) {
        nt.b bVarA = h.a(bVar);
        try {
            CoroutineContext context = bVarA.getContext();
            Object objI = l0.i(context, null);
            try {
                h.b(bVarA);
                Object objD = !(function2 instanceof pt.a) ? ot.b.d(function2, r8, bVarA) : ((Function2) h0.e(function2, 2)).invoke(r8, bVarA);
                l0.f(context, objI);
                if (objD != c.e()) {
                    bVarA.resumeWith(n.b(objD));
                }
            } catch (Throwable th2) {
                l0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof b1) {
                th = ((b1) th).getCause();
            }
            n.Companion companion = n.INSTANCE;
            bVarA.resumeWith(n.b(o.a(th)));
        }
    }

    @Nullable
    public static final <T, R> Object d(@NotNull a0<? super T> a0Var, R r8, @NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2) {
        return f(a0Var, true, r8, function2);
    }

    @Nullable
    public static final <T, R> Object e(@NotNull a0<? super T> a0Var, R r8, @NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2) {
        return f(a0Var, false, r8, function2);
    }

    public static final <T, R> Object f(a0<? super T> a0Var, boolean z10, R r8, Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2) throws Throwable {
        Object c0Var;
        Object objX0;
        try {
            c0Var = !(function2 instanceof pt.a) ? ot.b.d(function2, r8, a0Var) : ((Function2) h0.e(function2, 2)).invoke(r8, a0Var);
        } catch (b1 e10) {
            a(a0Var, e10);
            throw new d();
        } catch (Throwable th2) {
            c0Var = new c0(th2, false, 2, null);
        }
        if (c0Var != c.e() && (objX0 = a0Var.x0(c0Var)) != k2.b) {
            a0Var.X0();
            if (!(objX0 instanceof c0)) {
                return k2.h(objX0);
            }
            if (z10 || b(a0Var, ((c0) objX0).cause)) {
                throw ((c0) objX0).cause;
            }
            if (c0Var instanceof c0) {
                throw ((c0) c0Var).cause;
            }
            return c0Var;
        }
        return c.e();
    }
}
