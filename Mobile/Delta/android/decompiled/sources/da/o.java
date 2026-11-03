package da;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements k9.a.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14503e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14505g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ga.q f14513o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14500a = false;
    public final boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14501c = 17;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14502d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14504f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14506h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14507i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14508j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14509k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14510l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f14511m = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14514p = false;

    public /* synthetic */ o(boolean z10, boolean z11, int i10, boolean z12, int i11, String str, ArrayList arrayList, boolean z13, boolean z14, boolean z15, String str2, int i12, int i13, String str3, ga.q qVar, boolean z16, byte[] bArr) {
        this.f14503e = i11;
        this.f14505g = arrayList;
        this.f14512n = str3;
        this.f14513o = qVar;
    }

    public static n a() {
        return new n(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f14503e == oVar.f14503e && this.f14505g.equals(oVar.f14505g) && TextUtils.equals(null, null) && n9.k.b(this.f14512n, oVar.f14512n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f14503e + 486741695) * 961) + this.f14505g.hashCode();
        String str = this.f14512n;
        return ((((iHashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
