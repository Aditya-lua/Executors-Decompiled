package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.ExecutionException;
import p128ff.C5590e;
import p129fg.C5598a;
import p129fg.C5599b;
import p170hf.InterfaceC6392a;
import p569y7.AbstractC13117d;
import p569y7.AbstractC13119f;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;
import p569y7.InterfaceC13122i;
import p603zf.C13800g;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.firebase.messaging.f0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2992f0 {
    /* JADX INFO: renamed from: A */
    public static void m14523A(String str, Bundle bundle) {
        try {
            C5590e.m25260l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strM14531d = m14531d(bundle);
            if (strM14531d != null) {
                bundle2.putString("_nmid", strM14531d);
            }
            String strM14532e = m14532e(bundle);
            if (strM14532e != null) {
                bundle2.putString("_nmn", strM14532e);
            }
            String strM14536i = m14536i(bundle);
            if (!TextUtils.isEmpty(strM14536i)) {
                bundle2.putString("label", strM14536i);
            }
            String strM14534g = m14534g(bundle);
            if (!TextUtils.isEmpty(strM14534g)) {
                bundle2.putString("message_channel", strM14534g);
            }
            String strM14545r = m14545r(bundle);
            if (strM14545r != null) {
                bundle2.putString("_nt", strM14545r);
            }
            String strM14539l = m14539l(bundle);
            if (strM14539l != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strM14539l));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String strM14547t = m14547t(bundle);
            if (strM14547t != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strM14547t));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String strM14541n = m14541n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strM14541n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC6392a interfaceC6392a = (InterfaceC6392a) C5590e.m25260l().m25267i(InterfaceC6392a.class);
            if (interfaceC6392a != null) {
                interfaceC6392a.mo27971a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m14524B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC6392a interfaceC6392a = (InterfaceC6392a) C5590e.m25260l().m25267i(InterfaceC6392a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC6392a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC6392a.mo27972b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Payload.SOURCE, "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC6392a.mo27971a("fcm", "_cmp", bundle2);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m14525C(Intent intent) {
        if (intent == null || m14548u(intent)) {
            return false;
        }
        return m14528a();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m14526D(Intent intent) {
        if (intent == null || m14548u(intent)) {
            return false;
        }
        return m14527E(intent.getExtras());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m14527E(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14528a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C5590e.m25260l();
            Context contextM25268j = C5590e.m25260l().m25268j();
            SharedPreferences sharedPreferences = contextM25268j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextM25268j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM25268j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5598a m14529b(C5598a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C5598a.a aVarM25315j = C5598a.m25290p().m25319n(m14546s(extras)).m25310e(bVar).m25311f(m14533f(extras)).m25314i(m14542o()).m25317l(C5598a.d.ANDROID).m25313h(m14540m(extras)).m25315j(m14538k(extras));
        String strM14535h = m14535h(extras);
        if (strM14535h != null) {
            aVarM25315j.m25312g(strM14535h);
        }
        String strM14545r = m14545r(extras);
        if (strM14545r != null) {
            aVarM25315j.m25318m(strM14545r);
        }
        String strM14530c = m14530c(extras);
        if (strM14530c != null) {
            aVarM25315j.m25308c(strM14530c);
        }
        String strM14536i = m14536i(extras);
        if (strM14536i != null) {
            aVarM25315j.m25307b(strM14536i);
        }
        String strM14532e = m14532e(extras);
        if (strM14532e != null) {
            aVarM25315j.m25309d(strM14532e);
        }
        long jM14544q = m14544q(extras);
        if (jM14544q > 0) {
            aVarM25315j.m25316k(jM14544q);
        }
        return aVarM25315j.m25306a();
    }

    /* JADX INFO: renamed from: c */
    public static String m14530c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* JADX INFO: renamed from: d */
    public static String m14531d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* JADX INFO: renamed from: e */
    public static String m14532e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m14533f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C11268m.m42331a(C13800g.m50253q(C5590e.m25260l()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m14534g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* JADX INFO: renamed from: h */
    public static String m14535h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* JADX INFO: renamed from: i */
    public static String m14536i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static int m14537j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m14538k(Bundle bundle) {
        int iM14543p = m14543p(bundle);
        if (iM14543p == 2) {
            return 5;
        }
        return iM14543p == 1 ? 10 : 0;
    }

    /* JADX INFO: renamed from: l */
    public static String m14539l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static C5598a.c m14540m(Bundle bundle) {
        return (bundle == null || !C2998h0.m14566t(bundle)) ? C5598a.c.DATA_MESSAGE : C5598a.c.DISPLAY_NOTIFICATION;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static String m14541n(Bundle bundle) {
        return (bundle == null || !C2998h0.m14566t(bundle)) ? "data" : "display";
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static String m14542o() {
        return C5590e.m25260l().m25268j().getPackageName();
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static int m14543p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return m14537j(string);
    }

    /* JADX INFO: renamed from: q */
    public static long m14544q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C5590e c5590eM25260l = C5590e.m25260l();
        String strM25286d = c5590eM25260l.m25270n().m25286d();
        if (strM25286d != null) {
            try {
                return Long.parseLong(strM25286d);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String strM25285c = c5590eM25260l.m25270n().m25285c();
        if (strM25285c.startsWith("1:")) {
            String[] strArrSplit = strM25285c.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            try {
                return Long.parseLong(strM25285c);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static String m14545r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static int m14546s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m14547t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m14548u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* JADX INFO: renamed from: v */
    public static void m14549v(Intent intent) {
        m14523A("_nd", intent.getExtras());
    }

    /* JADX INFO: renamed from: w */
    public static void m14550w(Intent intent) {
        m14523A("_nf", intent.getExtras());
    }

    /* JADX INFO: renamed from: x */
    public static void m14551x(Bundle bundle) {
        m14524B(bundle);
        m14523A("_no", bundle);
    }

    /* JADX INFO: renamed from: y */
    public static void m14552y(Intent intent) {
        if (m14526D(intent)) {
            m14523A("_nr", intent.getExtras());
        }
        if (m14525C(intent)) {
            m14553z(C5598a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m14423s());
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m14553z(C5598a.b bVar, Intent intent, InterfaceC13122i interfaceC13122i) {
        if (interfaceC13122i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C5598a c5598aM14529b = m14529b(bVar, intent);
        if (c5598aM14529b == null) {
            return;
        }
        try {
            interfaceC13122i.mo7043a("FCM_CLIENT_EVENT_LOGGING", C5599b.class, C13116c.m48729b("proto"), new InterfaceC13120g() { // from class: com.google.firebase.messaging.e0
                @Override // p569y7.InterfaceC13120g
                public final Object apply(Object obj) {
                    return ((C5599b) obj).m25325c();
                }
            }).mo7046a(AbstractC13117d.m48732f(C5599b.m25323b().m25327b(c5598aM14529b).m25326a(), AbstractC13119f.m48734b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }
}
