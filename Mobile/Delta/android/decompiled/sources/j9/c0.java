package j9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import n9.o0;
import n9.p0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile p0 f21754g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f21756i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f21749a = new r(x.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    public static final a0 b = new s(x.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f21750c = new t(x.u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f21751d = new u(x.u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f21752e = new v(x.u2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f21753f = new w(x.u2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f21755h = new Object();

    public static synchronized void a(Context context) {
        if (f21756i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f21756i = context.getApplicationContext();
        }
    }

    public static void b() {
        if (f21754g != null) {
            return;
        }
        n9.m.l(f21756i);
        synchronized (f21755h) {
            try {
                if (f21754g == null) {
                    f21754g = o0.s2(DynamiteModule.e(f21756i, DynamiteModule.f5939f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static j0 c(h0 h0Var) {
        j0 j0VarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            n9.m.l(f21756i);
            try {
                b();
                n9.m.l(f21756i);
                zzp zzpVarB = h0Var.b(f21756i);
                try {
                    zzr zzrVarH1 = h0Var.a() ? f21754g.H1(zzpVarB) : f21754g.d2(zzpVarB);
                    if (zzrVarH1.zza()) {
                        j0VarD = j0.f(zzrVarH1.zze(), zzrVarH1.zzc());
                    } else {
                        String strZzb = zzrVarH1.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzrVarH1.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        j0VarD = j0.g(zzrVarH1.zze(), zzrVarH1.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    j0VarD = j0.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                j0VarD = j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return j0VarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static j0 d(String str, x xVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, xVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static /* synthetic */ String e(boolean z10, String str, x xVar) {
        String str2 = (z10 || !f(str, xVar, true, false).f21773a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = u9.a.b("SHA-256");
        n9.m.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, u9.k.a(messageDigestB.digest(xVar.t2())), Boolean.valueOf(z10), "12451000.false");
    }

    @Deprecated
    public static j0 f(final String str, final x xVar, final boolean z10, boolean z11) {
        try {
            b();
            n9.m.l(f21756i);
            try {
                return f21754g.L(new zzt(str, xVar, z10, z11), y9.b.u2(f21756i.getPackageManager())) ? j0.b() : new i0(new Callable() { // from class: j9.z
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return c0.e(z10, str, xVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return j0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
