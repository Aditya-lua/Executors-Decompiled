package ef;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import n9.m;
import u9.o;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15464a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15469g;

    public k(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        m.q(!o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.f15464a = str2;
        this.f15465c = str3;
        this.f15466d = str4;
        this.f15467e = str5;
        this.f15468f = str6;
        this.f15469g = str7;
    }

    public static k a(@NonNull Context context) {
        n9.o oVar = new n9.o(context);
        String strA = oVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, oVar.a("google_api_key"), oVar.a("firebase_database_url"), oVar.a("ga_trackingId"), oVar.a("gcm_defaultSenderId"), oVar.a("google_storage_bucket"), oVar.a("project_id"));
    }

    @NonNull
    public String b() {
        return this.f15464a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public String d() {
        return this.f15467e;
    }

    public String e() {
        return this.f15469g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n9.k.b(this.b, kVar.b) && n9.k.b(this.f15464a, kVar.f15464a) && n9.k.b(this.f15465c, kVar.f15465c) && n9.k.b(this.f15466d, kVar.f15466d) && n9.k.b(this.f15467e, kVar.f15467e) && n9.k.b(this.f15468f, kVar.f15468f) && n9.k.b(this.f15469g, kVar.f15469g);
    }

    public int hashCode() {
        return n9.k.c(this.b, this.f15464a, this.f15465c, this.f15466d, this.f15467e, this.f15468f, this.f15469g);
    }

    public String toString() {
        return n9.k.d(this).a("applicationId", this.b).a("apiKey", this.f15464a).a("databaseUrl", this.f15465c).a("gcmSenderId", this.f15467e).a("storageBucket", this.f15468f).a("projectId", this.f15469g).toString();
    }
}
