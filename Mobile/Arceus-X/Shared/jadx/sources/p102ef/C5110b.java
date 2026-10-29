package p102ef;

import java.math.BigInteger;
import pe.C10218d0;

/* JADX INFO: renamed from: ef.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5110b {

    /* JADX INFO: renamed from: a */
    public final BigInteger f19929a;

    public C5110b(BigInteger bigInteger) {
        this.f19929a = bigInteger;
    }

    /* JADX INFO: renamed from: a */
    public static C5110b m23851a(BigInteger bigInteger, C10218d0 c10218d0) {
        if (c10218d0 != null) {
            return new C5110b(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX INFO: renamed from: b */
    public BigInteger m23852b(C10218d0 c10218d0) {
        if (c10218d0 != null) {
            return this.f19929a;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
