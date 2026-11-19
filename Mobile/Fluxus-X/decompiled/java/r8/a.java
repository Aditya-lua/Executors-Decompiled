package r8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k9.g;
import o9.s;
import va.e;
import va.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k9.a f30611a;
    public f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30613d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f30614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f30615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30616g;

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C0598a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30617a;
        public final boolean b;

        @Deprecated
        public C0598a(String str, boolean z10) {
            this.f30617a = str;
            this.b = z10;
        }

        public String a() {
            return this.f30617a;
        }

        public boolean b() {
            return this.b;
        }

        @NonNull
        public String toString() {
            String str = this.f30617a;
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
        s.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f30615f = context;
        this.f30612c = false;
        this.f30616g = j10;
    }

    @NonNull
    public static C0598a a(@NonNull Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0598a c0598aF = aVar.f(-1);
            aVar.e(c0598aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, BuildConfig.FLAVOR, null);
            aVar.c();
            return c0598aF;
        } catch (Throwable th2) {
            try {
                aVar.e(null, true, 0.0f, -1L, BuildConfig.FLAVOR, th2);
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
        s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f30615f == null || this.f30611a == null) {
                    return;
                }
                try {
                    if (this.f30612c) {
                        u9.a.b().c(this.f30615f, this.f30611a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f30612c = false;
                this.b = null;
                this.f30611a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final void d(boolean z10) {
        s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f30612c) {
                    c();
                }
                Context context = this.f30615f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = k9.f.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    k9.a aVar = new k9.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!u9.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f30611a = aVar;
                        try {
                            this.b = e.r2(aVar.a(10000L, TimeUnit.MILLISECONDS));
                            this.f30612c = true;
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
                    throw new g(9);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @VisibleForTesting
    public final boolean e(C0598a c0598a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0598a != null) {
            map.put("limit_ad_tracking", true != c0598a.b() ? "0" : "1");
            String strA = c0598a.a();
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

    public final C0598a f(int i10) {
        C0598a c0598a;
        s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f30612c) {
                    synchronized (this.f30613d) {
                        c cVar = this.f30614e;
                        if (cVar == null || !cVar.f30621d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f30612c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                s.l(this.f30611a);
                s.l(this.b);
                try {
                    c0598a = new C0598a(this.b.zzc(), this.b.D(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return c0598a;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f30613d) {
            c cVar = this.f30614e;
            if (cVar != null) {
                cVar.f30620c.countDown();
                try {
                    this.f30614e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f30616g;
            if (j10 > 0) {
                this.f30614e = new c(this, j10);
            }
        }
    }
}
