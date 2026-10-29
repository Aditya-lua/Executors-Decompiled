package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.t0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10563t0 extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10566u0 f37878a;

    /* JADX INFO: renamed from: b */
    public final C5109a f37879b;

    /* JADX INFO: renamed from: c */
    public final Integer f37880c;

    public C10563t0(C10566u0 c10566u0, C5109a c5109a, Integer num) {
        this.f37878a = c10566u0;
        this.f37879b = c5109a;
        this.f37880c = num;
    }

    /* JADX INFO: renamed from: b */
    public static C10563t0 m40490b(C10566u0 c10566u0, Integer num) throws GeneralSecurityException {
        C5109a c5109aM46288b;
        if (c10566u0.m40508e() == C10566u0.d.f37914c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c5109aM46288b = C12366e0.f44235a;
        } else {
            if (c10566u0.m40508e() != C10566u0.d.f37913b) {
                throw new GeneralSecurityException("Unknown Variant: " + c10566u0.m40508e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c5109aM46288b = C12366e0.m46288b(num.intValue());
        }
        return new C10563t0(c10566u0, c5109aM46288b, num);
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37880c;
    }

    /* JADX INFO: renamed from: c */
    public C5109a m40491c() {
        return this.f37879b;
    }

    /* JADX INFO: renamed from: d */
    public C10566u0 m40492d() {
        return this.f37878a;
    }
}
