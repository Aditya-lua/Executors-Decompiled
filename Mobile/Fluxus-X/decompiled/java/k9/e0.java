package k9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import o9.y0;
import o9.z0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f21241g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f21243i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f21236a = new t(z.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    public static final c0 b = new u(z.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f21237c = new v(z.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f21238d = new w(z.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f21239e = new x(z.u2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f21240f = new y(z.u2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f21242h = new Object();

    public static synchronized void a(Context context) {
        if (f21243i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f21243i = context.getApplicationContext();
        }
    }

    public static void b() {
        if (f21241g != null) {
            return;
        }
        o9.s.l(f21243i);
        synchronized (f21242h) {
            try {
                if (f21241g == null) {
                    f21241g = y0.s2(DynamiteModule.e(f21243i, DynamiteModule.f6164f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static o0 c(m0 m0Var) {
        o0 o0VarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            o9.s.l(f21243i);
            try {
                b();
                o9.s.l(f21243i);
                f0 f0VarB = m0Var.b(f21243i);
                try {
                    h0 h0VarL2 = m0Var.a() ? f21241g.l2(f0VarB) : f21241g.N1(f0VarB);
                    if (h0VarL2.zza()) {
                        o0VarD = o0.f(h0VarL2.zze(), h0VarL2.zzc());
                    } else {
                        String strZzb = h0VarL2.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = h0VarL2.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        o0VarD = o0.g(h0VarL2.zze(), h0VarL2.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    o0VarD = o0.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                o0VarD = o0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return o0VarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static o0 d(String str, z zVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, zVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static /* synthetic */ String e(boolean z10, String str, z zVar) {
        String str2 = (z10 || !f(str, zVar, true, false).f21281a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = v9.a.b("SHA-256");
        o9.s.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, v9.k.a(messageDigestB.digest(zVar.t2())), Boolean.valueOf(z10), "12451000.false");
    }

    @Deprecated
    public static o0 f(final String str, final z zVar, final boolean z10, boolean z11) {
        try {
            b();
            o9.s.l(f21243i);
            try {
                return f21241g.Q1(new j0(str, zVar, z10, z11), z9.b.u2(f21243i.getPackageManager())) ? o0.b() : new n0(new Callable() { // from class: k9.b0
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return e0.e(z10, str, zVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return o0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return o0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
