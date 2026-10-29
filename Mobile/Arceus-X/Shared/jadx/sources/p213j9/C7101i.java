package p213j9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.roblox.client.personasdk.BuildConfig;
import java.util.Arrays;
import p074db.AbstractC4527i;
import p074db.AbstractC4531m;
import p074db.C4523e;
import p074db.C4537s;
import p305n9.C8953m;
import p462u9.C11810a;

/* JADX INFO: renamed from: j9.i */
/* JADX INFO: loaded from: classes.dex */
public class C7101i {

    /* JADX INFO: renamed from: c */
    public static C7101i f27720c;

    /* JADX INFO: renamed from: a */
    public final Context f27721a;

    /* JADX INFO: renamed from: b */
    public volatile String f27722b;

    public C7101i(@NonNull Context context) {
        this.f27721a = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C7101i m29899a(@NonNull Context context) {
        C8953m.m36047l(context);
        synchronized (C7101i.class) {
            try {
                if (f27720c == null) {
                    C7090c0.m29870a(context);
                    f27720c = new C7101i(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f27720c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    /* JADX INFO: renamed from: d */
    public static final boolean m29900d(PackageInfo packageInfo, boolean z10) {
        AbstractC4527i abstractC4527iM22494g;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && (BuildConfig.STORE_PACKAGE.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            AbstractC4527i abstractC4527i = z10 ? C7088b0.f27690c : C7088b0.f27689b;
            Object obj = C11810a.f41568a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                abstractC4527iM22494g = byteArray != null ? AbstractC4527i.m22495h(byteArray) : AbstractC4527i.m22494g();
            } else {
                C4537s.m22509a(i10 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    abstractC4527iM22494g = AbstractC4527i.m22494g();
                } else {
                    AbstractC4531m abstractC4531m = AbstractC4527i.f18577b;
                    C4523e c4523e = new C4523e();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        c4523e.m22488b(signature.toByteArray());
                    }
                    abstractC4527iM22494g = c4523e.m22489c();
                }
            }
            if (abstractC4527iM22494g.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            AbstractC4527i abstractC4527iMo22491e = abstractC4527iM22494g.mo22491e();
            int size = abstractC4527iMo22491e.size();
            int i11 = 0;
            while (i11 < size) {
                byte[] bArr = (byte[]) abstractC4527iMo22491e.get(i11);
                AbstractC4531m abstractC4531mListIterator = abstractC4527i.listIterator(0);
                do {
                    int i12 = i11 + 1;
                    if (!abstractC4531mListIterator.hasNext()) {
                        i11 = i12;
                    }
                } while (!Arrays.equals(bArr, (byte[]) abstractC4531mListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? m29901f(packageInfo, C7088b0.f27688a) : m29901f(packageInfo, C7088b0.f27688a[0])) != null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static AbstractBinderC7119x m29901f(PackageInfo packageInfo, AbstractBinderC7119x... abstractBinderC7119xArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC7120y binderC7120y = new BinderC7120y(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < abstractBinderC7119xArr.length; i10++) {
                if (abstractBinderC7119xArr[i10].equals(binderC7120y)) {
                    return abstractBinderC7119xArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m29902b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m29900d(packageInfo, false)) {
            return true;
        }
        if (m29900d(packageInfo, true)) {
            if (C7099h.m29890e(this.f27721a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m29903c(int i10) {
        C7104j0 c7104j0M29907c;
        String[] packagesForUid = this.f27721a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            c7104j0M29907c = C7104j0.m29907c("no pkgs");
        } else {
            c7104j0M29907c = null;
            for (String str : packagesForUid) {
                c7104j0M29907c = m29904e(str, false, false);
                if (!c7104j0M29907c.f27726a) {
                }
            }
            C8953m.m36047l(c7104j0M29907c);
        }
        c7104j0M29907c.m29911e();
        return c7104j0M29907c.f27726a;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0018 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: android.os.StrictMode$ThreadPolicy */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: e */
    public final C7104j0 m29904e(String str, boolean z10, boolean z11) {
        C7104j0 c7104j0M29907c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C7104j0.m29907c("null pkg");
        }
        if (str.equals(this.f27722b)) {
            return C7104j0.m29906b();
        }
        AbstractBinderC7086a0 abstractBinderC7086a0 = C7090c0.f27695a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                C7090c0.m29871b();
                boolean zMo36059c = C7090c0.f27701g.mo36059c();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zMo36059c) {
                    C7098g0 c7098g0 = new C7098g0(null);
                    c7098g0.m29882a(str);
                    c7098g0.m29883b(C7099h.m29890e(this.f27721a));
                    c7098g0.m29884c(true);
                    c7104j0M29907c = C7090c0.m29872c(c7098g0.m29885d());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.f27721a.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zM29890e = C7099h.m29890e(this.f27721a);
                        if (packageInfo == null) {
                            c7104j0M29907c = C7104j0.m29907c("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                c7104j0M29907c = C7104j0.m29907c("single cert required");
                            } else {
                                BinderC7120y binderC7120y = new BinderC7120y(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                C7104j0 c7104j0M29873d = C7090c0.m29873d(str2, binderC7120y, zM29890e, false);
                                c7104j0M29907c = (!c7104j0M29873d.f27726a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C7090c0.m29873d(str2, binderC7120y, false, true).f27726a) ? c7104j0M29873d : C7104j0.m29907c("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return C7104j0.m29908d("no pkg ".concat(str), e10);
                    }
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        } catch (RemoteException | DynamiteModule.C1906a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (c7104j0M29907c.f27726a) {
            this.f27722b = str;
        }
        return c7104j0M29907c;
    }
}
