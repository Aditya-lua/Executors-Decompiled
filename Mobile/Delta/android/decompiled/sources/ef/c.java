package ef;

import df.u;
import pe.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16111a;

    public c(a aVar) {
        this.f16111a = aVar;
    }

    public static c a(byte[] bArr, d0 d0Var) {
        if (d0Var != null) {
            return new c(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static c b(int i10) {
        return new c(a.a(u.a(i10)));
    }

    public int c() {
        return this.f16111a.c();
    }

    public byte[] d(d0 d0Var) {
        if (d0Var != null) {
            return this.f16111a.d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
