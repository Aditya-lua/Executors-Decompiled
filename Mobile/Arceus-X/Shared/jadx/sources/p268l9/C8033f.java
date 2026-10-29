package p268l9;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import bb.HandlerC1302j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1899a;
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
import p213j9.C7089c;
import p242k9.AbstractC7495e;
import p305n9.AbstractC8932f;
import p305n9.C8927d0;
import p305n9.C8953m;
import p305n9.C8956n;
import p305n9.C8961p;
import p305n9.InterfaceC8963q;
import p462u9.C11818i;
import p504w1.C12278b;
import sb.C11264k;

/* JADX INFO: renamed from: l9.f */
/* JADX INFO: loaded from: classes.dex */
public class C8033f implements Handler.Callback {

    /* JADX INFO: renamed from: u */
    @NonNull
    public static final Status f29990u = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: v */
    public static final Status f29991v = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: w */
    public static final Object f29992w = new Object();

    /* JADX INFO: renamed from: x */
    public static C8033f f29993x;

    /* JADX INFO: renamed from: c */
    public TelemetryData f29996c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8963q f29997d;

    /* JADX INFO: renamed from: e */
    public final Context f29998e;

    /* JADX INFO: renamed from: f */
    public final C7089c f29999f;

    /* JADX INFO: renamed from: g */
    public final C8927d0 f30000g;

    /* JADX INFO: renamed from: s */
    public final Handler f30007s;

    /* JADX INFO: renamed from: t */
    public volatile boolean f30008t;

    /* JADX INFO: renamed from: a */
    public long f29994a = 10000;

    /* JADX INFO: renamed from: b */
    public boolean f29995b = false;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f30001h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f30002i = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    public final Map f30003o = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: p */
    public C8018a0 f30004p = null;

    /* JADX INFO: renamed from: q */
    public final Set f30005q = new C12278b();

    /* JADX INFO: renamed from: r */
    public final Set f30006r = new C12278b();

