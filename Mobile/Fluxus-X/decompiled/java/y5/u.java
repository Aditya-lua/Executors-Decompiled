package y5;

import av.d2;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lav/r0;", "start", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, "block", "Lpe/x;", "j", "(Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;)Lpe/x;", "V", "Ljava/util/concurrent/Executor;", BuildConfig.FLAVOR, "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lpe/x;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37548t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37549u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<av.p0, eu.b<? super T>, Object> f37550v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ y1.c.a<T> f37551w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super av.p0, ? super eu.b<? super T>, ? extends Object> function2, y1.c.a<T> aVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f37550v = function2;
            this.f37551w = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f37550v, this.f37551w, bVar);
            aVar.f37549u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to y5.u$a for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r3.f37548t
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                zt.o.b(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L2b
            Lf:
                r4 = move-exception
                goto L31
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                zt.o.b(r4)
                java.lang.Object r4 = r3.f37549u
                av.p0 r4 = (av.p0) r4
                kotlin.jvm.functions.Function2<av.p0, eu.b<? super T>, java.lang.Object> r1 = r3.f37550v     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r3.f37548t = r2     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                if (r4 != r0) goto L2b
                return r0
            L2b:
                y1.c$a<T> r0 = r3.f37551w     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r0.c(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L3c
            L31:
                y1.c$a<T> r0 = r3.f37551w
                r0.f(r4)
                goto L3c
            L37:
                y1.c$a<T> r4 = r3.f37551w
                r4.d()
            L3c:
                kotlin.Unit r4 = p001kotlin.Unit.f21506a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <V> pe.x<V> f(@NotNull final Executor executor, @NotNull final String debugTag, @NotNull final Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        pe.x<V> xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: y5.r
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return u.g(executor, debugTag, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xVarA, "getFuture(...)");
        return xVarA;
    }

    public static final Object g(Executor executor, String str, final Function0 function0, final y1.c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: y5.s
            @Override // java.lang.Runnable
            public final void run() {
                u.h(atomicBoolean);
            }
        }, h.INSTANCE);
        executor.execute(new Runnable() { // from class: y5.t
            @Override // java.lang.Runnable
            public final void run() {
                u.i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void i(AtomicBoolean atomicBoolean, y1.c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    @NotNull
    public static final <T> pe.x<T> j(@NotNull final CoroutineContext context, @NotNull final av.r0 start, @NotNull final Function2<? super av.p0, ? super eu.b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        pe.x<T> xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: y5.p
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return u.l(context, start, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xVarA, "getFuture(...)");
        return xVarA;
    }

    public static /* synthetic */ pe.x k(CoroutineContext coroutineContext, av.r0 r0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        if ((i10 & 2) != 0) {
            r0Var = av.r0.DEFAULT;
        }
        return j(coroutineContext, r0Var, function2);
    }

    public static final Object l(CoroutineContext coroutineContext, av.r0 r0Var, Function2 function2, y1.c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        completer.a(new Runnable() { // from class: y5.q
            @Override // java.lang.Runnable
            public final void run() {
                u.m(d2Var);
            }
        }, h.INSTANCE);
        return av.k.d(av.q0.a(coroutineContext), null, r0Var, new a(function2, completer, null), 1, null);
    }

    public static final void m(d2 d2Var) {
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }
}
