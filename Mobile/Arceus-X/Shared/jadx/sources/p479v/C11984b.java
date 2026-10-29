package p479v;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;

/* JADX INFO: renamed from: v.b */
/* JADX INFO: loaded from: classes.dex */
public class C11984b {

    /* JADX INFO: renamed from: a */
    public final Intent f42456a;

    /* JADX INFO: renamed from: v.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Intent f42457a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        public final C11983a.b f42458b = new C11983a.b();

        /* JADX INFO: renamed from: c */
        public SparseArray<Bundle> f42459c;

        /* JADX INFO: renamed from: d */
        public Bundle f42460d;

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public C11984b m44736a() {
            this.f42457a.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
            C11985c c11985c = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!this.f42457a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m44737b(null, null);
            }
            this.f42457a.putExtras(this.f42458b.m44735a().m44734a());
            Bundle bundle = this.f42460d;
            if (bundle != null) {
                this.f42457a.putExtras(bundle);
            }
            if (this.f42459c != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f42459c);
                this.f42457a.putExtras(bundle2);
            }
            return new C11984b(this.f42457a, c11985c, objArr2 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: b */
        public final void m44737b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f42457a.putExtras(bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11984b(Intent intent, C11985c c11985c, C11985c.a aVar) {
        this.f42456a = intent;
    }
}
