package p213j9;

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
import p305n9.AbstractBinderC8960o0;
import p305n9.C8953m;
import p305n9.InterfaceC8962p0;
import p462u9.C11810a;
import p462u9.C11820k;
import p571y9.BinderC13134b;

/* JADX INFO: renamed from: j9.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7090c0 {

    /* JADX INFO: renamed from: g */
    public static volatile InterfaceC8962p0 f27701g;

    /* JADX INFO: renamed from: i */
    public static Context f27703i;

    /* JADX INFO: renamed from: a */
    public static final AbstractBinderC7086a0 f27695a = new BinderC7113r(AbstractBinderC7119x.m29915u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b */
    public static final AbstractBinderC7086a0 f27696b = new BinderC7114s(AbstractBinderC7119x.m29915u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c */
    public static final AbstractBinderC7086a0 f27697c = new BinderC7115t(AbstractBinderC7119x.m29915u2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d */
    public static final AbstractBinderC7086a0 f27698d = new BinderC7116u(AbstractBinderC7119x.m29915u2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e */
    public static final AbstractBinderC7086a0 f27699e = new BinderC7117v(AbstractBinderC7119x.m29915u2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f */
    public static final AbstractBinderC7086a0 f27700f = new BinderC7118w(AbstractBinderC7119x.m29915u2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h */
    public static final Object f27702h = new Object();

    /* JADX INFO: renamed from: a */
    public static synchronized void m29870a(Context context) {
        if (f27703i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f27703i = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m29871b() {
        if (f27701g != null) {
            return;
        }
        C8953m.m36047l(f27703i);
        synchronized (f27702h) {
            try {
                if (f27701g == null) {
                    f27701g = AbstractBinderC8960o0.m36062s2(DynamiteModule.m9235e(f27703i, DynamiteModule.f7557f, "com.google.android.gms.googlecertificates").m9244d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C7104j0 m29872c(C7100h0 c7100h0) {
        C7104j0 c7104j0M29908d;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C8953m.m36047l(f27703i);
            try {
                m29871b();
                C8953m.m36047l(f27703i);
                zzp zzpVarM29898b = c7100h0.m29898b(f27703i);
                try {
                    zzr zzrVarMo36057H1 = c7100h0.m29897a() ? f27701g.mo36057H1(zzpVarM29898b) : f27701g.mo36060d2(zzpVarM29898b);
                    if (zzrVarMo36057H1.zza()) {
                        c7104j0M29908d = C7104j0.m29909f(zzrVarMo36057H1.zze(), zzrVarMo36057H1.zzc());
                    } else {
                        String strZzb = zzrVarMo36057H1.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzrVarMo36057H1.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        c7104j0M29908d = C7104j0.m29910g(zzrVarMo36057H1.zze(), zzrVarMo36057H1.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    c7104j0M29908d = C7104j0.m29908d("module call", e10);
                }
            } catch (DynamiteModule.C1906a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                c7104j0M29908d = C7104j0.m29908d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c7104j0M29908d;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static C7104j0 m29873d(String str, AbstractBinderC7119x abstractBinderC7119x, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m29875f(str, abstractBinderC7119x, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m29874e(boolean z10, String str, AbstractBinderC7119x abstractBinderC7119x) {
        String str2 = (z10 || !m29875f(str, abstractBinderC7119x, true, false).f27726a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestM44168b = C11810a.m44168b("SHA-256");
        C8953m.m36047l(messageDigestM44168b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, C11820k.m44190a(messageDigestM44168b.digest(abstractBinderC7119x.mo29846t2())), Boolean.valueOf(z10), "12451000.false");
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static C7104j0 m29875f(final String str, final AbstractBinderC7119x abstractBinderC7119x, final boolean z10, boolean z11) {
        try {
            m29871b();
            C8953m.m36047l(f27703i);
            try {
                return f27701g.mo36058L(new zzt(str, abstractBinderC7119x, z10, z11), BinderC13134b.m48743u2(f27703i.getPackageManager())) ? C7104j0.m29906b() : new C7102i0(new Callable() { // from class: j9.z
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return C7090c0.m29874e(z10, str, abstractBinderC7119x);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C7104j0.m29908d("module call", e10);
            }
        } catch (DynamiteModule.C1906a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C7104j0.m29908d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
