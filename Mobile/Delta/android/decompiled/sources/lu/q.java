package lu;

import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import iu.e3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"T", "Llu/h;", "", "timeoutMillis", "b", "(Llu/h;J)Llu/h;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Llu/h;Lkotlin/jvm/functions/Function1;)Llu/h;", "Lkotlin/time/a;", "timeout", "e", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Liu/p0;", "Llu/i;", "downstream", "", "<anonymous>", "(Liu/p0;Llu/i;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a<T> extends nt.m implements xt.n<iu.p0, i<? super T>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24043t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24044u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24045v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f24046w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f24047x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Long> f24048y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T> f24049z;

        /* JADX INFO: renamed from: lu.q$a$a, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0424a extends nt.m implements Function1<lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24050t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i<T> f24051u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f24052v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0424a(i<? super T> iVar, kotlin.jvm.internal.c0<Object> c0Var, lt.b<? super C0424a> bVar) {
                super(1, bVar);
                this.f24051u = iVar;
                this.f24052v = c0Var;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new C0424a(this.f24051u, this.f24052v, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f24050t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    i<T> iVar = this.f24051u;
                    ou.e0 e0Var = p001mu.t.f25389a;
                    T t8 = this.f24052v.f23007a;
                    if (t8 == e0Var) {
                        t8 = null;
                    }
                    this.f24050t = 1;
                    if (iVar.emit(t8, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                this.f24052v.f23007a = null;
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super Unit> bVar) {
                return ((C0424a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lku/k;", "", "value", "", "<anonymous>", "(Lku/k;)V"}, k = 3, mv = {2, 1, 0})
        public static final class b extends nt.m implements Function2<ku.k<? extends Object>, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f24053t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f24054u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f24055v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f24056w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ i<T> f24057x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f24056w = c0Var;
                this.f24057x = iVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                b bVar2 = new b(this.f24056w, this.f24057x, bVar);
                bVar2.f24055v = obj;
                return bVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ku.k<? extends Object> kVar, lt.b<? super Unit> bVar) {
                return m(kVar.getHolder(), bVar);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, ou.e0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to lu.q$a$b for r6v1 'this'  lt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // nt.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r6.f24054u
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f24053t
                    kotlin.jvm.internal.c0 r0 = (kotlin.jvm.internal.c0) r0
                    gt.o.b(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    gt.o.b(r7)
                    java.lang.Object r7 = r6.f24055v
                    ku.k r7 = (ku.k) r7
                    java.lang.Object r7 = r7.getHolder()
                    kotlin.jvm.internal.c0<java.lang.Object> r1 = r6.f24056w
                    boolean r3 = r7 instanceof ku.k.c
                    if (r3 != 0) goto L2e
                    r1.f23007a = r7
                L2e:
                    lu.i<T> r4 = r6.f24057x
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = ku.k.e(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f23007a
                    if (r3 == 0) goto L50
                    ou.e0 r5 = p001mu.t.f25389a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f24055v = r7
                    r6.f24053t = r1
                    r6.f24054u = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    ou.e0 r7 = p001mu.t.f25390c
                    r1.f23007a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.Unit r7 = kotlin.Unit.f22938a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: lu.q.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object m(Object obj, lt.b<? super Unit> bVar) {
                return ((b) create(ku.k.b(obj), bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/v;", "", "", "<anonymous>", "(Lku/v;)V"}, k = 3, mv = {2, 1, 0})
        public static final class c extends nt.m implements Function2<ku.v<? super Object>, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24058t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24059u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f24060v;

            /* JADX INFO: renamed from: lu.q$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0425a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ku.v<Object> f24061a;

                /* JADX INFO: renamed from: lu.q$a$c$a$a, reason: collision with other inner class name */
                @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class C0426a extends nt.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f24062t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0425a<T> f24063u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f24064v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0426a(C0425a<? super T> c0425a, lt.b<? super C0426a> bVar) {
                        super(bVar);
                        this.f24063u = c0425a;
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f24062t = obj;
                        this.f24064v |= Integer.MIN_VALUE;
                        return this.f24063u.emit(null, this);
                    }
                }

                public C0425a(ku.v<Object> vVar) {
                    this.f24061a = vVar;
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
                @Override // lu.i
                public final Object emit(T t8, lt.b<? super Unit> bVar) {
                    C0426a c0426a;
                    if (bVar instanceof C0426a) {
                        c0426a = (C0426a) bVar;
                        int i10 = c0426a.f24064v;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0426a.f24064v = i10 - Integer.MIN_VALUE;
                        } else {
                            c0426a = new C0426a(this, bVar);
                        }
                    } else {
                        c0426a = new C0426a(this, bVar);
                    }
                    Object obj = c0426a.f24062t;
                    Object objE = mt.c.e();
                    int i11 = c0426a.f24064v;
                    if (i11 == 0) {
                        gt.o.b(obj);
                        ku.v<Object> vVar = this.f24061a;
                        if (t8 == null) {
                            t8 = (T) p001mu.t.f25389a;
                        }
                        c0426a.f24064v = 1;
                        if (vVar.z(t8, c0426a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                    }
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(h<? extends T> hVar, lt.b<? super c> bVar) {
                super(2, bVar);
                this.f24060v = hVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                c cVar = new c(this.f24060v, bVar);
                cVar.f24059u = obj;
                return cVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f24058t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    ku.v vVar = (ku.v) this.f24059u;
                    h<T> hVar = this.f24060v;
                    C0425a c0425a = new C0425a(vVar);
                    this.f24058t = 1;
                    if (hVar.collect(c0425a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ku.v<Object> vVar, lt.b<? super Unit> bVar) {
                return ((c) create(vVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Long> function1, h<? extends T> hVar, lt.b<? super a> bVar) {
            super(3, bVar);
            this.f24048y = function1;
            this.f24049z = hVar;
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
          0x00a4: PHI (r6v2 ku.x) = (r6v4 ku.x), (r6v5 ku.x), (r6v5 ku.x) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 lu.i) = (r7v4 lu.i), (r7v5 lu.i), (r7v5 lu.i) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
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
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // xt.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iu.p0 p0Var, i<? super T> iVar, lt.b<? super Unit> bVar) {
            a aVar = new a(this.f24048y, this.f24049z, bVar);
            aVar.f24046w = p0Var;
            aVar.f24047x = iVar;
            return aVar.invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {HttpStatusCode.PAYLOAD_TOO_LARGE_413}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Liu/p0;", "Llu/i;", "downStream", "", "<anonymous>", "(Liu/p0;Llu/i;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b<T> extends nt.m implements xt.n<iu.p0, i<? super T>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f24065t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f24066u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24067v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f24068w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f24069x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h<T> f24070y;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lku/k;", "value", "", "<anonymous>", "(Lku/k;)Z"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<ku.k<? extends T>, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24071t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24072u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i<T> f24073v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f24073v = iVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f24073v, bVar);
                aVar.f24072u = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, lt.b<? super Boolean> bVar) {
                return m(((ku.k) obj).getHolder(), bVar);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to lu.q$b$a for r4v1 'this'  lt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // nt.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r4.f24071t
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f24072u
                    gt.o.b(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    gt.o.b(r5)
                    java.lang.Object r5 = r4.f24072u
                    ku.k r5 = (ku.k) r5
                    java.lang.Object r5 = r5.getHolder()
                    lu.i<T> r1 = r4.f24073v
                    boolean r3 = r5 instanceof ku.k.c
                    if (r3 != 0) goto L37
                    r4.f24072u = r5
                    r4.f24071t = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof ku.k.Closed
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = ku.k.e(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = nt.b.a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = nt.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: lu.q.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object m(Object obj, lt.b<? super Boolean> bVar) {
                return ((a) create(ku.k.b(obj), bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX INFO: renamed from: lu.q$b$b, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0427b extends nt.m implements Function1<lt.b<?>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24074t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f24075u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0427b(long j10, lt.b<? super C0427b> bVar) {
                super(1, bVar);
                this.f24075u = j10;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new C0427b(this.f24075u, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f24074t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                throw new e3("Timed out waiting for " + ((Object) kotlin.time.a.R(this.f24075u)));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<?> bVar) {
                return ((C0427b) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, h<? extends T> hVar, lt.b<? super b> bVar) {
            super(3, bVar);
            this.f24069x = j10;
            this.f24070y = hVar;
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
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r9.f24066u
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f24065t
                java.lang.Object r1 = r9.f24068w
                ku.x r1 = (ku.x) r1
                java.lang.Object r6 = r9.f24067v
                lu.i r6 = (lu.i) r6
                gt.o.b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                gt.o.b(r10)
                java.lang.Object r10 = r9.f24067v
                iu.p0 r10 = (iu.p0) r10
                java.lang.Object r1 = r9.f24068w
                lu.i r1 = (lu.i) r1
                long r4 = r9.f24069x
                kotlin.time.a$a r6 = kotlin.time.a.INSTANCE
                long r6 = r6.b()
                int r4 = kotlin.time.a.j(r4, r6)
                if (r4 <= 0) goto L82
                lu.h<T> r4 = r9.f24070y
                r5 = 0
                r6 = 2
                lu.h r4 = lu.j.c(r4, r5, r3, r6, r3)
                ku.x r10 = lu.j.G(r4, r10)
                long r4 = r9.f24069x
                r6 = r1
                r1 = r10
            L4b:
                ru.k r10 = new ru.k
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                ru.h r7 = r1.C()
                lu.q$b$a r8 = new lu.q$b$a
                r8.<init>(r6, r3)
                r10.a(r7, r8)
                lu.q$b$b r7 = new lu.q$b$b
                r7.<init>(r4, r3)
                ru.c.b(r10, r4, r7)
                r9.f24067v = r6
                r9.f24068w = r1
                r9.f24065t = r4
                r9.f24066u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = kotlin.Unit.f22938a
                return r10
            L82:
                iu.e3 r10 = new iu.e3
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // xt.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iu.p0 p0Var, i<? super T> iVar, lt.b<? super Unit> bVar) {
            b bVar2 = new b(this.f24069x, this.f24070y, bVar);
            bVar2.f24067v = p0Var;
            bVar2.f24068w = iVar;
            return bVar2.invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? hVar : d(hVar, new Function1() { // from class: lu.p
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
        return p001mu.o.b(new a(function1, hVar, null));
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, long j10) {
        return f(hVar, j10);
    }

    public static final <T> h<T> f(h<? extends T> hVar, long j10) {
        return p001mu.o.b(new b(j10, hVar, null));
    }
}
