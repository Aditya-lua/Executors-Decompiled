package kotlin;

import av.d2;
import av.k;
import av.p0;
import av.q0;
import av.r0;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import dv.h;
import eu.b;
import fu.c;
import gu.d;
import gu.f;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.coroutines.e;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.c0;
import pu.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lev/i;", "T", "R", "Lev/g;", "Lkotlin/Function3;", "Ldv/i;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "transform", "Ldv/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "capacity", "Lcv/a;", "onBufferOverflow", "<init>", "(Lpu/n;Ldv/h;Lkotlin/coroutines/CoroutineContext;ILcv/a;)V", "Lev/e;", "e", "(Lkotlin/coroutines/CoroutineContext;ILcv/a;)Lev/e;", "collector", "q", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "Lpu/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T, R> extends g<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<dv.i<? super R>, T, b<? super p001kotlin.Unit>, Object> transform;

    @p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super p001kotlin.Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14707t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14708u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T, R> f14709v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ dv.i<R> f14710w;

        /* JADX INFO: renamed from: ev.i$a$a, reason: collision with other inner class name */
        @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0282a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c0<d2> f14711a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T, R> f14712c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ dv.i<R> f14713d;

            /* JADX INFO: renamed from: ev.i$a$a$a, reason: collision with other inner class name */
            @p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend")
            public static final class C0283a extends m implements Function2<p0, eu.b<? super p001kotlin.Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f14714t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i<T, R> f14715u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ dv.i<R> f14716v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ T f14717w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0283a(i<T, R> iVar, dv.i<? super R> iVar2, T t8, eu.b<? super C0283a> bVar) {
                    super(2, bVar);
                    this.f14715u = iVar;
                    this.f14716v = iVar2;
                    this.f14717w = t8;
                }

                @Override // gu.a
                public final eu.b<p001kotlin.Unit> create(Object obj, eu.b<?> bVar) {
                    return new C0283a(this.f14715u, this.f14716v, this.f14717w, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super p001kotlin.Unit> bVar) {
                    return ((C0283a) create(p0Var, bVar)).invokeSuspend(p001kotlin.Unit.f21506a);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = c.e();
                    int i10 = this.f14714t;
                    if (i10 == 0) {
                        o.b(obj);
                        n nVar = this.f14715u.transform;
                        dv.i<R> iVar = this.f14716v;
                        T t8 = this.f14717w;
                        this.f14714t = 1;
                        if (nVar.invoke(iVar, t8, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    return p001kotlin.Unit.f21506a;
                }
            }

            /* JADX INFO: renamed from: ev.i$a$a$b */
            @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            public static final class b extends d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f14718t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f14719u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f14720v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public /* synthetic */ Object f14721w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ C0282a<T> f14722x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public int f14723y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0282a<? super T> c0282a, eu.b<? super b> bVar) {
                    super(bVar);
                    this.f14722x = c0282a;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f14721w = obj;
                    this.f14723y |= Integer.MIN_VALUE;
                    return this.f14722x.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0282a(c0<d2> c0Var, p0 p0Var, i<T, R> iVar, dv.i<? super R> iVar2) {
                this.f14711a = c0Var;
                this.b = p0Var;
                this.f14712c = iVar;
                this.f14713d = iVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            public final Object emit(T t8, eu.b<? super p001kotlin.Unit> bVar) {
                b bVar2;
                C0282a<T> c0282a;
                if (bVar instanceof b) {
                    bVar2 = (b) bVar;
                    int i10 = bVar2.f14723y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar2.f14723y = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar2 = new b(this, bVar);
                    }
                } else {
                    bVar2 = new b(this, bVar);
                }
                Object obj = bVar2.f14721w;
                Object objE = c.e();
                int i11 = bVar2.f14723y;
                if (i11 == 0) {
                    o.b(obj);
                    d2 d2Var = this.f14711a.f21575a;
                    if (d2Var != null) {
                        d2Var.c(new k());
                        bVar2.f14718t = this;
                        bVar2.f14719u = t8;
                        bVar2.f14720v = d2Var;
                        bVar2.f14723y = 1;
                        if (d2Var.z(bVar2) == objE) {
                            return objE;
                        }
                    }
                    c0282a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8 = (T) bVar2.f14719u;
                    c0282a = (C0282a) bVar2.f14718t;
                    o.b(obj);
                }
                c0282a.f14711a.f21575a = (T) k.d(c0282a.b, null, r0.UNDISPATCHED, new C0283a(c0282a.f14712c, c0282a.f14713d, t8, null), 1, null);
                return p001kotlin.Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, dv.i<? super R> iVar2, b<? super a> bVar) {
            super(2, bVar);
            this.f14709v = iVar;
            this.f14710w = iVar2;
        }

        @Override // gu.a
        public final b<p001kotlin.Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f14709v, this.f14710w, bVar);
            aVar.f14708u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super p001kotlin.Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(p001kotlin.Unit.f21506a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type eu.b to ev.i$a for r7v1 'this'  eu.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r7.f14707t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                zt.o.b(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                zt.o.b(r8)
                java.lang.Object r8 = r7.f14708u
                av.p0 r8 = (av.p0) r8
                kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
                r1.<init>()
                ev.i<T, R> r3 = r7.f14709v
                dv.h<S> r4 = r3.flow
                ev.i$a$a r5 = new ev.i$a$a
                dv.i<R> r6 = r7.f14710w
                r5.<init>(r1, r8, r3, r6)
                r7.f14707t = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.Unit r8 = p001kotlin.Unit.f21506a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ev.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ i(n nVar, h hVar, CoroutineContext coroutineContext, int i10, cv.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, hVar, (i11 & 4) != 0 ? e.f21548a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? cv.a.SUSPEND : aVar);
    }

    @Override // kotlin.e
    @NotNull
    public e<R> e(@NotNull CoroutineContext context, int capacity, @NotNull cv.a onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.g
    @Nullable
    public Object q(@NotNull dv.i<? super R> iVar, @NotNull b<? super p001kotlin.Unit> bVar) {
        Object objG = q0.g(new a(this, iVar, null), bVar);
        return objG == c.e() ? objG : p001kotlin.Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull n<? super dv.i<? super R>, ? super T, ? super b<? super p001kotlin.Unit>, ? extends Object> nVar, @NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull cv.a aVar) {
        super(hVar, coroutineContext, i10, aVar);
        this.transform = nVar;
    }
}
