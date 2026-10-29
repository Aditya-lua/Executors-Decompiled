package l9;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class f implements Handler.Callback {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Status f23001u = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Status f23002v = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f23003w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static f f23004x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TelemetryData f23006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n9.q f23007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f23008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.c f23009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n9.d0 f23010g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f23017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f23018t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23005a = 10000;
    public boolean b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f23011h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f23012i = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f23013o = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a0 f23014p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f23015q = new w1.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f23016r = new w1.b();

    public f(Context context, Looper looper, j9.c cVar) {
        this.f23018t = true;
        this.f23008e = context;
        bb.j jVar = new bb.j(looper, this);
        this.f23017s = jVar;
        this.f23009f = cVar;
        this.f23010g = new n9.d0(cVar);
        if (u9.i.a(context)) {
            this.f23018t = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f23003w) {
            try {
                f fVar = f23004x;
                if (fVar != null) {
                    fVar.f23012i.incrementAndGet();
                    Handler handler = fVar.f23017s;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(b bVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @NonNull
    public static f u() {
        f fVar;
        synchronized (f23003w) {
            n9.m.m(f23004x, "Must guarantee manager is non-null before using getInstance");
            fVar = f23004x;
        }
        return fVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static f v(@NonNull Context context) {
        f fVar;
        synchronized (f23003w) {
            try {
                if (f23004x == null) {
                    f23004x = new f(context.getApplicationContext(), n9.f.b().getLooper(), j9.c.o());
                }
                fVar = f23004x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final void E(@NonNull k9.e eVar, int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        this.f23017s.sendMessage(this.f23017s.obtainMessage(4, new v0(new k1(i10, aVar), this.f23012i.get(), eVar)));
    }

    public final void F(@NonNull k9.e eVar, int i10, @NonNull u uVar, @NonNull sb.k kVar, @NonNull s sVar) {
        k(kVar, uVar.f(), eVar);
        this.f23017s.sendMessage(this.f23017s.obtainMessage(4, new v0(new m1(i10, uVar, kVar, sVar), this.f23012i.get(), eVar)));
    }

    public final void G(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f23017s.sendMessage(this.f23017s.obtainMessage(18, new u0(methodInvocation, i10, j10, i11)));
    }

    public final void H(@NonNull ConnectionResult connectionResult, int i10) {
        if (f(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f23017s;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void I() {
        Handler handler = this.f23017s;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void J(@NonNull k9.e eVar) {
        Handler handler = this.f23017s;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(@NonNull a0 a0Var) {
        synchronized (f23003w) {
            try {
                if (this.f23014p != a0Var) {
                    this.f23014p = a0Var;
                    this.f23015q.clear();
                }
                this.f23015q.addAll(a0Var.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NonNull a0 a0Var) {
        synchronized (f23003w) {
            try {
                if (this.f23014p == a0Var) {
                    this.f23014p = null;
                    this.f23015q.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = n9.n.b().a();
        if (rootTelemetryConfigurationA != null && !rootTelemetryConfigurationA.x3()) {
            return false;
        }
        int iA = this.f23010g.a(this.f23008e, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f23009f.y(this.f23008e, connectionResult, i10);
    }

    @ResultIgnorabilityUnspecified
    public final j0 h(k9.e eVar) {
        Map map = this.f23013o;
        b bVarU = eVar.u();
        j0 j0Var = (j0) map.get(bVarU);
        if (j0Var == null) {
            j0Var = new j0(this, eVar);
            this.f23013o.put(bVarU, j0Var);
        }
        if (j0Var.a()) {
            this.f23016r.add(bVarU);
        }
        j0Var.C();
        return j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x022d  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x022d, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        int i10 = message.what;
        j0 j0Var = null;
        switch (i10) {
            case 1:
                this.f23005a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f23017s.removeMessages(12);
                for (b bVar : this.f23013o.keySet()) {
                    Handler handler = this.f23017s;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f23005a);
                }
                return true;
            case 2:
                p1 p1Var = (p1) message.obj;
                for (b bVar2 : p1Var.b()) {
                    j0 j0Var2 = (j0) this.f23013o.get(bVar2);
                    if (j0Var2 == null) {
                        p1Var.c(bVar2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (j0Var2.N()) {
                        p1Var.c(bVar2, ConnectionResult.f5688k, j0Var2.t().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultR = j0Var2.r();
                        if (connectionResultR != null) {
                            p1Var.c(bVar2, connectionResultR, null);
                        } else {
                            j0Var2.H(p1Var);
                            j0Var2.C();
                        }
                    }
                }
                return true;
            case 3:
                for (j0 j0Var3 : this.f23013o.values()) {
                    j0Var3.B();
                    j0Var3.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                v0 v0Var = (v0) message.obj;
                j0 j0VarH = (j0) this.f23013o.get(v0Var.f23097c.u());
                if (j0VarH == null) {
                    j0VarH = h(v0Var.f23097c);
                }
                if (!j0VarH.a() || this.f23012i.get() == v0Var.b) {
                    j0VarH.D(v0Var.f23096a);
                } else {
                    v0Var.f23096a.a(f23001u);
                    j0VarH.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (j0 j0Var4 : this.f23013o.values()) {
                    if (j0Var4.p() == i11) {
                        j0Var = j0Var4;
                        if (j0Var != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                        } else if (connectionResult.w3() == 13) {
                            j0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f23009f.e(connectionResult.w3()) + ": " + connectionResult.x3()));
                        } else {
                            j0Var.e(g(j0Var.f23034c, connectionResult));
                        }
                        return true;
                    }
                }
                if (j0Var != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.w3() == 13) {
                    j0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f23009f.e(connectionResult.w3()) + ": " + connectionResult.x3()));
                } else {
                    j0Var.e(g(j0Var.f23034c, connectionResult));
                }
                return true;
            case 6:
                if (this.f23008e.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f23008e.getApplicationContext());
                    c.b().a(new e0(this));
                    if (!c.b().e(true)) {
                        this.f23005a = 300000L;
                    }
                }
                return true;
            case 7:
                h((k9.e) message.obj);
                return true;
            case 9:
                if (this.f23013o.containsKey(message.obj)) {
                    ((j0) this.f23013o.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it = this.f23016r.iterator();
                while (it.hasNext()) {
                    j0 j0Var5 = (j0) this.f23013o.remove((b) it.next());
                    if (j0Var5 != null) {
                        j0Var5.J();
                    }
                }
                this.f23016r.clear();
                return true;
            case 11:
                if (this.f23013o.containsKey(message.obj)) {
                    ((j0) this.f23013o.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f23013o.containsKey(message.obj)) {
                    ((j0) this.f23013o.get(message.obj)).b();
                }
                return true;
            case 14:
                b0 b0Var = (b0) message.obj;
                b bVarA = b0Var.a();
                if (this.f23013o.containsKey(bVarA)) {
                    b0Var.b().c(Boolean.valueOf(((j0) this.f23013o.get(bVarA)).o(false)));
                } else {
                    b0Var.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                l0 l0Var = (l0) message.obj;
                if (this.f23013o.containsKey(l0Var.f23048a)) {
                    j0.z((j0) this.f23013o.get(l0Var.f23048a), l0Var);
                }
                return true;
            case 16:
                l0 l0Var2 = (l0) message.obj;
                if (this.f23013o.containsKey(l0Var2.f23048a)) {
                    j0.A((j0) this.f23013o.get(l0Var2.f23048a), l0Var2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                u0 u0Var = (u0) message.obj;
                if (u0Var.f23094c == 0) {
                    i().c(new TelemetryData(u0Var.b, Arrays.asList(u0Var.f23093a)));
                } else {
                    TelemetryData telemetryData = this.f23006c;
                    if (telemetryData != null) {
                        List listW3 = telemetryData.w3();
                        if (telemetryData.v3() != u0Var.b || (listW3 != null && listW3.size() >= u0Var.f23095d)) {
                            this.f23017s.removeMessages(17);
                            j();
                        } else {
                            this.f23006c.x3(u0Var.f23093a);
                        }
                    }
                    if (this.f23006c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u0Var.f23093a);
                        this.f23006c = new TelemetryData(u0Var.b, arrayList);
                        Handler handler2 = this.f23017s;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u0Var.f23094c);
                    }
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final n9.q i() {
        if (this.f23007d == null) {
            this.f23007d = n9.p.a(this.f23008e);
        }
        return this.f23007d;
    }

    public final void j() {
        TelemetryData telemetryData = this.f23006c;
        if (telemetryData != null) {
            if (telemetryData.v3() > 0 || e()) {
                i().c(telemetryData);
            }
            this.f23006c = null;
        }
    }

    public final void k(sb.k kVar, int i10, k9.e eVar) {
        t0 t0VarA;
        if (i10 == 0 || (t0VarA = t0.a(this, i10, eVar.u())) == null) {
            return;
        }
        Task taskA = kVar.a();
        final Handler handler = this.f23017s;
        handler.getClass();
        taskA.c(new Executor() { // from class: l9.d0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, t0VarA);
    }

    public final int l() {
        return this.f23011h.getAndIncrement();
    }

    public final j0 t(b bVar) {
        return (j0) this.f23013o.get(bVar);
    }

    @NonNull
    public final Task x(@NonNull Iterable iterable) {
        p1 p1Var = new p1(iterable);
        this.f23017s.sendMessage(this.f23017s.obtainMessage(2, p1Var));
        return p1Var.a();
    }

    @NonNull
    public final Task y(@NonNull k9.e eVar, @NonNull o oVar, @NonNull w wVar, @NonNull Runnable runnable) {
        sb.k kVar = new sb.k();
        k(kVar, oVar.e(), eVar);
        this.f23017s.sendMessage(this.f23017s.obtainMessage(8, new v0(new l1(new w0(oVar, wVar, runnable), kVar), this.f23012i.get(), eVar)));
        return kVar.a();
    }

    @NonNull
    public final Task z(@NonNull k9.e eVar, @NonNull k.a aVar, int i10) {
        sb.k kVar = new sb.k();
        k(kVar, i10, eVar);
        this.f23017s.sendMessage(this.f23017s.obtainMessage(13, new v0(new n1(aVar, kVar), this.f23012i.get(), eVar)));
        return kVar.a();
    }
}
