package fm;

import android.app.Application;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NsdManager.RegistrationListener f16184a;
    public u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NsdManager f16185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p.b f16186d = p.b.INACTIVE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<Application> f16187e;

    public class a implements NsdManager.RegistrationListener {
        public a() {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            Log.e("MagicLoginNsdHelperServer", "Exception while handling registration: " + i10);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            r.this.g(p.b.ACTIVE);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            r rVar = r.this;
            if (rVar.f16186d == p.b.ACTIVE) {
                p.b bVar = p.b.INACTIVE;
                rVar.f16186d = bVar;
                rVar.g(bVar);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            Log.e("MagicLoginNsdHelperServer", "Exception while handling unregistration: " + i10);
        }
    }

    public r(Application application) {
        this.f16185c = (NsdManager) application.getSystemService("servicediscovery");
        this.f16187e = new WeakReference<>(application);
    }

    public final void b() {
        this.f16184a = new a();
    }

    public final void c() {
        this.b = new u();
    }

    public synchronized void d() {
        if (this.f16186d == p.b.ACTIVE) {
            i();
            this.f16186d = p.b.PAUSED;
        }
    }

    public final void e(int i10) {
        String string;
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        if (this.f16187e.get() != null) {
            string = Settings.Secure.getString(this.f16187e.get().getContentResolver(), "bluetooth_name");
        } else {
            Log.e("MagicLoginNsdHelperServer", "weakApplication is null");
            string = BuildConfig.FLAVOR;
        }
        nsdServiceInfo.setServiceName("Roblox-Magic-Login");
        nsdServiceInfo.setServiceType("_scpi-raw._tcp");
        nsdServiceInfo.setPort(i10);
        nsdServiceInfo.setAttribute(an.a.j(), Build.MODEL);
        nsdServiceInfo.setAttribute(an.a.i(), string);
        this.f16185c.registerService(nsdServiceInfo, 1, this.f16184a);
    }

    public synchronized void f() {
        if (this.f16186d == p.b.PAUSED) {
            h();
        }
    }

    public final synchronized void g(p.b bVar) {
        this.f16186d = bVar;
    }

    public synchronized void h() {
        try {
            if (this.f16186d != p.b.ACTIVE) {
                try {
                    if (this.b == null) {
                        c();
                    }
                    if (this.f16184a == null) {
                        b();
                    }
                    this.b.d();
                    e(this.b.b());
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalArgumentException while handling startAdvertising: " + e10.toString());
                    i();
                } catch (IllegalStateException e11) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalStateException while handling startAdvertising: " + e11.toString());
                    i();
                } catch (SecurityException e12) {
                    Log.e("MagicLoginNsdHelperServer", "SecurityException while handling startAdvertising: " + e12.toString());
                    i();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:15:0x0017, B:16:0x0032, B:17:0x004c, B:19:0x0050), top: B:24:0x0001, inners: #1, #2 }] */
    public synchronized void i() {
        u uVar;
        NsdManager.RegistrationListener registrationListener;
        if (this.f16186d != p.b.ACTIVE || (registrationListener = this.f16184a) == null) {
            uVar = this.b;
            if (uVar != null) {
                uVar.e();
            }
        } else {
            try {
                try {
                    this.f16185c.unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalArgumentException while handling stopAdvertising: " + e10.toString());
                }
            } catch (IllegalStateException e11) {
                Log.e("MagicLoginNsdHelperServer", "IllegalStateException while handling stopAdvertising: " + e11.toString());
            }
            uVar = this.b;
            if (uVar != null) {
                uVar.e();
            }
        }
        throw th;
    }
}
