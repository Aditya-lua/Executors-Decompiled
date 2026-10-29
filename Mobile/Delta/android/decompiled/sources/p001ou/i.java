package p001ou;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.c0;
import ku.d2;
import ku.k;
import ku.p0;
import ku.q0;
import ku.r0;
import nt.b;
import nu.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.d;
import pt.f;
import pt.m;
import zt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lou/i;", "T", "R", "Lou/g;", "Lkotlin/Function3;", "Lnu/i;", "Lnt/b;", "", "", "transform", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lzt/n;Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "collector", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "e", "Lzt/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T, R> extends g<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<nu.i<? super R>, T, b<? super Unit>, Object> transform;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27963t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27964u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T, R> f27965v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ nu.i<R> f27966w;

        /* JADX INFO: renamed from: ou.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0483a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c0<d2> f27967a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T, R> f27968c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ nu.i<R> f27969d;

            /* JADX INFO: renamed from: ou.i$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class C0484a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f27970t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i<T, R> f27971u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ nu.i<R> f27972v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ T f27973w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0484a(i<T, R> iVar, nu.i<? super R> iVar2, T t8, nt.b<? super C0484a> bVar) {
                    super(2, bVar);
                    this.f27971u = iVar;
                    this.f27972v = iVar2;
                    this.f27973w = t8;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    return new C0484a(this.f27971u, this.f27972v, this.f27973w, bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = c.e();
                    int i10 = this.f27970t;
                    if (i10 == 0) {
                        o.b(obj);
                        n nVar = this.f27971u.transform;
                        nu.i<R> iVar = this.f27972v;
                        T t8 = this.f27973w;
                        this.f27970t = 1;
                        if (nVar.invoke(iVar, t8, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((C0484a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX INFO: renamed from: ou.i$a$a$b */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b extends d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f27974t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f27975u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f27976v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public /* synthetic */ Object f27977w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ C0483a<T> f27978x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public int f27979y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0483a<? super T> c0483a, nt.b<? super b> bVar) {
                    super(bVar);
                    this.f27978x = c0483a;
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f27977w = obj;
                    this.f27979y |= Integer.MIN_VALUE;
                    return this.f27978x.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0483a(c0<d2> c0Var, p0 p0Var, i<T, R> iVar, nu.i<? super R> iVar2) {
                this.f27967a = c0Var;
                this.b = p0Var;
                this.f27968c = iVar;
                this.f27969d = iVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.i
            public final Object emit(T t8, nt.b<? super Unit> bVar) {
                b bVar2;
                C0483a<T> c0483a;
                if (bVar instanceof b) {
                    bVar2 = (b) bVar;
                    int i10 = bVar2.f27979y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar2.f27979y = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar2 = new b(this, bVar);
                    }
                } else {
                    bVar2 = new b(this, bVar);
                }
                Object obj = bVar2.f27977w;
                Object objE = c.e();
                int i11 = bVar2.f27979y;
                if (i11 == 0) {
                    o.b(obj);
                    d2 d2Var = this.f27967a.f22552a;
                    if (d2Var != null) {
                        d2Var.c(new k());
                        bVar2.f27974t = this;
                        bVar2.f27975u = t8;
                        bVar2.f27976v = d2Var;
                        bVar2.f27979y = 1;
                        if (d2Var.L(bVar2) == objE) {
                            return objE;
                        }
                    }
                    c0483a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8 = (T) bVar2.f27975u;
                    c0483a = (C0483a) bVar2.f27974t;
                    o.b(obj);
                }
                c0483a.f27967a.f22552a = (T) k.d(c0483a.b, null, r0.UNDISPATCHED, new C0484a(c0483a.f27968c, c0483a.f27969d, t8, null), 1, null);
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, nu.i<? super R> iVar2, b<? super a> bVar) {
            super(2, bVar);
            this.f27965v = iVar;
            this.f27966w = iVar2;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27965v, this.f27966w, bVar);
            aVar.f27964u = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to ou.i$a for r7v1 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r7.f27963t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jt.o.b(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                jt.o.b(r8)
                java.lang.Object r8 = r7.f27964u
                ku.p0 r8 = (ku.p0) r8
                kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
                r1.<init>()
                ou.i<T, R> r3 = r7.f27965v
                nu.h<S> r4 = r3.flow
                ou.i$a$a r5 = new ou.i$a$a
                nu.i<R> r6 = r7.f27966w
                r5.<init>(r1, r8, r3, r6)
                r7.f27963t = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.Unit r8 = kotlin.Unit.f22483a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ou.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public /* synthetic */ i(n nVar, h hVar, CoroutineContext coroutineContext, int i10, mu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, hVar, (i11 & 4) != 0 ? e.f22525a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? mu.a.SUSPEND : aVar);
    }

    @Override // p001ou.e
    @NotNull
    public e<R> f(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p001ou.g
    @Nullable
    public Object q(@NotNull nu.i<? super R> iVar, @NotNull b<? super Unit> bVar) {
        Object objG = q0.g(new a(this, iVar, null), bVar);
        return objG == c.e() ? objG : Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull n<? super nu.i<? super R>, ? super T, ? super b<? super Unit>, ? extends Object> nVar, @NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        super(hVar, coroutineContext, i10, aVar);
        this.transform = nVar;
    }
}
