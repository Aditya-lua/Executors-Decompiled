package p073da;

import android.text.TextUtils;
import ga.C6074q;
import java.util.ArrayList;
import p242k9.C7491a;
import p305n9.C8947k;

/* JADX INFO: renamed from: da.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4511o implements C7491a.d {

    /* JADX INFO: renamed from: e */
    public final int f18554e;

    /* JADX INFO: renamed from: g */
    public final ArrayList f18556g;

    /* JADX INFO: renamed from: n */
    public final String f18563n;

    /* JADX INFO: renamed from: o */
    public final C6074q f18564o;

    /* JADX INFO: renamed from: a */
    public final boolean f18550a = false;

    /* JADX INFO: renamed from: b */
    public final boolean f18551b = true;

    /* JADX INFO: renamed from: c */
    public final int f18552c = 17;

    /* JADX INFO: renamed from: d */
    public final boolean f18553d = false;

    /* JADX INFO: renamed from: f */
    public final String f18555f = null;

    /* JADX INFO: renamed from: h */
    public final boolean f18557h = false;

    /* JADX INFO: renamed from: i */
    public final boolean f18558i = false;

    /* JADX INFO: renamed from: j */
    public final boolean f18559j = false;

    /* JADX INFO: renamed from: k */
    public final String f18560k = null;

    /* JADX INFO: renamed from: l */
    public final int f18561l = 0;

    /* JADX INFO: renamed from: m */
    public final int f18562m = 9;

    /* JADX INFO: renamed from: p */
    public final boolean f18565p = false;

    public /* synthetic */ C4511o(boolean z10, boolean z11, int i10, boolean z12, int i11, String str, ArrayList arrayList, boolean z13, boolean z14, boolean z15, String str2, int i12, int i13, String str3, C6074q c6074q, boolean z16, byte[] bArr) {
        this.f18554e = i11;
        this.f18556g = arrayList;
        this.f18563n = str3;
        this.f18564o = c6074q;
    }

    /* JADX INFO: renamed from: a */
    public static C4510n m22476a() {
        return new C4510n(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4511o) {
            C4511o c4511o = (C4511o) obj;
            if (this.f18554e == c4511o.f18554e && this.f18556g.equals(c4511o.f18556g) && TextUtils.equals(null, null) && C8947k.m36026b(this.f18563n, c4511o.f18563n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f18554e + 486741695) * 961) + this.f18556g.hashCode();
        String str = this.f18563n;
        return ((((iHashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
