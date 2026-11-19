package m9;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.mlkit.common.MlKitException;
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
    public static final Status f22986u = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Status f22987v = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f22988w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static f f22989x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o9.w f22991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o9.y f22992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f22993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k9.e f22994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o9.l0 f22995g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f23002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f23003t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22990a = 10000;
    public boolean b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f22996h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f22997i = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f22998o = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a0 f22999p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f23000q = new w1.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f23001r = new w1.b();

    public f(Context context, Looper looper, k9.e eVar) {
        this.f23003t = true;
        this.f22993e = context;
        cb.j jVar = new cb.j(looper, this);
        this.f23002s = jVar;
        this.f22994f = eVar;
        this.f22995g = new o9.l0(eVar);
        if (v9.i.a(context)) {
            this.f23003t = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f22988w) {
            try {
                f fVar = f22989x;
                if (fVar != null) {
                    fVar.f22997i.incrementAndGet();
                    Handler handler = fVar.f23002s;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(b bVar, k9.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    @NonNull
    public static f u() {
        f fVar;
        synchronized (f22988w) {
            o9.s.m(f22989x, "Must guarantee manager is non-null before using getInstance");
            fVar = f22989x;
        }
        return fVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static f v(@NonNull Context context) {
        f fVar;
        synchronized (f22988w) {
            try {
                if (f22989x == null) {
                    f22989x = new f(context.getApplicationContext(), o9.j.b().getLooper(), k9.e.o());
                }
                fVar = f22989x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final void E(@NonNull l9.g gVar, int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        this.f23002s.sendMessage(this.f23002s.obtainMessage(4, new v0(new k1(i10, aVar), this.f22997i.get(), gVar)));
    }

    public final void F(@NonNull l9.g gVar, int i10, @NonNull u uVar, @NonNull tb.k kVar, @NonNull s sVar) {
        k(kVar, uVar.f(), gVar);
        this.f23002s.sendMessage(this.f23002s.obtainMessage(4, new v0(new m1(i10, uVar, kVar, sVar), this.f22997i.get(), gVar)));
    }

    public final void G(o9.p pVar, int i10, long j10, int i11) {
        this.f23002s.sendMessage(this.f23002s.obtainMessage(18, new u0(pVar, i10, j10, i11)));
    }

    public final void H(@NonNull k9.b bVar, int i10) {
        if (f(bVar, i10)) {
            return;
        }
        Handler handler = this.f23002s;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void I() {
        Handler handler = this.f23002s;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void J(@NonNull l9.g gVar) {
        Handler handler = this.f23002s;
        handler.sendMessage(handler.obtainMessage(7, gVar));
    }

    public final void b(@NonNull a0 a0Var) {
        synchronized (f22988w) {
            try {
                if (this.f22999p != a0Var) {
                    this.f22999p = a0Var;
                    this.f23000q.clear();
                }
                this.f23000q.addAll(a0Var.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NonNull a0 a0Var) {
        synchronized (f22988w) {
            try {
                if (this.f22999p == a0Var) {
                    this.f22999p = null;
                    this.f23000q.clear();
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
        o9.u uVarA = o9.t.b().a();
        if (uVarA != null && !uVarA.C3()) {
            return false;
        }
        int iA = this.f22995g.a(this.f22993e, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean f(k9.b bVar, int i10) {
        return this.f22994f.y(this.f22993e, bVar, i10);
    }

    @ResultIgnorabilityUnspecified
    public final j0 h(l9.g gVar) {
        Map map = this.f22998o;
        b bVarV = gVar.v();
        j0 j0Var = (j0) map.get(bVarV);
        if (j0Var == null) {
            j0Var = new j0(this, gVar);
            this.f22998o.put(bVarV, j0Var);
        }
        if (j0Var.a()) {
            this.f23001r.add(bVarV);
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
                this.f22990a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f23002s.removeMessages(12);
                for (b bVar : this.f22998o.keySet()) {
                    Handler handler = this.f23002s;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f22990a);
                }
                return true;
            case 2:
                p1 p1Var = (p1) message.obj;
                for (b bVar2 : p1Var.b()) {
                    j0 j0Var2 = (j0) this.f22998o.get(bVar2);
                    if (j0Var2 == null) {
                        p1Var.c(bVar2, new k9.b(13), null);
                        return true;
                    }
                    if (j0Var2.N()) {
                        p1Var.c(bVar2, k9.b.f21215k, j0Var2.t().getEndpointPackageName());
                    } else {
                        k9.b bVarR = j0Var2.r();
                        if (bVarR != null) {
                            p1Var.c(bVar2, bVarR, null);
                        } else {
                            j0Var2.H(p1Var);
                            j0Var2.C();
                        }
                    }
                }
                return true;
            case 3:
                for (j0 j0Var3 : this.f22998o.values()) {
                    j0Var3.B();
                    j0Var3.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                v0 v0Var = (v0) message.obj;
                j0 j0VarH = (j0) this.f22998o.get(v0Var.f23082c.v());
                if (j0VarH == null) {
                    j0VarH = h(v0Var.f23082c);
                }
                if (!j0VarH.a() || this.f22997i.get() == v0Var.b) {
                    j0VarH.D(v0Var.f23081a);
                } else {
                    v0Var.f23081a.a(f22986u);
                    j0VarH.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                k9.b bVar3 = (k9.b) message.obj;
                for (j0 j0Var4 : this.f22998o.values()) {
                    if (j0Var4.p() == i11) {
                        j0Var = j0Var4;
                        if (j0Var != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                        } else if (bVar3.B3() == 13) {
                            j0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f22994f.e(bVar3.B3()) + ": " + bVar3.C3()));
                        } else {
                            j0Var.e(g(j0Var.f23019c, bVar3));
                        }
                        return true;
                    }
                }
                if (j0Var != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar3.B3() == 13) {
                    j0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f22994f.e(bVar3.B3()) + ": " + bVar3.C3()));
                } else {
                    j0Var.e(g(j0Var.f23019c, bVar3));
                }
                return true;
            case 6:
                if (this.f22993e.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f22993e.getApplicationContext());
                    c.b().a(new e0(this));
                    if (!c.b().e(true)) {
                        this.f22990a = 300000L;
                    }
                }
                return true;
            case 7:
                h((l9.g) message.obj);
                return true;
            case 9:
                if (this.f22998o.containsKey(message.obj)) {
                    ((j0) this.f22998o.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it = this.f23001r.iterator();
                while (it.hasNext()) {
                    j0 j0Var5 = (j0) this.f22998o.remove((b) it.next());
                    if (j0Var5 != null) {
                        j0Var5.J();
                    }
                }
                this.f23001r.clear();
                return true;
            case 11:
                if (this.f22998o.containsKey(message.obj)) {
                    ((j0) this.f22998o.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f22998o.containsKey(message.obj)) {
                    ((j0) this.f22998o.get(message.obj)).b();
                }
                return true;
            case 14:
                b0 b0Var = (b0) message.obj;
                b bVarA = b0Var.a();
                if (this.f22998o.containsKey(bVarA)) {
                    b0Var.b().c(Boolean.valueOf(((j0) this.f22998o.get(bVarA)).o(false)));
                } else {
                    b0Var.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                l0 l0Var = (l0) message.obj;
                if (this.f22998o.containsKey(l0Var.f23033a)) {
                    j0.z((j0) this.f22998o.get(l0Var.f23033a), l0Var);
                }
                return true;
            case 16:
                l0 l0Var2 = (l0) message.obj;
                if (this.f22998o.containsKey(l0Var2.f23033a)) {
                    j0.A((j0) this.f22998o.get(l0Var2.f23033a), l0Var2);
                }
                return true;
            case 17:
                j();
                return true;
            case MlKitException.UNSUPPORTED /* 18 */:
                u0 u0Var = (u0) message.obj;
                if (u0Var.f23079c == 0) {
                    i().g(new o9.w(u0Var.b, Arrays.asList(u0Var.f23078a)));
                } else {
                    o9.w wVar = this.f22991c;
                    if (wVar != null) {
                        List listB3 = wVar.B3();
                        if (wVar.A3() != u0Var.b || (listB3 != null && listB3.size() >= u0Var.f23080d)) {
                            this.f23002s.removeMessages(17);
                            j();
                        } else {
                            this.f22991c.C3(u0Var.f23078a);
                        }
                    }
                    if (this.f22991c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u0Var.f23078a);
                        this.f22991c = new o9.w(u0Var.b, arrayList);
                        Handler handler2 = this.f23002s;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u0Var.f23079c);
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

    public final o9.y i() {
        if (this.f22992d == null) {
            this.f22992d = o9.x.a(this.f22993e);
        }
        return this.f22992d;
    }

    public final void j() {
        o9.w wVar = this.f22991c;
        if (wVar != null) {
            if (wVar.A3() > 0 || e()) {
                i().g(wVar);
            }
            this.f22991c = null;
        }
    }

    public final void k(tb.k kVar, int i10, l9.g gVar) {
        t0 t0VarA;
        if (i10 == 0 || (t0VarA = t0.a(this, i10, gVar.v())) == null) {
            return;
        }
        Task taskA = kVar.a();
        final Handler handler = this.f23002s;
        handler.getClass();
        taskA.c(new Executor() { // from class: m9.d0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, t0VarA);
    }

    public final int l() {
        return this.f22996h.getAndIncrement();
    }

    public final j0 t(b bVar) {
        return (j0) this.f22998o.get(bVar);
    }

    @NonNull
    public final Task x(@NonNull Iterable iterable) {
        p1 p1Var = new p1(iterable);
        this.f23002s.sendMessage(this.f23002s.obtainMessage(2, p1Var));
        return p1Var.a();
    }

    @NonNull
    public final Task y(@NonNull l9.g gVar, @NonNull o oVar, @NonNull w wVar, @NonNull Runnable runnable) {
        tb.k kVar = new tb.k();
        k(kVar, oVar.e(), gVar);
        this.f23002s.sendMessage(this.f23002s.obtainMessage(8, new v0(new l1(new w0(oVar, wVar, runnable), kVar), this.f22997i.get(), gVar)));
        return kVar.a();
    }

    @NonNull
    public final Task z(@NonNull l9.g gVar, @NonNull k.a aVar, int i10) {
        tb.k kVar = new tb.k();
        k(kVar, i10, gVar);
        this.f23002s.sendMessage(this.f23002s.obtainMessage(13, new v0(new n1(aVar, kVar), this.f22997i.get(), gVar)));
        return kVar.a();
    }
}
