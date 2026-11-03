package lu;

import iu.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "Llu/h;", "Liu/p0;", "scope", "Llu/m0;", "started", "", "replay", "Llu/g0;", "d", "(Llu/h;Liu/p0;Llu/m0;I)Llu/g0;", "Llu/l0;", "b", "(Llu/h;I)Llu/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Llu/b0;", "shared", "initialValue", "Liu/d2;", "c", "(Liu/p0;Lkotlin/coroutines/CoroutineContext;Llu/h;Llu/b0;Llu/m0;Ljava/lang/Object;)Liu/d2;", "Llu/p0;", "f", "(Llu/h;Liu/p0;Llu/m0;Ljava/lang/Object;)Llu/p0;", "Llu/c0;", "a", "(Llu/c0;)Llu/p0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class z {

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24200t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ m0 f24201u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<T> f24202v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b0<T> f24203w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ T f24204x;

        /* JADX INFO: renamed from: lu.z$a$a, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0430a extends nt.m implements Function2<Integer, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24205t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ int f24206u;

            public C0430a(lt.b<? super C0430a> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                C0430a c0430a = new C0430a(bVar);
                c0430a.f24206u = ((Number) obj).intValue();
                return c0430a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, lt.b<? super Boolean> bVar) {
                return m(num.intValue(), bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f24205t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return nt.b.a(this.f24206u > 0);
            }

            public final Object m(int i10, lt.b<? super Boolean> bVar) {
                return ((C0430a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/k0;", "it", "", "<anonymous>", "(Llu/k0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class b extends nt.m implements Function2<k0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24207t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24208u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f24209v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ b0<T> f24210w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ T f24211x;

            /* JADX INFO: renamed from: lu.z$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class C0431a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f24212a;

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
                    f24212a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(h<? extends T> hVar, b0<T> b0Var, T t8, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f24209v = hVar;
                this.f24210w = b0Var;
                this.f24211x = t8;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                b bVar2 = new b(this.f24209v, this.f24210w, this.f24211x, bVar);
                bVar2.f24208u = obj;
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
            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f24207t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    int i11 = C0431a.f24212a[((k0) this.f24208u).ordinal()];
                    if (i11 == 1) {
                        h<T> hVar = this.f24209v;
                        h hVar2 = this.f24210w;
                        this.f24207t = 1;
                        if (hVar.collect(hVar2, this) == objE) {
                            return objE;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new gt.l();
                        }
                        T t8 = this.f24211x;
                        if (t8 == i0.f24010a) {
                            this.f24210w.i();
                        } else {
                            nt.b.a(this.f24210w.a(t8));
                        }
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
            public final Object invoke(k0 k0Var, lt.b<? super Unit> bVar) {
                return ((b) create(k0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0 m0Var, h<? extends T> hVar, b0<T> b0Var, T t8, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f24201u = m0Var;
            this.f24202v = hVar;
            this.f24203w = b0Var;
            this.f24204x = t8;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f24201u, this.f24202v, this.f24203w, this.f24204x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (lu.j.j(r8, r1, r7) == r0) goto L28;
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
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r7.f24200t
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
                gt.o.b(r8)
                goto L5c
            L21:
                gt.o.b(r8)
                goto L8d
            L25:
                gt.o.b(r8)
                lu.m0 r8 = r7.f24201u
                lu.m0$a r1 = lu.m0.INSTANCE
                lu.m0 r6 = r1.a()
                if (r8 != r6) goto L3f
                lu.h<T> r8 = r7.f24202v
                lu.b0<T> r1 = r7.f24203w
                r7.f24200t = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                lu.m0 r8 = r7.f24201u
                lu.m0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                lu.b0<T> r8 = r7.f24203w
                lu.p0 r8 = r8.f()
                lu.z$a$a r1 = new lu.z$a$a
                r1.<init>(r5)
                r7.f24200t = r4
                java.lang.Object r8 = lu.j.t(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                lu.h<T> r8 = r7.f24202v
                lu.b0<T> r1 = r7.f24203w
                r7.f24200t = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                lu.m0 r8 = r7.f24201u
                lu.b0<T> r1 = r7.f24203w
                lu.p0 r1 = r1.f()
                lu.h r8 = r8.a(r1)
                lu.h r8 = lu.j.m(r8)
                lu.z$a$b r1 = new lu.z$a$b
                lu.h<T> r3 = r7.f24202v
                lu.b0<T> r4 = r7.f24203w
                T r6 = r7.f24204x
                r1.<init>(r3, r4, r6, r5)
                r7.f24200t = r2
                java.lang.Object r8 = lu.j.j(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> p0<T> a(@NotNull c0<T> c0Var) {
        return new e0(c0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static final <T> l0<T> b(h<? extends T> hVar, int i10) {
        p001mu.e eVar;
        h<T> hVarG;
        int iC = kotlin.ranges.d.c(i10, ku.g.INSTANCE.a()) - i10;
        if (!(hVar instanceof p001mu.e) || (hVarG = (eVar = (p001mu.e) hVar).g()) == null) {
            return new l0<>(hVar, iC, ku.a.SUSPEND, kotlin.coroutines.e.f22980a);
        }
        int i11 = eVar.capacity;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iC = i11;
        } else if (eVar.onBufferOverflow == ku.a.SUSPEND) {
            if (i11 == 0) {
                iC = 0;
            }
        } else if (i10 == 0) {
            iC = 1;
        } else {
            iC = 0;
        }
        return new l0<>(hVarG, iC, eVar.onBufferOverflow, eVar.context);
    }

    public static final <T> d2 c(iu.p0 p0Var, CoroutineContext coroutineContext, h<? extends T> hVar, b0<T> b0Var, m0 m0Var, T t8) {
        return iu.i.c(p0Var, coroutineContext, Intrinsics.c(m0Var, m0.INSTANCE.a()) ? iu.r0.DEFAULT : iu.r0.UNDISPATCHED, new a(m0Var, hVar, b0Var, t8, null));
    }

    @NotNull
    public static final <T> g0<T> d(@NotNull h<? extends T> hVar, @NotNull iu.p0 p0Var, @NotNull m0 m0Var, int i10) {
        l0 l0VarB = b(hVar, i10);
        b0 b0VarA = i0.a(i10, l0VarB.extraBufferCapacity, l0VarB.onBufferOverflow);
        return new d0(b0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, b0VarA, m0Var, i0.f24010a));
    }

    public static /* synthetic */ g0 e(h hVar, iu.p0 p0Var, m0 m0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return j.J(hVar, p0Var, m0Var, i10);
    }

    @NotNull
    public static final <T> p0<T> f(@NotNull h<? extends T> hVar, @NotNull iu.p0 p0Var, @NotNull m0 m0Var, T t8) {
        l0 l0VarB = b(hVar, 1);
        c0 c0VarA = r0.a(t8);
        return new e0(c0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, c0VarA, m0Var, t8));
    }
}
