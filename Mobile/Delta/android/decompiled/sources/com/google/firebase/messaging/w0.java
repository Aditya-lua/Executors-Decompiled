package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8897d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8898a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8899c;

    public w0(String str, String str2) {
        this.f8898a = d(str2, str);
        this.b = str;
        this.f8899c = str + "!" + str2;
    }

    public static w0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new w0(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f8897d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f8898a;
    }

    public String e() {
        return this.f8899c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f8898a.equals(w0Var.f8898a) && this.b.equals(w0Var.b);
    }

    public int hashCode() {
        return n9.k.c(this.b, this.f8898a);
    }
}
