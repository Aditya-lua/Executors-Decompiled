package p502w;

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
import p035c.InterfaceC1494a;
import p035c.InterfaceC1495b;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: loaded from: classes.dex */
public class C12267c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1495b f43413a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f43414b;

    /* JADX INFO: renamed from: c */
    public final Context f43415c;

    /* JADX INFO: renamed from: w.c$a */
    public class a extends InterfaceC1494a.a {

        /* JADX INFO: renamed from: a */
        public Handler f43416a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12266b f43417b;

        /* JADX INFO: renamed from: w.c$a$a, reason: collision with other inner class name */
        public class RunnableC14274a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f43419a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC14274a(Bundle bundle) {
                this.f43419a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onUnminimized(this.f43419a);
            }
        }

        /* JADX INFO: renamed from: w.c$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f43421a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f43422b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public b(int i10, Bundle bundle) {
                this.f43421a = i10;
                this.f43422b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onNavigationEvent(this.f43421a, this.f43422b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f43424a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f43425b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public c(String str, Bundle bundle) {
                this.f43424a = str;
                this.f43425b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.extraCallback(this.f43424a, this.f43425b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f43427a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public d(Bundle bundle) {
                this.f43427a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onMessageChannelReady(this.f43427a);
            }
        }

        /* JADX INFO: renamed from: w.c$a$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f43429a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f43430b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public e(String str, Bundle bundle) {
                this.f43429a = str;
                this.f43430b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onPostMessage(this.f43429a, this.f43430b);
            }
        }

        /* JADX INFO: renamed from: w.c$a$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f43432a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Uri f43433b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f43434c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f43435d;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f43432a = i10;
                this.f43433b = uri;
                this.f43434c = z10;
                this.f43435d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onRelationshipValidationResult(this.f43432a, this.f43433b, this.f43434c, this.f43435d);
            }
        }

        /* JADX INFO: renamed from: w.c$a$g */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f43437a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f43438b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f43439c;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public g(int i10, int i11, Bundle bundle) {
                this.f43437a = i10;
                this.f43438b = i11;
                this.f43439c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onActivityResized(this.f43437a, this.f43438b, this.f43439c);
            }
        }

        /* JADX INFO: renamed from: w.c$a$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f43441a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public h(Bundle bundle) {
                this.f43441a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onWarmupCompleted(this.f43441a);
            }
        }

        /* JADX INFO: renamed from: w.c$a$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f43443a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f43444b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f43445c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f43446d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f43447e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Bundle f43448f;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f43443a = i10;
                this.f43444b = i11;
                this.f43445c = i12;
                this.f43446d = i13;
                this.f43447e = i14;
                this.f43448f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onActivityLayout(this.f43443a, this.f43444b, this.f43445c, this.f43446d, this.f43447e, this.f43448f);
            }
        }

        /* JADX INFO: renamed from: w.c$a$j */
        public class j implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f43450a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public j(Bundle bundle) {
                this.f43450a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f43417b.onMinimized(this.f43450a);
            }
        }

        public a(C12266b c12266b) {
            this.f43417b = c12266b;
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: L1 */
        public void mo7622L1(int i10, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new b(i10, bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: M */
        public Bundle mo7623M(String str, Bundle bundle) {
            C12266b c12266b = this.f43417b;
            if (c12266b == null) {
                return null;
            }
            return c12266b.extraCallbackWithResult(str, bundle);
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: c2 */
        public void mo7624c2(String str, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new e(str, bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: g2 */
        public void mo7625g2(Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new d(bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: j2 */
        public void mo7626j2(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new f(i10, uri, z10, bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: l1 */
        public void mo7627l1(Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new j(bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: m0 */
        public void mo7628m0(String str, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new c(str, bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: p0 */
        public void mo7629p0(Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new h(bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: q1 */
        public void mo7630q1(Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new RunnableC14274a(bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: w1 */
        public void mo7631w1(int i10, int i11, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new g(i10, i11, bundle));
        }

        @Override // p035c.InterfaceC1494a
        /* JADX INFO: renamed from: z */
        public void mo7632z(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f43417b == null) {
                return;
            }
            this.f43416a.post(new i(i10, i11, i12, i13, i14, bundle));
        }
    }

    public C12267c(InterfaceC1495b interfaceC1495b, ComponentName componentName, Context context) {
        this.f43413a = interfaceC1495b;
        this.f43414b = componentName;
        this.f43415c = context;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m45517a(Context context, String str, AbstractServiceConnectionC12269e abstractServiceConnectionC12269e) {
        abstractServiceConnectionC12269e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, abstractServiceConnectionC12269e, 33);
    }

    /* JADX INFO: renamed from: c */
    public static String m45518c(Context context, List<String> list) {
        return m45519d(context, list, false);
    }

    /* JADX INFO: renamed from: d */
    public static String m45519d(Context context, List<String> list, boolean z10) {
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

    /* JADX INFO: renamed from: e */
    public static boolean m45520e(Context context, String str) {
        return m45521h(context, str, "androidx.browser.auth.category.AuthTab");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m45521h(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1494a.a m45522b(C12266b c12266b) {
        return new a(c12266b);
    }

    /* JADX INFO: renamed from: f */
    public C12270f m45523f(C12266b c12266b) {
        return m45524g(c12266b, null);
    }

    /* JADX INFO: renamed from: g */
    public final C12270f m45524g(C12266b c12266b, PendingIntent pendingIntent) {
        boolean zMo7637J;
        InterfaceC1494a.a aVarM45522b = m45522b(c12266b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zMo7637J = this.f43413a.mo7641m(aVarM45522b, bundle);
            } else {
                zMo7637J = this.f43413a.mo7637J(aVarM45522b);
            }
            if (zMo7637J) {
                return new C12270f(this.f43413a, aVarM45522b, this.f43414b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m45525i(long j10) {
        try {
            return this.f43413a.mo7638h1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
