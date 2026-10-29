package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.h0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2998h0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Bundle f11281a;

    public C2998h0(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f11281a = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: d */
    public static int m14564d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14565s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m14566t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m14568v("gcm.n.e")));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m14567u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* JADX INFO: renamed from: v */
    public static String m14568v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* JADX INFO: renamed from: z */
    public static String m14569z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14570a(String str) {
        String strM14584p = m14584p(str);
        return "1".equals(strM14584p) || Boolean.parseBoolean(strM14584p);
    }

    /* JADX INFO: renamed from: b */
    public Integer m14571b(String str) {
        String strM14584p = m14584p(str);
        if (TextUtils.isEmpty(strM14584p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM14584p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m14569z(str) + "(" + strM14584p + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m14572c(String str) {
        String strM14584p = m14584p(str);
        if (TextUtils.isEmpty(strM14584p)) {
            return null;
        }
        try {
            return new JSONArray(strM14584p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m14569z(str) + ": " + strM14584p + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int[] m14573e() {
        JSONArray jSONArrayM14572c = m14572c("gcm.n.light_settings");
        if (jSONArrayM14572c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM14572c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m14564d(jSONArrayM14572c.optString(0));
            iArr[1] = jSONArrayM14572c.optInt(1);
            iArr[2] = jSONArrayM14572c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM14572c + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM14572c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public Uri m14574f() {
        String strM14584p = m14584p("gcm.n.link_android");
        if (TextUtils.isEmpty(strM14584p)) {
            strM14584p = m14584p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM14584p)) {
            return null;
        }
        return Uri.parse(strM14584p);
    }

    /* JADX INFO: renamed from: g */
    public Object[] m14575g(String str) {
        JSONArray jSONArrayM14572c = m14572c(str + "_loc_args");
        if (jSONArrayM14572c == null) {
            return null;
        }
        int length = jSONArrayM14572c.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayM14572c.optString(i10);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: h */
    public String m14576h(String str) {
        return m14584p(str + "_loc_key");
    }

    /* JADX INFO: renamed from: i */
    public String m14577i(Resources resources, String str, String str2) {
        String strM14576h = m14576h(str2);
        if (TextUtils.isEmpty(strM14576h)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM14576h, InquiryField.StringField.TYPE, str);
        if (identifier == 0) {
            Log.w("NotificationParams", m14569z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM14575g = m14575g(str2);
        if (objArrM14575g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM14575g);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + m14569z(str2) + ": " + Arrays.toString(objArrM14575g) + " Default value will be used.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Long m14578j(String str) {
        String strM14584p = m14584p(str);
        if (TextUtils.isEmpty(strM14584p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM14584p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m14569z(str) + "(" + strM14584p + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m14579k() {
        return m14584p("gcm.n.android_channel_id");
    }

    /* JADX INFO: renamed from: l */
    public Integer m14580l() {
        Integer numM14571b = m14571b("gcm.n.notification_count");
        if (numM14571b == null) {
            return null;
        }
        if (numM14571b.intValue() >= 0) {
            return numM14571b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM14571b + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Integer m14581m() {
        Integer numM14571b = m14571b("gcm.n.notification_priority");
        if (numM14571b == null) {
            return null;
        }
        if (numM14571b.intValue() >= -2 && numM14571b.intValue() <= 2) {
            return numM14571b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM14571b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public String m14582n(Resources resources, String str, String str2) {
        String strM14584p = m14584p(str2);
        return !TextUtils.isEmpty(strM14584p) ? strM14584p : m14577i(resources, str, str2);
    }

    /* JADX INFO: renamed from: o */
    public String m14583o() {
        String strM14584p = m14584p("gcm.n.sound2");
        return TextUtils.isEmpty(strM14584p) ? m14584p("gcm.n.sound") : strM14584p;
    }

    /* JADX INFO: renamed from: p */
    public String m14584p(String str) {
        return this.f11281a.getString(m14587w(str));
    }

    /* JADX INFO: renamed from: q */
    public long[] m14585q() {
        JSONArray jSONArrayM14572c = m14572c("gcm.n.vibrate_timings");
        if (jSONArrayM14572c == null) {
            return null;
        }
        try {
            if (jSONArrayM14572c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM14572c.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayM14572c.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM14572c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public Integer m14586r() {
        Integer numM14571b = m14571b("gcm.n.visibility");
        if (numM14571b == null) {
            return null;
        }
        if (numM14571b.intValue() >= -1 && numM14571b.intValue() <= 1) {
            return numM14571b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + numM14571b + ". Skipping setting visibility.");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final String m14587w(String str) {
        if (!this.f11281a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strM14568v = m14568v(str);
            if (this.f11281a.containsKey(strM14568v)) {
                return strM14568v;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public Bundle m14588x() {
        Bundle bundle = new Bundle(this.f11281a);
        for (String str : this.f11281a.keySet()) {
            if (!m14565s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    public Bundle m14589y() {
        Bundle bundle = new Bundle(this.f11281a);
        for (String str : this.f11281a.keySet()) {
            if (m14567u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
