package t3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lt3/b0;", "T", "", "Lku/p0;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lnt/b;", "consumeMessage", "<init>", "(Lku/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Lku/p0;", "b", "Lkotlin/jvm/functions/Function2;", "Lmu/g;", "c", "Lmu/g;", "messageQueue", "Lt3/b;", "d", "Lt3/b;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, nt.b<? super Unit>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.g<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.b remainingMessages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Unit> f31350i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b0<T> f31351j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Throwable, Unit> f31352k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1, b0<T> b0Var, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f31350i = function1;
            this.f31351j = b0Var;
            this.f31352k = function2;
        }

        public final void a(@Nullable Throwable th2) {
            Unit unit;
            this.f31350i.invoke(th2);
            this.f31351j.messageQueue.F(th2);
            do {
                Object objF = mu.k.f(this.f31351j.messageQueue.C());
                if (objF != null) {
                    this.f31352k.invoke((T) objF, th2);
                    unit = Unit.f22483a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31353t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31354u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b0<T> f31355v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0<T> b0Var, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f31355v = b0Var;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            return new b(this.f31355v, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r5.f31354u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f31353t
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                jt.o.b(r6)
                goto L51
            L22:
                jt.o.b(r6)
                t3.b0<T> r6 = r5.f31355v
                t3.b r6 = t3.b0.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                t3.b0<T> r6 = r5.f31355v
                ku.p0 r6 = t3.b0.d(r6)
                ku.q0.h(r6)
                t3.b0<T> r6 = r5.f31355v
                kotlin.jvm.functions.Function2 r1 = t3.b0.a(r6)
                t3.b0<T> r6 = r5.f31355v
                mu.g r6 = t3.b0.b(r6)
                r5.f31353t = r1
                r5.f31354u = r3
                java.lang.Object r6 = r6.D(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f31353t = r4
                r5.f31354u = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                t3.b0<T> r6 = r5.f31355v
                t3.b r6 = t3.b0.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull p0 scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super nt.b<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = mu.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new t3.b(0);
        d2 d2Var = (d2) scope.getCoroutineContext().get(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.q(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T msg) throws Throwable {
        Object objW = this.messageQueue.w(msg);
        if (objW instanceof mu.k.Closed) {
            Throwable thE = mu.k.e(objW);
            if (thE != null) {
                throw thE;
            }
            throw new mu.r("Channel was closed normally");
        }
        if (!mu.k.i(objW)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            ku.k.d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
