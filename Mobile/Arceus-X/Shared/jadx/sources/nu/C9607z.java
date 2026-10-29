package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import mu.EnumC8666a;
import mu.InterfaceC8672g;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7872i;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.AbstractC10055e;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.z */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"T", "Lnu/h;", "Lku/p0;", "scope", "Lnu/m0;", "started", "", "replay", "Lnu/g0;", "d", "(Lnu/h;Lku/p0;Lnu/m0;I)Lnu/g0;", "Lnu/l0;", "b", "(Lnu/h;I)Lnu/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lnu/b0;", "shared", "initialValue", "Lku/d2;", "c", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lnu/h;Lnu/b0;Lnu/m0;Ljava/lang/Object;)Lku/d2;", "Lnu/p0;", "f", "(Lnu/h;Lku/p0;Lnu/m0;Ljava/lang/Object;)Lnu/p0;", "Lnu/c0;", "a", "(Lnu/c0;)Lnu/p0;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9607z {

    /* JADX INFO: renamed from: nu.z$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m39664f = "Share.kt", m39665l = {210, 214, 215, 221}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34815t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC9586m0 f34816u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9575h<T> f34817v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC9564b0<T> f34818w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ T f34819x;

        /* JADX INFO: renamed from: nu.z$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "it", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m39664f = "Share.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class C14215a extends AbstractC10351m implements Function2<Integer, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34820t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ int f34821u;

            public C14215a(InterfaceC9557b<? super C14215a> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                C14215a c14215a = new C14215a(interfaceC9557b);
                c14215a.f34821u = ((Number) obj).intValue();
                return c14215a;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return m37908q(num.intValue(), interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f34820t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C10340b.m39658a(this.f34821u > 0);
            }

            /* JADX INFO: renamed from: q */
            public final Object m37908q(int i10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((C14215a) create(Integer.valueOf(i10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: nu.z$a$b */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/k0;", "it", "", "<anonymous>", "(Lnu/k0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m39664f = "Share.kt", m39665l = {223}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<EnumC9582k0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34822t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34823u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC9575h<T> f34824v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ InterfaceC9564b0<T> f34825w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ T f34826x;

            /* JADX INFO: renamed from: nu.z$a$b$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public /* synthetic */ class C14216a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f34827a;

                static {
                    int[] iArr = new int[EnumC9582k0.values().length];
                    try {
                        iArr[EnumC9582k0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC9582k0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC9582k0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f34827a = iArr;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9564b0<T> interfaceC9564b0, T t8, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f34824v = interfaceC9575h;
                this.f34825w = interfaceC9564b0;
                this.f34826x = t8;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                b bVar = new b(this.f34824v, this.f34825w, this.f34826x, interfaceC9557b);
                bVar.f34823u = obj;
                return bVar;
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
            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f34822t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    int i11 = C14216a.f34827a[((EnumC9582k0) this.f34823u).ordinal()];
                    if (i11 == 1) {
                        InterfaceC9575h<T> interfaceC9575h = this.f34824v;
                        InterfaceC9577i interfaceC9577i = this.f34825w;
                        this.f34822t = 1;
                        if (interfaceC9575h.collect(interfaceC9577i, this) == objM38805e) {
                            return objM38805e;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new C7345l();
                        }
                        T t8 = this.f34826x;
                        if (t8 == C9578i0.f34601a) {
                            this.f34825w.mo37709j();
                        } else {
                            C10340b.m39658a(this.f34825w.mo37707a(t8));
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC9582k0 enumC9582k0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(enumC9582k0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.h<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9586m0 interfaceC9586m0, InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9564b0<T> interfaceC9564b0, T t8, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34816u = interfaceC9586m0;
            this.f34817v = interfaceC9575h;
            this.f34818w = interfaceC9564b0;
            this.f34819x = t8;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f34816u, this.f34817v, this.f34818w, this.f34819x, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (nu.C9579j.m37793j(r8, r1, r7) == r0) goto L28;
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f34815t;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        C7348o.m30470b(obj);
                        InterfaceC9575h<T> interfaceC9575h = this.f34817v;
                        InterfaceC9577i interfaceC9577i = this.f34818w;
                        this.f34815t = 3;
                    } else if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C7348o.m30470b(obj);
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            InterfaceC9586m0 interfaceC9586m0 = this.f34816u;
            InterfaceC9586m0.Companion aVar = InterfaceC9586m0.INSTANCE;
            if (interfaceC9586m0 != aVar.m37829a()) {
                if (this.f34816u == aVar.m37830b()) {
                    InterfaceC9592p0<Integer> interfaceC9592p0M37708g = this.f34818w.m37708g();
                    C14215a c14215a = new C14215a(null);
                    this.f34815t = 2;
                    if (C9579j.m37803t(interfaceC9592p0M37708g, c14215a, this) != objM38805e) {
                        InterfaceC9575h<T> interfaceC9575h2 = this.f34817v;
                        InterfaceC9577i interfaceC9577i2 = this.f34818w;
                        this.f34815t = 3;
                    }
                } else {
                    InterfaceC9575h interfaceC9575hM37796m = C9579j.m37796m(this.f34816u.mo37828a(this.f34818w.m37708g()));
                    b bVar = new b(this.f34817v, this.f34818w, this.f34819x, null);
                    this.f34815t = 4;
                }
                return objM38805e;
            }
            InterfaceC9575h<T> interfaceC9575h3 = this.f34817v;
            InterfaceC9577i interfaceC9577i3 = this.f34818w;
            this.f34815t = 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9592p0<T> m37902a(@NotNull InterfaceC9566c0<T> interfaceC9566c0) {
        return new C9570e0(interfaceC9566c0, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX INFO: renamed from: b */
    public static final <T> C9584l0<T> m37903b(InterfaceC9575h<? extends T> interfaceC9575h, int i10) {
        AbstractC10055e abstractC10055e;
        InterfaceC9575h<T> interfaceC9575hMo37714h;
        int iM32078c = C7764d.m32078c(i10, InterfaceC8672g.INSTANCE.m34923a()) - i10;
        if (!(interfaceC9575h instanceof AbstractC10055e) || (interfaceC9575hMo37714h = (abstractC10055e = (AbstractC10055e) interfaceC9575h).mo37714h()) == null) {
            return new C9584l0<>(interfaceC9575h, iM32078c, EnumC8666a.SUSPEND, C7721e.f29393a);
        }
        int i11 = abstractC10055e.capacity;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iM32078c = i11;
        } else if (abstractC10055e.onBufferOverflow == EnumC8666a.SUSPEND) {
            if (i11 == 0) {
                iM32078c = 0;
            }
        } else if (i10 == 0) {
            iM32078c = 1;
        } else {
            iM32078c = 0;
        }
        return new C9584l0<>(interfaceC9575hMo37714h, iM32078c, abstractC10055e.onBufferOverflow, abstractC10055e.context);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC7850d2 m37904c(InterfaceC7906p0 interfaceC7906p0, CoroutineContext coroutineContext, InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9564b0<T> interfaceC9564b0, InterfaceC9586m0 interfaceC9586m0, T t8) {
        return C7872i.m32680c(interfaceC7906p0, coroutineContext, Intrinsics.m31980c(interfaceC9586m0, InterfaceC9586m0.INSTANCE.m37829a()) ? EnumC7914r0.DEFAULT : EnumC7914r0.UNDISPATCHED, new a(interfaceC9586m0, interfaceC9575h, interfaceC9564b0, t8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC9574g0<T> m37905d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull InterfaceC9586m0 interfaceC9586m0, int i10) {
        C9584l0 c9584l0M37903b = m37903b(interfaceC9575h, i10);
        InterfaceC9564b0 interfaceC9564b0M37757a = C9578i0.m37757a(i10, c9584l0M37903b.extraBufferCapacity, c9584l0M37903b.onBufferOverflow);
        return new C9568d0(interfaceC9564b0M37757a, m37904c(interfaceC7906p0, c9584l0M37903b.context, c9584l0M37903b.upstream, interfaceC9564b0M37757a, interfaceC9586m0, C9578i0.f34601a));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC9574g0 m37906e(InterfaceC9575h interfaceC9575h, InterfaceC7906p0 interfaceC7906p0, InterfaceC9586m0 interfaceC9586m0, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C9579j.m37773J(interfaceC9575h, interfaceC7906p0, interfaceC9586m0, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC9592p0<T> m37907f(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull InterfaceC9586m0 interfaceC9586m0, T t8) {
        C9584l0 c9584l0M37903b = m37903b(interfaceC9575h, 1);
        InterfaceC9566c0 interfaceC9566c0M37859a = C9596r0.m37859a(t8);
        return new C9570e0(interfaceC9566c0M37859a, m37904c(interfaceC7906p0, c9584l0M37903b.context, c9584l0M37903b.upstream, interfaceC9566c0M37859a, interfaceC9586m0, t8));
    }
}
