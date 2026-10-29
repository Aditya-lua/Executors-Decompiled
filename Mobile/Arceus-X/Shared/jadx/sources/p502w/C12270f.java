package p502w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p035c.InterfaceC1494a;
import p035c.InterfaceC1495b;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12270f {

    /* JADX INFO: renamed from: a */
    public final Object f43466a = new Object();

    /* JADX INFO: renamed from: b */
    public final InterfaceC1495b f43467b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1494a f43468c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f43469d;

    /* JADX INFO: renamed from: e */
    public final PendingIntent f43470e;

    public C12270f(InterfaceC1495b interfaceC1495b, InterfaceC1494a interfaceC1494a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f43467b = interfaceC1495b;
        this.f43468c = interfaceC1494a;
        this.f43469d = componentName;
        this.f43470e = pendingIntent;
    }

    /* JADX INFO: renamed from: a */
    public final void m45541a(Bundle bundle) {
        PendingIntent pendingIntent = this.f43470e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m45542b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m45541a(bundle2);
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m45543c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f43470e != null) {
            m45541a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public IBinder m45544d() {
        return this.f43468c.asBinder();
    }

    /* JADX INFO: renamed from: e */
    public ComponentName m45545e() {
        return this.f43469d;
    }

    /* JADX INFO: renamed from: f */
    public PendingIntent m45546f() {
        return this.f43470e;
    }

    /* JADX INFO: renamed from: g */
    public int m45547g(String str, Bundle bundle) {
        int iMo7642w0;
        Bundle bundleM45542b = m45542b(bundle);
        synchronized (this.f43466a) {
            try {
                try {
                    iMo7642w0 = this.f43467b.mo7642w0(this.f43468c, str, bundleM45542b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iMo7642w0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m45548h(Uri uri) {
        return m45549i(uri, null, new Bundle());
    }

    /* JADX INFO: renamed from: i */
    public boolean m45549i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleM45543c = m45543c(uri2);
            if (bundleM45543c == null) {
                return this.f43467b.mo7639j1(this.f43468c, uri);
            }
            bundle.putAll(bundleM45543c);
            return this.f43467b.mo7640l2(this.f43468c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
