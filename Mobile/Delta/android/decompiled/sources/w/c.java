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
    public final c.b f33739a;
    public final ComponentName b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f33740c;

    public class a extends c.a.AbstractBinderC0091a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f33741a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ w.b b;

        /* JADX INFO: renamed from: w.c$a$a, reason: collision with other inner class name */
        public class RunnableC0620a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33743a;

            public RunnableC0620a(Bundle bundle) {
                this.f33743a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onUnminimized(this.f33743a);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33744a;
            public final /* synthetic */ Bundle b;

            public b(int i10, Bundle bundle) {
                this.f33744a = i10;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onNavigationEvent(this.f33744a, this.b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$c, reason: collision with other inner class name */
        public class RunnableC0621c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33746a;
            public final /* synthetic */ Bundle b;

            public RunnableC0621c(String str, Bundle bundle) {
                this.f33746a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.extraCallback(this.f33746a, this.b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33748a;

            public d(Bundle bundle) {
                this.f33748a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMessageChannelReady(this.f33748a);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33749a;
            public final /* synthetic */ Bundle b;

            public e(String str, Bundle bundle) {
                this.f33749a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onPostMessage(this.f33749a, this.b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33751a;
            public final /* synthetic */ Uri b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f33752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f33753d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f33751a = i10;
                this.b = uri;
                this.f33752c = z10;
                this.f33753d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onRelationshipValidationResult(this.f33751a, this.b, this.f33752c, this.f33753d);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33755a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f33756c;

            public g(int i10, int i11, Bundle bundle) {
                this.f33755a = i10;
                this.b = i11;
                this.f33756c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityResized(this.f33755a, this.b, this.f33756c);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33758a;

            public h(Bundle bundle) {
                this.f33758a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onWarmupCompleted(this.f33758a);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33759a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f33760c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f33761d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f33762e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f33763f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f33759a = i10;
                this.b = i11;
                this.f33760c = i12;
                this.f33761d = i13;
                this.f33762e = i14;
                this.f33763f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityLayout(this.f33759a, this.b, this.f33760c, this.f33761d, this.f33762e, this.f33763f);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33765a;

            public j(Bundle bundle) {
                this.f33765a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMinimized(this.f33765a);
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
            this.f33741a.post(new b(i10, bundle));
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
        public void c2(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new e(str, bundle));
        }

        @Override // c.a
        public void g2(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new d(bundle));
        }

        @Override // c.a
        public void j2(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public void l1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new j(bundle));
        }

        @Override // c.a
        public void m0(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new RunnableC0621c(str, bundle));
        }

        @Override // c.a
        public void p0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new h(bundle));
        }

        @Override // c.a
        public void q1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new RunnableC0620a(bundle));
        }

        @Override // c.a
        public void w1(int i10, int i11, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void z(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33741a.post(new i(i10, i11, i12, i13, i14, bundle));
        }
    }

    public c(c.b bVar, ComponentName componentName, Context context) {
        this.f33739a = bVar;
        this.b = componentName;
        this.f33740c = context;
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
        boolean zJ;
        c.a.AbstractBinderC0091a abstractBinderC0091aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zJ = this.f33739a.m(abstractBinderC0091aB, bundle);
            } else {
                zJ = this.f33739a.J(abstractBinderC0091aB);
            }
            if (zJ) {
                return new f(this.f33739a, abstractBinderC0091aB, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean i(long j10) {
        try {
            return this.f33739a.h1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
