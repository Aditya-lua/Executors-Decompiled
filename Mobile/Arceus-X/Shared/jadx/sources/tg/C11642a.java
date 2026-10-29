package tg;

import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7724a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p203j.ActivityC6992b;
import p229jt.C7334d;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;
import tl.C11678d0;
import tl.InterfaceC11675c;
import tl.InterfaceC11687i;

/* JADX INFO: renamed from: tg.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, m31665d2 = {"Ltg/a;", "", "Lku/l0;", "dispatcher", "", "controllerClassName", "Lkotlin/Function2;", "Ltl/i;", "Ltl/c;", "Ltl/d0;", "adsProtocolFactory", "Ltg/g;", "nativeAdsHandlerFactory", "<init>", "(Lku/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lj/b;", "activity", "", "e", "(Lj/b;)V", "f", "()V", "d", "(Lj/b;)Ltl/c;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11642a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String controllerClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC11687i, InterfaceC11675c, C11678d0> adsProtocolFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC11687i, InterfaceC11675c, C11648g> nativeAdsHandlerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: tg.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7724a implements Function2<InterfaceC11687i, InterfaceC11675c, C11678d0> {

        /* JADX INFO: renamed from: h */
        public static final a f41061h = new a();

        public a() {
            super(2, C11678d0.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11678d0 invoke(InterfaceC11687i p8, InterfaceC11675c p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new C11678d0(p8, p10, null, null, null, 28, null);
        }
    }

    /* JADX INFO: renamed from: tg.a$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7724a implements Function2<InterfaceC11687i, InterfaceC11675c, C11648g> {

        /* JADX INFO: renamed from: h */
        public static final b f41062h = new b();

        public b() {
            super(2, C11648g.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11648g invoke(InterfaceC11687i p8, InterfaceC11675c p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new C11648g(p8, p10, null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: tg.a$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.AdsHelper$onCreate$1", m39664f = "AdsHelper.kt", m39665l = {43, 53, 66, 75}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f41063t;

        /* JADX INFO: renamed from: u */
        public Object f41064u;

        /* JADX INFO: renamed from: v */
        public int f41065v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ActivityC6992b f41067x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ActivityC6992b activityC6992b, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41067x = activityC6992b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11642a.this.new d(this.f41067x, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:65:0x012a A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0131 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:74:0x014f  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11675c interfaceC11675cM43321d;
            C11678d0 c11678d0;
            C11678d0 c11678d1;
            InterfaceC11675c interfaceC11675c;
            InterfaceC11675c interfaceC11675cM43321d2;
            C11648g c11648g;
            C11648g c11648g2;
            Throwable th2;
            InterfaceC11675c interfaceC11675cM43321d3;
            InterfaceC11675c interfaceC11675cM43321d4;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41065v;
            if (i10 != 0) {
                if (i10 == 1) {
                    C11648g c11648g3 = (C11648g) this.f41064u;
                    interfaceC11675cM43321d2 = (InterfaceC11675c) this.f41063t;
                    try {
                        C7348o.m30470b(obj);
                        c11648g = c11648g3;
                        interfaceC11675cM43321d3 = C11642a.this.m43321d(this.f41067x);
                        if (interfaceC11675cM43321d3 instanceof NoopGmaSdkController) {
                            C10340b.m39661d(C6124q.m27066k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                        } else {
                            C6124q.m27063h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                            c11648g.m43348n(interfaceC11675cM43321d3);
                        }
                        this.f41063t = C10350l.m39676a(interfaceC11675cM43321d2);
                        this.f41064u = c11648g;
                        this.f41065v = 2;
                        if (C7946z0.m32937a(this) != objM38805e) {
                            c11648g2 = c11648g;
                            throw new C7334d();
                        }
                        return objM38805e;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c11648g2 = c11648g3;
                        c11648g2.m43345i();
                        throw th2;
                    }
                }
                if (i10 == 2) {
                    c11648g2 = (C11648g) this.f41064u;
                    try {
                        C7348o.m30470b(obj);
                        throw new C7334d();
                    } catch (Throwable th4) {
                        th2 = th4;
                        c11648g2.m43345i();
                        throw th2;
                    }
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11678d0 = (C11678d0) this.f41064u;
                    try {
                        C7348o.m30470b(obj);
                        throw new C7334d();
                    } catch (Throwable th5) {
                        th = th5;
                        c11678d0.m43872C();
                        throw th;
                    }
                }
                c11678d1 = (C11678d0) this.f41064u;
                interfaceC11675c = (InterfaceC11675c) this.f41063t;
                try {
                    C7348o.m30470b(obj);
                    interfaceC11675cM43321d4 = C11642a.this.m43321d(this.f41067x);
                    if (interfaceC11675cM43321d4 instanceof NoopGmaSdkController) {
                        C10340b.m39661d(C6124q.m27066k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                    } else {
                        C6124q.m27063h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                        c11678d1.m43885X(interfaceC11675cM43321d4);
                    }
                    interfaceC11675cM43321d = interfaceC11675c;
                    this.f41063t = C10350l.m39676a(interfaceC11675cM43321d);
                    this.f41064u = c11678d1;
                    this.f41065v = 4;
                    if (C7946z0.m32937a(this) != objM38805e) {
                        c11678d0 = c11678d1;
                        throw new C7334d();
                    }
                    return objM38805e;
                } catch (Throwable th6) {
                    th = th6;
                    c11678d0 = c11678d1;
                    c11678d0.m43872C();
                    throw th;
                }
            }
            C7348o.m30470b(obj);
            if (JNINativeAdsProtocol.getFFlagEnableNativeAdsProtocol()) {
                interfaceC11675cM43321d2 = C11642a.this.m43321d(this.f41067x);
                Function2 function2 = C11642a.this.nativeAdsHandlerFactory;
                C11645d c11645d = C11645d.f41073a;
                c11648g = (C11648g) function2.invoke(c11645d, interfaceC11675cM43321d2);
                try {
                    if (C11659h.m43403a().mo43632g0() && (interfaceC11675cM43321d2 instanceof NoopGmaSdkController)) {
                        C6124q.m27063h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f41063t = C10350l.m39676a(interfaceC11675cM43321d2);
                        this.f41064u = c11648g;
                        this.f41065v = 1;
                        if (c11645d.m43331c(this) != objM38805e) {
                            interfaceC11675cM43321d3 = C11642a.this.m43321d(this.f41067x);
                            if (interfaceC11675cM43321d3 instanceof NoopGmaSdkController) {
                                C6124q.m27063h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                c11648g.m43348n(interfaceC11675cM43321d3);
                            } else {
                                C10340b.m39661d(C6124q.m27066k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            this.f41063t = C10350l.m39676a(interfaceC11675cM43321d2);
                            this.f41064u = c11648g;
                            this.f41065v = 2;
                            if (C7946z0.m32937a(this) != objM38805e) {
                                c11648g2 = c11648g;
                                throw new C7334d();
                            }
                        }
                    } else {
                        this.f41063t = C10350l.m39676a(interfaceC11675cM43321d2);
                        this.f41064u = c11648g;
                        this.f41065v = 2;
                        if (C7946z0.m32937a(this) != objM38805e) {
                            c11648g2 = c11648g;
                            throw new C7334d();
                        }
                    }
                } catch (Throwable th7) {
                    c11648g2 = c11648g;
                    th2 = th7;
                    c11648g2.m43345i();
                    throw th2;
                }
            } else {
                interfaceC11675cM43321d = C11642a.this.m43321d(this.f41067x);
                Function2 function3 = C11642a.this.adsProtocolFactory;
                C11645d c11645d2 = C11645d.f41073a;
                C11678d0 c11678d2 = (C11678d0) function3.invoke(c11645d2, interfaceC11675cM43321d);
                try {
                    if (C11659h.m43403a().mo43632g0() && (interfaceC11675cM43321d instanceof NoopGmaSdkController)) {
                        C6124q.m27063h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f41063t = C10350l.m39676a(interfaceC11675cM43321d);
                        this.f41064u = c11678d2;
                        this.f41065v = 3;
                        if (c11645d2.m43331c(this) != objM38805e) {
                            interfaceC11675c = interfaceC11675cM43321d;
                            c11678d1 = c11678d2;
                            interfaceC11675cM43321d4 = C11642a.this.m43321d(this.f41067x);
                            if (interfaceC11675cM43321d4 instanceof NoopGmaSdkController) {
                                C6124q.m27063h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                c11678d1.m43885X(interfaceC11675cM43321d4);
                            } else {
                                C10340b.m39661d(C6124q.m27066k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            interfaceC11675cM43321d = interfaceC11675c;
                            this.f41063t = C10350l.m39676a(interfaceC11675cM43321d);
                            this.f41064u = c11678d1;
                            this.f41065v = 4;
                            if (C7946z0.m32937a(this) != objM38805e) {
                                c11678d0 = c11678d1;
                                throw new C7334d();
                            }
                        }
                    } else {
                        c11678d1 = c11678d2;
                        this.f41063t = C10350l.m39676a(interfaceC11675cM43321d);
                        this.f41064u = c11678d1;
                        this.f41065v = 4;
                        if (C7946z0.m32937a(this) != objM38805e) {
                            c11678d0 = c11678d1;
                            throw new C7334d();
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c11678d0 = c11678d2;
                    c11678d0.m43872C();
                    throw th;
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11642a() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final InterfaceC11675c m43321d(ActivityC6992b activity) {
        Object objM30460b;
        String str;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object objNewInstance = Class.forName(this.controllerClassName).getConstructor(ActivityC6992b.class).newInstance(activity);
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type com.roblox.universalapp.ads.GmaSdkController");
            objM30460b = C7347n.m30460b((InterfaceC11675c) objNewInstance);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            if (thM30463e instanceof ClassNotFoundException) {
                str = "GmaSdkController not found. Ensure the GMA SDK module is included.";
            } else if (thM30463e instanceof NoSuchMethodException) {
                str = "Constructor GmaSdkController(AppCompatActivity) not found. Check class definition.";
            } else if ((thM30463e instanceof IllegalAccessException) || (thM30463e instanceof InstantiationException) || (thM30463e instanceof InvocationTargetException)) {
                str = "Failed to instantiate GmaSdkController: " + thM30463e.getClass().getSimpleName();
            } else {
                str = "An unexpected error occurred while trying to create GmaSdkController";
            }
            C6124q.m27061f("rbx.AdsHelper", str, thM30463e);
        }
        Throwable thM30463e2 = C7347n.m30463e(objM30460b);
        if (thM30463e2 != null) {
            if (C11659h.m43403a().mo43498N3()) {
                objM30460b = new NoopGmaSdkController(thM30463e2 instanceof ClassNotFoundException ? "MODULE_NOT_INSTALLED" : "CONTROLLER_UNAVAILABLE");
            } else {
                objM30460b = new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0);
            }
        }
        return (InterfaceC11675c) objM30460b;
    }

    /* JADX INFO: renamed from: e */
    public final void m43322e(@NotNull ActivityC6992b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C7882k.m32780d(this.scope, null, null, new d(activity, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m43323f() {
        C7910q0.m32890f(this.scope, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super tl.i, ? super tl.c, tl.d0> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super tl.i, ? super tl.c, tg.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11642a(@NotNull AbstractC7888l0 dispatcher, @NotNull String controllerClassName, @NotNull Function2<? super InterfaceC11687i, ? super InterfaceC11675c, C11678d0> adsProtocolFactory, @NotNull Function2<? super InterfaceC11687i, ? super InterfaceC11675c, C11648g> nativeAdsHandlerFactory) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(controllerClassName, "controllerClassName");
        Intrinsics.checkNotNullParameter(adsProtocolFactory, "adsProtocolFactory");
        Intrinsics.checkNotNullParameter(nativeAdsHandlerFactory, "nativeAdsHandlerFactory");
        this.controllerClassName = controllerClassName;
        this.adsProtocolFactory = adsProtocolFactory;
        this.nativeAdsHandlerFactory = nativeAdsHandlerFactory;
        this.scope = C7910q0.m32885a(dispatcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11642a(AbstractC7888l0 abstractC7888l0, String str, Function2 function2, Function2 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        abstractC7888l0 = (i10 & 1) != 0 ? C7864g1.m32644b() : abstractC7888l0;
        if ((i10 & 2) != 0) {
            str = C11659h.m43403a().mo43556W() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController";
        }
        this(abstractC7888l0, str, (i10 & 4) != 0 ? a.f41061h : function2, (i10 & 8) != 0 ? b.f41062h : function3);
    }
}
