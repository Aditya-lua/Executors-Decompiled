package j9;

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

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f21195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21196a;
    public volatile String b;

    public i(@NonNull Context context) {
        this.f21196a = context.getApplicationContext();
    }

    @NonNull
    public static i a(@NonNull Context context) {
        n9.m.l(context);
        synchronized (i.class) {
            try {
                if (f21195c == null) {
                    c0.a(context);
                    f21195c = new i(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21195c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        db.i iVarG;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && (BuildConfig.STORE_PACKAGE.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            db.i iVar = z10 ? b0.f21171c : b0.b;
            Object obj = u9.a.f32092a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                iVarG = byteArray != null ? db.i.h(byteArray) : db.i.g();
            } else {
                db.s.a(i10 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    iVarG = db.i.g();
                } else {
                    db.m mVar = db.i.b;
                    db.e eVar = new db.e();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        eVar.b(signature.toByteArray());
                    }
                    iVarG = eVar.c();
                }
            }
            if (iVarG.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            db.i iVarE = iVarG.e();
            int size = iVarE.size();
            int i11 = 0;
            while (i11 < size) {
                byte[] bArr = (byte[]) iVarE.get(i11);
                db.m mVarListIterator = iVar.listIterator(0);
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
            return (z10 ? f(packageInfo, b0.f21170a) : f(packageInfo, b0.f21170a[0])) != null;
        }
    }

    public static x f(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            y yVar = new y(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                if (xVarArr[i10].equals(yVar)) {
                    return xVarArr[i10];
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
            if (h.e(this.f21196a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        j0 j0VarC;
        String[] packagesForUid = this.f21196a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            j0VarC = j0.c("no pkgs");
        } else {
            j0VarC = null;
            for (String str : packagesForUid) {
                j0VarC = e(str, false, false);
                if (!j0VarC.f21200a) {
                }
            }
            n9.m.l(j0VarC);
        }
        j0VarC.e();
        return j0VarC.f21200a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @SuppressLint({"PackageManagerGetSignatures"})
    public final j0 e(String str, boolean z10, boolean z11) {
        j0 j0VarC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return j0.c("null pkg");
        }
        if (str.equals(this.b)) {
            return j0.b();
        }
        a0 a0Var = c0.f21176a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                c0.b();
                boolean zC = c0.f21181g.c();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zC) {
                    g0 g0Var = new g0(null);
                    g0Var.a(str);
                    g0Var.b(h.e(this.f21196a));
                    g0Var.c(true);
                    j0VarC = c0.c(g0Var.d());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.f21196a.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zE = h.e(this.f21196a);
                        if (packageInfo == null) {
                            j0VarC = j0.c("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                j0VarC = j0.c("single cert required");
                            } else {
                                y yVar = new y(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                j0 j0VarD = c0.d(str2, yVar, zE, false);
                                j0VarC = (!j0VarD.f21200a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !c0.d(str2, yVar, false, true).f21200a) ? j0VarD : j0.c("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return j0.d("no pkg ".concat(str), e10);
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
        if (j0VarC.f21200a) {
            this.b = str;
        }
        return j0VarC;
    }
}
