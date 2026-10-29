package be;

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
import p601zd.C13773b;
import p601zd.C13777f;

/* JADX INFO: renamed from: be.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C1344n {

    /* JADX INFO: renamed from: a */
    public final C13777f f5386a;

    /* JADX INFO: renamed from: b */
    public final C1329i f5387b;

    /* JADX INFO: renamed from: c */
    public final Context f5388c;

    /* JADX INFO: renamed from: d */
    public final C1341m f5389d;

    /* JADX INFO: renamed from: e */
    public PackageInfo f5390e;

    public C1344n(Context context, C13777f c13777f, C1329i c1329i) {
        C1341m c1341m = new C1341m(new C13773b(c13777f));
        this.f5386a = c13777f;
        this.f5387b = c1329i;
        this.f5388c = context;
        this.f5389d = c1341m;
    }

    /* JADX INFO: renamed from: e */
    public static X509Certificate m7187e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7188a(File[] fileArr) {
        PackageInfo packageInfoM7191d = m7191d();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoM7191d.getLongVersionCode() : packageInfoM7191d.versionCode;
        AssetManager assetManager = (AssetManager) C1324g0.m7159c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f5389d.m7186b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f5389d.m7185a());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7189b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f5386a.m50218g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7190c(File[] fileArr) {
        PackageInfo packageInfoM7191d = m7191d();
        ArrayList arrayList = null;
        if (packageInfoM7191d != null && packageInfoM7191d.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoM7191d.signatures) {
                X509Certificate x509CertificateM7187e = m7187e(signature);
                if (x509CertificateM7187e != null) {
                    arrayList.add(x509CertificateM7187e);
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
                    X509Certificate[][] x509CertificateArrM7112a = C1319e1.m7112a(absolutePath);
                    if (x509CertificateArrM7112a != null && x509CertificateArrM7112a.length != 0 && x509CertificateArrM7112a[0].length != 0) {
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
                            int length2 = x509CertificateArrM7112a.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                    break loop1;
                                }
                                if (!x509CertificateArrM7112a[i11][0].equals(x509Certificate)) {
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

    /* JADX INFO: renamed from: d */
    public final PackageInfo m7191d() {
        if (this.f5390e == null) {
            try {
                this.f5390e = this.f5388c.getPackageManager().getPackageInfo(this.f5388c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f5390e;
    }
}
