package p536x5;

import androidx.p616lifecycle.C0949d0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p563y1.C12997c;

/* JADX INFO: renamed from: x5.e0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lx5/l0;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", "Lx5/a0;", "c", "(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12697e0 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC12689a0 m47355c(@NotNull final InterfaceC12711l0 tracer, @NotNull final String label, @NotNull final Executor executor, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final C0949d0 c0949d0 = new C0949d0(InterfaceC12689a0.f45212b);
        InterfaceFutureC9440x interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: x5.c0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C12697e0.m47356d(executor, tracer, label, block, c0949d0, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture(...)");
        return new C12691b0(c0949d0, interfaceFutureC9440xM48311a);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m47356d(Executor executor, final InterfaceC12711l0 interfaceC12711l0, final String str, final Function0 function0, final C0949d0 c0949d0, final C12997c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: x5.d0
            @Override // java.lang.Runnable
            public final void run() {
                C12697e0.m47357e(interfaceC12711l0, str, function0, c0949d0, completer);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m47357e(InterfaceC12711l0 interfaceC12711l0, String str, Function0 function0, C0949d0 c0949d0, C12997c.a aVar) {
        boolean zIsEnabled = interfaceC12711l0.isEnabled();
        if (zIsEnabled) {
            try {
                interfaceC12711l0.mo47330a(str);
            } catch (Throwable th2) {
                if (zIsEnabled) {
                    interfaceC12711l0.mo47333d();
                }
                throw th2;
            }
        }
        try {
            function0.invoke();
            InterfaceC12689a0.b.c cVar = InterfaceC12689a0.f45211a;
            c0949d0.mo4861m(cVar);
            aVar.m48314c(cVar);
        } catch (Throwable th3) {
            c0949d0.mo4861m(new InterfaceC12689a0.b.a(th3));
            aVar.m48317f(th3);
        }
        Unit unit = Unit.f29331a;
        if (zIsEnabled) {
            interfaceC12711l0.mo47333d();
        }
    }
}
