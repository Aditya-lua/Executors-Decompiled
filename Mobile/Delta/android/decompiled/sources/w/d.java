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
    public final Intent f33766a;
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
    public static class C0622d {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f33766a = intent;
        this.b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f33766a.setData(uri);
        l2.b.p(context, this.f33766a, this.b);
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f33768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActivityOptions f33769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<Bundle> f33770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Bundle> f33771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f33772g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f33775j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<Bundle> f33776k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f33767a = new Intent("android.intent.action.VIEW");
        public final w.a.C0619a b = new w.a.C0619a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f33773h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f33774i = true;

        public e() {
        }

        public d a() {
            if (!this.f33767a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f33768c;
            if (arrayList != null) {
                this.f33767a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f33770e;
            if (arrayList2 != null) {
                this.f33767a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f33767a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f33774i);
            this.f33767a.putExtras(this.b.a().a());
            Bundle bundle = this.f33772g;
            if (bundle != null) {
                this.f33767a.putExtras(bundle);
            }
            if (this.f33771f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f33771f);
                this.f33767a.putExtras(bundle2);
            }
            this.f33767a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f33773h);
            ArrayList<Bundle> arrayList3 = this.f33776k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f33767a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f33776k);
            }
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                i();
            }
            if (i10 >= 36) {
                b();
            }
            ActivityOptions activityOptions = this.f33769d;
            return new d(this.f33767a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            if (this.f33769d == null) {
                this.f33769d = a.a();
            }
            C0622d.a(this.f33769d, d.a(this.f33767a));
        }

        public e c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f33767a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public final void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f33767a.hasExtra("com.android.browser.headers") ? this.f33767a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f33767a.putExtra("com.android.browser.headers", bundleExtra);
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
            this.f33767a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f33767a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public e g(f fVar) {
            this.f33767a.setPackage(fVar.e().getPackageName());
            h(fVar.d(), fVar.f());
            return this;
        }

        public final void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f33767a.putExtras(bundle);
        }

        public final void i() {
            if (this.f33769d == null) {
                this.f33769d = a.a();
            }
            c.a(this.f33769d, this.f33775j);
        }

        public e(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
