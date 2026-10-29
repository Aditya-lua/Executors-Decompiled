package p374q8;

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
import p213j9.C7091d;
import p213j9.C7093e;
import p213j9.ServiceConnectionC7085a;
import p305n9.C8953m;
import p445t9.C11555a;
import ua.AbstractBinderC11835e;
import ua.InterfaceC11836f;

/* JADX INFO: renamed from: q8.a */
/* JADX INFO: loaded from: classes.dex */
public class C10480a {

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC7085a f37683a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11836f f37684b;

    /* JADX INFO: renamed from: c */
    public boolean f37685c;

    /* JADX INFO: renamed from: d */
    public final Object f37686d = new Object();

    /* JADX INFO: renamed from: e */
    public C10482c f37687e;

    /* JADX INFO: renamed from: f */
    public final Context f37688f;

    /* JADX INFO: renamed from: g */
    public final long f37689g;

    /* JADX INFO: renamed from: q8.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f37690a;

        /* JADX INFO: renamed from: b */
        public final boolean f37691b;

        @Deprecated
        public a(String str, boolean z10) {
            this.f37690a = str;
            this.f37691b = z10;
        }

        /* JADX INFO: renamed from: a */
        public String m40286a() {
            return this.f37690a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m40287b() {
            return this.f37691b;
        }

        @NonNull
        public String toString() {
            String str = this.f37690a;
            boolean z10 = this.f37691b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public C10480a(@NonNull Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C8953m.m36047l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f37688f = context;
        this.f37685c = false;
        this.f37689g = j10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m40279a(@NonNull Context context) {
        C10480a c10480a = new C10480a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c10480a.m40282d(false);
            a aVarM40284f = c10480a.m40284f(-1);
            c10480a.m40283e(aVarM40284f, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            c10480a.m40281c();
            return aVarM40284f;
        } catch (Throwable th2) {
            try {
                c10480a.m40283e(null, true, 0.0f, -1L, "", th2);
                throw th2;
            } catch (Throwable th3) {
                c10480a.m40281c();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m40280b(boolean z10) {
    }

    /* JADX INFO: renamed from: c */
    public final void m40281c() {
        C8953m.m36046k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f37688f == null || this.f37683a == null) {
                    return;
                }
                try {
                    if (this.f37685c) {
                        C11555a.m43201b().m43206c(this.f37688f, this.f37683a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f37685c = false;
                this.f37684b = null;
                this.f37683a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m40282d(boolean z10) {
        C8953m.m36046k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f37685c) {
                    m40281c();
                }
                Context context = this.f37688f;
                try {
                    context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 0);
                    int iMo29855h = C7091d.m29876f().mo29855h(context, 12451000);
                    if (iMo29855h != 0 && iMo29855h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC7085a serviceConnectionC7085a = new ServiceConnectionC7085a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C11555a.m43201b().m43205a(context, intent, serviceConnectionC7085a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f37683a = serviceConnectionC7085a;
                        try {
                            this.f37684b = AbstractBinderC11835e.m44222r2(serviceConnectionC7085a.m29845a(10000L, TimeUnit.MILLISECONDS));
                            this.f37685c = true;
                            if (z10) {
                                m40285g();
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
                    throw new C7093e(9);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final boolean m40283e(a aVar, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (aVar != null) {
            map.put("limit_ad_tracking", true != aVar.m40287b() ? "0" : "1");
            String strM40286a = aVar.m40286a();
            if (strM40286a != null) {
                map.put("ad_id_size", Integer.toString(strM40286a.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new C10481b(this, map).start();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final a m40284f(int i10) {
        a aVar;
        C8953m.m36046k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f37685c) {
                    synchronized (this.f37686d) {
                        C10482c c10482c = this.f37687e;
                        if (c10482c == null || !c10482c.f37696d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m40282d(false);
                        if (!this.f37685c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                C8953m.m36047l(this.f37683a);
                C8953m.m36047l(this.f37684b);
                try {
                    aVar = new a(this.f37684b.zzc(), this.f37684b.mo44221B(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m40285g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        m40281c();
        super.finalize();
    }

    /* JADX INFO: renamed from: g */
    public final void m40285g() {
        synchronized (this.f37686d) {
            C10482c c10482c = this.f37687e;
            if (c10482c != null) {
                c10482c.f37695c.countDown();
                try {
                    this.f37687e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f37689g;
            if (j10 > 0) {
                this.f37687e = new C10482c(this, j10);
            }
        }
    }
}
