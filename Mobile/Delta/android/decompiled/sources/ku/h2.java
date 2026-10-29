package ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0013*\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0001*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lku/d2;", "", "invokeImmediately", "Lku/i2;", "handler", "Lku/i1;", "i", "(Lku/d2;ZLku/i2;)Lku/i1;", "parent", "Lku/a0;", "a", "(Lku/d2;)Lku/a0;", "handle", "e", "(Lku/d2;Lku/i1;)Lku/i1;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "g", "(Lku/d2;)V", "f", "(Lkotlin/coroutines/CoroutineContext;)V", "k", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "h", "(Lkotlin/coroutines/CoroutineContext;)Lku/d2;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class h2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements Function1<Throwable, Unit> {
        public a(Object obj) {
            super(1, obj, i2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable th2) {
            ((i2) this.receiver).x(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            d(th2);
            return Unit.f22483a;
        }
    }

    @NotNull
    public static final a0 a(@Nullable d2 d2Var) {
        return new f2(d2Var);
    }

    public static /* synthetic */ a0 b(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return g2.a(d2Var);
    }

    public static final void c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.c(cancellationException);
        }
    }

    public static /* synthetic */ void d(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.c(coroutineContext, cancellationException);
    }

    @NotNull
    public static final i1 e(@NotNull d2 d2Var, @NotNull i1 i1Var) {
        return j(d2Var, false, new k1(i1Var), 1, null);
    }

    public static final void f(@NotNull CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        if (d2Var != null) {
            g2.g(d2Var);
        }
    }

    public static final void g(@NotNull d2 d2Var) {
        if (!d2Var.b()) {
            throw d2Var.m();
        }
    }

    @NotNull
    public static final d2 h(@NotNull CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    @NotNull
    public static final i1 i(@NotNull d2 d2Var, boolean z10, @NotNull i2 i2Var) {
        return d2Var instanceof j2 ? ((j2) d2Var).r0(z10, i2Var) : d2Var.l(i2Var.w(), z10, new a(i2Var));
    }

    public static /* synthetic */ i1 j(d2 d2Var, boolean z10, i2 i2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g2.i(d2Var, z10, i2Var);
    }

    public static final boolean k(@NotNull CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var.b();
        }
        return true;
    }
}
