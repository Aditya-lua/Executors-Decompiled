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
    public static final long f30229r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f30230s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f30231t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile e f30232u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30233a;
    public final PowerManager.WakeLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future<?> f30235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<f> f30237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public jb.b f30240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u9.e f30241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkSource f30242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f30243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f30244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f30245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<String, d> f30246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicInteger f30247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f30248q;

    public a(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f30233a = new Object();
        this.f30234c = 0;
        this.f30237f = new HashSet();
        this.f30238g = true;
        this.f30241j = h.c();
        this.f30246o = new HashMap();
        this.f30247p = new AtomicInteger(0);
        m.m(context, "WakeLock: context must not be null");
        m.g(str, "WakeLock: wakeLockName must not be empty");
        this.f30245n = context.getApplicationContext();
        this.f30244m = str;
        this.f30240i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f30243l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f30243l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
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
            this.f30242k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f30230s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f30231t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f30230s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        jb.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f30230s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f30248q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(@NonNull a aVar) {
        synchronized (aVar.f30233a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f30243l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f30234c = 1;
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
        this.f30247p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f30229r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f30233a) {
            try {
                if (!b()) {
                    this.f30240i = jb.b.a(false, null);
                    this.b.acquire();
                    this.f30241j.b();
                }
                this.f30234c++;
                this.f30239h++;
                f(null);
                d dVar = this.f30246o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f30246o.put(null, dVar);
                }
                dVar.f30250a++;
                long jB = this.f30241j.b();
                long j11 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j11 > this.f30236e) {
                    this.f30236e = j11;
                    Future<?> future = this.f30235d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f30235d = this.f30248q.schedule(new Runnable() { // from class: rb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f30249a);
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
        synchronized (this.f30233a) {
            z10 = this.f30234c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f30247p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f30243l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f30233a) {
            try {
                f(null);
                if (this.f30246o.containsKey(null)) {
                    d dVar = this.f30246o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f30250a - 1;
                        dVar.f30250a = i10;
                        if (i10 == 0) {
                            this.f30246o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f30243l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f30233a) {
            this.f30238g = z10;
        }
    }

    public final String f(String str) {
        if (this.f30238g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f30237f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f30237f);
        this.f30237f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f30233a) {
            try {
                if (b()) {
                    if (this.f30238g) {
                        int i11 = this.f30234c - 1;
                        this.f30234c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f30234c = 0;
                    }
                    g();
                    Iterator<d> it = this.f30246o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f30250a = 0;
                    }
                    this.f30246o.clear();
                    Future<?> future = this.f30235d;
                    if (future != null) {
                        future.cancel(false);
                        this.f30235d = null;
                        this.f30236e = 0L;
                    }
                    this.f30239h = 0;
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.f30240i != null) {
                                    this.f30240i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f30243l).concat(" failed to release!"), e10);
                                if (this.f30240i != null) {
                                    this.f30240i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f30240i != null) {
                                this.f30240i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f30243l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
