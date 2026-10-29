package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.k1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10537k1 extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10549o1 f37808a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37809b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37810c;

    /* JADX INFO: renamed from: d */
    public final Integer f37811d;

    public C10537k1(C10549o1 c10549o1, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37808a = c10549o1;
        this.f37809b = c5111c;
        this.f37810c = c5109a;
        this.f37811d = num;
    }

    /* JADX INFO: renamed from: b */
    public static C10537k1 m40403b(C10549o1 c10549o1, C5111c c5111c, Integer num) throws GeneralSecurityException {
        C10549o1.a aVarM40441d = c10549o1.m40441d();
        C10549o1.a aVar = C10549o1.a.f37838c;
        if (aVarM40441d != aVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + c10549o1.m40441d() + " the value of idRequirement must be non-null");
        }
        if (c10549o1.m40441d() == aVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c5111c.m23855c() == 32) {
            return new C10537k1(c10549o1, c5111c, m40404e(c10549o1, num), num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + c5111c.m23855c());
    }

    /* JADX INFO: renamed from: e */
    public static C5109a m40404e(C10549o1 c10549o1, Integer num) {
        if (c10549o1.m40441d() == C10549o1.a.f37838c) {
            return C12366e0.f44235a;
        }
        if (c10549o1.m40441d() == C10549o1.a.f37837b) {
            return C12366e0.m46288b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + c10549o1.m40441d());
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37811d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40405c() {
        return this.f37809b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40406d() {
        return this.f37810c;
    }

    /* JADX INFO: renamed from: f */
    public C10549o1 m40407f() {
        return this.f37808a;
    }
}
