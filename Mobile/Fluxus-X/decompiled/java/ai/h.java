package ai;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import av.g1;
import av.n;
import av.p;
import av.p0;
import av.q0;
import av.z0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import gu.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R4\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b088\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lai/h;", "Lce/f;", "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lai/a;", "policies", BuildConfig.FLAVOR, "r", "(Ljava/util/Map;)V", "moduleName", "m", "(Ljava/lang/String;)V", "l", BuildConfig.FLAVOR, "k", "(Ljava/lang/String;)Z", "y", "()Z", "loadIntoProcess", "i", "(Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;", "Lce/e;", "state", "v", "(Lce/e;)V", "t", BuildConfig.FLAVOR, "moduleNames", "s", "(Ljava/util/List;)Ljava/lang/String;", "status", BuildConfig.FLAVOR, "retryAttempt", "installDurationBucket", "w", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "Lce/b;", "b", "Lce/b;", "splitInstallManager", "c", "Ljava/util/List;", "standardFields", "d", "Ljava/util/Map;", "retryPolicies", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "retryCounts", BuildConfig.FLAVOR, "f", "downloadRequestedAtMs", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getLoadWebRtcLibrary$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function1;", "setLoadWebRtcLibrary$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function1;)V", "getLoadWebRtcLibrary$NativeShell_googleProdRelease$annotations", "loadWebRtcLibrary", "Lav/p0;", "h", "Lav/p0;", "retryScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements ce.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f468a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static ce.b splitInstallManager;

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
    public static final ConcurrentHashMap<String, Long> downloadRequestedAtMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> loadWebRtcLibrary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static p0 retryScope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery", f = "RobloxFeatureDelivery.kt", l = {396}, m = "awaitModuleInstalled", v = 1)
    public static final class a extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f475t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f476u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f477v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f478w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f479x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f480y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f480y = obj;
            this.A |= Integer.MIN_VALUE;
            return h.this.i(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ce.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f482a;
        public final /* synthetic */ n<Unit> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f484d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10) {
            this.f482a = str;
            this.b = nVar;
            this.f483c = atomicBoolean;
            this.f484d = z10;
        }

        @Override // xd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ce.e state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.i() == 5 && state.f().contains(this.f482a)) {
                h.j(this.b, this.f483c, this.f484d, this.f482a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$onStateUpdate$2$1", f = "RobloxFeatureDelivery.kt", l = {275}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f485t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f486u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f487v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String str, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f486u = j10;
            this.f487v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f486u, this.f487v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f485t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f486u;
                this.f485t = 1;
                if (z0.b(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            String str = this.f487v;
            Intrinsics.checkNotNull(str);
            h.m(str);
            return Unit.f21506a;
        }
    }

    static {
        h hVar = new h();
        f468a = hVar;
        standardFields = p001kotlin.collections.o.d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        retryPolicies = k0.j();
        retryCounts = new ConcurrentHashMap<>();
        downloadRequestedAtMs = new ConcurrentHashMap<>();
        loadWebRtcLibrary = new Function1() { // from class: ai.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.u((String) obj);
            }
        };
        retryScope = q0.a(g1.b().plus(z2.b(null, 1, null)));
        Context contextF = RobloxApplication.f();
        ce.b bVarA = bi.h.a().j3() ? fe.b.a(contextF) : ce.c.a(contextF);
        bVarA.c(hVar);
        Intrinsics.checkNotNullExpressionValue(bVarA, "apply(...)");
        splitInstallManager = bVarA;
    }

    public static final void j(n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10, String str) {
        if (nVar.b() && atomicBoolean.compareAndSet(false, true)) {
            if (z10) {
                Context contextF = RobloxApplication.f();
                Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
                j.a(contextF);
            }
            Log.i("rbx.featuredelivery", "awaitModuleInstalled: " + str + " installed");
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(Unit.f21506a));
        }
    }

    public static final boolean k(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ce.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        return bVar.b().contains(moduleName);
    }

    public static final void l(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ce.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        bVar.e(p001kotlin.collections.o.d(moduleName));
    }

    public static final void m(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (k(moduleName)) {
            Log.i("rbx.featuredelivery", "Module already installed: " + moduleName);
            return;
        }
        downloadRequestedAtMs.putIfAbsent(moduleName, Long.valueOf(SystemClock.elapsedRealtime()));
        ce.d dVarB = ce.d.c().a(moduleName).b();
        Intrinsics.checkNotNullExpressionValue(dVarB, "build(...)");
        ce.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        Task<Integer> taskD = bVar.d(dVarB);
        final Function1 function1 = new Function1() { // from class: ai.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.n((Integer) obj);
            }
        };
        taskD.g(new tb.g() { // from class: ai.e
            @Override // tb.g
            public final void onSuccess(Object obj) {
                h.o(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: ai.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h.p(task);
            }
        }).e(new tb.f() { // from class: ai.g
            @Override // tb.f
            public final void onFailure(Exception exc) {
                h.q(exc);
            }
        });
    }

    public static final Unit n(Integer num) {
        Log.i("rbx.featuredelivery", "Module download started: " + num);
        return Unit.f21506a;
    }

    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void p(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.i("rbx.featuredelivery", "Module download completed");
    }

    public static final void q(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("rbx.featuredelivery", "Module download failed", e10);
    }

    public static final void r(@NotNull Map<String, ExpBackOffRetryPolicy> policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        retryPolicies = policies;
        retryCounts.clear();
        Iterator<T> it = policies.keySet().iterator();
        while (it.hasNext()) {
            retryCounts.put((String) it.next(), new AtomicInteger(0));
        }
    }

    public static final Unit u(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebRtcLoader.initialize(it);
        return Unit.f21506a;
    }

    public static /* synthetic */ void x(h hVar, String str, List list, int i10, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        hVar.w(str, list, i10, str2);
    }

    public static final boolean y() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, ai.h$b, ce.f] */
    public final /* synthetic */ Object i(String str, boolean z10, eu.b bVar) throws Throwable {
        a aVar;
        c0 c0Var;
        ce.f fVar;
        ce.b bVar2;
        ce.f fVar2;
        ce.b bVar3;
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
        Object obj = aVar.f480y;
        Object objE = fu.c.e();
        int i11 = aVar.A;
        ce.b bVar4 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) aVar.f476u;
            try {
                o.b(obj);
                fVar2 = (ce.f) c0Var.f21575a;
                if (fVar2 != null) {
                    bVar3 = splitInstallManager;
                    if (bVar3 == null) {
                        Intrinsics.u("splitInstallManager");
                    } else {
                        bVar4 = bVar3;
                    }
                    bVar4.f(fVar2);
                }
                return Unit.f21506a;
            } catch (Throwable th2) {
                th = th2;
                fVar = (ce.f) c0Var.f21575a;
                if (fVar != null) {
                    bVar2 = splitInstallManager;
                    if (bVar2 == null) {
                        Intrinsics.u("splitInstallManager");
                    } else {
                        bVar4 = bVar2;
                    }
                    bVar4.f(fVar);
                }
                throw th;
            }
        }
        o.b(obj);
        c0 c0Var2 = new c0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            aVar.f475t = str;
            aVar.f476u = c0Var2;
            aVar.f477v = atomicBoolean;
            aVar.f478w = z10;
            aVar.f479x = 0;
            aVar.A = 1;
            p pVar = new p(fu.b.c(aVar), 1);
            pVar.G();
            ?? bVar5 = new b(str, pVar, atomicBoolean, z10);
            c0Var2.f21575a = bVar5;
            ce.b bVar6 = splitInstallManager;
            ce.b bVar7 = bVar6;
            if (bVar6 == null) {
                Intrinsics.u("splitInstallManager");
                bVar7 = 0;
            }
            bVar7.c(bVar5);
            if (k(str)) {
                j(pVar, atomicBoolean, z10, str);
            }
            Object objY = pVar.y();
            if (objY == fu.c.e()) {
                gu.h.c(aVar);
            }
            if (objY == objE) {
                return objE;
            }
            c0Var = c0Var2;
            fVar2 = (ce.f) c0Var.f21575a;
            if (fVar2 != null) {
                bVar3 = splitInstallManager;
                if (bVar3 == null) {
                    Intrinsics.u("splitInstallManager");
                } else {
                    bVar4 = bVar3;
                }
                bVar4.f(fVar2);
            }
            return Unit.f21506a;
        } catch (Throwable th3) {
            th = th3;
            c0Var = c0Var2;
            fVar = (ce.f) c0Var.f21575a;
            if (fVar != null) {
                bVar2 = splitInstallManager;
                if (bVar2 == null) {
                    Intrinsics.u("splitInstallManager");
                } else {
                    bVar4 = bVar2;
                }
                bVar4.f(fVar);
            }
            throw th;
        }
    }

    public final String s(List<String> moduleNames) {
        Long lRemove;
        Iterator<T> it = moduleNames.iterator();
        do {
            if (!it.hasNext()) {
                lRemove = null;
                break;
            }
            lRemove = downloadRequestedAtMs.remove((String) it.next());
        } while (lRemove == null);
        if (lRemove == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
        if (jElapsedRealtime < 5000) {
            return "lt5s";
        }
        if (jElapsedRealtime < 15000) {
            return "5to15s";
        }
        return jElapsedRealtime < 60000 ? "15to60s" : "gte60s";
    }

    public final void t() {
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNull(contextF);
        j.a(contextF);
        String strF = ai.b.f(contextF, "robloxwebrtc", null, 4, null);
        if (strF != null) {
            loadWebRtcLibrary.invoke(strF);
            x(this, "WebRtcLoadRequested", p001kotlin.collections.o.d("webrtcsdk"), 0, null, 12, null);
        } else {
            Log.w("rbx.featuredelivery", "Installed webrtcsdk but could not resolve librobloxwebrtc.so");
            x(this, "WebRtcResolvePathFailed", p001kotlin.collections.o.d("webrtcsdk"), 0, null, 12, null);
        }
    }

    @Override // xd.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull ce.e state) {
        AtomicInteger atomicIntegerPutIfAbsent;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.i()) {
            case 0:
                Log.i("rbx.featuredelivery", "Status: UNKNOWN for module " + state.f());
                List<String> listF = state.f();
                Intrinsics.checkNotNullExpressionValue(listF, "moduleNames(...)");
                x(this, "Unknown", listF, 0, null, 12, null);
                break;
            case 1:
                Log.i("rbx.featuredelivery", "Status: PENDING for module " + state.f());
                List<String> listF2 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF2, "moduleNames(...)");
                x(this, "Pending", listF2, 0, null, 12, null);
                break;
            case 2:
                Log.i("rbx.featuredelivery", state.j() == 0 ? "Downloading " + state.f() : "Downloading " + state.f() + ", " + ((state.a() * ((long) 100)) / state.j()) + "%");
                List<String> listF3 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF3, "moduleNames(...)");
                x(this, "Downloading", listF3, 0, null, 12, null);
                break;
            case 3:
                Log.i("rbx.featuredelivery", "Status: DOWNLOADED for module " + state.f());
                List<String> listF4 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF4, "moduleNames(...)");
                x(this, "Downloaded", listF4, 0, null, 12, null);
                break;
            case 4:
                Log.i("rbx.featuredelivery", "Installing " + state.f());
                List<String> listF5 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF5, "moduleNames(...)");
                x(this, "Installing", listF5, 0, null, 12, null);
                break;
            case 5:
                Log.i("rbx.featuredelivery", "Installed " + state.f());
                List<String> listF6 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF6, "moduleNames(...)");
                List<String> listF7 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF7, "moduleNames(...)");
                x(this, "Installed", listF6, 0, s(listF7), 4, null);
                if (bi.h.a().W3()) {
                    List<String> listF8 = state.f();
                    Intrinsics.checkNotNullExpressionValue(listF8, "moduleNames(...)");
                    Iterator<T> it = listF8.iterator();
                    while (it.hasNext()) {
                        AtomicInteger atomicInteger = retryCounts.get((String) it.next());
                        if (atomicInteger != null) {
                            atomicInteger.set(0);
                        }
                    }
                }
                JNIAAssetManagerSetup.a(RobloxApplication.f());
                if (state.f().contains("webrtcsdk")) {
                    t();
                }
                break;
            case 6:
                Log.e("rbx.featuredelivery", "Status: Failed for module " + state.f() + ", errorCode=" + state.c());
                List<String> listF9 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF9, "moduleNames(...)");
                x(this, "Failed", listF9, 0, null, 12, null);
                if (bi.h.a().W3()) {
                    List<String> listF10 = state.f();
                    Intrinsics.checkNotNullExpressionValue(listF10, "moduleNames(...)");
                    for (String str : listF10) {
                        ExpBackOffRetryPolicy expBackOffRetryPolicy = retryPolicies.get(str);
                        if (expBackOffRetryPolicy != null) {
                            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = retryCounts;
                            AtomicInteger atomicInteger2 = concurrentHashMap.get(str);
                            if (atomicInteger2 == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger2 = new AtomicInteger(0)))) != null) {
                                atomicInteger2 = atomicIntegerPutIfAbsent;
                            }
                            AtomicInteger atomicInteger3 = atomicInteger2;
                            if (i.f488a.contains(Integer.valueOf(state.c()))) {
                                int andIncrement = atomicInteger3.getAndIncrement();
                                if (andIncrement < expBackOffRetryPolicy.getMaxRetries()) {
                                    long baseDelayMs = expBackOffRetryPolicy.getBaseDelayMs() * (1 << andIncrement);
                                    Log.i("rbx.featuredelivery", "Scheduling " + str + " retry #" + (andIncrement + 1) + " in " + baseDelayMs + "ms");
                                    av.k.d(retryScope, null, null, new c(baseDelayMs, str, null), 3, null);
                                } else {
                                    Log.e("rbx.featuredelivery", str + ": max retries exhausted after " + andIncrement + " attempts");
                                    h hVar = f468a;
                                    List<String> listF11 = state.f();
                                    Intrinsics.checkNotNullExpressionValue(listF11, "moduleNames(...)");
                                    x(hVar, "RetryExhausted", listF11, andIncrement, null, 8, null);
                                }
                            } else {
                                Log.e("rbx.featuredelivery", str + ": non-retryable error " + state.c());
                                h hVar2 = f468a;
                                List<String> listF12 = state.f();
                                Intrinsics.checkNotNullExpressionValue(listF12, "moduleNames(...)");
                                x(hVar2, "PermanentFailure", listF12, 0, null, 12, null);
                            }
                        }
                    }
                } else {
                    Log.i("rbx.featuredelivery", "Retry disabled globally via kill switch");
                }
                break;
            case 7:
                Log.i("rbx.featuredelivery", "Status: CANCELED for module " + state.f());
                List<String> listF13 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF13, "moduleNames(...)");
                x(this, "Canceled", listF13, 0, null, 12, null);
                break;
            case 8:
                Log.i("rbx.featuredelivery", "REQUIRES_USER_CONFIRMATION is unsupported " + state.f());
                List<String> listF14 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF14, "moduleNames(...)");
                x(this, "Requires User Confirmation", listF14, 0, null, 12, null);
                break;
            case 9:
                Log.i("rbx.featuredelivery", "Status: CANCELING for module " + state.f());
                List<String> listF15 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF15, "moduleNames(...)");
                x(this, "Canceling", listF15, 0, null, 12, null);
                break;
        }
    }

    public final void w(String status, List<String> moduleNames, int retryAttempt, String installDurationBucket) {
        List<Pair<String, String>> listX0;
        List<String> listD = p001kotlin.collections.o.d(RobloxTelemetryEventConfig.POINTS_BACKEND);
        List<Pair<String, String>> listN = bi.h.a().t5() ? p001kotlin.collections.p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)), new Pair("user_id", String.valueOf(nk.c.c().j()))) : p001kotlin.collections.p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)));
        if (installDurationBucket != null && (listX0 = CollectionsKt.x0(listN, new Pair("install_duration", installDurationBucket))) != null) {
            listN = listX0;
        }
        RobloxTelemetryEvent robloxTelemetryEventB = RobloxTelemetryEvent.builder().e(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).c(RobloxTelemetryEventConfig.builder().c(listD).e(bi.h.a().T()).d("roblox_feature_delivery").b()).d(RobloxTelemetryEventData.builder().d(standardFields).c(listN).b()).b();
        Intrinsics.checkNotNullExpressionValue(robloxTelemetryEventB, "build(...)");
        LoggingProtocol.j(robloxTelemetryEventB);
    }
}
