package v;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f32674a;

    /* JADX INFO: renamed from: v.b$b, reason: collision with other inner class name */
    public static final class C0592b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f32675a = new Intent("android.intent.action.VIEW");
        public final v.a.b b = new v.a.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<Bundle> f32676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f32677d;

        /* JADX WARN: Multi-variable type inference failed */
        public b a() {
            this.f32675a.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
            c cVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!this.f32675a.hasExtra("android.support.customtabs.extra.SESSION")) {
                b(null, null);
            }
            this.f32675a.putExtras(this.b.a().a());
            Bundle bundle = this.f32677d;
            if (bundle != null) {
                this.f32675a.putExtras(bundle);
            }
            if (this.f32676c != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f32676c);
                this.f32675a.putExtras(bundle2);
            }
            return new b(this.f32675a, cVar, objArr2 == true ? 1 : 0);
        }

        public final void b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f32675a.putExtras(bundle);
        }
    }

    public b(Intent intent, c cVar, c.a aVar) {
        this.f32674a = intent;
    }
}
