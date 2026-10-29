package tg;

import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Ltg/a;", "", "Lku/l0;", "dispatcher", "", "controllerClassName", "Lkotlin/Function2;", "Ltl/d;", "Ltl/a;", "Ltl/y;", "adsProtocolFactory", "Ltg/o;", "nativeAdsHandlerFactory", "<init>", "(Lku/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lj/b;", "activity", "", "e", "(Lj/b;)V", "f", "()V", "d", "(Lj/b;)Ltl/a;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String controllerClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<tl.d, tl.a, tl.y> adsProtocolFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<tl.d, tl.a, o> nativeAdsHandlerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: tg.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0572a extends kotlin.jvm.internal.a implements Function2<tl.d, tl.a, tl.y> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0572a f31739h = new C0572a();

        public C0572a() {
            super(2, tl.y.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/IGmaSDKController;Lkotlinx/coroutines/CoroutineScope;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tl.y invoke(tl.d p8, tl.a p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new tl.y(p8, p10, null, null, null, 28, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2<tl.d, tl.a, o> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f31740h = new b();

        public b() {
            super(2, o.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/IGmaSDKController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke(tl.d p8, tl.a p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new o(p8, p10, null, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.ads.AdsHelper$onCreate$1", f = "AdsHelper.kt", l = {42, 52, 65, 74}, m = "invokeSuspend", v = 1)
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31741t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31742u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31743v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j.b f31745x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j.b bVar, nt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f31745x = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new d(this.f31745x, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[Catch: all -> 0x00bb, TryCatch #3 {all -> 0x00bb, blocks: (B:40:0x00a8, B:42:0x00b4, B:46:0x00c7, B:45:0x00c0, B:33:0x0085, B:35:0x008f, B:37:0x0093), top: B:85:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:65:0x012a A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0131 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:16:0x003a, B:63:0x011e, B:65:0x012a, B:71:0x013e, B:66:0x0131), top: B:87:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:74:0x014f  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            tl.a aVarD;
            tl.y yVar;
            tl.y yVar2;
            tl.a aVar;
            tl.a aVarD2;
            o oVar;
            o oVar2;
            Throwable th2;
            tl.a aVarD3;
            tl.a aVarD4;
            Object objE = ot.c.e();
            int i10 = this.f31743v;
            if (i10 != 0) {
                if (i10 == 1) {
                    o oVar3 = (o) this.f31742u;
                    aVarD2 = (tl.a) this.f31741t;
                    try {
                        jt.o.b(obj);
                        oVar = oVar3;
                        aVarD3 = a.this.d(this.f31745x);
                        if (aVarD3 instanceof NoopGmaSdkController) {
                            pt.b.d(gk.p.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                        } else {
                            gk.p.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                            oVar.v(aVarD3);
                        }
                        this.f31741t = pt.l.a(aVarD2);
                        this.f31742u = oVar;
                        this.f31743v = 2;
                        if (z0.a(this) != objE) {
                            oVar2 = oVar;
                            throw new jt.d();
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        oVar2 = oVar3;
                        oVar2.n();
                        throw th2;
                    }
                }
                if (i10 == 2) {
                    oVar2 = (o) this.f31742u;
                    try {
                        jt.o.b(obj);
                        throw new jt.d();
                    } catch (Throwable th4) {
                        th2 = th4;
                        oVar2.n();
                        throw th2;
                    }
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (tl.y) this.f31742u;
                    try {
                        jt.o.b(obj);
                        throw new jt.d();
                    } catch (Throwable th5) {
                        th = th5;
                        yVar.C();
                        throw th;
                    }
                }
                yVar2 = (tl.y) this.f31742u;
                aVar = (tl.a) this.f31741t;
                try {
                    jt.o.b(obj);
                    aVarD4 = a.this.d(this.f31745x);
                    if (aVarD4 instanceof NoopGmaSdkController) {
                        pt.b.d(gk.p.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                    } else {
                        gk.p.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                        yVar2.X(aVarD4);
                    }
                    aVarD = aVar;
                    this.f31741t = pt.l.a(aVarD);
                    this.f31742u = yVar2;
                    this.f31743v = 4;
                    if (z0.a(this) != objE) {
                        yVar = yVar2;
                        throw new jt.d();
                    }
                    return objE;
                } catch (Throwable th6) {
                    th = th6;
                    yVar = yVar2;
                    yVar.C();
                    throw th;
                }
            }
            jt.o.b(obj);
            if (JNINativeAdsProtocol.getFFlagEnableNativeAdsProtocol()) {
                aVarD2 = a.this.d(this.f31745x);
                Function2 function2 = a.this.nativeAdsHandlerFactory;
                tg.d dVar = tg.d.f31750a;
                oVar = (o) function2.invoke(dVar, aVarD2);
                try {
                    if (th.h.a().c0() && (aVarD2 instanceof NoopGmaSdkController)) {
                        gk.p.h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f31741t = pt.l.a(aVarD2);
                        this.f31742u = oVar;
                        this.f31743v = 1;
                        if (dVar.c(this) != objE) {
                            aVarD3 = a.this.d(this.f31745x);
                            if (aVarD3 instanceof NoopGmaSdkController) {
                                gk.p.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                oVar.v(aVarD3);
                            } else {
                                pt.b.d(gk.p.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            this.f31741t = pt.l.a(aVarD2);
                            this.f31742u = oVar;
                            this.f31743v = 2;
                            if (z0.a(this) != objE) {
                                oVar2 = oVar;
                                throw new jt.d();
                            }
                        }
                    } else {
                        this.f31741t = pt.l.a(aVarD2);
                        this.f31742u = oVar;
                        this.f31743v = 2;
                        if (z0.a(this) != objE) {
                            oVar2 = oVar;
                            throw new jt.d();
                        }
                    }
                } catch (Throwable th7) {
                    oVar2 = oVar;
                    th2 = th7;
                    oVar2.n();
                    throw th2;
                }
            } else {
                aVarD = a.this.d(this.f31745x);
                Function2 function3 = a.this.adsProtocolFactory;
                tg.d dVar2 = tg.d.f31750a;
                tl.y yVar3 = (tl.y) function3.invoke(dVar2, aVarD);
                try {
                    if (th.h.a().c0() && (aVarD instanceof NoopGmaSdkController)) {
                        gk.p.h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                        this.f31741t = pt.l.a(aVarD);
                        this.f31742u = yVar3;
                        this.f31743v = 3;
                        if (dVar2.c(this) != objE) {
                            aVar = aVarD;
                            yVar2 = yVar3;
                            aVarD4 = a.this.d(this.f31745x);
                            if (aVarD4 instanceof NoopGmaSdkController) {
                                gk.p.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                                yVar2.X(aVarD4);
                            } else {
                                pt.b.d(gk.p.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                            }
                            aVarD = aVar;
                            this.f31741t = pt.l.a(aVarD);
                            this.f31742u = yVar2;
                            this.f31743v = 4;
                            if (z0.a(this) != objE) {
                                yVar = yVar2;
                                throw new jt.d();
                            }
                        }
                    } else {
                        yVar2 = yVar3;
                        this.f31741t = pt.l.a(aVarD);
                        this.f31742u = yVar2;
                        this.f31743v = 4;
                        if (z0.a(this) != objE) {
                            yVar = yVar2;
                            throw new jt.d();
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    yVar = yVar3;
                    yVar.C();
                    throw th;
                }
            }
            return objE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public final tl.a d(j.b activity) {
        Object objB;
        String str;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Object objNewInstance = Class.forName(this.controllerClassName).getConstructor(j.b.class).newInstance(activity);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.roblox.universalapp.ads.IGmaSDKController");
            objB = jt.n.b((tl.a) objNewInstance);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            if (thE instanceof ClassNotFoundException) {
                str = "LegacyGmaSdkController class not found. Ensure the GMA SDK module is included.";
            } else if (thE instanceof NoSuchMethodException) {
                str = "Constructor LegacyGmaSdkController(AppCompatActivity) not found. Check class definition.";
            } else if ((thE instanceof IllegalAccessException) || (thE instanceof InstantiationException) || (thE instanceof InvocationTargetException)) {
                str = "Failed to instantiate LegacyGmaSdkController: " + thE.getClass().getSimpleName();
            } else {
                str = "An unexpected error occurred while trying to create LegacyGmaSdkController";
            }
            gk.p.f("rbx.AdsHelper", str, thE);
        }
        Throwable thE2 = jt.n.e(objB);
        if (thE2 != null) {
            if (th.h.a().I3()) {
                objB = new NoopGmaSdkController(thE2 instanceof ClassNotFoundException ? "MODULE_NOT_INSTALLED" : "CONTROLLER_UNAVAILABLE");
            } else {
                objB = new NoopGmaSdkController(null, 1, null);
            }
        }
        return (tl.a) objB;
    }

    public final void e(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ku.k.d(this.scope, null, null, new d(activity, null), 3, null);
    }

    public final void f() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull l0 dispatcher, @NotNull String controllerClassName, @NotNull Function2<? super tl.d, ? super tl.a, tl.y> adsProtocolFactory, @NotNull Function2<? super tl.d, ? super tl.a, o> nativeAdsHandlerFactory) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(controllerClassName, "controllerClassName");
        Intrinsics.checkNotNullParameter(adsProtocolFactory, "adsProtocolFactory");
        Intrinsics.checkNotNullParameter(nativeAdsHandlerFactory, "nativeAdsHandlerFactory");
        this.controllerClassName = controllerClassName;
        this.adsProtocolFactory = adsProtocolFactory;
        this.nativeAdsHandlerFactory = nativeAdsHandlerFactory;
        this.scope = q0.a(dispatcher);
    }

    public /* synthetic */ a(l0 l0Var, String str, Function2 function2, Function2 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.b() : l0Var, (i10 & 2) != 0 ? "com.roblox.client.gmasdk.LegacyGmaSdkController" : str, (i10 & 4) != 0 ? C0572a.f31739h : function2, (i10 & 8) != 0 ? b.f31740h : function3);
    }
}
