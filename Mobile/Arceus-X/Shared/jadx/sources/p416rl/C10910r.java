package p416rl;

import android.app.Application;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.lang.ref.WeakReference;
import p311nm.C9494a;

/* JADX INFO: renamed from: rl.r */
/* JADX INFO: loaded from: classes2.dex */
public class C10910r {

    /* JADX INFO: renamed from: a */
    public NsdManager.RegistrationListener f38688a;

    /* JADX INFO: renamed from: b */
    public C10913u f38689b;

    /* JADX INFO: renamed from: c */
    public final NsdManager f38690c;

    /* JADX INFO: renamed from: d */
    public C10908p.b f38691d = C10908p.b.INACTIVE;

    /* JADX INFO: renamed from: e */
    public final WeakReference<Application> f38692e;

    /* JADX INFO: renamed from: rl.r$a */
    public class a implements NsdManager.RegistrationListener {
        public a() {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            Log.e("MagicLoginNsdHelperServer", "Exception while handling registration: " + i10);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C10910r.this.m41499g(C10908p.b.ACTIVE);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C10910r c10910r = C10910r.this;
            if (c10910r.f38691d == C10908p.b.ACTIVE) {
                C10908p.b bVar = C10908p.b.INACTIVE;
                c10910r.f38691d = bVar;
                c10910r.m41499g(bVar);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            Log.e("MagicLoginNsdHelperServer", "Exception while handling unregistration: " + i10);
        }
    }

    public C10910r(Application application) {
        this.f38690c = (NsdManager) application.getSystemService("servicediscovery");
        this.f38692e = new WeakReference<>(application);
    }

    /* JADX INFO: renamed from: b */
    public final void m41494b() {
        this.f38688a = new a();
    }

    /* JADX INFO: renamed from: c */
    public final void m41495c() {
        this.f38689b = new C10913u();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m41496d() {
        if (this.f38691d == C10908p.b.ACTIVE) {
            m41501i();
            this.f38691d = C10908p.b.PAUSED;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m41497e(int i10) {
        String string;
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        if (this.f38692e.get() != null) {
            string = Settings.Secure.getString(this.f38692e.get().getContentResolver(), "bluetooth_name");
        } else {
            Log.e("MagicLoginNsdHelperServer", "weakApplication is null");
            string = "";
        }
        nsdServiceInfo.setServiceName("Roblox-Magic-Login");
        nsdServiceInfo.setServiceType("_scpi-raw._tcp");
        nsdServiceInfo.setPort(i10);
        nsdServiceInfo.setAttribute(C9494a.m37397j(), Build.MODEL);
        nsdServiceInfo.setAttribute(C9494a.m37396i(), string);
        this.f38690c.registerService(nsdServiceInfo, 1, this.f38688a);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m41498f() {
        if (this.f38691d == C10908p.b.PAUSED) {
            m41500h();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m41499g(C10908p.b bVar) {
        this.f38691d = bVar;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m41500h() {
        try {
            if (this.f38691d != C10908p.b.ACTIVE) {
                try {
                    if (this.f38689b == null) {
                        m41495c();
                    }
                    if (this.f38688a == null) {
                        m41494b();
                    }
                    this.f38689b.m41506d();
                    m41497e(this.f38689b.m41504b());
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalArgumentException while handling startAdvertising: " + e10.toString());
                    m41501i();
                } catch (IllegalStateException e11) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalStateException while handling startAdvertising: " + e11.toString());
                    m41501i();
                } catch (SecurityException e12) {
                    Log.e("MagicLoginNsdHelperServer", "SecurityException while handling startAdvertising: " + e12.toString());
                    m41501i();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:15:0x0017, B:16:0x0032, B:17:0x004c, B:19:0x0050), top: B:24:0x0001, inners: #1, #2 }] */
    /* JADX INFO: renamed from: i */
    public synchronized void m41501i() {
        C10913u c10913u;
        NsdManager.RegistrationListener registrationListener;
        if (this.f38691d != C10908p.b.ACTIVE || (registrationListener = this.f38688a) == null) {
            c10913u = this.f38689b;
            if (c10913u != null) {
                c10913u.m41507e();
            }
        } else {
            try {
                try {
                    this.f38690c.unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperServer", "IllegalArgumentException while handling stopAdvertising: " + e10.toString());
                }
            } catch (IllegalStateException e11) {
                Log.e("MagicLoginNsdHelperServer", "IllegalStateException while handling stopAdvertising: " + e11.toString());
            }
            c10913u = this.f38689b;
            if (c10913u != null) {
                c10913u.m41507e();
            }
        }
        throw th;
    }
}
