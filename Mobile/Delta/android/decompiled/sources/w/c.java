package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f33533a;
    public final ComponentName b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f33534c;

    public class a extends c.a.AbstractBinderC0091a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f33535a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ w.b b;

        /* JADX INFO: renamed from: w.c$a$a, reason: collision with other inner class name */
        public class RunnableC0610a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33537a;

            public RunnableC0610a(Bundle bundle) {
                this.f33537a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onUnminimized(this.f33537a);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33538a;
            public final /* synthetic */ Bundle b;

            public b(int i10, Bundle bundle) {
                this.f33538a = i10;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onNavigationEvent(this.f33538a, this.b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$c, reason: collision with other inner class name */
        public class RunnableC0611c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33540a;
            public final /* synthetic */ Bundle b;

            public RunnableC0611c(String str, Bundle bundle) {
                this.f33540a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.extraCallback(this.f33540a, this.b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33542a;

            public d(Bundle bundle) {
                this.f33542a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMessageChannelReady(this.f33542a);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33543a;
            public final /* synthetic */ Bundle b;

            public e(String str, Bundle bundle) {
                this.f33543a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onPostMessage(this.f33543a, this.b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33545a;
            public final /* synthetic */ Uri b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f33546c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f33547d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f33545a = i10;
                this.b = uri;
                this.f33546c = z10;
                this.f33547d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onRelationshipValidationResult(this.f33545a, this.b, this.f33546c, this.f33547d);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33549a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f33550c;

            public g(int i10, int i11, Bundle bundle) {
                this.f33549a = i10;
                this.b = i11;
                this.f33550c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityResized(this.f33549a, this.b, this.f33550c);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33552a;

            public h(Bundle bundle) {
                this.f33552a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onWarmupCompleted(this.f33552a);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33553a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f33554c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f33555d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f33556e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f33557f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f33553a = i10;
                this.b = i11;
                this.f33554c = i12;
                this.f33555d = i13;
                this.f33556e = i14;
                this.f33557f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityLayout(this.f33553a, this.b, this.f33554c, this.f33555d, this.f33556e, this.f33557f);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33559a;

            public j(Bundle bundle) {
                this.f33559a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMinimized(this.f33559a);
            }
        }

        public a(w.b bVar) {
            this.b = bVar;
        }

        @Override // c.a
        public void L1(int i10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new b(i10, bundle));
        }

        @Override // c.a
        public Bundle O(String str, Bundle bundle) {
            w.b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void c2(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new e(str, bundle));
        }

        @Override // c.a
        public void g2(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new d(bundle));
        }

        @Override // c.a
        public void j2(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public void p0(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new RunnableC0611c(str, bundle));
        }

        @Override // c.a
        public void p1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new j(bundle));
        }

        @Override // c.a
        public void r0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new h(bundle));
        }

        @Override // c.a
        public void t1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new RunnableC0610a(bundle));
        }

        @Override // c.a
        public void y1(int i10, int i11, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void z(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33535a.post(new i(i10, i11, i12, i13, i14, bundle));
        }
    }

    public c(c.b bVar, ComponentName componentName, Context context) {
        this.f33533a = bVar;
        this.b = componentName;
        this.f33534c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, eVar, 33);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static boolean e(Context context, String str) {
        return h(context, str, "androidx.browser.auth.category.AuthTab");
    }

    public static boolean h(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public final c.a.AbstractBinderC0091a b(b bVar) {
        return new a(bVar);
    }

    public f f(b bVar) {
        return g(bVar, null);
    }

    public final f g(b bVar, PendingIntent pendingIntent) {
        boolean zL;
        c.a.AbstractBinderC0091a abstractBinderC0091aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zL = this.f33533a.m(abstractBinderC0091aB, bundle);
            } else {
                zL = this.f33533a.L(abstractBinderC0091aB);
            }
            if (zL) {
                return new f(this.f33533a, abstractBinderC0091aB, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean i(long j10) {
        try {
            return this.f33533a.l1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
