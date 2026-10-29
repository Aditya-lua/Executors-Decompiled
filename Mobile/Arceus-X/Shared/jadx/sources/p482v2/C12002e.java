package p482v2;

import android.util.Base64;
import java.util.List;
import p533x2.C12637g;

/* JADX INFO: renamed from: v2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12002e {

    /* JADX INFO: renamed from: a */
    public final String f42494a;

    /* JADX INFO: renamed from: b */
    public final String f42495b;

    /* JADX INFO: renamed from: c */
    public final String f42496c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f42497d;

    /* JADX INFO: renamed from: e */
    public final int f42498e;

    /* JADX INFO: renamed from: f */
    public final String f42499f;

    /* JADX INFO: renamed from: g */
    public final String f42500g;

    /* JADX INFO: renamed from: h */
    public final String f42501h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12002e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m44788a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    /* JADX INFO: renamed from: b */
    public List<List<byte[]>> m44789b() {
        return this.f42497d;
    }

    /* JADX INFO: renamed from: c */
    public int m44790c() {
        return this.f42498e;
    }

    /* JADX INFO: renamed from: d */
    public String m44791d() {
        return this.f42501h;
    }

    /* JADX INFO: renamed from: e */
    public String m44792e() {
        return this.f42494a;
    }

    /* JADX INFO: renamed from: f */
    public String m44793f() {
        return this.f42495b;
    }

    /* JADX INFO: renamed from: g */
    public String m44794g() {
        return this.f42496c;
    }

    /* JADX INFO: renamed from: h */
    public String m44795h() {
        return this.f42499f;
    }

    /* JADX INFO: renamed from: i */
    public String m44796i() {
        return this.f42500g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f42494a + ", mProviderPackage: " + this.f42495b + ", mQuery: " + this.f42496c + ", mSystemFont: " + this.f42499f + ", mVariationSettings: " + this.f42500g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f42497d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f42497d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f42498e);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12002e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f42494a = (String) C12637g.m47075g(str);
        this.f42495b = (String) C12637g.m47075g(str2);
        this.f42496c = (String) C12637g.m47075g(str3);
        this.f42497d = (List) C12637g.m47075g(list);
        this.f42498e = 0;
        this.f42499f = str4;
        this.f42500g = str5;
        this.f42501h = m44788a(str, str2, str3, str4, str5);
    }
}
