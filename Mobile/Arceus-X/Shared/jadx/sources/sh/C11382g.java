package sh;

import ae.AbstractC0159e;
import ae.C0155c;
import ae.C0157d;
import ae.InterfaceC0152b;
import ae.InterfaceC0161f;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import de.C4552b;
import fk.C5654c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.C7946z0;
import p256ku.C7948z2;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;
import th.C11659h;

/* JADX INFO: renamed from: sh.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m31665d2 = {"Lsh/g;", "Lae/f;", "<init>", "()V", "", "", "Lsh/a;", "policies", "", "q", "(Ljava/util/Map;)V", "moduleName", "l", "(Ljava/lang/String;)V", "k", "", "j", "(Ljava/lang/String;)Z", "loadIntoProcess", "h", "(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "Lae/e;", "state", "r", "(Lae/e;)V", NotificationCompat.CATEGORY_STATUS, "", "moduleNames", "", "retryAttempt", "s", "(Ljava/lang/String;Ljava/util/List;I)V", "Lae/b;", "b", "Lae/b;", "splitInstallManager", "c", "Ljava/util/List;", "standardFields", "d", "Ljava/util/Map;", "retryPolicies", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "retryCounts", "Lku/p0;", "f", "Lku/p0;", "retryScope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11382g implements InterfaceC0161f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11382g f40243a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static InterfaceC0152b splitInstallManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> standardFields;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Map<String, ExpBackOffRetryPolicy> retryPolicies;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, AtomicInteger> retryCounts;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC7906p0 retryScope;

    /* JADX INFO: renamed from: sh.g$a */
    @InterfaceC10344f(m39663c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery", m39664f = "RobloxFeatureDelivery.kt", m39665l = {338}, m39666m = "awaitModuleInstalled", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f40249A;

        /* JADX INFO: renamed from: t */
        public Object f40250t;

        /* JADX INFO: renamed from: u */
        public Object f40251u;

        /* JADX INFO: renamed from: v */
        public Object f40252v;

        /* JADX INFO: renamed from: w */
        public boolean f40253w;

        /* JADX INFO: renamed from: x */
        public int f40254x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f40255y;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40255y = obj;
            this.f40249A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11382g.this.m42693h(null, false, this);
        }
    }

    /* JADX INFO: renamed from: sh.g$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0161f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f40257a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7897n<Unit> f40258b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicBoolean f40259c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f40260d;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, InterfaceC7897n<? super Unit> interfaceC7897n, AtomicBoolean atomicBoolean, boolean z10) {
            this.f40257a = str;
            this.f40258b = interfaceC7897n;
            this.f40259c = atomicBoolean;
            this.f40260d = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p489vd.InterfaceC12158a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void mo1207a(AbstractC0159e state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.mo511i() == 5 && state.m508f().contains(this.f40257a)) {
                C11382g.m42683i(this.f40258b, this.f40259c, this.f40260d, this.f40257a);
            }
        }
    }

    /* JADX INFO: renamed from: sh.g$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$onStateUpdate$3$1", m39664f = "RobloxFeatureDelivery.kt", m39665l = {254}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40261t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f40262u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f40263v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String str, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40262u = j10;
            this.f40263v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f40262u, this.f40263v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40261t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f40262u;
                this.f40261t = 1;
                if (C7946z0.m32938b(j10, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            String str = this.f40263v;
            Intrinsics.checkNotNull(str);
            C11382g.m42686l(str);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        C11382g c11382g = new C11382g();
        f40243a = c11382g;
        standardFields = C7697o.m31878d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        retryPolicies = C7690k0.m31795j();
        retryCounts = new ConcurrentHashMap<>();
        retryScope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));
        Context contextM14834f = RobloxApplication.m14834f();
        InterfaceC0152b interfaceC0152bM22616a = C11659h.m43403a().mo43604c3() ? C4552b.m22616a(contextM14834f) : C0155c.m489a(contextM14834f);
        interfaceC0152bM22616a.mo485c(c11382g);
        Intrinsics.checkNotNullExpressionValue(interfaceC0152bM22616a, "apply(...)");
        splitInstallManager = interfaceC0152bM22616a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m42683i(InterfaceC7897n<? super Unit> interfaceC7897n, AtomicBoolean atomicBoolean, boolean z10, String str) {
        if (interfaceC7897n.mo32811b() && atomicBoolean.compareAndSet(false, true)) {
            if (z10) {
                Context contextM14834f = RobloxApplication.m14834f();
                Intrinsics.checkNotNullExpressionValue(contextM14834f, "getAppContext(...)");
                C11384i.m42698a(contextM14834f);
            }
            Log.i("rbx.featuredelivery", "awaitModuleInstalled: " + str + " installed");
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m42684j(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        InterfaceC0152b interfaceC0152b = splitInstallManager;
        if (interfaceC0152b == null) {
            Intrinsics.m31998u("splitInstallManager");
            interfaceC0152b = null;
        }
        return interfaceC0152b.mo487e().contains(moduleName);
    }

    /* JADX INFO: renamed from: k */
    public static final void m42685k(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        InterfaceC0152b interfaceC0152b = splitInstallManager;
        if (interfaceC0152b == null) {
            Intrinsics.m31998u("splitInstallManager");
            interfaceC0152b = null;
        }
        interfaceC0152b.mo488f(C7697o.m31878d(moduleName));
    }

    /* JADX INFO: renamed from: l */
    public static final void m42686l(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (m42684j(moduleName)) {
            Log.i("rbx.featuredelivery", "Module already installed: " + moduleName);
            return;
        }
        C0157d c0157dM501b = C0157d.m495c().m500a(moduleName).m501b();
        Intrinsics.checkNotNullExpressionValue(c0157dM501b, "build(...)");
        InterfaceC0152b interfaceC0152b = splitInstallManager;
        if (interfaceC0152b == null) {
            Intrinsics.m31998u("splitInstallManager");
            interfaceC0152b = null;
        }
        Task<Integer> taskMo483a = interfaceC0152b.mo483a(c0157dM501b);
        final Function1 function1 = new Function1() { // from class: sh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11382g.m42687m((Integer) obj);
            }
        };
        taskMo483a.mo11893g(new InterfaceC11256g() { // from class: sh.d
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                C11382g.m42688n(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: sh.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C11382g.m42689o(task);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: sh.f
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                C11382g.m42690p(exc);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m42687m(Integer num) {
        Log.i("rbx.featuredelivery", "Module download started: " + num);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m42688n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final void m42689o(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.i("rbx.featuredelivery", "Module download completed");
    }

    /* JADX INFO: renamed from: p */
    public static final void m42690p(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("rbx.featuredelivery", "Module download failed", e10);
    }

    /* JADX INFO: renamed from: q */
    public static final void m42691q(@NotNull Map<String, ExpBackOffRetryPolicy> policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        retryPolicies = policies;
        retryCounts.clear();
        Iterator<T> it = policies.keySet().iterator();
        while (it.hasNext()) {
            retryCounts.put((String) it.next(), new AtomicInteger(0));
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m42692t(C11382g c11382g, String str, List list, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        c11382g.m42695s(str, list, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: ae.b */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: ae.b */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: ae.b */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, ae.f, sh.g$b] */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object m42693h(String str, boolean z10, InterfaceC9557b interfaceC9557b) throws Throwable {
        a aVar;
        C7729c0 c7729c0;
        InterfaceC0161f interfaceC0161f;
        InterfaceC0152b interfaceC0152b;
        InterfaceC0161f interfaceC0161f2;
        InterfaceC0152b interfaceC0152b2;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40249A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40249A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f40255y;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40249A;
        InterfaceC0152b interfaceC0152b3 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c0 = (C7729c0) aVar.f40251u;
            try {
                C7348o.m30470b(obj);
                interfaceC0161f2 = (InterfaceC0161f) c7729c0.f29425a;
                if (interfaceC0161f2 != null) {
                    interfaceC0152b2 = splitInstallManager;
                    if (interfaceC0152b2 == null) {
                        Intrinsics.m31998u("splitInstallManager");
                    } else {
                        interfaceC0152b3 = interfaceC0152b2;
                    }
                    interfaceC0152b3.mo484b(interfaceC0161f2);
                }
                return Unit.f29331a;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0161f = (InterfaceC0161f) c7729c0.f29425a;
                if (interfaceC0161f != null) {
                    interfaceC0152b = splitInstallManager;
                    if (interfaceC0152b == null) {
                        Intrinsics.m31998u("splitInstallManager");
                    } else {
                        interfaceC0152b3 = interfaceC0152b;
                    }
                    interfaceC0152b3.mo484b(interfaceC0161f);
                }
                throw th;
            }
        }
        C7348o.m30470b(obj);
        C7729c0 c7729c1 = new C7729c0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            aVar.f40250t = str;
            aVar.f40251u = c7729c1;
            aVar.f40252v = atomicBoolean;
            aVar.f40253w = z10;
            aVar.f40254x = 0;
            aVar.f40249A = 1;
            C7905p c7905p = new C7905p(C10046b.m38803c(aVar), 1);
            c7905p.m32860H();
            ?? bVar = new b(str, c7905p, atomicBoolean, z10);
            c7729c1.f29425a = bVar;
            InterfaceC0152b interfaceC0152b4 = splitInstallManager;
            InterfaceC0152b interfaceC0152b5 = interfaceC0152b4;
            if (interfaceC0152b4 == null) {
                Intrinsics.m31998u("splitInstallManager");
                interfaceC0152b5 = 0;
            }
            interfaceC0152b5.mo485c(bVar);
            if (m42684j(str)) {
                m42683i(c7905p, atomicBoolean, z10, str);
            }
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(aVar);
            }
            if (objM32857A == objM38805e) {
                return objM38805e;
            }
            c7729c0 = c7729c1;
            interfaceC0161f2 = (InterfaceC0161f) c7729c0.f29425a;
            if (interfaceC0161f2 != null) {
                interfaceC0152b2 = splitInstallManager;
                if (interfaceC0152b2 == null) {
                    Intrinsics.m31998u("splitInstallManager");
                } else {
                    interfaceC0152b3 = interfaceC0152b2;
                }
                interfaceC0152b3.mo484b(interfaceC0161f2);
            }
            return Unit.f29331a;
        } catch (Throwable th3) {
            th = th3;
            c7729c0 = c7729c1;
            interfaceC0161f = (InterfaceC0161f) c7729c0.f29425a;
            if (interfaceC0161f != null) {
                interfaceC0152b = splitInstallManager;
                if (interfaceC0152b == null) {
                    Intrinsics.m31998u("splitInstallManager");
                } else {
                    interfaceC0152b3 = interfaceC0152b;
                }
                interfaceC0152b3.mo484b(interfaceC0161f);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p489vd.InterfaceC12158a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo1207a(@NotNull AbstractC0159e state) {
        AtomicInteger atomicIntegerPutIfAbsent;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.mo511i()) {
            case 0:
                Log.i("rbx.featuredelivery", "Status: UNKNOWN for module " + state.m508f());
                List<String> listM508f = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f, "moduleNames(...)");
                m42692t(this, "Unknown", listM508f, 0, 4, null);
                break;
            case 1:
                Log.i("rbx.featuredelivery", "Status: PENDING for module " + state.m508f());
                List<String> listM508f2 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f2, "moduleNames(...)");
                m42692t(this, "Pending", listM508f2, 0, 4, null);
                break;
            case 2:
                Log.i("rbx.featuredelivery", state.mo512j() == 0 ? "Downloading " + state.m508f() : "Downloading " + state.m508f() + ", " + ((state.mo504a() * ((long) 100)) / state.mo512j()) + "%");
                List<String> listM508f3 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f3, "moduleNames(...)");
                m42692t(this, "Downloading", listM508f3, 0, 4, null);
                break;
            case 3:
                Log.i("rbx.featuredelivery", "Status: DOWNLOADED for module " + state.m508f());
                List<String> listM508f4 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f4, "moduleNames(...)");
                m42692t(this, "Downloaded", listM508f4, 0, 4, null);
                break;
            case 4:
                Log.i("rbx.featuredelivery", "Installing " + state.m508f());
                List<String> listM508f5 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f5, "moduleNames(...)");
                m42692t(this, "Installing", listM508f5, 0, 4, null);
                break;
            case 5:
                Log.i("rbx.featuredelivery", "Installed " + state.m508f());
                List<String> listM508f6 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f6, "moduleNames(...)");
                m42692t(this, "Installed", listM508f6, 0, 4, null);
                if (C11659h.m43403a().mo43485L3()) {
                    List<String> listM508f7 = state.m508f();
                    Intrinsics.checkNotNullExpressionValue(listM508f7, "moduleNames(...)");
                    Iterator<T> it = listM508f7.iterator();
                    while (it.hasNext()) {
                        AtomicInteger atomicInteger = retryCounts.get((String) it.next());
                        if (atomicInteger != null) {
                            atomicInteger.set(0);
                        }
                    }
                }
                JNIAAssetManagerSetup.m14817a(RobloxApplication.m14834f());
                if (C11659h.m43403a().mo43644h5() && state.m508f().contains("webrtcsdk")) {
                    Context contextM14834f = RobloxApplication.m14834f();
                    Intrinsics.checkNotNullExpressionValue(contextM14834f, "getAppContext(...)");
                    String strM42669f = C11377b.m42669f(contextM14834f, "robloxwebrtc", null, 4, null);
                    if (strM42669f != null) {
                        WebRtcLoader.initialize(strM42669f);
                    }
                    break;
                }
                break;
            case 6:
                Log.e("rbx.featuredelivery", "Status: Failed for module " + state.m508f() + ", errorCode=" + state.mo505c());
                List<String> listM508f8 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f8, "moduleNames(...)");
                m42692t(this, "Failed", listM508f8, 0, 4, null);
                if (C11659h.m43403a().mo43485L3()) {
                    List<String> listM508f9 = state.m508f();
                    Intrinsics.checkNotNullExpressionValue(listM508f9, "moduleNames(...)");
                    for (String str : listM508f9) {
                        ExpBackOffRetryPolicy expBackOffRetryPolicy = retryPolicies.get(str);
                        if (expBackOffRetryPolicy != null) {
                            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = retryCounts;
                            AtomicInteger atomicInteger2 = concurrentHashMap.get(str);
                            if (atomicInteger2 == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger2 = new AtomicInteger(0)))) != null) {
                                atomicInteger2 = atomicIntegerPutIfAbsent;
                            }
                            AtomicInteger atomicInteger3 = atomicInteger2;
                            if (C11383h.f40264a.contains(Integer.valueOf(state.mo505c()))) {
                                int andIncrement = atomicInteger3.getAndIncrement();
                                if (andIncrement < expBackOffRetryPolicy.getMaxRetries()) {
                                    long baseDelayMs = expBackOffRetryPolicy.getBaseDelayMs() * (1 << andIncrement);
                                    Log.i("rbx.featuredelivery", "Scheduling " + str + " retry #" + (andIncrement + 1) + " in " + baseDelayMs + "ms");
                                    C7882k.m32780d(retryScope, null, null, new c(baseDelayMs, str, null), 3, null);
                                } else {
                                    Log.e("rbx.featuredelivery", str + ": max retries exhausted after " + andIncrement + " attempts");
                                    C11382g c11382g = f40243a;
                                    List<String> listM508f10 = state.m508f();
                                    Intrinsics.checkNotNullExpressionValue(listM508f10, "moduleNames(...)");
                                    c11382g.m42695s("RetryExhausted", listM508f10, andIncrement);
                                }
                            } else {
                                Log.e("rbx.featuredelivery", str + ": non-retryable error " + state.mo505c());
                                C11382g c11382g2 = f40243a;
                                List<String> listM508f11 = state.m508f();
                                Intrinsics.checkNotNullExpressionValue(listM508f11, "moduleNames(...)");
                                m42692t(c11382g2, "PermanentFailure", listM508f11, 0, 4, null);
                            }
                        }
                    }
                } else {
                    Log.i("rbx.featuredelivery", "Retry disabled globally via kill switch");
                }
                break;
            case 7:
                Log.i("rbx.featuredelivery", "Status: CANCELED for module " + state.m508f());
                List<String> listM508f12 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f12, "moduleNames(...)");
                m42692t(this, "Canceled", listM508f12, 0, 4, null);
                break;
            case 8:
                Log.i("rbx.featuredelivery", "REQUIRES_USER_CONFIRMATION is unsupported " + state.m508f());
                List<String> listM508f13 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f13, "moduleNames(...)");
                m42692t(this, "Requires User Confirmation", listM508f13, 0, 4, null);
                break;
            case 9:
                Log.i("rbx.featuredelivery", "Status: CANCELING for module " + state.m508f());
                List<String> listM508f14 = state.m508f();
                Intrinsics.checkNotNullExpressionValue(listM508f14, "moduleNames(...)");
                m42692t(this, "Canceling", listM508f14, 0, 4, null);
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m42695s(String status, List<String> moduleNames, int retryAttempt) {
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(C7697o.m31878d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(C11659h.m43403a().mo43528S()).setEventName("roblox_feature_delivery").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(standardFields).setCustomStringFields(C11659h.m43403a().mo43707q5() ? C7699p.m31895n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m31715m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)), new Pair("user_id", String.valueOf(C5654c.m25669c().m25678j()))) : C7699p.m31895n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m31715m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)))).build()).build();
        Intrinsics.checkNotNullExpressionValue(robloxTelemetryEventBuild, "build(...)");
        LoggingProtocol.m15997j(robloxTelemetryEventBuild);
    }
}
