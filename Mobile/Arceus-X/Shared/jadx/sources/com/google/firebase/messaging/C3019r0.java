package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.r0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3019r0 {

    /* JADX INFO: renamed from: e */
    public static C3019r0 f11313e;

    /* JADX INFO: renamed from: a */
    public String f11314a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f11315b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f11316c = null;

    /* JADX INFO: renamed from: d */
    public final Queue<Intent> f11317d = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public static synchronized C3019r0 m14637b() {
        try {
            if (f11313e == null) {
                f11313e = new C3019r0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11313e;
    }

    /* JADX INFO: renamed from: a */
    public final int m14638a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strM14642f = m14642f(context, intent);
        if (strM14642f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strM14642f);
            }
            intent.setClassName(context.getPackageName(), strM14642f);
        }
        try {
            if (m14641e(context)) {
                componentNameStartService = C2984c1.m14507g(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return HttpStatusCode.NOT_FOUND_404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return HttpStatusCode.UNAUTHORIZED_401;
        }
    }

    /* JADX INFO: renamed from: c */
    public Intent m14639c() {
        return this.f11317d.poll();
    }

    /* JADX INFO: renamed from: d */
    public boolean m14640d(Context context) {
        if (this.f11316c == null) {
            this.f11316c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f11315b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11316c.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m14641e(Context context) {
        if (this.f11315b == null) {
            this.f11315b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f11315b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11315b.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized String m14642f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f11314a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f11314a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f11314a = serviceInfo.name;
                    }
                    return this.f11314a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m14643g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f11317d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m14638a(context, intent2);
    }
}
