package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35467a = new Object();
    public final c.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f35468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f35469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f35470e;

    public f(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = bVar;
        this.f35468c = aVar;
        this.f35469d = componentName;
        this.f35470e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f35470e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f35470e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder d() {
        return this.f35468c.asBinder();
    }

    public ComponentName e() {
        return this.f35469d;
    }

    public PendingIntent f() {
        return this.f35470e;
    }

    public int g(String str, Bundle bundle) {
        int iB0;
        Bundle bundleB = b(bundle);
        synchronized (this.f35467a) {
            try {
                try {
                    iB0 = this.b.B0(this.f35468c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iB0;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.b.r1(this.f35468c, uri);
            }
            bundle.putAll(bundleC);
            return this.b.m2(this.f35468c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
