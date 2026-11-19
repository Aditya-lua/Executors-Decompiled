package dv;

import av.e3;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"T", "Ldv/h;", BuildConfig.FLAVOR, "timeoutMillis", "b", "(Ldv/h;J)Ldv/h;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Ldv/h;Lkotlin/jvm/functions/Function1;)Ldv/h;", "Lkotlin/time/a;", "timeout", "e", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lav/p0;", "Ldv/i;", "downstream", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;Ldv/i;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
    public static final class a<T> extends gu.m implements pu.n<av.p0, i<? super T>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12800t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12801u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f12802v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12803w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12804x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Long> f12805y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T> f12806z;

        /* JADX INFO: renamed from: dv.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        public static final class C0243a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12807t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i<T> f12808u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ p001kotlin.jvm.internal.c0<Object> f12809v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0243a(i<? super T> iVar, p001kotlin.jvm.internal.c0<Object> c0Var, eu.b<? super C0243a> bVar) {
                super(1, bVar);
                this.f12808u = iVar;
                this.f12809v = c0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0243a(this.f12808u, this.f12809v, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f12807t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    i<T> iVar = this.f12808u;
                    gv.e0 e0Var = kotlin.t.f14752a;
                    T t8 = this.f12809v.f21575a;
                    if (t8 == e0Var) {
                        t8 = null;
                    }
                    this.f12807t = 1;
                    if (iVar.emit(t8, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                this.f12809v.f21575a = null;
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super Unit> bVar) {
                return ((C0243a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcv/k;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "<anonymous>", "(Lcv/k;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<cv.k<? extends Object>, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f12810t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12811u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f12812v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ p001kotlin.jvm.internal.c0<Object> f12813w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ i<T> f12814x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(p001kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f12813w = c0Var;
                this.f12814x = iVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                b bVar2 = new b(this.f12813w, this.f12814x, bVar);
                bVar2.f12812v = obj;
                return bVar2;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(cv.k<? extends Object> kVar, eu.b<? super Unit> bVar) {
                return m(kVar.getHolder(), bVar);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, gv.e0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type eu.b to dv.q$a$b for r6v1 'this'  eu.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // gu.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = fu.c.e()
                    int r1 = r6.f12811u
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f12810t
                    kotlin.jvm.internal.c0 r0 = (p001kotlin.jvm.internal.c0) r0
                    zt.o.b(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    zt.o.b(r7)
                    java.lang.Object r7 = r6.f12812v
                    cv.k r7 = (cv.k) r7
                    java.lang.Object r7 = r7.getHolder()
                    kotlin.jvm.internal.c0<java.lang.Object> r1 = r6.f12813w
                    boolean r3 = r7 instanceof cv.k.c
                    if (r3 != 0) goto L2e
                    r1.f21575a = r7
                L2e:
                    dv.i<T> r4 = r6.f12814x
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = cv.k.e(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f21575a
                    if (r3 == 0) goto L50
                    gv.e0 r5 = kotlin.t.f14752a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f12812v = r7
                    r6.f12810t = r1
                    r6.f12811u = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    gv.e0 r7 = kotlin.t.f14753c
                    r1.f21575a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.Unit r7 = p001kotlin.Unit.f21506a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: dv.q.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object m(Object obj, eu.b<? super Unit> bVar) {
                return ((b) create(cv.k.b(obj), bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcv/v;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Lcv/v;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
        public static final class c extends gu.m implements Function2<cv.v<? super Object>, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12815t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12816u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f12817v;

            /* JADX INFO: renamed from: dv.q$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0244a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ cv.v<Object> f12818a;

                /* JADX INFO: renamed from: dv.q$a$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "emit")
                public static final class C0245a extends gu.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f12819t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0244a<T> f12820u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f12821v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0245a(C0244a<? super T> c0244a, eu.b<? super C0245a> bVar) {
                        super(bVar);
                        this.f12820u = c0244a;
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f12819t = obj;
                        this.f12821v |= Integer.MIN_VALUE;
                        return this.f12820u.emit(null, this);
                    }
                }

                public C0244a(cv.v<Object> vVar) {
                    this.f12818a = vVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // dv.i
                public final Object emit(T t8, eu.b<? super Unit> bVar) {
                    C0245a c0245a;
                    if (bVar instanceof C0245a) {
                        c0245a = (C0245a) bVar;
                        int i10 = c0245a.f12821v;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0245a.f12821v = i10 - Integer.MIN_VALUE;
                        } else {
                            c0245a = new C0245a(this, bVar);
                        }
                    } else {
                        c0245a = new C0245a(this, bVar);
                    }
                    Object obj = c0245a.f12819t;
                    Object objE = fu.c.e();
                    int i11 = c0245a.f12821v;
                    if (i11 == 0) {
                        zt.o.b(obj);
                        cv.v<Object> vVar = this.f12818a;
                        if (t8 == null) {
                            t8 = (T) kotlin.t.f14752a;
                        }
                        c0245a.f12821v = 1;
                        if (vVar.m(t8, c0245a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(h<? extends T> hVar, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f12817v = hVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                c cVar = new c(this.f12817v, bVar);
                cVar.f12816u = obj;
                return cVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f12815t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    cv.v vVar = (cv.v) this.f12816u;
                    h<T> hVar = this.f12817v;
                    C0244a c0244a = new C0244a(vVar);
                    this.f12815t = 1;
                    if (hVar.collect(c0244a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(cv.v<Object> vVar, eu.b<? super Unit> bVar) {
                return ((c) create(vVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Long> function1, h<? extends T> hVar, eu.b<? super a> bVar) {
            super(3, bVar);
            this.f12805y = function1;
            this.f12806z = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 kotlin.jvm.internal.b0) = (r1v5 kotlin.jvm.internal.b0), (r1v7 kotlin.jvm.internal.b0), (r1v7 kotlin.jvm.internal.b0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 kotlin.jvm.internal.c0) = (r5v5 kotlin.jvm.internal.c0), (r5v6 kotlin.jvm.internal.c0), (r5v6 kotlin.jvm.internal.c0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 cv.x) = (r6v4 cv.x), (r6v5 cv.x), (r6v5 cv.x) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 dv.i) = (r7v4 dv.i), (r7v5 dv.i), (r7v5 dv.i) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.o(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            p001kotlin.jvm.internal.c0 c0Var;
            i iVar;
            cv.x xVar;
            p001kotlin.jvm.internal.b0 b0Var;
            p001kotlin.jvm.internal.b0 b0Var2;
            p001kotlin.jvm.internal.c0 c0Var2;
            cv.x xVar2;
            i iVar2;
            jv.k kVar;
            T t8;
            gv.e0 e0Var;
            long jLongValue;
            T t10;
            Object objE = fu.c.e();
            int i10 = this.f12802v;
            if (i10 == 0) {
                zt.o.b(obj);
                av.p0 p0Var = (av.p0) this.f12803w;
                i iVar3 = (i) this.f12804x;
                cv.x xVarE = cv.t.e(p0Var, null, 0, new c(this.f12806z, null), 3, null);
                c0Var = new p001kotlin.jvm.internal.c0();
                iVar = iVar3;
                xVar = xVarE;
                if (c0Var.f21575a != kotlin.t.f14753c) {
                    return Unit.f21506a;
                }
                b0Var = new p001kotlin.jvm.internal.b0();
                t8 = c0Var.f21575a;
                if (t8 != null) {
                    Function1<T, Long> function1 = this.f12805y;
                    e0Var = kotlin.t.f14752a;
                    if (t8 == e0Var) {
                        t8 = null;
                    }
                    jLongValue = function1.invoke(t8).longValue();
                    b0Var.f21574a = jLongValue;
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (jLongValue != 0) {
                        b0Var2 = b0Var;
                        c0Var2 = c0Var;
                        xVar2 = xVar;
                        iVar2 = iVar;
                        kVar = new jv.k(getContext());
                        if (c0Var2.f21575a != null) {
                            jv.c.a(kVar, b0Var2.f21574a, new C0243a(iVar2, c0Var2, null));
                        }
                        kVar.b(xVar2.B(), new b(c0Var2, iVar2, null));
                        this.f12803w = iVar2;
                        this.f12804x = xVar2;
                        this.f12800t = c0Var2;
                        this.f12801u = null;
                        this.f12802v = 2;
                    } else {
                        t10 = c0Var.f21575a;
                        if (t10 == e0Var) {
                            t10 = null;
                        }
                        this.f12803w = iVar;
                        this.f12804x = xVar;
                        this.f12800t = c0Var;
                        this.f12801u = b0Var;
                        this.f12802v = 1;
                    }
                } else {
                    b0Var2 = b0Var;
                    c0Var2 = c0Var;
                    xVar2 = xVar;
                    iVar2 = iVar;
                    kVar = new jv.k(getContext());
                    if (c0Var2.f21575a != null) {
                        jv.c.a(kVar, b0Var2.f21574a, new C0243a(iVar2, c0Var2, null));
                    }
                    kVar.b(xVar2.B(), new b(c0Var2, iVar2, null));
                    this.f12803w = iVar2;
                    this.f12804x = xVar2;
                    this.f12800t = c0Var2;
                    this.f12801u = null;
                    this.f12802v = 2;
                }
                return objE;
            }
            if (i10 == 1) {
                b0Var = (p001kotlin.jvm.internal.b0) this.f12801u;
                c0Var = (p001kotlin.jvm.internal.c0) this.f12800t;
                xVar = (cv.x) this.f12804x;
                iVar = (i) this.f12803w;
                zt.o.b(obj);
                c0Var.f21575a = null;
                b0Var2 = b0Var;
                c0Var2 = c0Var;
                xVar2 = xVar;
                iVar2 = iVar;
                kVar = new jv.k(getContext());
                if (c0Var2.f21575a != null) {
                    jv.c.a(kVar, b0Var2.f21574a, new C0243a(iVar2, c0Var2, null));
                }
                kVar.b(xVar2.B(), new b(c0Var2, iVar2, null));
                this.f12803w = iVar2;
                this.f12804x = xVar2;
                this.f12800t = c0Var2;
                this.f12801u = null;
                this.f12802v = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var2 = (p001kotlin.jvm.internal.c0) this.f12800t;
                xVar2 = (cv.x) this.f12804x;
                iVar2 = (i) this.f12803w;
                zt.o.b(obj);
            }
            iVar = iVar2;
            xVar = xVar2;
            c0Var = c0Var2;
            if (c0Var.f21575a != kotlin.t.f14753c) {
                return Unit.f21506a;
            }
            b0Var = new p001kotlin.jvm.internal.b0();
            t8 = c0Var.f21575a;
            if (t8 != null) {
                Function1<T, Long> function2 = this.f12805y;
                e0Var = kotlin.t.f14752a;
                if (t8 == e0Var) {
                    t8 = null;
                }
                jLongValue = function2.invoke(t8).longValue();
                b0Var.f21574a = jLongValue;
                if (jLongValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (jLongValue != 0) {
                    b0Var2 = b0Var;
                    c0Var2 = c0Var;
                    xVar2 = xVar;
                    iVar2 = iVar;
                    kVar = new jv.k(getContext());
                    if (c0Var2.f21575a != null) {
                        jv.c.a(kVar, b0Var2.f21574a, new C0243a(iVar2, c0Var2, null));
                    }
                    kVar.b(xVar2.B(), new b(c0Var2, iVar2, null));
                    this.f12803w = iVar2;
                    this.f12804x = xVar2;
                    this.f12800t = c0Var2;
                    this.f12801u = null;
                    this.f12802v = 2;
                } else {
                    t10 = c0Var.f21575a;
                    if (t10 == e0Var) {
                        t10 = null;
                    }
                    this.f12803w = iVar;
                    this.f12804x = xVar;
                    this.f12800t = c0Var;
                    this.f12801u = b0Var;
                    this.f12802v = 1;
                }
            } else {
                b0Var2 = b0Var;
                c0Var2 = c0Var;
                xVar2 = xVar;
                iVar2 = iVar;
                kVar = new jv.k(getContext());
                if (c0Var2.f21575a != null) {
                    jv.c.a(kVar, b0Var2.f21574a, new C0243a(iVar2, c0Var2, null));
                }
                kVar.b(xVar2.B(), new b(c0Var2, iVar2, null));
                this.f12803w = iVar2;
                this.f12804x = xVar2;
                this.f12800t = c0Var2;
                this.f12801u = null;
                this.f12802v = 2;
            }
            return objE;
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(av.p0 p0Var, i<? super T> iVar, eu.b<? super Unit> bVar) {
            a aVar = new a(this.f12805y, this.f12806z, bVar);
            aVar.f12803w = p0Var;
            aVar.f12804x = iVar;
            return aVar.invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lav/p0;", "Ldv/i;", "downStream", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;Ldv/i;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {HttpStatusCode.PAYLOAD_TOO_LARGE_413}, m = "invokeSuspend")
    public static final class b<T> extends gu.m implements pu.n<av.p0, i<? super T>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f12822t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f12823u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12824v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12825w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f12826x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h<T> f12827y;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcv/k;", "value", BuildConfig.FLAVOR, "<anonymous>", "(Lcv/k;)Z"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<cv.k<? extends T>, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12828t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12829u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i<T> f12830v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f12830v = iVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.f12830v, bVar);
                aVar.f12829u = obj;
                return aVar;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, eu.b<? super Boolean> bVar) {
                return m(((cv.k) obj).getHolder(), bVar);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type eu.b to dv.q$b$a for r4v1 'this'  eu.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // gu.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = fu.c.e()
                    int r1 = r4.f12828t
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f12829u
                    zt.o.b(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    zt.o.b(r5)
                    java.lang.Object r5 = r4.f12829u
                    cv.k r5 = (cv.k) r5
                    java.lang.Object r5 = r5.getHolder()
                    dv.i<T> r1 = r4.f12830v
                    boolean r3 = r5 instanceof cv.k.c
                    if (r3 != 0) goto L37
                    r4.f12829u = r5
                    r4.f12828t = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof cv.k.Closed
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = cv.k.e(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = gu.b.a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = gu.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dv.q.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object m(Object obj, eu.b<? super Boolean> bVar) {
                return ((a) create(cv.k.b(obj), bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX INFO: renamed from: dv.q$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
        public static final class C0246b extends gu.m implements Function1<eu.b<?>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12831t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f12832u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0246b(long j10, eu.b<? super C0246b> bVar) {
                super(1, bVar);
                this.f12832u = j10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0246b(this.f12832u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f12831t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                throw new e3("Timed out waiting for " + ((Object) p001kotlin.time.a.R(this.f12832u)));
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<?> bVar) {
                return ((C0246b) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, h<? extends T> hVar, eu.b<? super b> bVar) {
            super(3, bVar);
            this.f12826x = j10;
            this.f12827y = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r9.f12823u
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f12822t
                java.lang.Object r1 = r9.f12825w
                cv.x r1 = (cv.x) r1
                java.lang.Object r6 = r9.f12824v
                dv.i r6 = (dv.i) r6
                zt.o.b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                zt.o.b(r10)
                java.lang.Object r10 = r9.f12824v
                av.p0 r10 = (av.p0) r10
                java.lang.Object r1 = r9.f12825w
                dv.i r1 = (dv.i) r1
                long r4 = r9.f12826x
                kotlin.time.a$a r6 = p001kotlin.time.a.INSTANCE
                long r6 = r6.b()
                int r4 = p001kotlin.time.a.k(r4, r6)
                if (r4 <= 0) goto L82
                dv.h<T> r4 = r9.f12827y
                r5 = 0
                r6 = 2
                dv.h r4 = dv.j.c(r4, r5, r3, r6, r3)
                cv.x r10 = dv.j.G(r4, r10)
                long r4 = r9.f12826x
                r6 = r1
                r1 = r10
            L4b:
                jv.k r10 = new jv.k
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                jv.h r7 = r1.B()
                dv.q$b$a r8 = new dv.q$b$a
                r8.<init>(r6, r3)
                r10.b(r7, r8)
                dv.q$b$b r7 = new dv.q$b$b
                r7.<init>(r4, r3)
                jv.c.b(r10, r4, r7)
                r9.f12824v = r6
                r9.f12825w = r1
                r9.f12822t = r4
                r9.f12823u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = p001kotlin.Unit.f21506a
                return r10
            L82:
                av.e3 r10 = new av.e3
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: dv.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(av.p0 p0Var, i<? super T> iVar, eu.b<? super Unit> bVar) {
            b bVar2 = new b(this.f12826x, this.f12827y, bVar);
            bVar2.f12824v = p0Var;
            bVar2.f12825w = iVar;
            return bVar2.invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? hVar : d(hVar, new Function1() { // from class: dv.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(q.c(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final long c(long j10, Object obj) {
        return j10;
    }

    public static final <T> h<T> d(h<? extends T> hVar, Function1<? super T, Long> function1) {
        return kotlin.o.b(new a(function1, hVar, null));
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, long j10) {
        return f(hVar, j10);
    }

    public static final <T> h<T> f(h<? extends T> hVar, long j10) {
        return kotlin.o.b(new b(j10, hVar, null));
    }
}
