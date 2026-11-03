package q8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.roblox.client.personasdk.BuildConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import n9.m;
import ua.e;
import ua.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j9.a f29634a;
    public f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29636d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f29637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f29638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f29639g;

    /* JADX INFO: renamed from: q8.a$a, reason: collision with other inner class name */
    public static final class C0514a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29640a;
        public final boolean b;

        @Deprecated
        public C0514a(String str, boolean z10) {
            this.f29640a = str;
            this.b = z10;
        }

        public String a() {
            return this.f29640a;
        }

        public boolean b() {
            return this.b;
        }

        @NonNull
        public String toString() {
            String str = this.f29640a;
            boolean z10 = this.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public a(@NonNull Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        m.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f29638f = context;
        this.f29635c = false;
        this.f29639g = j10;
    }

    @NonNull
    public static C0514a a(@NonNull Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0514a c0514aF = aVar.f(-1);
            aVar.e(c0514aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            aVar.c();
            return c0514aF;
        } catch (Throwable th2) {
            try {
                aVar.e(null, true, 0.0f, -1L, "", th2);
                throw th2;
            } catch (Throwable th3) {
                aVar.c();
                throw th3;
            }
        }
    }

    public static void b(boolean z10) {
    }

    public final void c() {
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f29638f == null || this.f29634a == null) {
                    return;
                }
                try {
                    if (this.f29635c) {
                        t9.a.b().c(this.f29638f, this.f29634a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f29635c = false;
                this.b = null;
                this.f29634a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final void d(boolean z10) {
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f29635c) {
                    c();
                }
                Context context = this.f29638f;
                try {
                    context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 0);
                    int iH = j9.d.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    j9.a aVar = new j9.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!t9.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f29634a = aVar;
                        try {
                            this.b = e.r2(aVar.a(10000L, TimeUnit.MILLISECONDS));
                            this.f29635c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new j9.e(9);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @VisibleForTesting
    public final boolean e(C0514a c0514a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0514a != null) {
            map.put("limit_ad_tracking", true != c0514a.b() ? "0" : "1");
            String strA = c0514a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new b(this, map).start();
        return true;
    }

    public final C0514a f(int i10) {
        C0514a c0514a;
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f29635c) {
                    synchronized (this.f29636d) {
                        c cVar = this.f29637e;
                        if (cVar == null || !cVar.f29644d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f29635c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                m.l(this.f29634a);
                m.l(this.b);
                try {
                    c0514a = new C0514a(this.b.zzc(), this.b.B(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return c0514a;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f29636d) {
            c cVar = this.f29637e;
            if (cVar != null) {
                cVar.f29643c.countDown();
                try {
                    this.f29637e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f29639g;
            if (j10 > 0) {
                this.f29637e = new c(this, j10);
            }
        }
    }
}
