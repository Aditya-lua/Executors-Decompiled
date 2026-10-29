package df;

import java.math.BigInteger;
import oe.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f14614a;

    public b(BigInteger bigInteger) {
        this.f14614a = bigInteger;
    }

    public static b a(BigInteger bigInteger, d0 d0Var) {
        if (d0Var != null) {
            return new b(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public BigInteger b(d0 d0Var) {
        if (d0Var != null) {
            return this.f14614a;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
