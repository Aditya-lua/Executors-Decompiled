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
    public final Object f33572a = new Object();
    public final c.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f33573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f33574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f33575e;

    public f(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = bVar;
        this.f33573c = aVar;
        this.f33574d = componentName;
        this.f33575e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f33575e;
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
        if (this.f33575e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder d() {
        return this.f33573c.asBinder();
    }

    public ComponentName e() {
        return this.f33574d;
    }

    public PendingIntent f() {
        return this.f33575e;
    }

    public int g(String str, Bundle bundle) {
        int iA0;
        Bundle bundleB = b(bundle);
        synchronized (this.f33572a) {
            try {
                try {
                    iA0 = this.b.A0(this.f33573c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iA0;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.b.n1(this.f33573c, uri);
            }
            bundle.putAll(bundleC);
            return this.b.l2(this.f33573c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
