package w;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f35455a;
    public final Bundle b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: w.d$d, reason: collision with other inner class name */
    public static class C0729d {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f35455a = intent;
        this.b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f35455a.setData(uri);
        l2.b.p(context, this.f35455a, this.b);
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f35457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActivityOptions f35458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<Bundle> f35459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Bundle> f35460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f35461g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f35464j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<Bundle> f35465k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f35456a = new Intent("android.intent.action.VIEW");
        public final w.a.C0726a b = new w.a.C0726a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f35462h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f35463i = true;

        public e() {
        }

        public d a() {
            if (!this.f35456a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f35457c;
            if (arrayList != null) {
                this.f35456a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f35459e;
            if (arrayList2 != null) {
                this.f35456a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f35456a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f35463i);
            this.f35456a.putExtras(this.b.a().a());
            Bundle bundle = this.f35461g;
            if (bundle != null) {
                this.f35456a.putExtras(bundle);
            }
            if (this.f35460f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f35460f);
                this.f35456a.putExtras(bundle2);
            }
            this.f35456a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f35462h);
            ArrayList<Bundle> arrayList3 = this.f35465k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f35456a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f35465k);
            }
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                i();
            }
            if (i10 >= 36) {
                b();
            }
            ActivityOptions activityOptions = this.f35458d;
            return new d(this.f35456a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            if (this.f35458d == null) {
                this.f35458d = a.a();
            }
            C0729d.a(this.f35458d, d.a(this.f35456a));
        }

        public e c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f35456a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public final void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f35456a.hasExtra("com.android.browser.headers") ? this.f35456a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f35456a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public e e(int i10) {
            return f(i10, 0);
        }

        public e f(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f35456a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f35456a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public e g(f fVar) {
            this.f35456a.setPackage(fVar.e().getPackageName());
            h(fVar.d(), fVar.f());
            return this;
        }

        public final void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f35456a.putExtras(bundle);
        }

        public final void i() {
            if (this.f35458d == null) {
                this.f35458d = a.a();
            }
            c.a(this.f35458d, this.f35464j);
        }

        public e(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
