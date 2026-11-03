package sg;

import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import ek.q;
import gt.n;
import gt.o;
import iu.g1;
import iu.l0;
import iu.p0;
import iu.q0;
import iu.z0;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import rl.d0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Lsg/a;", "", "Liu/l0;", "dispatcher", "", "controllerClassName", "Lkotlin/Function2;", "Lrl/i;", "Lrl/c;", "Lrl/d0;", "adsProtocolFactory", "Lsg/i;", "nativeAdsHandlerFactory", "<init>", "(Liu/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lj/b;", "activity", "", "e", "(Lj/b;)V", "f", "()V", "d", "(Lj/b;)Lrl/c;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Liu/p0;", "Liu/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String controllerClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<rl.i, rl.c, d0> adsProtocolFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<rl.i, rl.c, i> nativeAdsHandlerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: sg.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0550a extends kotlin.jvm.internal.a implements Function2<rl.i, rl.c, d0> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0550a f31182h = new C0550a();

        public C0550a() {
            super(2, d0.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke(rl.i p8, rl.c p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new d0(p8, p10, null, null, null, 28, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2<rl.i, rl.c, i> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f31183h = new b();

        public b() {
            super(2, i.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(rl.i p8, rl.c p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new i(p8, p10, null, null, 12, null);
        }
    }

    @nt.f(c = "com.roblox.client.ads.AdsHelper$onCreate$1", f = "AdsHelper.kt", l = {43, 53, 66, 75}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31184t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31185u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31186v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j.b f31188x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j.b bVar, lt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f31188x = bVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new d(this.f31188x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:65:0x012a A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0131 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:74:0x014f  */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rl.c cVarD;
            d0 d0Var;
            d0 d0Var2;
            rl.c cVar;
            rl.c cVarD2;
            i iVar;
            i iVar2;
            Throwable th2;
            rl.c cVarD3;
            rl.c cVarD4;
            Object objE = mt.c.e();
            int i10 = this.f31186v;
            if (i10 != 0) {
                if (i10 == 1) {
                    i iVar3 = (i) this.f31185u;
                    cVarD2 = (rl.c) this.f31184t;
                    try {
                        o.b(obj);
                        iVar = iVar3;
                        cVarD3 = a.this.d(this.f31188x);
                        if (cVarD3 instanceof NoopGmaSdkController) {
                            nt.b.d(q.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                        } else {
                            q.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                            iVar.n(cVarD3);
                        }
                        this.f31184t = nt.l.a(cVarD2);
                        this.f31185u = iVar;
                        this.f31186v = 2;
                        if (z0.a(this) != objE) {
                            iVar2 = iVar;
                            throw new gt.d();
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iVar2 = iVar3;
                        iVar2.i();
                        throw th2;
                    }
                }
                if (i10 == 2) {
                    iVar2 = (i) this.f31185u;
                    try {
                        o.b(obj);
                        throw new gt.d();
                    } catch (Throwable th4) {
                        th2 = th4;
                        iVar2.i();
                        throw th2;
                    }
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = (d0) this.f31185u;
                    try {
                        o.b(obj);
                        throw new gt.d();
                    } catch (Throwable th5) {
                        th = th5;
                        d0Var.C();
                        throw th;
                    }
                }
                d0Var2 = (d0) this.f31185u;
                cVar = (rl.c) this.f31184t;
                try {
                    o.b(obj);
                    cVarD4 = a.this.d(this.f31188x);
                    if (cVarD4 instanceof NoopGmaSdkController) {
                        nt.b.d(q.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                    } else {
                        q.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                        d0Var2.X(cVarD4);
                    }
                    cVarD = cVar;
                    this.f31184t = nt.l.a(cVarD);
                    this.f31185u = d0Var2;
                    this.f31186v = 4;
                    if (z0.a(this) != objE) {
                        d0Var = d0Var2;
                        throw new gt.d();
                    }
                    return objE;
                } catch (Throwable th6) {
                    th = th6;
                    d0Var = d0Var2;
                    d0Var.C();
                    throw th;
                }
            }
            o.b(obj);
            if (JNINativeAdsProtocol.getFFlagEnableNativeAdsProtocol()) {
                cVarD2 = a.this.d(this.f31188x);
                Function2 function2 = a.this.nativeAdsHandlerFactory;
                f fVar = f.f31198a;
                iVar = (i) function2.invoke(fVar, cVarD2);
                try {
                    if (rh.h.a().h0() && (cVarD2 instanceof NoopGmaSdkController)) {
                        q.h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f31184t = nt.l.a(cVarD2);
                        this.f31185u = iVar;
                        this.f31186v = 1;
                        if (fVar.d(this) != objE) {
                            cVarD3 = a.this.d(this.f31188x);
                            if (cVarD3 instanceof NoopGmaSdkController) {
                                q.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                iVar.n(cVarD3);
                            } else {
                                nt.b.d(q.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            this.f31184t = nt.l.a(cVarD2);
                            this.f31185u = iVar;
                            this.f31186v = 2;
                            if (z0.a(this) != objE) {
                                iVar2 = iVar;
                                throw new gt.d();
                            }
                        }
                    } else {
                        this.f31184t = nt.l.a(cVarD2);
                        this.f31185u = iVar;
                        this.f31186v = 2;
                        if (z0.a(this) != objE) {
                            iVar2 = iVar;
                            throw new gt.d();
                        }
                    }
                } catch (Throwable th7) {
                    iVar2 = iVar;
                    th2 = th7;
                    iVar2.i();
                    throw th2;
                }
            } else {
                cVarD = a.this.d(this.f31188x);
                Function2 function3 = a.this.adsProtocolFactory;
                f fVar2 = f.f31198a;
                d0 d0Var3 = (d0) function3.invoke(fVar2, cVarD);
                try {
                    if (rh.h.a().h0() && (cVarD instanceof NoopGmaSdkController)) {
                        q.h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f31184t = nt.l.a(cVarD);
                        this.f31185u = d0Var3;
                        this.f31186v = 3;
                        if (fVar2.d(this) != objE) {
                            cVar = cVarD;
                            d0Var2 = d0Var3;
                            cVarD4 = a.this.d(this.f31188x);
                            if (cVarD4 instanceof NoopGmaSdkController) {
                                q.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                d0Var2.X(cVarD4);
                            } else {
                                nt.b.d(q.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            cVarD = cVar;
                            this.f31184t = nt.l.a(cVarD);
                            this.f31185u = d0Var2;
                            this.f31186v = 4;
                            if (z0.a(this) != objE) {
                                d0Var = d0Var2;
                                throw new gt.d();
                            }
                        }
                    } else {
                        d0Var2 = d0Var3;
                        this.f31184t = nt.l.a(cVarD);
                        this.f31185u = d0Var2;
                        this.f31186v = 4;
                        if (z0.a(this) != objE) {
                            d0Var = d0Var2;
                            throw new gt.d();
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    d0Var = d0Var3;
                    d0Var.C();
                    throw th;
                }
            }
            return objE;
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public final rl.c d(j.b activity) {
        Object objB;
        String str;
        try {
            n.Companion companion = n.INSTANCE;
            Object objNewInstance = Class.forName(this.controllerClassName).getConstructor(j.b.class).newInstance(activity);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.roblox.universalapp.ads.GmaSdkController");
            objB = n.b((rl.c) objNewInstance);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            if (thE instanceof ClassNotFoundException) {
                str = "GmaSdkController not found. Ensure the GMA SDK module is included.";
            } else if (thE instanceof NoSuchMethodException) {
                str = "Constructor GmaSdkController(AppCompatActivity) not found. Check class definition.";
            } else if ((thE instanceof IllegalAccessException) || (thE instanceof InstantiationException) || (thE instanceof InvocationTargetException)) {
                str = "Failed to instantiate GmaSdkController: " + thE.getClass().getSimpleName();
            } else {
                str = "An unexpected error occurred while trying to create GmaSdkController";
            }
            q.f("rbx.AdsHelper", str, thE);
        }
        Throwable thE2 = n.e(objB);
        if (thE2 != null) {
            objB = new NoopGmaSdkController(thE2 instanceof ClassNotFoundException ? "MODULE_NOT_INSTALLED" : "CONTROLLER_UNAVAILABLE");
        }
        return (rl.c) objB;
    }

    public final void e(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        iu.k.d(this.scope, null, null, new d(activity, null), 3, null);
    }

    public final void f() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull l0 dispatcher, @NotNull String controllerClassName, @NotNull Function2<? super rl.i, ? super rl.c, d0> adsProtocolFactory, @NotNull Function2<? super rl.i, ? super rl.c, i> nativeAdsHandlerFactory) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(controllerClassName, "controllerClassName");
        Intrinsics.checkNotNullParameter(adsProtocolFactory, "adsProtocolFactory");
        Intrinsics.checkNotNullParameter(nativeAdsHandlerFactory, "nativeAdsHandlerFactory");
        this.controllerClassName = controllerClassName;
        this.adsProtocolFactory = adsProtocolFactory;
        this.nativeAdsHandlerFactory = nativeAdsHandlerFactory;
        this.scope = q0.a(dispatcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(l0 l0Var, String str, Function2 function2, Function2 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l0Var = (i10 & 1) != 0 ? g1.b() : l0Var;
        if ((i10 & 2) != 0) {
            str = rh.h.a().V() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController";
        }
        this(l0Var, str, (i10 & 4) != 0 ? C0550a.f31182h : function2, (i10 & 8) != 0 ? b.f31183h : function3);
    }
}
