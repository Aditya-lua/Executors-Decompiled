package rb;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jb.i;
import n9.m;
import u9.h;
import u9.o;
import u9.q;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f29827r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f29828s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f29829t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile e f29830u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29831a;
    public final PowerManager.WakeLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future<?> f29833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<f> f29835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public jb.b f29838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u9.e f29839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkSource f29840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f29841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f29842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f29843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<String, d> f29844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicInteger f29845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f29846q;

    public a(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f29831a = new Object();
        this.f29832c = 0;
        this.f29835f = new HashSet();
        this.f29836g = true;
        this.f29839j = h.c();
        this.f29844o = new HashMap();
        this.f29845p = new AtomicInteger(0);
        m.m(context, "WakeLock: context must not be null");
        m.g(str, "WakeLock: wakeLockName must not be empty");
        this.f29843n = context.getApplicationContext();
        this.f29842m = str;
        this.f29838i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f29841l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f29841l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.b = wakeLockNewWakeLock;
        if (q.c(context)) {
            WorkSource workSourceB = q.b(context, o.a(packageName) ? context.getPackageName() : packageName);
            this.f29840k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f29828s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f29829t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f29828s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        jb.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f29828s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f29846q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(@NonNull a aVar) {
        synchronized (aVar.f29831a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f29841l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f29832c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f29845p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f29827r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f29831a) {
            try {
                if (!b()) {
                    this.f29838i = jb.b.a(false, null);
                    this.b.acquire();
                    this.f29839j.b();
                }
                this.f29832c++;
                this.f29837h++;
                f(null);
                d dVar = this.f29844o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f29844o.put(null, dVar);
                }
                dVar.f29848a++;
                long jB = this.f29839j.b();
                long j11 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j11 > this.f29834e) {
                    this.f29834e = j11;
                    Future<?> future = this.f29833d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f29833d = this.f29846q.schedule(new Runnable() { // from class: rb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f29847a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f29831a) {
            z10 = this.f29832c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f29845p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f29841l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f29831a) {
            try {
                f(null);
                if (this.f29844o.containsKey(null)) {
                    d dVar = this.f29844o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f29848a - 1;
                        dVar.f29848a = i10;
                        if (i10 == 0) {
                            this.f29844o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f29841l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f29831a) {
            this.f29836g = z10;
        }
    }

    public final String f(String str) {
        if (this.f29836g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f29835f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f29835f);
        this.f29835f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f29831a) {
            try {
                if (b()) {
                    if (this.f29836g) {
                        int i11 = this.f29832c - 1;
                        this.f29832c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f29832c = 0;
                    }
                    g();
                    Iterator<d> it = this.f29844o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f29848a = 0;
                    }
                    this.f29844o.clear();
                    Future<?> future = this.f29833d;
                    if (future != null) {
                        future.cancel(false);
                        this.f29833d = null;
                        this.f29834e = 0L;
                    }
                    this.f29837h = 0;
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.f29838i != null) {
                                    this.f29838i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f29841l).concat(" failed to release!"), e10);
                                if (this.f29838i != null) {
                                    this.f29838i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f29838i != null) {
                                this.f29838i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f29841l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
