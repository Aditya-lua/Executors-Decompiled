package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.regex.Pattern;
import p305n9.C8947k;

/* JADX INFO: renamed from: com.google.firebase.messaging.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3029w0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f11344d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f11345a;

    /* JADX INFO: renamed from: b */
    public final String f11346b;

    /* JADX INFO: renamed from: c */
    public final String f11347c;

    public C3029w0(String str, String str2) {
        this.f11345a = m14669d(str2, str);
        this.f11346b = str;
        this.f11347c = str + "!" + str2;
    }

    /* JADX INFO: renamed from: a */
    public static C3029w0 m14668a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new C3029w0(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static String m14669d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f11344d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public String m14670b() {
        return this.f11346b;
    }

    /* JADX INFO: renamed from: c */
    public String m14671c() {
        return this.f11345a;
    }

    /* JADX INFO: renamed from: e */
    public String m14672e() {
        return this.f11347c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3029w0)) {
            return false;
        }
        C3029w0 c3029w0 = (C3029w0) obj;
        return this.f11345a.equals(c3029w0.f11345a) && this.f11346b.equals(c3029w0.f11346b);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f11346b, this.f11345a);
    }
}
