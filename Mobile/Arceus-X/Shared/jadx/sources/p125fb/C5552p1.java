package p125fb;

import p242k9.C7491a;
import p305n9.C8947k;

/* JADX INFO: renamed from: fb.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5552p1 implements C7491a.d {

    /* JADX INFO: renamed from: a */
    public final int f21342a;

    /* JADX INFO: renamed from: b */
    public final String f21343b;

    public /* synthetic */ C5552p1(int i10, String str, byte[] bArr) {
        this.f21342a = i10;
        this.f21343b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C5537k1 m25218a() {
        return new C5537k1(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5552p1)) {
            return false;
        }
        C5552p1 c5552p1 = (C5552p1) obj;
        return this.f21342a == c5552p1.f21342a && C8947k.m36026b(this.f21343b, c5552p1.f21343b);
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f21342a), this.f21343b);
    }
}
