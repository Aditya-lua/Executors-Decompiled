package mm;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24419a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f24420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f24421d;

    public b(String str, String str2, JSONObject jSONObject, g gVar) {
        this.f24419a = str;
        this.b = str2;
        this.f24421d = gVar;
        this.f24420c = jSONObject;
    }

    public final g a() {
        return this.f24421d;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.f24420c;
    }

    public final String d() {
        return this.f24419a;
    }
}
