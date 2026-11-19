package dv;

import av.d2;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "Ldv/h;", "Lav/p0;", "scope", "Ldv/m0;", "started", BuildConfig.FLAVOR, "replay", "Ldv/g0;", "d", "(Ldv/h;Lav/p0;Ldv/m0;I)Ldv/g0;", "Ldv/l0;", "b", "(Ldv/h;I)Ldv/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Ldv/b0;", "shared", "initialValue", "Lav/d2;", "c", "(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;", "Ldv/p0;", "f", "(Ldv/h;Lav/p0;Ldv/m0;Ljava/lang/Object;)Ldv/p0;", "Ldv/c0;", "a", "(Ldv/c0;)Ldv/p0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12957t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ m0 f12958u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<T> f12959v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b0<T> f12960w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ T f12961x;

        /* JADX INFO: renamed from: dv.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR}, k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        public static final class C0249a extends gu.m implements Function2<Integer, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12962t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ int f12963u;

            public C0249a(eu.b<? super C0249a> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                C0249a c0249a = new C0249a(bVar);
                c0249a.f12963u = ((Number) obj).intValue();
                return c0249a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, eu.b<? super Boolean> bVar) {
                return m(num.intValue(), bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f12962t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return gu.b.a(this.f12963u > 0);
            }

            public final Object m(int i10, eu.b<? super Boolean> bVar) {
                return ((C0249a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/k0;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/k0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<k0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12964t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12965u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f12966v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ b0<T> f12967w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ T f12968x;

            /* JADX INFO: renamed from: dv.z$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class C0250a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f12969a;

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
                    f12969a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(h<? extends T> hVar, b0<T> b0Var, T t8, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f12966v = hVar;
                this.f12967w = b0Var;
                this.f12968x = t8;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                b bVar2 = new b(this.f12966v, this.f12967w, this.f12968x, bVar);
                bVar2.f12965u = obj;
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
            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f12964t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    int i11 = C0250a.f12969a[((k0) this.f12965u).ordinal()];
                    if (i11 == 1) {
                        h<T> hVar = this.f12966v;
                        i iVar = this.f12967w;
                        this.f12964t = 1;
                        if (hVar.collect(iVar, this) == objE) {
                            return objE;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new zt.l();
                        }
                        T t8 = this.f12968x;
                        if (t8 == i0.f12767a) {
                            this.f12967w.k();
                        } else {
                            gu.b.a(this.f12967w.a(t8));
                        }
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
            public final Object invoke(k0 k0Var, eu.b<? super Unit> bVar) {
                return ((b) create(k0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0 m0Var, h<? extends T> hVar, b0<T> b0Var, T t8, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f12958u = m0Var;
            this.f12959v = hVar;
            this.f12960w = b0Var;
            this.f12961x = t8;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f12958u, this.f12959v, this.f12960w, this.f12961x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (dv.j.j(r8, r1, r7) == r0) goto L28;
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
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f12957t;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        zt.o.b(obj);
                        h<T> hVar = this.f12959v;
                        i iVar = this.f12960w;
                        this.f12957t = 3;
                    } else if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                zt.o.b(obj);
                return Unit.f21506a;
            }
            zt.o.b(obj);
            m0 m0Var = this.f12958u;
            m0.Companion aVar = m0.INSTANCE;
            if (m0Var != aVar.a()) {
                if (this.f12958u == aVar.b()) {
                    p0<Integer> p0VarF = this.f12960w.f();
                    C0249a c0249a = new C0249a(null);
                    this.f12957t = 2;
                    if (j.u(p0VarF, c0249a, this) != objE) {
                        h<T> hVar2 = this.f12959v;
                        i iVar2 = this.f12960w;
                        this.f12957t = 3;
                    }
                } else {
                    h hVarM = j.m(this.f12958u.a(this.f12960w.f()));
                    b bVar = new b(this.f12959v, this.f12960w, this.f12961x, null);
                    this.f12957t = 4;
                }
                return objE;
            }
            h<T> hVar3 = this.f12959v;
            i iVar3 = this.f12960w;
            this.f12957t = 1;
        }
    }

    @NotNull
    public static final <T> p0<T> a(@NotNull c0<T> c0Var) {
        return new e0(c0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static final <T> l0<T> b(h<? extends T> hVar, int i10) {
        kotlin.e eVar;
        h<T> hVarI;
        int iC = p001kotlin.ranges.d.c(i10, cv.g.INSTANCE.a()) - i10;
        if (!(hVar instanceof kotlin.e) || (hVarI = (eVar = (kotlin.e) hVar).i()) == null) {
            return new l0<>(hVar, iC, cv.a.SUSPEND, p001kotlin.coroutines.e.f21548a);
        }
        int i11 = eVar.capacity;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iC = i11;
        } else if (eVar.onBufferOverflow == cv.a.SUSPEND) {
            if (i11 == 0) {
                iC = 0;
            }
        } else if (i10 == 0) {
            iC = 1;
        } else {
            iC = 0;
        }
        return new l0<>(hVarI, iC, eVar.onBufferOverflow, eVar.context);
    }

    public static final <T> d2 c(av.p0 p0Var, CoroutineContext coroutineContext, h<? extends T> hVar, b0<T> b0Var, m0 m0Var, T t8) {
        return av.i.c(p0Var, coroutineContext, Intrinsics.c(m0Var, m0.INSTANCE.a()) ? av.r0.DEFAULT : av.r0.UNDISPATCHED, new a(m0Var, hVar, b0Var, t8, null));
    }

    @NotNull
    public static final <T> g0<T> d(@NotNull h<? extends T> hVar, @NotNull av.p0 p0Var, @NotNull m0 m0Var, int i10) {
        l0 l0VarB = b(hVar, i10);
        b0 b0VarA = i0.a(i10, l0VarB.extraBufferCapacity, l0VarB.onBufferOverflow);
        return new d0(b0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, b0VarA, m0Var, i0.f12767a));
    }

    public static /* synthetic */ g0 e(h hVar, av.p0 p0Var, m0 m0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return j.K(hVar, p0Var, m0Var, i10);
    }

    @NotNull
    public static final <T> p0<T> f(@NotNull h<? extends T> hVar, @NotNull av.p0 p0Var, @NotNull m0 m0Var, T t8) {
        l0 l0VarB = b(hVar, 1);
        c0 c0VarA = r0.a(t8);
        return new e0(c0VarA, c(p0Var, l0VarB.context, l0VarB.upstream, c0VarA, m0Var, t8));
    }
}
