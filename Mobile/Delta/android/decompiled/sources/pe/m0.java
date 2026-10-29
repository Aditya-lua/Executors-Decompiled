package pe;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class m0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f28497a;
    public final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28498c;

    public m0(n0 n0Var, df.a aVar, Integer num) {
        this.f28497a = n0Var;
        this.b = aVar;
        this.f28498c = num;
    }

    public static m0 b(n0 n0Var, Integer num) throws GeneralSecurityException {
        df.a aVarA;
        if (n0Var.d() == n0.a.b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarA = df.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (n0Var.d() != n0.a.f28500c) {
                throw new GeneralSecurityException("Unknown Variant: " + n0Var.d());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarA = df.a.a(new byte[0]);
        }
        return new m0(n0Var, aVarA, num);
    }

    @Override // oe.l
    public Integer a() {
        return this.f28498c;
    }

    public df.a c() {
        return this.b;
    }

    public n0 d() {
        return this.f28497a;
    }
}
