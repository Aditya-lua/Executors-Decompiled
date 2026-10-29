package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.concurrent.atomic.AtomicInteger;
import p235k2.C7419k;
import p261l2.C7975b;

/* JADX INFO: renamed from: com.google.firebase.messaging.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2982c {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f11250a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C7419k.f f11251a;

        /* JADX INFO: renamed from: b */
        public final String f11252b;

        /* JADX INFO: renamed from: c */
        public final int f11253c;

        public a(C7419k.f fVar, String str, int i10) {
            this.f11251a = fVar;
            this.f11252b = str;
            this.f11253c = i10;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m14484a(Context context, C2998h0 c2998h0, String str, PackageManager packageManager) {
        Intent intentM14489f = m14489f(str, c2998h0, packageManager);
        if (intentM14489f == null) {
            return null;
        }
        intentM14489f.addFlags(67108864);
        intentM14489f.putExtras(c2998h0.m14589y());
        if (m14500q(c2998h0)) {
            intentM14489f.putExtra("gcm.n.analytics_data", c2998h0.m14588x());
        }
        return PendingIntent.getActivity(context, m14490g(), intentM14489f, m14495l(1073741824));
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m14485b(Context context, Context context2, C2998h0 c2998h0) {
        if (m14500q(c2998h0)) {
            return m14486c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c2998h0.m14588x()));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static PendingIntent m14486c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m14490g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), m14495l(1073741824));
    }

    /* JADX INFO: renamed from: d */
    public static a m14487d(Context context, Context context2, C2998h0 c2998h0, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C7419k.f fVar = new C7419k.f(context2, str);
        String strM14582n = c2998h0.m14582n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM14582n)) {
            fVar.m30788l(strM14582n);
        }
        String strM14582n2 = c2998h0.m14582n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM14582n2)) {
            fVar.m30787k(strM14582n2);
            fVar.m30772B(new C7419k.d().m30768h(strM14582n2));
        }
        fVar.m30802z(m14496m(packageManager, resources, packageName, c2998h0.m14584p("gcm.n.icon"), bundle));
        Uri uriM14497n = m14497n(packageName, c2998h0, resources);
        if (uriM14497n != null) {
            fVar.m30771A(uriM14497n);
        }
        fVar.m30786j(m14484a(context, c2998h0, packageName, packageManager));
        PendingIntent pendingIntentM14485b = m14485b(context, context2, c2998h0);
        if (pendingIntentM14485b != null) {
            fVar.m30790n(pendingIntentM14485b);
        }
        Integer numM14491h = m14491h(context2, c2998h0.m14584p("gcm.n.color"), bundle);
        if (numM14491h != null) {
            fVar.m30784h(numM14491h.intValue());
        }
        fVar.m30782f(!c2998h0.m14570a("gcm.n.sticky"));
        fVar.m30797u(c2998h0.m14570a("gcm.n.local_only"));
        String strM14584p = c2998h0.m14584p("gcm.n.ticker");
        if (strM14584p != null) {
            fVar.m30773C(strM14584p);
        }
        Integer numM14581m = c2998h0.m14581m();
        if (numM14581m != null) {
            fVar.m30800x(numM14581m.intValue());
        }
        Integer numM14586r = c2998h0.m14586r();
        if (numM14586r != null) {
            fVar.m30776F(numM14586r.intValue());
        }
        Integer numM14580l = c2998h0.m14580l();
        if (numM14580l != null) {
            fVar.m30798v(numM14580l.intValue());
        }
        Long lM14578j = c2998h0.m14578j("gcm.n.event_time");
        if (lM14578j != null) {
            fVar.m30801y(true);
            fVar.m30777G(lM14578j.longValue());
        }
        long[] jArrM14585q = c2998h0.m14585q();
        if (jArrM14585q != null) {
            fVar.m30775E(jArrM14585q);
        }
        int[] iArrM14573e = c2998h0.m14573e();
        if (iArrM14573e != null) {
            fVar.m30796t(iArrM14573e[0], iArrM14573e[1], iArrM14573e[2]);
        }
        fVar.m30789m(m14492i(c2998h0));
        return new a(fVar, m14498o(c2998h0), 0);
    }

    /* JADX INFO: renamed from: e */
    public static a m14488e(Context context, C2998h0 c2998h0) {
        Bundle bundleM14493j = m14493j(context.getPackageManager(), context.getPackageName());
        return m14487d(context, context, c2998h0, m14494k(context, c2998h0.m14579k(), bundleM14493j), bundleM14493j);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m14489f(String str, C2998h0 c2998h0, PackageManager packageManager) {
        String strM14584p = c2998h0.m14584p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strM14584p)) {
            Intent intent = new Intent(strM14584p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriM14574f = c2998h0.m14574f();
        if (uriM14574f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriM14574f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* JADX INFO: renamed from: g */
    public static int m14490g() {
        return f11250a.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    public static Integer m14491h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C7975b.m33005c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: i */
    public static int m14492i(C2998h0 c2998h0) {
        boolean zM14570a = c2998h0.m14570a("gcm.n.default_sound");
        ?? r8 = zM14570a;
        if (c2998h0.m14570a("gcm.n.default_vibrate_timings")) {
            r8 = (zM14570a ? 1 : 0) | 2;
        }
        return c2998h0.m14570a("gcm.n.default_light_settings") ? r8 | 4 : r8;
    }

    /* JADX INFO: renamed from: j */
    public static Bundle m14493j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: k */
    public static String m14494k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", InquiryField.StringField.TYPE, context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m14495l(int i10) {
        return i10 | 67108864;
    }

    /* JADX INFO: renamed from: m */
    public static int m14496m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m14499p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m14499p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !m14499p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !m14499p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    /* JADX INFO: renamed from: n */
    public static Uri m14497n(String str, C2998h0 c2998h0, Resources resources) {
        String strM14583o = c2998h0.m14583o();
        if (TextUtils.isEmpty(strM14583o)) {
            return null;
        }
        if ("default".equals(strM14583o) || resources.getIdentifier(strM14583o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strM14583o);
    }

    /* JADX INFO: renamed from: o */
    public static String m14498o(C2998h0 c2998h0) {
        String strM14584p = c2998h0.m14584p("gcm.n.tag");
        if (!TextUtils.isEmpty(strM14584p)) {
            return strM14584p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: p */
    public static boolean m14499p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14500q(@NonNull C2998h0 c2998h0) {
        return c2998h0.m14570a("google.c.a.e");
    }
}
