package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.p1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10552p1 extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10564t1 f37852a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37853b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37854c;

    /* JADX INFO: renamed from: d */
    public final Integer f37855d;

    public C10552p1(C10564t1 c10564t1, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37852a = c10564t1;
        this.f37853b = c5111c;
        this.f37854c = c5109a;
        this.f37855d = num;
    }

    /* JADX INFO: renamed from: b */
    public static C10552p1 m40452b(C10564t1.a aVar, C5111c c5111c, Integer num) throws GeneralSecurityException {
        C10564t1.a aVar2 = C10564t1.a.f37884d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c5111c.m23855c() == 32) {
            C10564t1 c10564t1M40493b = C10564t1.m40493b(aVar);
            return new C10552p1(c10564t1M40493b, c5111c, m40453e(c10564t1M40493b, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c5111c.m23855c());
    }

    /* JADX INFO: renamed from: e */
    public static C5109a m40453e(C10564t1 c10564t1, Integer num) {
        if (c10564t1.m40494c() == C10564t1.a.f37884d) {
            return C12366e0.f44235a;
        }
        if (c10564t1.m40494c() == C10564t1.a.f37883c) {
            return C12366e0.m46287a(num.intValue());
        }
        if (c10564t1.m40494c() == C10564t1.a.f37882b) {
            return C12366e0.m46288b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + c10564t1.m40494c());
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37855d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40454c() {
        return this.f37853b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40455d() {
        return this.f37854c;
    }

    /* JADX INFO: renamed from: f */
    public C10564t1 m40456f() {
        return this.f37852a;
    }
}
