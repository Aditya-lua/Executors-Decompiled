package ch;

import av.g1;
import av.l0;
import av.p0;
import av.q0;
import av.z0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import gu.m;
import java.lang.reflect.InvocationTargetException;
import ok.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, d2 = {"Lch/a;", BuildConfig.FLAVOR, "Lav/l0;", "dispatcher", BuildConfig.FLAVOR, "controllerClassName", "Lkotlin/Function2;", "Lhm/i;", "Lhm/c;", "Lch/i;", "nativeAdsHandlerFactory", "<init>", "(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lj/b;", "activity", BuildConfig.FLAVOR, "d", "(Lj/b;)V", "e", "()V", "c", "(Lj/b;)Lhm/c;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "Lav/p0;", "Lav/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String controllerClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<hm.i, hm.c, i> nativeAdsHandlerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: ch.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0102a extends p001kotlin.jvm.internal.a implements Function2<hm.i, hm.c, i> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0102a f5125h = new C0102a();

        public C0102a() {
            super(2, i.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(hm.i p8, hm.c p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return new i(p8, p10, null, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ads.AdsHelper$onCreate$1", f = "AdsHelper.kt", l = {39, 49}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f5126t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f5127u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f5128v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j.b f5130x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j.b bVar, eu.b<? super c> bVar2) {
            super(2, bVar2);
            this.f5130x = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new c(this.f5130x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x0034, PHI: r1 r8
          0x0095: PHI (r1v7 ??) = (r1v15 ??), (r1v16 ??), (r1v17 ??) binds: [B:20:0x0059, B:22:0x005d, B:31:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r8v5 hm.c) = (r8v4 hm.c), (r8v4 hm.c), (r8v12 hm.c) binds: [B:20:0x0059, B:22:0x005d, B:31:0x0094] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:14:0x0030, B:27:0x0076, B:29:0x0082, B:32:0x0095, B:30:0x008b, B:19:0x0051, B:21:0x005b, B:23:0x005f), top: B:40:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [ch.i] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v7, types: [ch.i] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r10;
            hm.c cVarC;
            hm.c cVar;
            i iVar;
            Object objE = fu.c.e();
            ?? r11 = this.f5128v;
            try {
                if (r11 == 0) {
                    o.b(obj);
                    cVarC = a.this.c(this.f5130x);
                    Function2 function2 = a.this.nativeAdsHandlerFactory;
                    f fVar = f.f5140a;
                    i iVar2 = (i) function2.invoke(fVar, cVarC);
                    r11 = iVar2;
                    if (bi.h.a().j0()) {
                        r11 = iVar2;
                        if (cVarC instanceof NoopGmaSdkController) {
                            q.h("rbx.AdsHelper", "gmasdk not installed; awaiting in-session install to activate ads");
                            this.f5126t = gu.l.a(cVarC);
                            this.f5127u = iVar2;
                            this.f5128v = 1;
                            if (fVar.d(this) != objE) {
                                cVar = cVarC;
                                iVar = iVar2;
                            }
                        } else {
                            this.f5126t = gu.l.a(cVarC);
                            this.f5127u = r11;
                            this.f5128v = 2;
                            if (z0.a(this) != objE) {
                                r10 = r11;
                                throw new zt.d();
                            }
                        }
                    } else {
                        this.f5126t = gu.l.a(cVarC);
                        this.f5127u = r11;
                        this.f5128v = 2;
                        if (z0.a(this) != objE) {
                            r10 = r11;
                            throw new zt.d();
                        }
                    }
                    return objE;
                }
                if (r11 != 1) {
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r10 = (i) this.f5127u;
                    try {
                        o.b(obj);
                        r10 = r10;
                        throw new zt.d();
                    } catch (Throwable th2) {
                        th = th2;
                        r10.i();
                        throw th;
                    }
                }
                i iVar3 = (i) this.f5127u;
                cVar = (hm.c) this.f5126t;
                o.b(obj);
                iVar = iVar3;
                hm.c cVarC2 = a.this.c(this.f5130x);
                if (cVarC2 instanceof NoopGmaSdkController) {
                    gu.b.c(q.k("rbx.AdsHelper", "gmasdk installed but controller still unavailable; keeping no-op protocol"));
                } else {
                    q.h("rbx.AdsHelper", "Activated real LegacyGmaSdkController in-session; swapping into ads protocol");
                    iVar.n(cVarC2);
                }
                cVarC = cVar;
                r11 = iVar;
                this.f5126t = gu.l.a(cVarC);
                this.f5127u = r11;
                this.f5128v = 2;
                if (z0.a(this) != objE) {
                    r10 = r11;
                    throw new zt.d();
                }
                return objE;
            } catch (Throwable th3) {
                th = th3;
                r10 = r11;
            }
        }
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public final hm.c c(j.b activity) {
        Object objB;
        String str;
        try {
            n.Companion companion = n.INSTANCE;
            Object objNewInstance = Class.forName(this.controllerClassName).getConstructor(j.b.class).newInstance(activity);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.roblox.universalapp.ads.GmaSdkController");
            objB = n.b((hm.c) objNewInstance);
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
        return (hm.c) objB;
    }

    public final void d(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        av.k.d(this.scope, null, null, new c(activity, null), 3, null);
    }

    public final void e() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull l0 dispatcher, @NotNull String controllerClassName, @NotNull Function2<? super hm.i, ? super hm.c, i> nativeAdsHandlerFactory) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(controllerClassName, "controllerClassName");
        Intrinsics.checkNotNullParameter(nativeAdsHandlerFactory, "nativeAdsHandlerFactory");
        this.controllerClassName = controllerClassName;
        this.nativeAdsHandlerFactory = nativeAdsHandlerFactory;
        this.scope = q0.a(dispatcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(l0 l0Var, String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l0Var = (i10 & 1) != 0 ? g1.b() : l0Var;
        if ((i10 & 2) != 0) {
            str = bi.h.a().X() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController";
        }
        this(l0Var, str, (i10 & 4) != 0 ? C0102a.f5125h : function2);
    }
}
