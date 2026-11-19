package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8737d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8738a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8739c;

    public x0(String str, String str2) {
        this.f8738a = d(str2, str);
        this.b = str;
        this.f8739c = str + "!" + str2;
    }

    public static x0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new x0(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f8737d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f8738a;
    }

    public String e() {
        return this.f8739c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f8738a.equals(x0Var.f8738a) && this.b.equals(x0Var.b);
    }

    public int hashCode() {
        return o9.q.c(this.b, this.f8738a);
    }
}
