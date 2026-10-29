package nu;

import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ku.e3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"T", "Lnu/h;", "", "timeoutMillis", "b", "(Lnu/h;J)Lnu/h;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Lnu/h;Lkotlin/jvm/functions/Function1;)Lnu/h;", "Lkotlin/time/a;", "timeout", "e", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lku/p0;", "Lnu/i;", "downstream", "", "<anonymous>", "(Lku/p0;Lnu/i;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
    public static final class a<T> extends pt.m implements zt.n<ku.p0, i<? super T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26754t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26755u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26756v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f26757w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f26758x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Long> f26759y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T> f26760z;

        /* JADX INFO: renamed from: nu.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        public static final class C0456a extends pt.m implements Function1<nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26761t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i<T> f26762u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f26763v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0456a(i<? super T> iVar, kotlin.jvm.internal.c0<Object> c0Var, nt.b<? super C0456a> bVar) {
                super(1, bVar);
                this.f26762u = iVar;
                this.f26763v = c0Var;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new C0456a(this.f26762u, this.f26763v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f26761t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    i<T> iVar = this.f26762u;
                    qu.e0 e0Var = p001ou.t.f28008a;
                    T t8 = this.f26763v.f22552a;
                    if (t8 == e0Var) {
                        t8 = null;
                    }
                    this.f26761t = 1;
                    if (iVar.emit(t8, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                this.f26763v.f22552a = null;
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super Unit> bVar) {
                return ((C0456a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/k;", "", "value", "", "<anonymous>", "(Lmu/k;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<mu.k<? extends Object>, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f26764t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f26765u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f26766v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f26767w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ i<T> f26768x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f26767w = c0Var;
                this.f26768x = iVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                b bVar2 = new b(this.f26767w, this.f26768x, bVar);
                bVar2.f26766v = obj;
                return bVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(mu.k<? extends Object> kVar, nt.b<? super Unit> bVar) {
                return q(kVar.getHolder(), bVar);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, qu.e0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.q$a$b for r6v1 'this'  nt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // pt.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r6.f26765u
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f26764t
                    kotlin.jvm.internal.c0 r0 = (kotlin.jvm.internal.c0) r0
                    jt.o.b(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    jt.o.b(r7)
                    java.lang.Object r7 = r6.f26766v
                    mu.k r7 = (mu.k) r7
                    java.lang.Object r7 = r7.getHolder()
                    kotlin.jvm.internal.c0<java.lang.Object> r1 = r6.f26767w
                    boolean r3 = r7 instanceof mu.k.c
                    if (r3 != 0) goto L2e
                    r1.f22552a = r7
                L2e:
                    nu.i<T> r4 = r6.f26768x
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = mu.k.e(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f22552a
                    if (r3 == 0) goto L50
                    qu.e0 r5 = p001ou.t.f28008a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f26766v = r7
                    r6.f26764t = r1
                    r6.f26765u = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    qu.e0 r7 = p001ou.t.f28009c
                    r1.f22552a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.Unit r7 = kotlin.Unit.f22483a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.q.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object q(Object obj, nt.b<? super Unit> bVar) {
                return ((b) create(mu.k.b(obj), bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/v;", "", "", "<anonymous>", "(Lmu/v;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
        public static final class c extends pt.m implements Function2<mu.v<? super Object>, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26769t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26770u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f26771v;

            /* JADX INFO: renamed from: nu.q$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0457a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.v<Object> f26772a;

                /* JADX INFO: renamed from: nu.q$a$c$a$a, reason: collision with other inner class name */
                @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class C0458a extends pt.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f26773t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0457a<T> f26774u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f26775v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0458a(C0457a<? super T> c0457a, nt.b<? super C0458a> bVar) {
                        super(bVar);
                        this.f26774u = c0457a;
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f26773t = obj;
                        this.f26775v |= Integer.MIN_VALUE;
                        return this.f26774u.emit(null, this);
                    }
                }

                public C0457a(mu.v<Object> vVar) {
                    this.f26772a = vVar;
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
                @Override // nu.i
                public final Object emit(T t8, nt.b<? super Unit> bVar) {
                    C0458a c0458a;
                    if (bVar instanceof C0458a) {
                        c0458a = (C0458a) bVar;
                        int i10 = c0458a.f26775v;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0458a.f26775v = i10 - Integer.MIN_VALUE;
                        } else {
                            c0458a = new C0458a(this, bVar);
                        }
                    } else {
                        c0458a = new C0458a(this, bVar);
                    }
                    Object obj = c0458a.f26773t;
                    Object objE = ot.c.e();
                    int i11 = c0458a.f26775v;
                    if (i11 == 0) {
                        jt.o.b(obj);
                        mu.v<Object> vVar = this.f26772a;
                        if (t8 == null) {
                            t8 = (T) p001ou.t.f28008a;
                        }
                        c0458a.f26775v = 1;
                        if (vVar.i(t8, c0458a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj);
                    }
                    return Unit.f22483a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(h<? extends T> hVar, nt.b<? super c> bVar) {
                super(2, bVar);
                this.f26771v = hVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                c cVar = new c(this.f26771v, bVar);
                cVar.f26770u = obj;
                return cVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f26769t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    mu.v vVar = (mu.v) this.f26770u;
                    h<T> hVar = this.f26771v;
                    C0457a c0457a = new C0457a(vVar);
                    this.f26769t = 1;
                    if (hVar.collect(c0457a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mu.v<Object> vVar, nt.b<? super Unit> bVar) {
                return ((c) create(vVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Long> function1, h<? extends T> hVar, nt.b<? super a> bVar) {
            super(3, bVar);
            this.f26759y = function1;
            this.f26760z = hVar;
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
          0x00a4: PHI (r6v2 mu.x) = (r6v4 mu.x), (r6v5 mu.x), (r6v5 mu.x) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 nu.i) = (r7v4 nu.i), (r7v5 nu.i), (r7v5 nu.i) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
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
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // zt.n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ku.p0 p0Var, i<? super T> iVar, nt.b<? super Unit> bVar) {
            a aVar = new a(this.f26759y, this.f26760z, bVar);
            aVar.f26757w = p0Var;
            aVar.f26758x = iVar;
            return aVar.invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lku/p0;", "Lnu/i;", "downStream", "", "<anonymous>", "(Lku/p0;Lnu/i;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {HttpStatusCode.PAYLOAD_TOO_LARGE_413}, m = "invokeSuspend")
    public static final class b<T> extends pt.m implements zt.n<ku.p0, i<? super T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f26776t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26777u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26778v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f26779w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f26780x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h<T> f26781y;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/k;", "value", "", "<anonymous>", "(Lmu/k;)Z"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<mu.k<? extends T>, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26782t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26783u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i<T> f26784v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f26784v = iVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(this.f26784v, bVar);
                aVar.f26783u = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, nt.b<? super Boolean> bVar) {
                return q(((mu.k) obj).getHolder(), bVar);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.q$b$a for r4v1 'this'  nt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // pt.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r4.f26782t
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f26783u
                    jt.o.b(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    jt.o.b(r5)
                    java.lang.Object r5 = r4.f26783u
                    mu.k r5 = (mu.k) r5
                    java.lang.Object r5 = r5.getHolder()
                    nu.i<T> r1 = r4.f26784v
                    boolean r3 = r5 instanceof mu.k.c
                    if (r3 != 0) goto L37
                    r4.f26783u = r5
                    r4.f26782t = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof mu.k.Closed
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = mu.k.e(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = pt.b.a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = pt.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.q.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object q(Object obj, nt.b<? super Boolean> bVar) {
                return ((a) create(mu.k.b(obj), bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: nu.q$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
        public static final class C0459b extends pt.m implements Function1<nt.b<?>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26785t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f26786u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0459b(long j10, nt.b<? super C0459b> bVar) {
                super(1, bVar);
                this.f26786u = j10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new C0459b(this.f26786u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f26785t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                throw new e3("Timed out waiting for " + ((Object) kotlin.time.a.R(this.f26786u)));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<?> bVar) {
                return ((C0459b) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, h<? extends T> hVar, nt.b<? super b> bVar) {
            super(3, bVar);
            this.f26780x = j10;
            this.f26781y = hVar;
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r9.f26777u
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f26776t
                java.lang.Object r1 = r9.f26779w
                mu.x r1 = (mu.x) r1
                java.lang.Object r6 = r9.f26778v
                nu.i r6 = (nu.i) r6
                jt.o.b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                jt.o.b(r10)
                java.lang.Object r10 = r9.f26778v
                ku.p0 r10 = (ku.p0) r10
                java.lang.Object r1 = r9.f26779w
                nu.i r1 = (nu.i) r1
                long r4 = r9.f26780x
                kotlin.time.a$a r6 = kotlin.time.a.INSTANCE
                long r6 = r6.b()
                int r4 = kotlin.time.a.j(r4, r6)
                if (r4 <= 0) goto L82
                nu.h<T> r4 = r9.f26781y
                r5 = 0
                r6 = 2
                nu.h r4 = nu.j.c(r4, r5, r3, r6, r3)
                mu.x r10 = nu.j.G(r4, r10)
                long r4 = r9.f26780x
                r6 = r1
                r1 = r10
            L4b:
                tu.k r10 = new tu.k
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                tu.h r7 = r1.A()
                nu.q$b$a r8 = new nu.q$b$a
                r8.<init>(r6, r3)
                r10.c(r7, r8)
                nu.q$b$b r7 = new nu.q$b$b
                r7.<init>(r4, r3)
                tu.c.b(r10, r4, r7)
                r9.f26778v = r6
                r9.f26779w = r1
                r9.f26776t = r4
                r9.f26777u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            L82:
                ku.e3 r10 = new ku.e3
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // zt.n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ku.p0 p0Var, i<? super T> iVar, nt.b<? super Unit> bVar) {
            b bVar2 = new b(this.f26780x, this.f26781y, bVar);
            bVar2.f26778v = p0Var;
            bVar2.f26779w = iVar;
            return bVar2.invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? hVar : d(hVar, new Function1() { // from class: nu.p
                @Override // kotlin.jvm.functions.Function1
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
        return p001ou.o.b(new a(function1, hVar, null));
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, long j10) {
        return f(hVar, j10);
    }

    public static final <T> h<T> f(h<? extends T> hVar, long j10) {
        return p001ou.o.b(new b(j10, hVar, null));
    }
}
