package ff;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import n9.m;
import u9.o;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17218a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17223g;

    public k(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        m.q(!o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.f17218a = str2;
        this.f17219c = str3;
        this.f17220d = str4;
        this.f17221e = str5;
        this.f17222f = str6;
        this.f17223g = str7;
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
        return this.f17218a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public String d() {
        return this.f17221e;
    }

    public String e() {
        return this.f17223g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n9.k.b(this.b, kVar.b) && n9.k.b(this.f17218a, kVar.f17218a) && n9.k.b(this.f17219c, kVar.f17219c) && n9.k.b(this.f17220d, kVar.f17220d) && n9.k.b(this.f17221e, kVar.f17221e) && n9.k.b(this.f17222f, kVar.f17222f) && n9.k.b(this.f17223g, kVar.f17223g);
    }

    public int hashCode() {
        return n9.k.c(this.b, this.f17218a, this.f17219c, this.f17220d, this.f17221e, this.f17222f, this.f17223g);
    }

    public String toString() {
        return n9.k.d(this).a("applicationId", this.b).a("apiKey", this.f17218a).a("databaseUrl", this.f17219c).a("gcmSenderId", this.f17221e).a("storageBucket", this.f17222f).a("projectId", this.f17223g).toString();
    }
}
