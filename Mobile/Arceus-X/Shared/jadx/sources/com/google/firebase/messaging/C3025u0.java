package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p261l2.C7975b;

/* JADX INFO: renamed from: com.google.firebase.messaging.u0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3025u0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f11329a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.u0$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static final long f11330d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a */
        public final String f11331a;

        /* JADX INFO: renamed from: b */
        public final String f11332b;

        /* JADX INFO: renamed from: c */
        public final long f11333c;

        public a(String str, String str2, long j10) {
            this.f11331a = str;
            this.f11332b = str2;
            this.f11333c = j10;
        }

        /* JADX INFO: renamed from: a */
        public static String m14659a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public static a m14660c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m14661b(String str) {
            return System.currentTimeMillis() > this.f11333c + f11330d || !str.equals(this.f11332b);
        }
    }

    public C3025u0(Context context) {
        this.f11329a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m14653a(context, "com.google.android.gms.appid-no-backup");
    }

    /* JADX INFO: renamed from: a */
    public final void m14653a(Context context, String str) {
        File file = new File(C7975b.m33012j(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m14657e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m14655c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m14654b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m14655c() {
        this.f11329a.edit().clear().commit();
    }

    /* JADX INFO: renamed from: d */
    public synchronized a m14656d(String str, String str2) {
        return a.m14660c(this.f11329a.getString(m14654b(str, str2), null));
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m14657e() {
        return this.f11329a.getAll().isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m14658f(String str, String str2, String str3, String str4) {
        String strM14659a = a.m14659a(str3, str4, System.currentTimeMillis());
        if (strM14659a == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f11329a.edit();
        editorEdit.putString(m14654b(str, str2), strM14659a);
        editorEdit.commit();
    }
}
