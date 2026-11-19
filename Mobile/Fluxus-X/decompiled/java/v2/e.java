package v2;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34160a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f34162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f34164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f34166h;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List<List<byte[]>> b() {
        return this.f34162d;
    }

    public int c() {
        return this.f34163e;
    }

    public String d() {
        return this.f34166h;
    }

    public String e() {
        return this.f34160a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f34161c;
    }

    public String h() {
        return this.f34164f;
    }

    public String i() {
        return this.f34165g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f34160a + ", mProviderPackage: " + this.b + ", mQuery: " + this.f34161c + ", mSystemFont: " + this.f34164f + ", mVariationSettings: " + this.f34165g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f34162d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f34162d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f34163e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f34160a = (String) x2.g.g(str);
        this.b = (String) x2.g.g(str2);
        this.f34161c = (String) x2.g.g(str3);
        this.f34162d = (List) x2.g.g(list);
        this.f34163e = 0;
        this.f34164f = str4;
        this.f34165g = str5;
        this.f34166h = a(str, str2, str3, str4, str5);
    }
}
