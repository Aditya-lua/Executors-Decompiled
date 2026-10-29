package bf;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p515we.C12366e0;

/* JADX INFO: renamed from: bf.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1410o extends AbstractC1387c1 {

    /* JADX INFO: renamed from: a */
    public final C1398i f5535a;

    /* JADX INFO: renamed from: b */
    public final C5109a f5536b;

    /* JADX INFO: renamed from: c */
    public final C5109a f5537c;

    /* JADX INFO: renamed from: d */
    public final Integer f5538d;

    public C1410o(C1398i c1398i, C5109a c5109a, C5109a c5109a2, Integer num) {
        this.f5535a = c1398i;
        this.f5536b = c5109a;
        this.f5537c = c5109a2;
        this.f5538d = num;
    }

    /* JADX INFO: renamed from: c */
    public static C1410o m7336c(C1398i.a aVar, C5109a c5109a, Integer num) throws GeneralSecurityException {
        C1398i c1398iM7289b = C1398i.m7289b(aVar);
        C1398i.a aVar2 = C1398i.a.f5480e;
        if (!aVar.equals(aVar2) && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar.equals(aVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c5109a.m23849c() == 32) {
            return new C1410o(c1398iM7289b, c5109a, m7337d(c1398iM7289b, num), num);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + c5109a.m23849c());
    }

    /* JADX INFO: renamed from: d */
    public static C5109a m7337d(C1398i c1398i, Integer num) {
        if (c1398i.m7290c() == C1398i.a.f5480e) {
            return C12366e0.f44235a;
        }
        if (c1398i.m7290c() == C1398i.a.f5478c || c1398i.m7290c() == C1398i.a.f5479d) {
            return C12366e0.m46287a(num.intValue());
        }
        if (c1398i.m7290c() == C1398i.a.f5477b) {
            return C12366e0.m46288b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + c1398i.m7290c());
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f5538d;
    }

    @Override // bf.AbstractC1387c1
    /* JADX INFO: renamed from: b */
    public C5109a mo7253b() {
        return this.f5537c;
    }

    /* JADX INFO: renamed from: e */
    public C1398i m7338e() {
        return this.f5535a;
    }

    /* JADX INFO: renamed from: f */
    public C5109a m7339f() {
        return this.f5536b;
    }
}
