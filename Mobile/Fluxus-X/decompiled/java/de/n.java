package de;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.f f12218a;
    public final i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f12220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageInfo f12221e;

    public n(Context context, be.f fVar, i iVar) {
        m mVar = new m(new be.b(fVar));
        this.f12218a = fVar;
        this.b = iVar;
        this.f12219c = context;
        this.f12220d = mVar;
    }

    public static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    public final boolean a(File[] fileArr) {
        PackageInfo packageInfoD = d();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoD.getLongVersionCode() : packageInfoD.versionCode;
        AssetManager assetManager = (AssetManager) g0.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f12220d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f12220d.a());
        return false;
    }

    public final boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f12218a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(File[] fileArr) {
        PackageInfo packageInfoD = d();
        ArrayList arrayList = null;
        if (packageInfoD != null && packageInfoD.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoD.signatures) {
                X509Certificate x509CertificateE = e(signature);
                if (x509CertificateE != null) {
                    arrayList.add(x509CertificateE);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] x509CertificateArrA = e1.a(absolutePath);
                    if (x509CertificateArrA != null && x509CertificateArrA.length != 0 && x509CertificateArrA[0].length != 0) {
                        if (arrayList.isEmpty()) {
                            Log.e("SplitCompat", "No certificates found for app.");
                            break;
                        }
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            X509Certificate x509Certificate = (X509Certificate) obj;
                            int length2 = x509CertificateArrA.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                    break loop1;
                                }
                                if (!x509CertificateArrA[i11][0].equals(x509Certificate)) {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
                        break;
                    }
                } catch (Exception e10) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e10);
                }
            } catch (Exception e11) {
                Log.e("SplitCompat", "Split verification error.", e11);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    public final PackageInfo d() {
        if (this.f12221e == null) {
            try {
                this.f12221e = this.f12219c.getPackageManager().getPackageInfo(this.f12219c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f12221e;
    }
}
