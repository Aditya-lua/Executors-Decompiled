package p407rb;

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
import p215jb.C7129b;
import p215jb.C7135h;
import p215jb.C7136i;
import p305n9.C8953m;
import p462u9.C11817h;
import p462u9.C11824o;
import p462u9.C11826q;
import p462u9.InterfaceC11814e;

/* JADX INFO: renamed from: rb.a */
/* JADX INFO: loaded from: classes.dex */
public class C10807a {

    /* JADX INFO: renamed from: r */
    public static final long f38495r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s */
    public static volatile ScheduledExecutorService f38496s = null;

    /* JADX INFO: renamed from: t */
    public static final Object f38497t = new Object();

    /* JADX INFO: renamed from: u */
    public static volatile InterfaceC10811e f38498u = new C10809c();

    /* JADX INFO: renamed from: a */
    public final Object f38499a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f38500b;

    /* JADX INFO: renamed from: c */
    public int f38501c;

    /* JADX INFO: renamed from: d */
    public Future<?> f38502d;

    /* JADX INFO: renamed from: e */
    public long f38503e;

    /* JADX INFO: renamed from: f */
    public final Set<C10812f> f38504f;

    /* JADX INFO: renamed from: g */
    public boolean f38505g;

    /* JADX INFO: renamed from: h */
    public int f38506h;

    /* JADX INFO: renamed from: i */
    public C7129b f38507i;

    /* JADX INFO: renamed from: j */
    public InterfaceC11814e f38508j;

    /* JADX INFO: renamed from: k */
    public WorkSource f38509k;

    /* JADX INFO: renamed from: l */
    public final String f38510l;

    /* JADX INFO: renamed from: m */
    public final String f38511m;

    /* JADX INFO: renamed from: n */
    public final Context f38512n;

    /* JADX INFO: renamed from: o */
    public final Map<String, C10810d> f38513o;

    /* JADX INFO: renamed from: p */
    public AtomicInteger f38514p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f38515q;

    public C10807a(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f38499a = new Object();
        this.f38501c = 0;
        this.f38504f = new HashSet();
        this.f38505g = true;
        this.f38508j = C11817h.m44180c();
        this.f38513o = new HashMap();
        this.f38514p = new AtomicInteger(0);
        C8953m.m36048m(context, "WakeLock: context must not be null");
        C8953m.m36042g(str, "WakeLock: wakeLockName must not be empty");
        this.f38512n = context.getApplicationContext();
        this.f38511m = str;
        this.f38507i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f38510l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f38510l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C7136i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f38500b = wakeLockNewWakeLock;
        if (C11826q.m44212c(context)) {
            WorkSource workSourceM44211b = C11826q.m44211b(context, C11824o.m44207a(packageName) ? context.getPackageName() : packageName);
            this.f38509k = workSourceM44211b;
            if (workSourceM44211b != null) {
                m41171i(wakeLockNewWakeLock, workSourceM44211b);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f38496s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f38497t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f38496s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        C7135h.m29918a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f38496s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f38515q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m41170e(@NonNull C10807a c10807a) {
        synchronized (c10807a.f38499a) {
            try {
                if (c10807a.m41173b()) {
                    Log.e("WakeLock", String.valueOf(c10807a.f38510l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c10807a.m41177g();
                    if (c10807a.m41173b()) {
                        c10807a.f38501c = 1;
                        c10807a.m41178h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m41171i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41172a(long j10) {
        this.f38514p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f38495r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f38499a) {
            try {
                if (!m41173b()) {
                    this.f38507i = C7129b.m29917a(false, null);
                    this.f38500b.acquire();
                    this.f38508j.mo44176b();
                }
                this.f38501c++;
                this.f38506h++;
                m41176f(null);
                C10810d c10810d = this.f38513o.get(null);
                if (c10810d == null) {
                    c10810d = new C10810d(null);
                    this.f38513o.put(null, c10810d);
                }
                c10810d.f38517a++;
                long jMo44176b = this.f38508j.mo44176b();
                long j11 = Long.MAX_VALUE - jMo44176b > jMax ? jMo44176b + jMax : Long.MAX_VALUE;
                if (j11 > this.f38503e) {
                    this.f38503e = j11;
                    Future<?> future = this.f38502d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f38502d = this.f38515q.schedule(new Runnable() { // from class: rb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10807a.m41170e(this.f38516a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m41173b() {
        boolean z10;
        synchronized (this.f38499a) {
            z10 = this.f38501c > 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public void m41174c() {
        if (this.f38514p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f38510l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f38499a) {
            try {
                m41176f(null);
                if (this.f38513o.containsKey(null)) {
                    C10810d c10810d = this.f38513o.get(null);
                    if (c10810d != null) {
                        int i10 = c10810d.f38517a - 1;
                        c10810d.f38517a = i10;
                        if (i10 == 0) {
                            this.f38513o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f38510l).concat(" counter does not exist"));
                }
                m41178h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m41175d(boolean z10) {
        synchronized (this.f38499a) {
            this.f38505g = z10;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m41176f(String str) {
        if (this.f38505g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m41177g() {
        if (this.f38504f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f38504f);
        this.f38504f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m41178h(int i10) {
        synchronized (this.f38499a) {
            try {
                if (m41173b()) {
                    if (this.f38505g) {
                        int i11 = this.f38501c - 1;
                        this.f38501c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f38501c = 0;
                    }
                    m41177g();
                    Iterator<C10810d> it = this.f38513o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f38517a = 0;
                    }
                    this.f38513o.clear();
                    Future<?> future = this.f38502d;
                    if (future != null) {
                        future.cancel(false);
                        this.f38502d = null;
                        this.f38503e = 0L;
                    }
                    this.f38506h = 0;
                    if (this.f38500b.isHeld()) {
                        try {
                            try {
                                this.f38500b.release();
                                if (this.f38507i != null) {
                                    this.f38507i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f38510l).concat(" failed to release!"), e10);
                                if (this.f38507i != null) {
                                    this.f38507i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f38507i != null) {
                                this.f38507i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f38510l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
