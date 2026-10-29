package p536x5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p563y1.C12997c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x5.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lku/r0;", "start", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "Lne/x;", "j", "(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lne/x;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12728u {

    /* JADX INFO: renamed from: x5.u$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m39664f = "ListenableFuture.kt", m39665l = {42}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45331t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45332u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> f45333v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C12997c.a<T> f45334w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, C12997c.a<T> aVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f45333v = function2;
            this.f45334w = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f45333v, this.f45334w, interfaceC9557b);
            aVar.f45332u = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to x5.u$a for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r3.f45331t
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                p229jt.C7348o.m30470b(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
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
                p229jt.C7348o.m30470b(r4)
                java.lang.Object r4 = r3.f45332u
                ku.p0 r4 = (p256ku.InterfaceC7906p0) r4
                kotlin.jvm.functions.Function2<ku.p0, nt.b<? super T>, java.lang.Object> r1 = r3.f45333v     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r3.f45331t = r2     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                if (r4 != r0) goto L2b
                return r0
            L2b:
                y1.c$a<T> r0 = r3.f45334w     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r0.m48314c(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L3c
            L31:
                y1.c$a<T> r0 = r3.f45334w
                r0.m48317f(r4)
                goto L3c
            L37:
                y1.c$a<T> r4 = r3.f45334w
                r4.m48315d()
            L3c:
                kotlin.Unit r4 = kotlin.Unit.f29331a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p536x5.C12728u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <V> InterfaceFutureC9440x<V> m47429f(@NotNull final Executor executor, @NotNull final String debugTag, @NotNull final Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        InterfaceFutureC9440x<V> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: x5.r
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C12728u.m47430g(executor, debugTag, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture(...)");
        return interfaceFutureC9440xM48311a;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m47430g(Executor executor, String str, final Function0 function0, final C12997c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.m48312a(new Runnable() { // from class: x5.s
            @Override // java.lang.Runnable
            public final void run() {
                C12728u.m47431h(atomicBoolean);
            }
        }, EnumC12702h.INSTANCE);
        executor.execute(new Runnable() { // from class: x5.t
            @Override // java.lang.Runnable
            public final void run() {
                C12728u.m47432i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static final void m47431h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: i */
    public static final void m47432i(AtomicBoolean atomicBoolean, C12997c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.m48314c(function0.invoke());
        } catch (Throwable th2) {
            aVar.m48317f(th2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final <T> InterfaceFutureC9440x<T> m47433j(@NotNull final CoroutineContext context, @NotNull final EnumC7914r0 start, @NotNull final Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        InterfaceFutureC9440x<T> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: x5.p
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C12728u.m47435l(context, start, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture(...)");
        return interfaceFutureC9440xM48311a;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceFutureC9440x m47434k(CoroutineContext coroutineContext, EnumC7914r0 enumC7914r0, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        if ((i10 & 2) != 0) {
            enumC7914r0 = EnumC7914r0.DEFAULT;
        }
        return m47433j(coroutineContext, enumC7914r0, function2);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m47435l(CoroutineContext coroutineContext, EnumC7914r0 enumC7914r0, Function2 function2, C12997c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
        completer.m48312a(new Runnable() { // from class: x5.q
            @Override // java.lang.Runnable
            public final void run() {
                C12728u.m47436m(interfaceC7850d2);
            }
        }, EnumC12702h.INSTANCE);
        return C7882k.m32780d(C7910q0.m32885a(coroutineContext), null, enumC7914r0, new a(function2, completer, null), 1, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m47436m(InterfaceC7850d2 interfaceC7850d2) {
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
    }
}
