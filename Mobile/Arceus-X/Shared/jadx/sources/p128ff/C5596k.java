package p128ff;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import p305n9.C8947k;
import p305n9.C8953m;
import p305n9.C8959o;
import p462u9.C11824o;

/* JADX INFO: renamed from: ff.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C5596k {

    /* JADX INFO: renamed from: a */
    public final String f21412a;

    /* JADX INFO: renamed from: b */
    public final String f21413b;

    /* JADX INFO: renamed from: c */
    public final String f21414c;

    /* JADX INFO: renamed from: d */
    public final String f21415d;

    /* JADX INFO: renamed from: e */
    public final String f21416e;

    /* JADX INFO: renamed from: f */
    public final String f21417f;

    /* JADX INFO: renamed from: g */
    public final String f21418g;

    public C5596k(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        C8953m.m36052q(!C11824o.m44207a(str), "ApplicationId must be set.");
        this.f21413b = str;
        this.f21412a = str2;
        this.f21414c = str3;
        this.f21415d = str4;
        this.f21416e = str5;
        this.f21417f = str6;
        this.f21418g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C5596k m25283a(@NonNull Context context) {
        C8959o c8959o = new C8959o(context);
        String strM36061a = c8959o.m36061a("google_app_id");
        if (TextUtils.isEmpty(strM36061a)) {
            return null;
        }
        return new C5596k(strM36061a, c8959o.m36061a("google_api_key"), c8959o.m36061a("firebase_database_url"), c8959o.m36061a("ga_trackingId"), c8959o.m36061a("gcm_defaultSenderId"), c8959o.m36061a("google_storage_bucket"), c8959o.m36061a("project_id"));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m25284b() {
        return this.f21412a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m25285c() {
        return this.f21413b;
    }

    /* JADX INFO: renamed from: d */
    public String m25286d() {
        return this.f21416e;
    }

    /* JADX INFO: renamed from: e */
    public String m25287e() {
        return this.f21418g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5596k)) {
            return false;
        }
        C5596k c5596k = (C5596k) obj;
        return C8947k.m36026b(this.f21413b, c5596k.f21413b) && C8947k.m36026b(this.f21412a, c5596k.f21412a) && C8947k.m36026b(this.f21414c, c5596k.f21414c) && C8947k.m36026b(this.f21415d, c5596k.f21415d) && C8947k.m36026b(this.f21416e, c5596k.f21416e) && C8947k.m36026b(this.f21417f, c5596k.f21417f) && C8947k.m36026b(this.f21418g, c5596k.f21418g);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f21413b, this.f21412a, this.f21414c, this.f21415d, this.f21416e, this.f21417f, this.f21418g);
    }

    public String toString() {
        return C8947k.m36028d(this).m36029a("applicationId", this.f21413b).m36029a("apiKey", this.f21412a).m36029a("databaseUrl", this.f21414c).m36029a("gcmSenderId", this.f21416e).m36029a("storageBucket", this.f21417f).m36029a("projectId", this.f21418g).toString();
    }
}
