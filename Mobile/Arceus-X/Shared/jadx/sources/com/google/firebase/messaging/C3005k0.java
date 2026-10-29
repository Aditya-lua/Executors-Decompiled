package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p092e3.ExecutorC4775n;
import p462u9.C11822m;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.firebase.messaging.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3005k0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14602a(Context context, boolean z10, C11264k c11264k) {
        try {
            if (!m14603b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C3009m0.m14620e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c11264k.m42330e(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14603b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* JADX INFO: renamed from: c */
    public static void m14604c(Context context) {
        if (C3009m0.m14618c(context)) {
            return;
        }
        m14606e(new ExecutorC4775n(), context, m14607f(context));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14605d(Context context) {
        if (!C11822m.m44202i()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!m14603b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: e */
    public static Task<Void> m14606e(Executor executor, final Context context, final boolean z10) {
        if (!C11822m.m44202i()) {
            return C11268m.m42336f(null);
        }
        final C11264k c11264k = new C11264k();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.j0
            @Override // java.lang.Runnable
            public final void run() {
                C3005k0.m14602a(context, z10, c11264k);
            }
        });
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14607f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
