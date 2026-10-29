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
    public final Intent f33560a;
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
    public static class C0612d {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f33560a = intent;
        this.b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f33560a.setData(uri);
        l2.b.p(context, this.f33560a, this.b);
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f33562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActivityOptions f33563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<Bundle> f33564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Bundle> f33565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f33566g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f33569j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<Bundle> f33570k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f33561a = new Intent("android.intent.action.VIEW");
        public final w.a.C0609a b = new w.a.C0609a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f33567h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f33568i = true;

        public e() {
        }

        public d a() {
            if (!this.f33561a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f33562c;
            if (arrayList != null) {
                this.f33561a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f33564e;
            if (arrayList2 != null) {
                this.f33561a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f33561a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f33568i);
            this.f33561a.putExtras(this.b.a().a());
            Bundle bundle = this.f33566g;
            if (bundle != null) {
                this.f33561a.putExtras(bundle);
            }
            if (this.f33565f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f33565f);
                this.f33561a.putExtras(bundle2);
            }
            this.f33561a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f33567h);
            ArrayList<Bundle> arrayList3 = this.f33570k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f33561a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f33570k);
            }
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                i();
            }
            if (i10 >= 36) {
                b();
            }
            ActivityOptions activityOptions = this.f33563d;
            return new d(this.f33561a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            if (this.f33563d == null) {
                this.f33563d = a.a();
            }
            C0612d.a(this.f33563d, d.a(this.f33561a));
        }

        public e c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f33561a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public final void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f33561a.hasExtra("com.android.browser.headers") ? this.f33561a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f33561a.putExtra("com.android.browser.headers", bundleExtra);
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
            this.f33561a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f33561a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public e g(f fVar) {
            this.f33561a.setPackage(fVar.e().getPackageName());
            h(fVar.d(), fVar.f());
            return this;
        }

        public final void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f33561a.putExtras(bundle);
        }

        public final void i() {
            if (this.f33563d == null) {
                this.f33563d = a.a();
            }
            c.a(this.f33563d, this.f33569j);
        }

        public e(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
