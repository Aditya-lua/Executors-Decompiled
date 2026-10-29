package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10506a0 extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10518e0 f37735a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37736b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37737c;

    /* JADX INFO: renamed from: d */
    public final Integer f37738d;

    public C10506a0(C10518e0 c10518e0, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37735a = c10518e0;
        this.f37736b = c5111c;
        this.f37737c = c5109a;
        this.f37738d = num;
    }

    /* JADX INFO: renamed from: b */
    public static C10506a0 m40337b(C10518e0.a aVar, C5111c c5111c, Integer num) throws GeneralSecurityException {
        C10518e0.a aVar2 = C10518e0.a.f37750d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c5111c.m23855c() == 32) {
            C10518e0 c10518e0M40350b = C10518e0.m40350b(aVar);
            return new C10506a0(c10518e0M40350b, c5111c, m40338e(c10518e0M40350b, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c5111c.m23855c());
    }

    /* JADX INFO: renamed from: e */
    public static C5109a m40338e(C10518e0 c10518e0, Integer num) {
        if (c10518e0.m40351c() == C10518e0.a.f37750d) {
            return C12366e0.f44235a;
        }
        if (c10518e0.m40351c() == C10518e0.a.f37749c) {
            return C12366e0.m46287a(num.intValue());
        }
        if (c10518e0.m40351c() == C10518e0.a.f37748b) {
            return C12366e0.m46288b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + c10518e0.m40351c());
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37738d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40339c() {
        return this.f37736b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40340d() {
        return this.f37737c;
    }

    /* JADX INFO: renamed from: f */
    public C10518e0 m40341f() {
        return this.f37735a;
    }
}
