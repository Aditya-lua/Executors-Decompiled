package hf;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import o9.q;
import o9.s;
import o9.v;
import v9.o;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18204a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18209g;

    public k(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        s.q(!o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.f18204a = str2;
        this.f18205c = str3;
        this.f18206d = str4;
        this.f18207e = str5;
        this.f18208f = str6;
        this.f18209g = str7;
    }

    public static k a(@NonNull Context context) {
        v vVar = new v(context);
        String strA = vVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    @NonNull
    public String b() {
        return this.f18204a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public String d() {
        return this.f18207e;
    }

    public String e() {
        return this.f18209g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return q.b(this.b, kVar.b) && q.b(this.f18204a, kVar.f18204a) && q.b(this.f18205c, kVar.f18205c) && q.b(this.f18206d, kVar.f18206d) && q.b(this.f18207e, kVar.f18207e) && q.b(this.f18208f, kVar.f18208f) && q.b(this.f18209g, kVar.f18209g);
    }

    public int hashCode() {
        return q.c(this.b, this.f18204a, this.f18205c, this.f18206d, this.f18207e, this.f18208f, this.f18209g);
    }

    public String toString() {
        return q.d(this).a("applicationId", this.b).a("apiKey", this.f18204a).a("databaseUrl", this.f18205c).a("gcmSenderId", this.f18207e).a("storageBucket", this.f18208f).a("projectId", this.f18209g).toString();
    }
}
