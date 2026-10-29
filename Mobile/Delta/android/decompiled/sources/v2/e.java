package v2;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32704a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f32706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f32709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f32710h;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List<List<byte[]>> b() {
        return this.f32706d;
    }

    public int c() {
        return this.f32707e;
    }

    public String d() {
        return this.f32710h;
    }

    public String e() {
        return this.f32704a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f32705c;
    }

    public String h() {
        return this.f32708f;
    }

    public String i() {
        return this.f32709g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f32704a + ", mProviderPackage: " + this.b + ", mQuery: " + this.f32705c + ", mSystemFont: " + this.f32708f + ", mVariationSettings: " + this.f32709g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f32706d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f32706d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f32707e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f32704a = (String) x2.g.g(str);
        this.b = (String) x2.g.g(str2);
        this.f32705c = (String) x2.g.g(str3);
        this.f32706d = (List) x2.g.g(list);
        this.f32707e = 0;
        this.f32708f = str4;
        this.f32709g = str5;
        this.f32710h = a(str, str2, str3, str4, str5);
    }
}
