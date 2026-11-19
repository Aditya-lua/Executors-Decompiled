package ea;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements l9.a.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13294e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13296g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f13303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ha.r f13304o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13291a = false;
    public final boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13292c = 17;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13293d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13295f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13297h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13298i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f13299j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f13300k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13301l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13302m = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13305p = false;

    public /* synthetic */ x(boolean z10, boolean z11, int i10, boolean z12, int i11, String str, ArrayList arrayList, boolean z13, boolean z14, boolean z15, String str2, int i12, int i13, String str3, ha.r rVar, boolean z16, byte[] bArr) {
        this.f13294e = i11;
        this.f13296g = arrayList;
        this.f13303n = str3;
        this.f13304o = rVar;
    }

    public static w a() {
        return new w(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f13294e == xVar.f13294e && this.f13296g.equals(xVar.f13296g) && TextUtils.equals(null, null) && o9.q.b(this.f13303n, xVar.f13303n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f13294e + 486741695) * 961) + this.f13296g.hashCode();
        String str = this.f13303n;
        return ((((iHashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
