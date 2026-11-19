package k9;

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
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f21267c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21268a;
    public volatile String b;

    public k(@NonNull Context context) {
        this.f21268a = context.getApplicationContext();
    }

    @NonNull
    public static k a(@NonNull Context context) {
        o9.s.l(context);
        synchronized (k.class) {
            try {
                if (f21267c == null) {
                    e0.a(context);
                    f21267c = new k(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21267c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        eb.i iVarG;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            eb.i iVar = z10 ? d0.f21231c : d0.b;
            Object obj = v9.a.f34238a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                iVarG = byteArray != null ? eb.i.h(byteArray) : eb.i.g();
            } else {
                eb.s.a(i10 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    iVarG = eb.i.g();
                } else {
                    eb.m mVar = eb.i.b;
                    eb.e eVar = new eb.e();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        eVar.b(signature.toByteArray());
                    }
                    iVarG = eVar.c();
                }
            }
            if (iVarG.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            eb.i iVarE = iVarG.e();
            int size = iVarE.size();
            int i11 = 0;
            while (i11 < size) {
                byte[] bArr = (byte[]) iVarE.get(i11);
                eb.m mVarListIterator = iVar.listIterator(0);
                do {
                    int i12 = i11 + 1;
                    if (!mVarListIterator.hasNext()) {
                        i11 = i12;
                    }
                } while (!Arrays.equals(bArr, (byte[]) mVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? f(packageInfo, d0.f21230a) : f(packageInfo, d0.f21230a[0])) != null;
        }
    }

    public static z f(PackageInfo packageInfo, z... zVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            a0 a0Var = new a0(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < zVarArr.length; i10++) {
                if (zVarArr[i10].equals(a0Var)) {
                    return zVarArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (j.e(this.f21268a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        o0 o0VarC;
        String[] packagesForUid = this.f21268a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            o0VarC = o0.c("no pkgs");
        } else {
            o0VarC = null;
            for (String str : packagesForUid) {
                o0VarC = e(str, false, false);
                if (!o0VarC.f21281a) {
                }
            }
            o9.s.l(o0VarC);
        }
        o0VarC.e();
        return o0VarC.f21281a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @SuppressLint({"PackageManagerGetSignatures"})
    public final o0 e(String str, boolean z10, boolean z11) {
        o0 o0VarC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return o0.c("null pkg");
        }
        if (str.equals(this.b)) {
            return o0.b();
        }
        c0 c0Var = e0.f21236a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                e0.b();
                boolean zC = e0.f21241g.c();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zC) {
                    l0 l0Var = new l0(null);
                    l0Var.a(str);
                    l0Var.b(j.e(this.f21268a));
                    l0Var.c(true);
                    o0VarC = e0.c(l0Var.d());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.f21268a.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zE = j.e(this.f21268a);
                        if (packageInfo == null) {
                            o0VarC = o0.c("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                o0VarC = o0.c("single cert required");
                            } else {
                                a0 a0Var = new a0(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                o0 o0VarD = e0.d(str2, a0Var, zE, false);
                                o0VarC = (!o0VarD.f21281a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !e0.d(str2, a0Var, false, true).f21281a) ? o0VarD : o0.c("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return o0.d("no pkg ".concat(str), e10);
                    }
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        } catch (RemoteException | DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (o0VarC.f21281a) {
            this.b = str;
        }
        return o0VarC;
    }
}
