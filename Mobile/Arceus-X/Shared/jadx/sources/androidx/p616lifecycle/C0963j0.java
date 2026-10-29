package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: androidx.lifecycle.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/l$b;", "state", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "", "block", "a", "(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/s;", "b", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "lifecycle-runtime"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0963j0 {

    /* JADX INFO: renamed from: androidx.lifecycle.j0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m39664f = "RepeatOnLifecycle.kt", m39665l = {83}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f3652t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f3653u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC0966l f3654v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC0966l.b f3655w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f3656x;

        /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
        @InterfaceC10344f(m39663c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m39664f = "RepeatOnLifecycle.kt", m39665l = {161}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class C14078a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ AbstractC0966l f3657A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ AbstractC0966l.b f3658B;

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ InterfaceC7906p0 f3659C;

            /* JADX INFO: renamed from: D */
            public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f3660D;

            /* JADX INFO: renamed from: t */
            public Object f3661t;

            /* JADX INFO: renamed from: u */
            public Object f3662u;

            /* JADX INFO: renamed from: v */
            public Object f3663v;

            /* JADX INFO: renamed from: w */
            public Object f3664w;

            /* JADX INFO: renamed from: x */
            public Object f3665x;

            /* JADX INFO: renamed from: y */
            public Object f3666y;

            /* JADX INFO: renamed from: z */
            public int f3667z;

            /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
            public static final class C14079a implements InterfaceC0974p {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0966l.a f3668a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C7729c0<InterfaceC7850d2> f3669b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7906p0 f3670c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC0966l.a f3671d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7897n<Unit> f3672e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC11970a f3673f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f3674g;

                /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
                @InterfaceC10344f(m39663c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m39664f = "RepeatOnLifecycle.kt", m39665l = {166, 110}, m39666m = "invokeSuspend", m39667v = 1)
                public static final class C14080a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t */
                    public Object f3675t;

                    /* JADX INFO: renamed from: u */
                    public Object f3676u;

                    /* JADX INFO: renamed from: v */
                    public int f3677v;

                    /* JADX INFO: renamed from: w */
                    public final /* synthetic */ InterfaceC11970a f3678w;

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f3679x;

                    /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a$a, reason: collision with other inner class name */
                    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
                    @InterfaceC10344f(m39663c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", m39664f = "RepeatOnLifecycle.kt", m39665l = {110}, m39666m = "invokeSuspend", m39667v = 1)
                    public static final class C14081a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                        /* JADX INFO: renamed from: t */
                        public int f3680t;

                        /* JADX INFO: renamed from: u */
                        public /* synthetic */ Object f3681u;

                        /* JADX INFO: renamed from: v */
                        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f3682v;

                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14081a(Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super C14081a> interfaceC9557b) {
                            super(2, interfaceC9557b);
                            this.f3682v = function2;
                        }

                        @Override // pt.AbstractC10339a
                        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                            C14081a c14081a = new C14081a(this.f3682v, interfaceC9557b);
                            c14081a.f3681u = obj;
                            return c14081a;
                        }

                        @Override // pt.AbstractC10339a
                        public final Object invokeSuspend(Object obj) {
                            Object objM38805e = C10047c.m38805e();
                            int i10 = this.f3680t;
                            if (i10 == 0) {
                                C7348o.m30470b(obj);
                                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f3681u;
                                Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> function2 = this.f3682v;
                                this.f3680t = 1;
                                if (function2.invoke(interfaceC7906p0, this) == objM38805e) {
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
                            return ((C14081a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                        }
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C14080a(InterfaceC11970a interfaceC11970a, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super C14080a> interfaceC9557b) {
                        super(2, interfaceC9557b);
                        this.f3678w = interfaceC11970a;
                        this.f3679x = function2;
                    }

                    @Override // pt.AbstractC10339a
                    public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                        return new C14080a(this.f3678w, this.f3679x, interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        InterfaceC11970a interfaceC11970a;
                        Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> function2;
                        InterfaceC11970a interfaceC11970a2;
                        Throwable th2;
                        Object objM38805e = C10047c.m38805e();
                        int i10 = this.f3677v;
                        try {
                            if (i10 == 0) {
                                C7348o.m30470b(obj);
                                interfaceC11970a = this.f3678w;
                                function2 = this.f3679x;
                                this.f3675t = interfaceC11970a;
                                this.f3676u = function2;
                                this.f3677v = 1;
                                if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                                }
                                return objM38805e;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC11970a2 = (InterfaceC11970a) this.f3675t;
                                try {
                                    C7348o.m30470b(obj);
                                    Unit unit = Unit.f29331a;
                                    interfaceC11970a2.mo44673e(null);
                                    return Unit.f29331a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    interfaceC11970a2.mo44673e(null);
                                    throw th2;
                                }
                            }
                            function2 = (Function2) this.f3676u;
                            InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) this.f3675t;
                            C7348o.m30470b(obj);
                            interfaceC11970a = interfaceC11970a3;
                            C14081a c14081a = new C14081a(function2, null);
                            this.f3675t = interfaceC11970a;
                            this.f3676u = null;
                            this.f3677v = 2;
                            if (C7910q0.m32891g(c14081a, this) != objM38805e) {
                                interfaceC11970a2 = interfaceC11970a;
                                Unit unit2 = Unit.f29331a;
                                interfaceC11970a2.mo44673e(null);
                                return Unit.f29331a;
                            }
                            return objM38805e;
                        } catch (Throwable th4) {
                            interfaceC11970a2 = interfaceC11970a;
                            th2 = th4;
                            interfaceC11970a2.mo44673e(null);
                            throw th2;
                        }
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                        return ((C14080a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                    }
                }

                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: ku.n<? super kotlin.Unit> */
                /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
                /* JADX WARN: Multi-variable type inference failed */
                public C14079a(AbstractC0966l.a aVar, C7729c0<InterfaceC7850d2> c7729c0, InterfaceC7906p0 interfaceC7906p0, AbstractC0966l.a aVar2, InterfaceC7897n<? super Unit> interfaceC7897n, InterfaceC11970a interfaceC11970a, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
                    this.f3668a = aVar;
                    this.f3669b = c7729c0;
                    this.f3670c = interfaceC7906p0;
                    this.f3671d = aVar2;
                    this.f3672e = interfaceC7897n;
                    this.f3673f = interfaceC11970a;
                    this.f3674g = function2;
                }

                /* JADX WARN: Type inference failed for: r9v5, types: [T, ku.d2] */
                @Override // androidx.p616lifecycle.InterfaceC0974p
                /* JADX INFO: renamed from: g */
                public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a event) {
                    Intrinsics.checkNotNullParameter(interfaceC0980s, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == this.f3668a) {
                        this.f3669b.f29425a = C7882k.m32780d(this.f3670c, null, null, new C14080a(this.f3673f, this.f3674g, null), 3, null);
                        return;
                    }
                    if (event == this.f3671d) {
                        InterfaceC7850d2 interfaceC7850d2 = this.f3669b.f29425a;
                        if (interfaceC7850d2 != null) {
                            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                        }
                        this.f3669b.f29425a = null;
                    }
                    if (event == AbstractC0966l.a.ON_DESTROY) {
                        InterfaceC7897n<Unit> interfaceC7897n = this.f3672e;
                        C7347n.Companion companion = C7347n.INSTANCE;
                        interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
                    }
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14078a(AbstractC0966l abstractC0966l, AbstractC0966l.b bVar, InterfaceC7906p0 interfaceC7906p0, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super C14078a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f3657A = abstractC0966l;
                this.f3658B = bVar;
                this.f3659C = interfaceC7906p0;
                this.f3660D = function2;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14078a(this.f3657A, this.f3658B, this.f3659C, this.f3660D, interfaceC9557b);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.j0$a$a$a, java.lang.Object] */
            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C7729c0 c7729c0;
                Throwable th2;
                C7729c0 c7729c1;
                InterfaceC7850d2 interfaceC7850d2;
                InterfaceC0974p interfaceC0974p;
                InterfaceC7850d2 interfaceC7850d3;
                InterfaceC0974p interfaceC0974p2;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f3667z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7729c0 = (C7729c0) this.f3662u;
                    c7729c1 = (C7729c0) this.f3661t;
                    try {
                        C7348o.m30470b(obj);
                        interfaceC7850d3 = (InterfaceC7850d2) c7729c1.f29425a;
                        if (interfaceC7850d3 != null) {
                            InterfaceC7850d2.a.m32603a(interfaceC7850d3, null, 1, null);
                        }
                        interfaceC0974p2 = (InterfaceC0974p) c7729c0.f29425a;
                        if (interfaceC0974p2 != null) {
                            this.f3657A.mo4938d(interfaceC0974p2);
                        }
                        return Unit.f29331a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC7850d2 = (InterfaceC7850d2) c7729c1.f29425a;
                        if (interfaceC7850d2 != null) {
                            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                        }
                        interfaceC0974p = (InterfaceC0974p) c7729c0.f29425a;
                        if (interfaceC0974p != null) {
                            throw th2;
                        }
                        this.f3657A.mo4938d(interfaceC0974p);
                        throw th2;
                    }
                }
                C7348o.m30470b(obj);
                if (this.f3657A.getState() == AbstractC0966l.b.DESTROYED) {
                    return Unit.f29331a;
                }
                C7729c0 c7729c2 = new C7729c0();
                c7729c0 = new C7729c0();
                try {
                    AbstractC0966l.b bVar = this.f3658B;
                    AbstractC0966l abstractC0966l = this.f3657A;
                    InterfaceC7906p0 interfaceC7906p0 = this.f3659C;
                    Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> function2 = this.f3660D;
                    this.f3661t = c7729c2;
                    this.f3662u = c7729c0;
                    this.f3663v = bVar;
                    this.f3664w = abstractC0966l;
                    this.f3665x = interfaceC7906p0;
                    this.f3666y = function2;
                    this.f3667z = 1;
                    C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
                    c7905p.m32860H();
                    AbstractC0966l.a.Companion companion = AbstractC0966l.a.INSTANCE;
                    ?? c14079a = new C14079a(companion.m4943c(bVar), c7729c2, interfaceC7906p0, companion.m4941a(bVar), c7905p, C11976g.m44697b(false, 1, null), function2);
                    c7729c0.f29425a = c14079a;
                    Intrinsics.m31981d(c14079a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC0966l.mo4935a((InterfaceC0974p) c14079a);
                    Object objM32857A = c7905p.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(this);
                    }
                    if (objM32857A == objM38805e) {
                        return objM38805e;
                    }
                    c7729c1 = c7729c2;
                    interfaceC7850d3 = (InterfaceC7850d2) c7729c1.f29425a;
                    if (interfaceC7850d3 != null) {
                        InterfaceC7850d2.a.m32603a(interfaceC7850d3, null, 1, null);
                    }
                    interfaceC0974p2 = (InterfaceC0974p) c7729c0.f29425a;
                    if (interfaceC0974p2 != null) {
                        this.f3657A.mo4938d(interfaceC0974p2);
                    }
                    return Unit.f29331a;
                } catch (Throwable th4) {
                    th2 = th4;
                    c7729c1 = c7729c2;
                    interfaceC7850d2 = (InterfaceC7850d2) c7729c1.f29425a;
                    if (interfaceC7850d2 != null) {
                        InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                    }
                    interfaceC0974p = (InterfaceC0974p) c7729c0.f29425a;
                    if (interfaceC0974p != null) {
                        throw th2;
                    }
                    this.f3657A.mo4938d(interfaceC0974p);
                    throw th2;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14078a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC0966l abstractC0966l, AbstractC0966l.b bVar, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f3654v = abstractC0966l;
            this.f3655w = bVar;
            this.f3656x = function2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f3654v, this.f3655w, this.f3656x, interfaceC9557b);
            aVar.f3653u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f3652t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f3653u;
                AbstractC7900n2 immediate = C7864g1.m32645c().getImmediate();
                C14078a c14078a = new C14078a(this.f3654v, this.f3655w, interfaceC7906p0, this.f3656x, null);
                this.f3652t = 1;
                if (C7872i.m32684g(immediate, c14078a, this) == objM38805e) {
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
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m4920a(@NotNull AbstractC0966l abstractC0966l, @NotNull AbstractC0966l.b bVar, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32891g;
        if (bVar != AbstractC0966l.b.INITIALIZED) {
            return (abstractC0966l.getState() != AbstractC0966l.b.DESTROYED && (objM32891g = C7910q0.m32891g(new a(abstractC0966l, bVar, function2, null), interfaceC9557b)) == C10047c.m38805e()) ? objM32891g : Unit.f29331a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m4921b(@NotNull InterfaceC0980s interfaceC0980s, @NotNull AbstractC0966l.b bVar, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM4920a = m4920a(interfaceC0980s.mo4656a(), bVar, function2, interfaceC9557b);
        return objM4920a == C10047c.m38805e() ? objM4920a : Unit.f29331a;
    }
}
