package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "Lnu/h;", "Lku/p0;", "scope", "Lnu/m0;", "started", "", "replay", "Lnu/g0;", "d", "(Lnu/h;Lku/p0;Lnu/m0;I)Lnu/g0;", "Lnu/l0;", "b", "(Lnu/h;I)Lnu/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lnu/b0;", "shared", "initialValue", "Lku/d2;", "c", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lnu/h;Lnu/b0;Lnu/m0;Ljava/lang/Object;)Lku/d2;", "Lnu/p0;", "f", "(Lnu/h;Lku/p0;Lnu/m0;Ljava/lang/Object;)Lnu/p0;", "Lnu/c0;", "a", "(Lnu/c0;)Lnu/p0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26911t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ m0 f26912u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<T> f26913v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b0<T> f26914w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ T f26915x;

        /* JADX INFO: renamed from: nu.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        public static final class C0462a extends pt.m implements Function2<Integer, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26916t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ int f26917u;

            public C0462a(nt.b<? super C0462a> bVar) {
                super(2, bVar);
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                C0462a c0462a = new C0462a(bVar);
                c0462a.f26917u = ((Number) obj).intValue();
                return c0462a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, nt.b<? super Boolean> bVar) {
                return q(num.intValue(), bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f26916t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return pt.b.a(this.f26917u > 0);
            }

            public final Object q(int i10, nt.b<? super Boolean> bVar) {
                return ((C0462a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/k0;", "it", "", "<anonymous>", "(Lnu/k0;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<k0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26918t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26919u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f26920v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ b0<T> f26921w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ T f26922x;

            /* JADX INFO: renamed from: nu.z$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class C0463a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f26923a;

                static {
                    int[] iArr = new int[k0.values().length];
                    try {
                        iArr[k0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f26923a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(h<? extends T> hVar, b0<T> b0Var, T t8, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f26920v = hVar;
                this.f26921w = b0Var;
                this.f26922x = t8;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                b bVar2 = new b(this.f26920v, this.f26921w, this.f26922x, bVar);
                bVar2.f26919u = obj;
                return bVar2;
            }

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
            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f26918t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    int i11 = C0463a.f26923a[((k0) this.f26919u).ordinal()];
                    if (i11 == 1) {
                        h<T> hVar = this.f26920v;
                        i iVar = this.f26921w;
                        this.f26918t = 1;
                        if (hVar.collect(iVar, this) == objE) {
                            return objE;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new jt.l();
                        }
                        T t8 = this.f26922x;
                        if (t8 == i0.f26721a) {
                            this.f26921w.j();
                        } else {
                            pt.b.a(this.f26921w.a(t8));
                        }
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
            public final Object invoke(k0 k0Var, nt.b<? super Unit> bVar) {
                return ((b) create(k0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0 m0Var, h<? extends T> hVar, b0<T> b0Var, T t8, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f26912u = m0Var;
            this.f26913v = hVar;
            this.f26914w = b0Var;
            this.f26915x = t8;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f26912u, this.f26913v, this.f26914w, this.f26915x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (nu.j.j(r8, r1, r7) == r0) goto L28;
         */
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
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r7.f26911t
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                jt.o.b(r8)
                goto L5c
            L21:
                jt.o.b(r8)
                goto L8d
            L25:
                jt.o.b(r8)
                nu.m0 r8 = r7.f26912u
                nu.m0$a r1 = nu.m0.INSTANCE
                nu.m0 r6 = r1.a()
                if (r8 != r6) goto L3f
                nu.h<T> r8 = r7.f26913v
                nu.b0<T> r1 = r7.f26914w
                r7.f26911t = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                nu.m0 r8 = r7.f26912u
                nu.m0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                nu.b0<T> r8 = r7.f26914w
                nu.p0 r8 = r8.g()
                nu.z$a$a r1 = new nu.z$a$a
                r1.<init>(r5)
                r7.f26911t = r4
                java.lang.Object r8 = nu.j.t(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                nu.h<T> r8 = r7.f26913v
                nu.b0<T> r1 = r7.f26914w
                r7.f26911t = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                nu.m0 r8 = r7.f26912u
                nu.b0<T> r1 = r7.f26914w
                nu.p0 r1 = r1.g()
                nu.h r8 = r8.a(r1)
                nu.h r8 = nu.j.m(r8)
                nu.z$a$b r1 = new nu.z$a$b
                nu.h<T> r3 = r7.f26913v
                nu.b0<T> r4 = r7.f26914w
                T r6 = r7.f26915x
                r1.<init>(r3, r4, r6, r5)
                r7.f26911t = r2
                java.lang.Object r8 = nu.j.j(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f22483a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @NotNull
    public static final <T> p0<T> a(@NotNull c0<T> c0Var) {
        return new e0(c0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static final <T> l0<T> b(h<? extends T> hVar, int i10) {
        p001ou.e eVar;
        h<T> hVarH;
        int iC = kotlin.ranges.d.c(i10, mu.g.INSTANCE.a()) - i10;
        if (!(hVar instanceof p001ou.e) || (hVarH = (eVar = (p001ou.e) hVar).h()) == null) {
            return new l0<>(hVar, iC, mu.a.SUSPEND, kotlin.coroutines.e.f22525a);
        }
        int i11 = eVar.capacity;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iC = i11;
        } else if (eVar.onBufferOverflow == mu.a.SUSPEND) {
            if (i11 == 0) {
                iC = 0;
            }
        } else if (i10 == 0) {
            iC = 1;
        } else {
            iC = 0;
        }
        return new l0<>(hVarH, iC, eVar.onBufferOverflow, eVar.context);
    }

    public static final <T> d2 c(ku.p0 p0Var, CoroutineContext coroutineContext, h<? extends T> hVar, b0<T> b0Var, m0 m0Var, T t8) {
        return ku.i.c(p0Var, coroutineContext, Intrinsics.c(m0Var, m0.INSTANCE.a()) ? ku.r0.DEFAULT : ku.r0.UNDISPATCHED, new a(m0Var, hVar, b0Var, t8, null));
    }

    @NotNull
    public static final <T> g0<T> d(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var, @NotNull m0 m0Var, int i10) {
        l0 l0VarB = b(hVar, i10);
        b0 b0VarA = i0.a(i10, l0VarB.extraBufferCapacity, l0VarB.onBufferOverflow);
        return new d0(b0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, b0VarA, m0Var, i0.f26721a));
    }

    public static /* synthetic */ g0 e(h hVar, ku.p0 p0Var, m0 m0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return j.J(hVar, p0Var, m0Var, i10);
    }

    @NotNull
    public static final <T> p0<T> f(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var, @NotNull m0 m0Var, T t8) {
        l0 l0VarB = b(hVar, 1);
        c0 c0VarA = r0.a(t8);
        return new e0(c0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, c0VarA, m0Var, t8));
    }
}
