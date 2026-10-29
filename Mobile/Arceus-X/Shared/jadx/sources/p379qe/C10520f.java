package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10520f extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10535k f37752a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37753b;

    /* JADX INFO: renamed from: c */
    public final C5111c f37754c;

    /* JADX INFO: renamed from: d */
    public final C5109a f37755d;

    /* JADX INFO: renamed from: e */
    public final Integer f37756e;

    /* JADX INFO: renamed from: qe.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C10535k f37757a;

        /* JADX INFO: renamed from: b */
        public C5111c f37758b;

        /* JADX INFO: renamed from: c */
        public C5111c f37759c;

        /* JADX INFO: renamed from: d */
        public Integer f37760d;

        /* JADX INFO: renamed from: a */
        public C10520f m40357a() throws GeneralSecurityException {
            C10535k c10535k = this.f37757a;
            if (c10535k == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f37758b == null || this.f37759c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (c10535k.m40389c() != this.f37758b.m23855c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f37757a.m40391e() != this.f37759c.m23855c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f37757a.mo7230a() && this.f37760d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37757a.mo7230a() && this.f37760d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10520f(this.f37757a, this.f37758b, this.f37759c, m40358b(), this.f37760d);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m40358b() {
            if (this.f37757a.m40394h() == C10535k.d.f37806d) {
                return C12366e0.f44235a;
            }
            if (this.f37757a.m40394h() == C10535k.d.f37805c) {
                return C12366e0.m46287a(this.f37760d.intValue());
            }
            if (this.f37757a.m40394h() == C10535k.d.f37804b) {
                return C12366e0.m46288b(this.f37760d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f37757a.m40394h());
        }

        /* JADX INFO: renamed from: c */
        public b m40359c(C5111c c5111c) {
            this.f37758b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40360d(C5111c c5111c) {
            this.f37759c = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40361e(Integer num) {
            this.f37760d = num;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m40362f(C10535k c10535k) {
            this.f37757a = c10535k;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37757a = null;
            this.f37758b = null;
            this.f37759c = null;
            this.f37760d = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40352b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37756e;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40353c() {
        return this.f37753b;
    }

    /* JADX INFO: renamed from: d */
    public C5111c m40354d() {
        return this.f37754c;
    }

    /* JADX INFO: renamed from: e */
    public C5109a m40355e() {
        return this.f37755d;
    }

    /* JADX INFO: renamed from: f */
    public C10535k m40356f() {
        return this.f37752a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10520f(C10535k c10535k, C5111c c5111c, C5111c c5111c2, C5109a c5109a, Integer num) {
        this.f37752a = c10535k;
        this.f37753b = c5111c;
        this.f37754c = c5111c2;
        this.f37755d = c5109a;
        this.f37756e = num;
    }
}
