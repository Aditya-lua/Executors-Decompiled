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
    public final c.b f35428a;
    public final ComponentName b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f35429c;

    public class a extends c.a.AbstractBinderC0088a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f35430a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ w.b b;

        /* JADX INFO: renamed from: w.c$a$a, reason: collision with other inner class name */
        public class RunnableC0727a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f35432a;

            public RunnableC0727a(Bundle bundle) {
                this.f35432a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onUnminimized(this.f35432a);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35433a;
            public final /* synthetic */ Bundle b;

            public b(int i10, Bundle bundle) {
                this.f35433a = i10;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onNavigationEvent(this.f35433a, this.b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$c, reason: collision with other inner class name */
        public class RunnableC0728c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35435a;
            public final /* synthetic */ Bundle b;

            public RunnableC0728c(String str, Bundle bundle) {
                this.f35435a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.extraCallback(this.f35435a, this.b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f35437a;

            public d(Bundle bundle) {
                this.f35437a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMessageChannelReady(this.f35437a);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35438a;
            public final /* synthetic */ Bundle b;

            public e(String str, Bundle bundle) {
                this.f35438a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onPostMessage(this.f35438a, this.b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35440a;
            public final /* synthetic */ Uri b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f35441c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f35442d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f35440a = i10;
                this.b = uri;
                this.f35441c = z10;
                this.f35442d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onRelationshipValidationResult(this.f35440a, this.b, this.f35441c, this.f35442d);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35444a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f35445c;

            public g(int i10, int i11, Bundle bundle) {
                this.f35444a = i10;
                this.b = i11;
                this.f35445c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityResized(this.f35444a, this.b, this.f35445c);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f35447a;

            public h(Bundle bundle) {
                this.f35447a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onWarmupCompleted(this.f35447a);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35448a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f35449c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f35450d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f35451e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f35452f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f35448a = i10;
                this.b = i11;
                this.f35449c = i12;
                this.f35450d = i13;
                this.f35451e = i14;
                this.f35452f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityLayout(this.f35448a, this.b, this.f35449c, this.f35450d, this.f35451e, this.f35452f);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f35454a;

            public j(Bundle bundle) {
                this.f35454a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMinimized(this.f35454a);
            }
        }

        public a(w.b bVar) {
            this.b = bVar;
        }

        @Override // c.a
        public void A(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // c.a
        public void B1(int i10, int i11, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public Bundle M(String str, Bundle bundle) {
            w.b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void S1(int i10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new b(i10, bundle));
        }

        @Override // c.a
        public void d2(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new e(str, bundle));
        }

        @Override // c.a
        public void f2(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new d(bundle));
        }

        @Override // c.a
        public void h2(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public void n0(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new RunnableC0728c(str, bundle));
        }

        @Override // c.a
        public void q0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new h(bundle));
        }

        @Override // c.a
        public void t1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new j(bundle));
        }

        @Override // c.a
        public void w1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f35430a.post(new RunnableC0727a(bundle));
        }
    }

    public c(c.b bVar, ComponentName componentName, Context context) {
        this.f35428a = bVar;
        this.b = componentName;
        this.f35429c = context;
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

    public final c.a.AbstractBinderC0088a b(b bVar) {
        return new a(bVar);
    }

    public f f(b bVar) {
        return g(bVar, null);
    }

    public final f g(b bVar, PendingIntent pendingIntent) {
        boolean zK;
        c.a.AbstractBinderC0088a abstractBinderC0088aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zK = this.f35428a.m(abstractBinderC0088aB, bundle);
            } else {
                zK = this.f35428a.K(abstractBinderC0088aB);
            }
            if (zK) {
                return new f(this.f35428a, abstractBinderC0088aB, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean i(long j10) {
        try {
            return this.f35428a.p1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
