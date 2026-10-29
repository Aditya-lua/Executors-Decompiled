package p617ou;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.EnumC8666a;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lou/i;", "T", "R", "Lou/g;", "Lkotlin/Function3;", "Lnu/i;", "Lnt/b;", "", "", "transform", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lzt/n;Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "collector", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "e", "Lzt/n;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10059i<T, R> extends AbstractC10057g<T, R> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<InterfaceC9577i<? super R>, T, InterfaceC9557b<? super Unit>, Object> transform;

    /* JADX INFO: renamed from: ou.i$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m39664f = "Merge.kt", m39665l = {23}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36214t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36215u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C10059i<T, R> f36216v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC9577i<R> f36217w;

        /* JADX INFO: renamed from: ou.i$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14224a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7729c0<InterfaceC7850d2> f36218a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC7906p0 f36219b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C10059i<T, R> f36220c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC9577i<R> f36221d;

            /* JADX INFO: renamed from: ou.i$a$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m39664f = "Merge.kt", m39665l = {30}, m39666m = "invokeSuspend")
            public static final class C14225a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f36222t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C10059i<T, R> f36223u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ InterfaceC9577i<R> f36224v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ T f36225w;

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super R> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C14225a(C10059i<T, R> c10059i, InterfaceC9577i<? super R> interfaceC9577i, T t8, InterfaceC9557b<? super C14225a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f36223u = c10059i;
                    this.f36224v = interfaceC9577i;
                    this.f36225w = t8;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new C14225a(this.f36223u, this.f36224v, this.f36225w, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f36222t;
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC14057n interfaceC14057n = this.f36223u.transform;
                        InterfaceC9577i<R> interfaceC9577i = this.f36224v;
                        T t8 = this.f36225w;
                        this.f36222t = 1;
                        if (interfaceC14057n.invoke(interfaceC9577i, t8, this) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14225a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: ou.i$a$a$b */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m39664f = "Merge.kt", m39665l = {26}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class b extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public Object f36226t;

                /* JADX INFO: renamed from: u */
                public Object f36227u;

                /* JADX INFO: renamed from: v */
                public Object f36228v;

                /* JADX INFO: renamed from: w */
                public /* synthetic */ Object f36229w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C14224a<T> f36230x;

                /* JADX INFO: renamed from: y */
                public int f36231y;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ou.i$a$a<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C14224a<? super T> c14224a, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(interfaceC9557b);
                    this.f36230x = c14224a;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f36229w = obj;
                    this.f36231y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f36230x.emit(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: nu.i<? super R> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14224a(C7729c0<InterfaceC7850d2> c7729c0, InterfaceC7906p0 interfaceC7906p0, C10059i<T, R> c10059i, InterfaceC9577i<? super R> interfaceC9577i) {
                this.f36218a = c7729c0;
                this.f36219b = interfaceC7906p0;
                this.f36220c = c10059i;
                this.f36221d = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                b bVar;
                C14224a<T> c14224a;
                if (interfaceC9557b instanceof b) {
                    bVar = (b) interfaceC9557b;
                    int i10 = bVar.f36231y;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        bVar.f36231y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        bVar = new b(this, interfaceC9557b);
                    }
                } else {
                    bVar = new b(this, interfaceC9557b);
                }
                Object obj = bVar.f36229w;
                Object objM38805e = C10047c.m38805e();
                int i11 = bVar.f36231y;
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC7850d2 interfaceC7850d2 = this.f36218a.f29425a;
                    if (interfaceC7850d2 != null) {
                        interfaceC7850d2.mo32597c(new C10061k());
                        bVar.f36226t = this;
                        bVar.f36227u = t8;
                        bVar.f36228v = interfaceC7850d2;
                        bVar.f36231y = 1;
                        if (interfaceC7850d2.mo32596L(bVar) == objM38805e) {
                            return objM38805e;
                        }
                    }
                    c14224a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8 = (T) bVar.f36227u;
                    c14224a = (C14224a) bVar.f36226t;
                    C7348o.m30470b(obj);
                }
                c14224a.f36218a.f29425a = (T) C7882k.m32780d(c14224a.f36219b, null, EnumC7914r0.UNDISPATCHED, new C14225a(c14224a.f36220c, c14224a.f36221d, t8, null), 1, null);
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C10059i<T, R> c10059i, InterfaceC9577i<? super R> interfaceC9577i, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36216v = c10059i;
            this.f36217w = interfaceC9577i;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f36216v, this.f36217w, interfaceC9557b);
            aVar.f36215u = obj;
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
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r7.f36214t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p229jt.C7348o.m30470b(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                p229jt.C7348o.m30470b(r8)
                java.lang.Object r8 = r7.f36215u
                ku.p0 r8 = (p256ku.InterfaceC7906p0) r8
                kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
                r1.<init>()
                ou.i<T, R> r3 = r7.f36216v
                nu.h<S> r4 = r3.flow
                ou.i$a$a r5 = new ou.i$a$a
                nu.i<R> r6 = r7.f36217w
                r5.<init>(r1, r8, r3, r6)
                r7.f36214t = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.Unit r8 = kotlin.Unit.f29331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p617ou.C10059i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
      (r7v0 zt.n)
      (r8v0 nu.h)
      (wrap kotlin.coroutines.CoroutineContext:0x0006: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r9v0 kotlin.coroutines.CoroutineContext))
      (wrap int:0x000c: TERNARY null = ((wrap int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r10v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x0011: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r11v0 mu.a))
     A[MD:(zt.n<? super nu.i<? super R>, ? super T, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object>, nu.h<? extends T>, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: ou.i.<init>(zt.n, nu.h, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C10059i(InterfaceC14057n interfaceC14057n, InterfaceC9575h interfaceC9575h, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14057n, interfaceC9575h, (i11 & 4) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<R> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C10059i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p617ou.AbstractC10057g
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo38828q(@NotNull InterfaceC9577i<? super R> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32891g = C7910q0.m32891g(new a(this, interfaceC9577i, null), interfaceC9557b);
        return objM32891g == C10047c.m38805e() ? objM32891g : Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: zt.n<? super nu.i<? super R>, ? super T, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10059i(@NotNull InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n, @NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(interfaceC9575h, coroutineContext, i10, enumC8666a);
        this.transform = interfaceC14057n;
    }
}
