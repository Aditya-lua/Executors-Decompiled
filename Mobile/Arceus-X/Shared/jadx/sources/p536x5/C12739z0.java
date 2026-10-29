package p536x5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import p563y1.C12997c;

/* JADX INFO: renamed from: x5.z0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lne/x;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12739z0 {
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceFutureC9440x<T> m47463e(final Executor executor, final Function0<? extends T> function0) {
        InterfaceFutureC9440x<T> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: x5.w0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C12739z0.m47464f(executor, function0, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture(...)");
        return interfaceFutureC9440xM48311a;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m47464f(Executor executor, final Function0 function0, final C12997c.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.m48312a(new Runnable() { // from class: x5.x0
            @Override // java.lang.Runnable
            public final void run() {
                C12739z0.m47465g(atomicBoolean);
            }
        }, EnumC12702h.INSTANCE);
        executor.execute(new Runnable() { // from class: x5.y0
            @Override // java.lang.Runnable
            public final void run() {
                C12739z0.m47466h(atomicBoolean, it, function0);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m47465g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: h */
    public static final void m47466h(AtomicBoolean atomicBoolean, C12997c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.m48314c(function0.invoke());
        } catch (Throwable th2) {
            aVar.m48317f(th2);
        }
    }
}
