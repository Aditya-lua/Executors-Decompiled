package sb;

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
import kb.i;
import o9.s;
import v9.h;
import v9.o;
import v9.q;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f31269r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f31270s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f31271t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile e f31272u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31273a;
    public final PowerManager.WakeLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future<?> f31275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<f> f31277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kb.b f31280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v9.e f31281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkSource f31282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f31283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f31284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f31285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<String, d> f31286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicInteger f31287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f31288q;

    public a(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f31273a = new Object();
        this.f31274c = 0;
        this.f31277f = new HashSet();
        this.f31278g = true;
        this.f31281j = h.d();
        this.f31286o = new HashMap();
        this.f31287p = new AtomicInteger(0);
        s.m(context, "WakeLock: context must not be null");
        s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f31285n = context.getApplicationContext();
        this.f31284m = str;
        this.f31280i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f31283l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f31283l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
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
            this.f31282k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f31270s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f31271t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f31270s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        kb.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f31270s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f31288q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(@NonNull a aVar) {
        synchronized (aVar.f31273a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f31283l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f31274c = 1;
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
        this.f31287p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f31269r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f31273a) {
            try {
                if (!b()) {
                    this.f31280i = kb.b.a(false, null);
                    this.b.acquire();
                    this.f31281j.b();
                }
                this.f31274c++;
                this.f31279h++;
                f(null);
                d dVar = this.f31286o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f31286o.put(null, dVar);
                }
                dVar.f31290a++;
                long jB = this.f31281j.b();
                long j11 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j11 > this.f31276e) {
                    this.f31276e = j11;
                    Future<?> future = this.f31275d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f31275d = this.f31288q.schedule(new Runnable() { // from class: sb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f31289a);
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
        synchronized (this.f31273a) {
            z10 = this.f31274c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f31287p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f31283l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f31273a) {
            try {
                f(null);
                if (this.f31286o.containsKey(null)) {
                    d dVar = this.f31286o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f31290a - 1;
                        dVar.f31290a = i10;
                        if (i10 == 0) {
                            this.f31286o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f31283l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f31273a) {
            this.f31278g = z10;
        }
    }

    public final String f(String str) {
        if (this.f31278g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f31277f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f31277f);
        this.f31277f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f31273a) {
            try {
                if (b()) {
                    if (this.f31278g) {
                        int i11 = this.f31274c - 1;
                        this.f31274c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f31274c = 0;
                    }
                    g();
                    Iterator<d> it = this.f31286o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f31290a = 0;
                    }
                    this.f31286o.clear();
                    Future<?> future = this.f31275d;
                    if (future != null) {
                        future.cancel(false);
                        this.f31275d = null;
                        this.f31276e = 0L;
                    }
                    this.f31279h = 0;
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.f31280i != null) {
                                    this.f31280i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f31283l).concat(" failed to release!"), e10);
                                if (this.f31280i != null) {
                                    this.f31280i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f31280i != null) {
                                this.f31280i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f31283l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
