package p379qe;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p102ef.C5109a;

/* JADX INFO: renamed from: qe.m0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10542m0 extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10545n0 f37822a;

    /* JADX INFO: renamed from: b */
    public final C5109a f37823b;

    /* JADX INFO: renamed from: c */
    public final Integer f37824c;

    public C10542m0(C10545n0 c10545n0, C5109a c5109a, Integer num) {
        this.f37822a = c10545n0;
        this.f37823b = c5109a;
        this.f37824c = num;
    }

    /* JADX INFO: renamed from: b */
    public static C10542m0 m40423b(C10545n0 c10545n0, Integer num) throws GeneralSecurityException {
        C5109a c5109aM23847a;
        if (c10545n0.m40428d() == C10545n0.a.f37827b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c5109aM23847a = C5109a.m23847a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c10545n0.m40428d() != C10545n0.a.f37828c) {
                throw new GeneralSecurityException("Unknown Variant: " + c10545n0.m40428d());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c5109aM23847a = C5109a.m23847a(new byte[0]);
        }
        return new C10542m0(c10545n0, c5109aM23847a, num);
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37824c;
    }

    /* JADX INFO: renamed from: c */
    public C5109a m40424c() {
        return this.f37823b;
    }

    /* JADX INFO: renamed from: d */
    public C10545n0 m40425d() {
        return this.f37822a;
    }
}
