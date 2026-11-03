package p001mu;

import gt.o;
import iu.d2;
import iu.k;
import iu.p0;
import iu.q0;
import iu.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.c0;
import lt.b;
import lu.h;
import mt.c;
import nt.d;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmu/i;", "T", "R", "Lmu/g;", "Lkotlin/Function3;", "Llu/i;", "Llt/b;", "", "", "transform", "Llu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lku/a;", "onBufferOverflow", "<init>", "(Lxt/n;Llu/h;Lkotlin/coroutines/CoroutineContext;ILku/a;)V", "Lmu/e;", "e", "(Lkotlin/coroutines/CoroutineContext;ILku/a;)Lmu/e;", "collector", "q", "(Llu/i;Llt/b;)Ljava/lang/Object;", "Lxt/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T, R> extends g<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<lu.i<? super R>, T, b<? super Unit>, Object> transform;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25344t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25345u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T, R> f25346v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ lu.i<R> f25347w;

        /* JADX INFO: renamed from: mu.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0449a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c0<d2> f25348a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T, R> f25349c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ lu.i<R> f25350d;

            /* JADX INFO: renamed from: mu.i$a$a$a, reason: collision with other inner class name */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C0450a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f25351t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i<T, R> f25352u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ lu.i<R> f25353v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ T f25354w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0450a(i<T, R> iVar, lu.i<? super R> iVar2, T t8, lt.b<? super C0450a> bVar) {
                    super(2, bVar);
                    this.f25352u = iVar;
                    this.f25353v = iVar2;
                    this.f25354w = t8;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new C0450a(this.f25352u, this.f25353v, this.f25354w, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((C0450a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = c.e();
                    int i10 = this.f25351t;
                    if (i10 == 0) {
                        o.b(obj);
                        n nVar = this.f25352u.transform;
                        lu.i<R> iVar = this.f25353v;
                        T t8 = this.f25354w;
                        this.f25351t = 1;
                        if (nVar.invoke(iVar, t8, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    return Unit.f22938a;
                }
            }

            /* JADX INFO: renamed from: mu.i$a$a$b */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b extends d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f25355t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f25356u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f25357v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public /* synthetic */ Object f25358w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ C0449a<T> f25359x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public int f25360y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0449a<? super T> c0449a, lt.b<? super b> bVar) {
                    super(bVar);
                    this.f25359x = c0449a;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f25358w = obj;
                    this.f25360y |= Integer.MIN_VALUE;
                    return this.f25359x.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0449a(c0<d2> c0Var, p0 p0Var, i<T, R> iVar, lu.i<? super R> iVar2) {
                this.f25348a = c0Var;
                this.b = p0Var;
                this.f25349c = iVar;
                this.f25350d = iVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // lu.i
            public final Object emit(T t8, lt.b<? super Unit> bVar) {
                b bVar2;
                C0449a<T> c0449a;
                if (bVar instanceof b) {
                    bVar2 = (b) bVar;
                    int i10 = bVar2.f25360y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar2.f25360y = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar2 = new b(this, bVar);
                    }
                } else {
                    bVar2 = new b(this, bVar);
                }
                Object obj = bVar2.f25358w;
                Object objE = c.e();
                int i11 = bVar2.f25360y;
                if (i11 == 0) {
                    o.b(obj);
                    d2 d2Var = this.f25348a.f23007a;
                    if (d2Var != null) {
                        d2Var.c(new k());
                        bVar2.f25355t = this;
                        bVar2.f25356u = t8;
                        bVar2.f25357v = d2Var;
                        bVar2.f25360y = 1;
                        if (d2Var.F(bVar2) == objE) {
                            return objE;
                        }
                    }
                    c0449a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8 = (T) bVar2.f25356u;
                    c0449a = (C0449a) bVar2.f25355t;
                    o.b(obj);
                }
                c0449a.f25348a.f23007a = (T) k.d(c0449a.b, null, r0.UNDISPATCHED, new C0450a(c0449a.f25349c, c0449a.f25350d, t8, null), 1, null);
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, lu.i<? super R> iVar2, b<? super a> bVar) {
            super(2, bVar);
            this.f25346v = iVar;
            this.f25347w = iVar2;
        }

        @Override // nt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f25346v, this.f25347w, bVar);
            aVar.f25345u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to mu.i$a for r7v1 'this'  lt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r7.f25344t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                gt.o.b(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                gt.o.b(r8)
                java.lang.Object r8 = r7.f25345u
                iu.p0 r8 = (iu.p0) r8
                kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
                r1.<init>()
                mu.i<T, R> r3 = r7.f25346v
                lu.h<S> r4 = r3.flow
                mu.i$a$a r5 = new mu.i$a$a
                lu.i<R> r6 = r7.f25347w
                r5.<init>(r1, r8, r3, r6)
                r7.f25344t = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ i(n nVar, h hVar, CoroutineContext coroutineContext, int i10, ku.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, hVar, (i11 & 4) != 0 ? e.f22980a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? ku.a.SUSPEND : aVar);
    }

    @Override // p001mu.e
    @NotNull
    public e<R> e(@NotNull CoroutineContext context, int capacity, @NotNull ku.a onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p001mu.g
    @Nullable
    public Object q(@NotNull lu.i<? super R> iVar, @NotNull b<? super Unit> bVar) {
        Object objG = q0.g(new a(this, iVar, null), bVar);
        return objG == c.e() ? objG : Unit.f22938a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull n<? super lu.i<? super R>, ? super T, ? super b<? super Unit>, ? extends Object> nVar, @NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull ku.a aVar) {
        super(hVar, coroutineContext, i10, aVar);
        this.transform = nVar;
    }
}
