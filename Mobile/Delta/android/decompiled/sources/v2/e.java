package v2;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33272a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f33274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f33277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33278h;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List<List<byte[]>> b() {
        return this.f33274d;
    }

    public int c() {
        return this.f33275e;
    }

    public String d() {
        return this.f33278h;
    }

    public String e() {
        return this.f33272a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f33273c;
    }

    public String h() {
        return this.f33276f;
    }

    public String i() {
        return this.f33277g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f33272a + ", mProviderPackage: " + this.b + ", mQuery: " + this.f33273c + ", mSystemFont: " + this.f33276f + ", mVariationSettings: " + this.f33277g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f33274d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f33274d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f33275e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f33272a = (String) x2.g.g(str);
        this.b = (String) x2.g.g(str2);
        this.f33273c = (String) x2.g.g(str3);
        this.f33274d = (List) x2.g.g(list);
        this.f33275e = 0;
        this.f33276f = str4;
        this.f33277g = str5;
        this.f33278h = a(str, str2, str3, str4, str5);
    }
}