    public C8033f(Context context, Looper looper, C7089c c7089c) {
        this.f30008t = true;
        this.f29998e = context;
        HandlerC1302j handlerC1302j = new HandlerC1302j(looper, this);
        this.f30007s = handlerC1302j;
        this.f29999f = c7089c;
        this.f30000g = new C8927d0(c7089c);
        if (C11818i.m44181a(context)) {
            this.f30008t = false;
        }
        handlerC1302j.sendMessage(handlerC1302j.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static void m33132a() {
        synchronized (f29992w) {
            try {
                C8033f c8033f = f29993x;
                if (c8033f != null) {
                    c8033f.f30002i.incrementAndGet();
                    Handler handler = c8033f.f30007s;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Status m33134g(C8021b c8021b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c8021b.m33116b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static C8033f m33142u() {
        C8033f c8033f;
        synchronized (f29992w) {
            C8953m.m36048m(f29993x, "Must guarantee manager is non-null before using getInstance");
            c8033f = f29993x;
        }
        return c8033f;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: v */
    public static C8033f m33143v(@NonNull Context context) {
        C8033f c8033f;
        synchronized (f29992w) {
            try {
                if (f29993x == null) {
                    f29993x = new C8033f(context.getApplicationContext(), AbstractC8932f.m35987b().getLooper(), C7089c.m29849o());
                }
                c8033f = f29993x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8033f;
    }

    /* JADX INFO: renamed from: E */
    public final void m33145E(@NonNull AbstractC7495e abstractC7495e, int i10, @NonNull AbstractC1899a abstractC1899a) {
        this.f30007s.sendMessage(this.f30007s.obtainMessage(4, new C8082v0(new C8050k1(i10, abstractC1899a), this.f30002i.get(), abstractC7495e)));
    }

    /* JADX INFO: renamed from: F */
    public final void m33146F(@NonNull AbstractC7495e abstractC7495e, int i10, @NonNull AbstractC8078u abstractC8078u, @NonNull C11264k c11264k, @NonNull InterfaceC8072s interfaceC8072s) {
        m33158k(c11264k, abstractC8078u.m33282f(), abstractC7495e);
        this.f30007s.sendMessage(this.f30007s.obtainMessage(4, new C8082v0(new C8056m1(i10, abstractC8078u, c11264k, interfaceC8072s), this.f30002i.get(), abstractC7495e)));
    }

    /* JADX INFO: renamed from: G */
    public final void m33147G(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f30007s.sendMessage(this.f30007s.obtainMessage(18, new C8079u0(methodInvocation, i10, j10, i11)));
    }

    /* JADX INFO: renamed from: H */
    public final void m33148H(@NonNull ConnectionResult connectionResult, int i10) {
        if (m33154f(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f30007s;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    /* JADX INFO: renamed from: I */
    public final void m33149I() {
        Handler handler = this.f30007s;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX INFO: renamed from: J */
    public final void m33150J(@NonNull AbstractC7495e abstractC7495e) {
        Handler handler = this.f30007s;
        handler.sendMessage(handler.obtainMessage(7, abstractC7495e));
    }

    /* JADX INFO: renamed from: b */
    public final void m33151b(@NonNull C8018a0 c8018a0) {
        synchronized (f29992w) {
            try {
                if (this.f30004p != c8018a0) {
                    this.f30004p = c8018a0;
                    this.f30005q.clear();
                }
                this.f30005q.addAll(c8018a0.m33109t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33152c(@NonNull C8018a0 c8018a0) {
        synchronized (f29992w) {
            try {
                if (this.f30004p == c8018a0) {
                    this.f30004p = null;
                    this.f30005q.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m33153e() {
        if (this.f29995b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationM36055a = C8956n.m36054b().m36055a();
        if (rootTelemetryConfigurationM36055a != null && !rootTelemetryConfigurationM36055a.m9212x3()) {
            return false;
        }
        int iM35975a = this.f30000g.m35975a(this.f29998e, 203400000);
        return iM35975a == -1 || iM35975a == 0;
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: f */
    public final boolean m33154f(ConnectionResult connectionResult, int i10) {
        return this.f29999f.m29869y(this.f29998e, connectionResult, i10);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: h */
    public final C8046j0 m33155h(AbstractC7495e abstractC7495e) {
        Map map = this.f30003o;
        C8021b c8021bMo31148u = abstractC7495e.mo31148u();
        C8046j0 c8046j0 = (C8046j0) map.get(c8021bMo31148u);
        if (c8046j0 == null) {
            c8046j0 = new C8046j0(this, abstractC7495e);
            this.f30003o.put(c8021bMo31148u, c8046j0);
        }
        if (c8046j0.m33208a()) {
            this.f30006r.add(c8021bMo31148u);
        }
        c8046j0.m33198C();
        return c8046j0;
    }

    /* JADX DEBUG: Class process forced to load method for inline: l9.j0.A(l9.j0, l9.l0):void */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x022d  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x022d, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        int i10 = message.what;
        C8046j0 c8046j0 = null;
        switch (i10) {
            case 1:
                this.f29994a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f30007s.removeMessages(12);
                for (C8021b c8021b : this.f30003o.keySet()) {
                    Handler handler = this.f30007s;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c8021b), this.f29994a);
                }
                return true;
            case 2:
                C8065p1 c8065p1 = (C8065p1) message.obj;
                for (C8021b c8021b2 : c8065p1.m33266b()) {
                    C8046j0 c8046j1 = (C8046j0) this.f30003o.get(c8021b2);
                    if (c8046j1 == null) {
                        c8065p1.m33267c(c8021b2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (c8046j1.m33207N()) {
                        c8065p1.m33267c(c8021b2, ConnectionResult.f7373k, c8046j1.m33226t().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultM33225r = c8046j1.m33225r();
                        if (connectionResultM33225r != null) {
                            c8065p1.m33267c(c8021b2, connectionResultM33225r, null);
                        } else {
                            c8046j1.m33203H(c8065p1);
                            c8046j1.m33198C();
                        }
                    }
                }
                return true;
            case 3:
                for (C8046j0 c8046j2 : this.f30003o.values()) {
                    c8046j2.m33197B();
                    c8046j2.m33198C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C8082v0 c8082v0 = (C8082v0) message.obj;
                C8046j0 c8046j0M33155h = (C8046j0) this.f30003o.get(c8082v0.f30113c.mo31148u());
                if (c8046j0M33155h == null) {
                    c8046j0M33155h = m33155h(c8082v0.f30113c);
                }
                if (!c8046j0M33155h.m33208a() || this.f30002i.get() == c8082v0.f30112b) {
                    c8046j0M33155h.m33199D(c8082v0.f30111a);
                } else {
                    c8082v0.f30111a.mo33184a(f29990u);
                    c8046j0M33155h.m33205J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (C8046j0 c8046j3 : this.f30003o.values()) {
                    if (c8046j3.m33223p() == i11) {
                        c8046j0 = c8046j3;
                        if (c8046j0 != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                        } else if (connectionResult.m9140w3() == 13) {
                            c8046j0.m33212e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f29999f.mo29853e(connectionResult.m9140w3()) + ": " + connectionResult.m9141x3()));
                        } else {
                            c8046j0.m33212e(m33134g(c8046j0.f30028c, connectionResult));
                        }
                        return true;
                    }
                }
                if (c8046j0 != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.m9140w3() == 13) {
                    c8046j0.m33212e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f29999f.mo29853e(connectionResult.m9140w3()) + ": " + connectionResult.m9141x3()));
                } else {
                    c8046j0.m33212e(m33134g(c8046j0.f30028c, connectionResult));
                }
                return true;
            case 6:
                if (this.f29998e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C8024c.m33120c((Application) this.f29998e.getApplicationContext());
                    ComponentCallbacks2C8024c.m33119b().m33121a(new C8031e0(this));
                    if (!ComponentCallbacks2C8024c.m33119b().m33123e(true)) {
                        this.f29994a = 300000L;
                    }
                }
                return true;
            case 7:
                m33155h((AbstractC7495e) message.obj);
                return true;
            case 9:
                if (this.f30003o.containsKey(message.obj)) {
                    ((C8046j0) this.f30003o.get(message.obj)).m33204I();
                }
                return true;
            case 10:
                Iterator it = this.f30006r.iterator();
                while (it.hasNext()) {
                    C8046j0 c8046j4 = (C8046j0) this.f30003o.remove((C8021b) it.next());
                    if (c8046j4 != null) {
                        c8046j4.m33205J();
                    }
                }
                this.f30006r.clear();
                return true;
            case 11:
                if (this.f30003o.containsKey(message.obj)) {
                    ((C8046j0) this.f30003o.get(message.obj)).m33206K();
                }
                return true;
            case 12:
                if (this.f30003o.containsKey(message.obj)) {
                    ((C8046j0) this.f30003o.get(message.obj)).m33209b();
                }
                return true;
            case 14:
                C8022b0 c8022b0 = (C8022b0) message.obj;
                C8021b c8021bM33117a = c8022b0.m33117a();
                if (this.f30003o.containsKey(c8021bM33117a)) {
                    c8022b0.m33118b().m42328c(Boolean.valueOf(((C8046j0) this.f30003o.get(c8021bM33117a)).m33222o(false)));
                } else {
                    c8022b0.m33118b().m42328c(Boolean.FALSE);
                }
                return true;
            case 15:
                C8052l0 c8052l0 = (C8052l0) message.obj;
                if (this.f30003o.containsKey(c8052l0.f30045a)) {
                    C8046j0.m33196z((C8046j0) this.f30003o.get(c8052l0.f30045a), c8052l0);
                }
                return true;
            case 16:
                C8052l0 c8052l1 = (C8052l0) message.obj;
                if (this.f30003o.containsKey(c8052l1.f30045a)) {
                    C8046j0.m33188A((C8046j0) this.f30003o.get(c8052l1.f30045a), c8052l1);
                }
                return true;
            case 17:
                m33157j();
                return true;
            case 18:
                C8079u0 c8079u0 = (C8079u0) message.obj;
                if (c8079u0.f30109c == 0) {
                    m33156i().mo36065c(new TelemetryData(c8079u0.f30108b, Arrays.asList(c8079u0.f30107a)));
                } else {
                    TelemetryData telemetryData = this.f29996c;
                    if (telemetryData != null) {
                        List listM9216w3 = telemetryData.m9216w3();
                        if (telemetryData.m9215v3() != c8079u0.f30108b || (listM9216w3 != null && listM9216w3.size() >= c8079u0.f30110d)) {
                            this.f30007s.removeMessages(17);
                            m33157j();
                        } else {
                            this.f29996c.m9217x3(c8079u0.f30107a);
                        }
                    }
                    if (this.f29996c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c8079u0.f30107a);
                        this.f29996c = new TelemetryData(c8079u0.f30108b, arrayList);
                        Handler handler2 = this.f30007s;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c8079u0.f30109c);
                    }
                }
                return true;
            case 19:
                this.f29995b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC8963q m33156i() {
        if (this.f29997d == null) {
            this.f29997d = C8961p.m36063a(this.f29998e);
        }
        return this.f29997d;
    }

    /* JADX INFO: renamed from: j */
    public final void m33157j() {
        TelemetryData telemetryData = this.f29996c;
        if (telemetryData != null) {
            if (telemetryData.m9215v3() > 0 || m33153e()) {
                m33156i().mo36065c(telemetryData);
            }
            this.f29996c = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33158k(C11264k c11264k, int i10, AbstractC7495e abstractC7495e) {
        C8076t0 c8076t0M33272a;
        if (i10 == 0 || (c8076t0M33272a = C8076t0.m33272a(this, i10, abstractC7495e.mo31148u())) == null) {
            return;
        }
        Task taskM42326a = c11264k.m42326a();
        final Handler handler = this.f30007s;
        handler.getClass();
        taskM42326a.mo11889c(new Executor() { // from class: l9.d0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c8076t0M33272a);
    }

    /* JADX INFO: renamed from: l */
    public final int m33159l() {
        return this.f30001h.getAndIncrement();
    }

    /* JADX INFO: renamed from: t */
    public final C8046j0 m33160t(C8021b c8021b) {
        return (C8046j0) this.f30003o.get(c8021b);
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public final Task m33161x(@NonNull Iterable iterable) {
        C8065p1 c8065p1 = new C8065p1(iterable);
        this.f30007s.sendMessage(this.f30007s.obtainMessage(2, c8065p1));
        return c8065p1.m33265a();
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public final Task m33162y(@NonNull AbstractC7495e abstractC7495e, @NonNull AbstractC8060o abstractC8060o, @NonNull AbstractC8084w abstractC8084w, @NonNull Runnable runnable) {
        C11264k c11264k = new C11264k();
        m33158k(c11264k, abstractC8060o.m33251e(), abstractC7495e);
        this.f30007s.sendMessage(this.f30007s.obtainMessage(8, new C8082v0(new C8053l1(new C8085w0(abstractC8060o, abstractC8084w, runnable), c11264k), this.f30002i.get(), abstractC7495e)));
        return c11264k.m42326a();
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public final Task m33163z(@NonNull AbstractC7495e abstractC7495e, @NonNull C8048k.a aVar, int i10) {
        C11264k c11264k = new C11264k();
        m33158k(c11264k, i10, abstractC7495e);
        this.f30007s.sendMessage(this.f30007s.obtainMessage(13, new C8082v0(new C8059n1(aVar, c11264k), this.f30002i.get(), abstractC7495e)));
        return c11264k.m42326a();
    }
}
