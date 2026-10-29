package sh;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.g1;
import ku.k;
import ku.n;
import ku.p;
import ku.p0;
import ku.q0;
import ku.z0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lsh/g;", "Lzd/f;", "<init>", "()V", "", "", "Lsh/a;", "policies", "", "q", "(Ljava/util/Map;)V", "moduleName", "l", "(Ljava/lang/String;)V", "k", "", "j", "(Ljava/lang/String;)Z", "loadIntoProcess", "h", "(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "Lzd/e;", "state", "r", "(Lzd/e;)V", "status", "", "moduleNames", "", "retryAttempt", "s", "(Ljava/lang/String;Ljava/util/List;I)V", "Lzd/b;", "b", "Lzd/b;", "splitInstallManager", "c", "Ljava/util/List;", "standardFields", "d", "Ljava/util/Map;", "retryPolicies", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "retryCounts", "Lku/p0;", "f", "Lku/p0;", "retryScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements zd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f31123a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static zd.b splitInstallManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> standardFields;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Map<String, ExpBackOffRetryPolicy> retryPolicies;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, AtomicInteger> retryCounts;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static p0 retryScope;

    @pt.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery", f = "RobloxFeatureDelivery.kt", l = {338}, m = "awaitModuleInstalled", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31128t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31129u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31130v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f31131w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31132x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f31133y;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31133y = obj;
            this.A |= Integer.MIN_VALUE;
            return g.this.h(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements zd.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31135a;
        public final /* synthetic */ n<Unit> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f31136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f31137d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10) {
            this.f31135a = str;
            this.b = nVar;
            this.f31136c = atomicBoolean;
            this.f31137d = z10;
        }

        @Override // ud.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(zd.e state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.i() == 5 && state.f().contains(this.f31135a)) {
                g.i(this.b, this.f31136c, this.f31137d, this.f31135a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$onStateUpdate$3$1", f = "RobloxFeatureDelivery.kt", l = {254}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31138t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f31139u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31140v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String str, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f31139u = j10;
            this.f31140v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f31139u, this.f31140v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f31138t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f31139u;
                this.f31138t = 1;
                if (z0.b(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            String str = this.f31140v;
            Intrinsics.checkNotNull(str);
            g.l(str);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        g gVar = new g();
        f31123a = gVar;
        standardFields = kotlin.collections.o.d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        retryPolicies = k0.j();
        retryCounts = new ConcurrentHashMap<>();
        retryScope = q0.a(g1.b().plus(z2.b(null, 1, null)));
        Context contextF = RobloxApplication.f();
        zd.b bVarA = th.h.a().W2() ? ce.b.a(contextF) : zd.c.a(contextF);
        bVarA.c(gVar);
        Intrinsics.checkNotNullExpressionValue(bVarA, "apply(...)");
        splitInstallManager = bVarA;
    }

    public static final void i(n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10, String str) {
        if (nVar.b() && atomicBoolean.compareAndSet(false, true)) {
            if (z10) {
                Context contextF = RobloxApplication.f();
                Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
                i.a(contextF);
            }
            Log.i("rbx.featuredelivery", "awaitModuleInstalled: " + str + " installed");
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(Unit.f22483a));
        }
    }

    public static final boolean j(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        zd.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        return bVar.e().contains(moduleName);
    }

    public static final void k(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        zd.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        bVar.f(kotlin.collections.o.d(moduleName));
    }

    public static final void l(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (j(moduleName)) {
            Log.i("rbx.featuredelivery", "Module already installed: " + moduleName);
            return;
        }
        zd.d dVarB = zd.d.c().a(moduleName).b();
        Intrinsics.checkNotNullExpressionValue(dVarB, "build(...)");
        zd.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        Task<Integer> taskB = bVar.b(dVarB);
        final Function1 function1 = new Function1() { // from class: sh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.m((Integer) obj);
            }
        };
        taskB.g(new sb.g() { // from class: sh.d
            @Override // sb.g
            public final void onSuccess(Object obj) {
                g.n(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: sh.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                g.o(task);
            }
        }).e(new sb.f() { // from class: sh.f
            @Override // sb.f
            public final void onFailure(Exception exc) {
                g.p(exc);
            }
        });
    }

    public static final Unit m(Integer num) {
        Log.i("rbx.featuredelivery", "Module download started: " + num);
        return Unit.f22483a;
    }

    public static final void n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void o(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.i("rbx.featuredelivery", "Module download completed");
    }

    public static final void p(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("rbx.featuredelivery", "Module download failed", e10);
    }

    public static final void q(@NotNull Map<String, ExpBackOffRetryPolicy> policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        retryPolicies = policies;
        retryCounts.clear();
        Iterator<T> it = policies.keySet().iterator();
        while (it.hasNext()) {
            retryCounts.put((String) it.next(), new AtomicInteger(0));
        }
    }

    public static /* synthetic */ void t(g gVar, String str, List list, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        gVar.s(str, list, i10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, sh.g$b, zd.f] */
    public final /* synthetic */ Object h(String str, boolean z10, nt.b bVar) throws Throwable {
        a aVar;
        c0 c0Var;
        zd.f fVar;
        zd.b bVar2;
        zd.f fVar2;
        zd.b bVar3;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.A = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f31133y;
        Object objE = ot.c.e();
        int i11 = aVar.A;
        zd.b bVar4 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) aVar.f31129u;
            try {
                o.b(obj);
                fVar2 = (zd.f) c0Var.f22552a;
                if (fVar2 != null) {
                    bVar3 = splitInstallManager;
                    if (bVar3 == null) {
                        Intrinsics.u("splitInstallManager");
                    } else {
                        bVar4 = bVar3;
                    }
                    bVar4.a(fVar2);
                }
                return Unit.f22483a;
            } catch (Throwable th2) {
                th = th2;
                fVar = (zd.f) c0Var.f22552a;
                if (fVar != null) {
                    bVar2 = splitInstallManager;
                    if (bVar2 == null) {
                        Intrinsics.u("splitInstallManager");
                    } else {
                        bVar4 = bVar2;
                    }
                    bVar4.a(fVar);
                }
                throw th;
            }
        }
        o.b(obj);
        c0 c0Var2 = new c0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            aVar.f31128t = str;
            aVar.f31129u = c0Var2;
            aVar.f31130v = atomicBoolean;
            aVar.f31131w = z10;
            aVar.f31132x = 0;
            aVar.A = 1;
            p pVar = new p(ot.b.c(aVar), 1);
            pVar.H();
            ?? bVar5 = new b(str, pVar, atomicBoolean, z10);
            c0Var2.f22552a = bVar5;
            zd.b bVar6 = splitInstallManager;
            zd.b bVar7 = bVar6;
            if (bVar6 == null) {
                Intrinsics.u("splitInstallManager");
                bVar7 = 0;
            }
            bVar7.c(bVar5);
            if (j(str)) {
                i(pVar, atomicBoolean, z10, str);
            }
            Object objA = pVar.A();
            if (objA == ot.c.e()) {
                pt.h.c(aVar);
            }
            if (objA == objE) {
                return objE;
            }
            c0Var = c0Var2;
            fVar2 = (zd.f) c0Var.f22552a;
            if (fVar2 != null) {
                bVar3 = splitInstallManager;
                if (bVar3 == null) {
                    Intrinsics.u("splitInstallManager");
                } else {
                    bVar4 = bVar3;
                }
                bVar4.a(fVar2);
            }
            return Unit.f22483a;
        } catch (Throwable th3) {
            th = th3;
            c0Var = c0Var2;
            fVar = (zd.f) c0Var.f22552a;
            if (fVar != null) {
                bVar2 = splitInstallManager;
                if (bVar2 == null) {
                    Intrinsics.u("splitInstallManager");
                } else {
                    bVar4 = bVar2;
                }
                bVar4.a(fVar);
            }
            throw th;
        }
    }

    @Override // ud.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull zd.e state) {
        AtomicInteger atomicIntegerPutIfAbsent;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.i()) {
            case 0:
                Log.i("rbx.featuredelivery", "Status: UNKNOWN for module " + state.f());
                List<String> listF = state.f();
                Intrinsics.checkNotNullExpressionValue(listF, "moduleNames(...)");
                t(this, "Unknown", listF, 0, 4, null);
                break;
            case 1:
                Log.i("rbx.featuredelivery", "Status: PENDING for module " + state.f());
                List<String> listF2 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF2, "moduleNames(...)");
                t(this, "Pending", listF2, 0, 4, null);
                break;
            case 2:
                Log.i("rbx.featuredelivery", state.j() == 0 ? "Downloading " + state.f() : "Downloading " + state.f() + ", " + ((state.a() * ((long) 100)) / state.j()) + "%");
                List<String> listF3 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF3, "moduleNames(...)");
                t(this, "Downloading", listF3, 0, 4, null);
                break;
            case 3:
                Log.i("rbx.featuredelivery", "Status: DOWNLOADED for module " + state.f());
                List<String> listF4 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF4, "moduleNames(...)");
                t(this, "Downloaded", listF4, 0, 4, null);
                break;
            case 4:
                Log.i("rbx.featuredelivery", "Installing " + state.f());
                List<String> listF5 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF5, "moduleNames(...)");
                t(this, "Installing", listF5, 0, 4, null);
                break;
            case 5:
                Log.i("rbx.featuredelivery", "Installed " + state.f());
                List<String> listF6 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF6, "moduleNames(...)");
                t(this, "Installed", listF6, 0, 4, null);
                if (th.h.a().G3()) {
                    List<String> listF7 = state.f();
                    Intrinsics.checkNotNullExpressionValue(listF7, "moduleNames(...)");
                    Iterator<T> it = listF7.iterator();
                    while (it.hasNext()) {
                        AtomicInteger atomicInteger = retryCounts.get((String) it.next());
                        if (atomicInteger != null) {
                            atomicInteger.set(0);
                        }
                    }
                }
                JNIAAssetManagerSetup.a(RobloxApplication.f());
                if (th.h.a().b5() && state.f().contains("webrtcsdk")) {
                    Context contextF = RobloxApplication.f();
                    Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
                    String strF = sh.b.f(contextF, "robloxwebrtc", null, 4, null);
                    if (strF != null) {
                        WebRtcLoader.initialize(strF);
                    }
                    break;
                }
                break;
            case 6:
                Log.e("rbx.featuredelivery", "Status: Failed for module " + state.f() + ", errorCode=" + state.c());
                List<String> listF8 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF8, "moduleNames(...)");
                t(this, "Failed", listF8, 0, 4, null);
                if (th.h.a().G3()) {
                    List<String> listF9 = state.f();
                    Intrinsics.checkNotNullExpressionValue(listF9, "moduleNames(...)");
                    for (String str : listF9) {
                        ExpBackOffRetryPolicy expBackOffRetryPolicy = retryPolicies.get(str);
                        if (expBackOffRetryPolicy != null) {
                            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = retryCounts;
                            AtomicInteger atomicInteger2 = concurrentHashMap.get(str);
                            if (atomicInteger2 == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger2 = new AtomicInteger(0)))) != null) {
                                atomicInteger2 = atomicIntegerPutIfAbsent;
                            }
                            AtomicInteger atomicInteger3 = atomicInteger2;
                            if (h.f31141a.contains(Integer.valueOf(state.c()))) {
                                int andIncrement = atomicInteger3.getAndIncrement();
                                if (andIncrement < expBackOffRetryPolicy.getMaxRetries()) {
                                    long baseDelayMs = expBackOffRetryPolicy.getBaseDelayMs() * (1 << andIncrement);
                                    Log.i("rbx.featuredelivery", "Scheduling " + str + " retry #" + (andIncrement + 1) + " in " + baseDelayMs + "ms");
                                    k.d(retryScope, null, null, new c(baseDelayMs, str, null), 3, null);
                                } else {
                                    Log.e("rbx.featuredelivery", str + ": max retries exhausted after " + andIncrement + " attempts");
                                    g gVar = f31123a;
                                    List<String> listF10 = state.f();
                                    Intrinsics.checkNotNullExpressionValue(listF10, "moduleNames(...)");
                                    gVar.s("RetryExhausted", listF10, andIncrement);
                                }
                            } else {
                                Log.e("rbx.featuredelivery", str + ": non-retryable error " + state.c());
                                g gVar2 = f31123a;
                                List<String> listF11 = state.f();
                                Intrinsics.checkNotNullExpressionValue(listF11, "moduleNames(...)");
                                t(gVar2, "PermanentFailure", listF11, 0, 4, null);
                            }
                        }
                    }
                } else {
                    Log.i("rbx.featuredelivery", "Retry disabled globally via kill switch");
                }
                break;
            case 7:
                Log.i("rbx.featuredelivery", "Status: CANCELED for module " + state.f());
                List<String> listF12 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF12, "moduleNames(...)");
                t(this, "Canceled", listF12, 0, 4, null);
                break;
            case 8:
                Log.i("rbx.featuredelivery", "REQUIRES_USER_CONFIRMATION is unsupported " + state.f());
                List<String> listF13 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF13, "moduleNames(...)");
                t(this, "Requires User Confirmation", listF13, 0, 4, null);
                break;
            case 9:
                Log.i("rbx.featuredelivery", "Status: CANCELING for module " + state.f());
                List<String> listF14 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF14, "moduleNames(...)");
                t(this, "Canceling", listF14, 0, 4, null);
                break;
        }
    }

    public final void s(String status, List<String> moduleNames, int retryAttempt) {
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(kotlin.collections.o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(th.h.a().P()).setEventName("roblox_feature_delivery").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(standardFields).setCustomStringFields(th.h.a().k5() ? kotlin.collections.p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)), new Pair("user_id", String.valueOf(fk.c.c().j()))) : kotlin.collections.p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)))).build()).build();
        Intrinsics.checkNotNullExpressionValue(robloxTelemetryEventBuild, "build(...)");
        LoggingProtocol.j(robloxTelemetryEventBuild);
    }
}
