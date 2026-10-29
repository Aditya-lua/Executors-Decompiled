package x5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lme/x;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lme/x;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {
    public static final <T> me.x<T> e(final Executor executor, final Function0<? extends T> function0) {
        me.x<T> xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: x5.w0
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return z0.f(executor, function0, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xVarA, "getFuture(...)");
        return xVarA;
    }

    public static final Unit f(Executor executor, final Function0 function0, final y1.c.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: x5.x0
            @Override // java.lang.Runnable
            public final void run() {
                z0.g(atomicBoolean);
            }
        }, h.INSTANCE);
        executor.execute(new Runnable() { // from class: x5.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0.h(atomicBoolean, it, function0);
            }
        });
        return Unit.f22483a;
    }

    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void h(AtomicBoolean atomicBoolean, y1.c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}
