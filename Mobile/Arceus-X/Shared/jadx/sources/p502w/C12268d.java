package p502w;

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
import p261l2.C7975b;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12268d {

    /* JADX INFO: renamed from: a */
    public final Intent f43452a;

    /* JADX INFO: renamed from: b */
    public final Bundle f43453b;

    /* JADX INFO: renamed from: w.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static ActivityOptions m45528a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: renamed from: w.d$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static String m45529a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: w.d$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m45530a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: w.d$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static void m45531a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public C12268d(Intent intent, Bundle bundle) {
        this.f43452a = intent;
        this.f43453b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m45526a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    /* JADX INFO: renamed from: b */
    public void m45527b(Context context, Uri uri) {
        this.f43452a.setData(uri);
        C7975b.m33018p(context, this.f43452a, this.f43453b);
    }

    /* JADX INFO: renamed from: w.d$e */
    public static final class e {

        /* JADX INFO: renamed from: c */
        public ArrayList<Bundle> f43456c;

        /* JADX INFO: renamed from: d */
        public ActivityOptions f43457d;

        /* JADX INFO: renamed from: e */
        public ArrayList<Bundle> f43458e;

        /* JADX INFO: renamed from: f */
        public SparseArray<Bundle> f43459f;

        /* JADX INFO: renamed from: g */
        public Bundle f43460g;

        /* JADX INFO: renamed from: j */
        public boolean f43463j;

        /* JADX INFO: renamed from: k */
        public ArrayList<Bundle> f43464k;

        /* JADX INFO: renamed from: a */
        public final Intent f43454a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        public final C12265a.a f43455b = new C12265a.a();

        /* JADX INFO: renamed from: h */
        public int f43461h = 0;

        /* JADX INFO: renamed from: i */
        public boolean f43462i = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
        }

        /* JADX INFO: renamed from: a */
        public C12268d m45532a() {
            if (!this.f43454a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m45539h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f43456c;
            if (arrayList != null) {
                this.f43454a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f43458e;
            if (arrayList2 != null) {
                this.f43454a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f43454a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f43462i);
            this.f43454a.putExtras(this.f43455b.m45516a().m45515a());
            Bundle bundle = this.f43460g;
            if (bundle != null) {
                this.f43454a.putExtras(bundle);
            }
            if (this.f43459f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f43459f);
                this.f43454a.putExtras(bundle2);
            }
            this.f43454a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f43461h);
            ArrayList<Bundle> arrayList3 = this.f43464k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f43454a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f43464k);
            }
            int i10 = Build.VERSION.SDK_INT;
            m45535d();
            if (i10 >= 34) {
                m45540i();
            }
            if (i10 >= 36) {
                m45533b();
            }
            ActivityOptions activityOptions = this.f43457d;
            return new C12268d(this.f43454a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        /* JADX INFO: renamed from: b */
        public final void m45533b() {
            if (this.f43457d == null) {
                this.f43457d = a.m45528a();
            }
            d.m45531a(this.f43457d, C12268d.m45526a(this.f43454a));
        }

        /* JADX INFO: renamed from: c */
        public e m45534c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f43454a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final void m45535d() {
            String strM45529a = b.m45529a();
            if (TextUtils.isEmpty(strM45529a)) {
                return;
            }
            Bundle bundleExtra = this.f43454a.hasExtra("com.android.browser.headers") ? this.f43454a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strM45529a);
            this.f43454a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* JADX INFO: renamed from: e */
        public e m45536e(int i10) {
            return m45537f(i10, 0);
        }

        /* JADX INFO: renamed from: f */
        public e m45537f(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f43454a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f43454a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public e m45538g(C12270f c12270f) {
            this.f43454a.setPackage(c12270f.m45545e().getPackageName());
            m45539h(c12270f.m45544d(), c12270f.m45546f());
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m45539h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f43454a.putExtras(bundle);
        }

        /* JADX INFO: renamed from: i */
        public final void m45540i() {
            if (this.f43457d == null) {
                this.f43457d = a.m45528a();
            }
            c.m45530a(this.f43457d, this.f43463j);
        }

        public e(C12270f c12270f) {
            if (c12270f != null) {
                m45538g(c12270f);
            }
        }
    }
}
