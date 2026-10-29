package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C10567v extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10575z f37916a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37917b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37918c;

    /* JADX INFO: renamed from: d */
    public final Integer f37919d;

    /* JADX INFO: renamed from: qe.v$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C10575z f37920a;

        /* JADX INFO: renamed from: b */
        public C5111c f37921b;

        /* JADX INFO: renamed from: c */
        public Integer f37922c;

        /* JADX INFO: renamed from: a */
        public C10567v m40519a() throws GeneralSecurityException {
            C10575z c10575z = this.f37920a;
            if (c10575z == null || this.f37921b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c10575z.m40530c() != this.f37921b.m23855c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f37920a.mo7230a() && this.f37922c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37920a.mo7230a() && this.f37922c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10567v(this.f37920a, this.f37921b, m40520b(), this.f37922c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m40520b() {
            if (this.f37920a.m40531d() == C10575z.c.f37933d) {
                return C12366e0.f44235a;
            }
            if (this.f37920a.m40531d() == C10575z.c.f37932c) {
                return C12366e0.m46287a(this.f37922c.intValue());
            }
            if (this.f37920a.m40531d() == C10575z.c.f37931b) {
                return C12366e0.m46288b(this.f37922c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f37920a.m40531d());
        }

        /* JADX INFO: renamed from: c */
        public b m40521c(Integer num) {
            this.f37922c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40522d(C5111c c5111c) {
            this.f37921b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40523e(C10575z c10575z) {
            this.f37920a = c10575z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37920a = null;
            this.f37921b = null;
            this.f37922c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40515b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37919d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40516c() {
        return this.f37917b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40517d() {
        return this.f37918c;
    }

    /* JADX INFO: renamed from: e */
    public C10575z m40518e() {
        return this.f37916a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10567v(C10575z c10575z, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37916a = c10575z;
        this.f37917b = c5111c;
        this.f37918c = c5109a;
        this.f37919d = num;
    }
}
