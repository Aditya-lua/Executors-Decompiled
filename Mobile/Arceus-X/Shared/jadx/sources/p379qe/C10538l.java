package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10538l extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10550p f37812a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37813b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37814c;

    /* JADX INFO: renamed from: d */
    public final Integer f37815d;

    /* JADX INFO: renamed from: qe.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C10550p f37816a;

        /* JADX INFO: renamed from: b */
        public C5111c f37817b;

        /* JADX INFO: renamed from: c */
        public Integer f37818c;

        /* JADX INFO: renamed from: a */
        public C10538l m40412a() throws GeneralSecurityException {
            C10550p c10550p = this.f37816a;
            if (c10550p == null || this.f37817b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c10550p.m40444d() != this.f37817b.m23855c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f37816a.mo7230a() && this.f37818c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37816a.mo7230a() && this.f37818c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10538l(this.f37816a, this.f37817b, m40413b(), this.f37818c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m40413b() {
            if (this.f37816a.m40446f() == C10550p.c.f37850d) {
                return C12366e0.f44235a;
            }
            if (this.f37816a.m40446f() == C10550p.c.f37849c) {
                return C12366e0.m46287a(this.f37818c.intValue());
            }
            if (this.f37816a.m40446f() == C10550p.c.f37848b) {
                return C12366e0.m46288b(this.f37818c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f37816a.m40446f());
        }

        /* JADX INFO: renamed from: c */
        public b m40414c(Integer num) {
            this.f37818c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40415d(C5111c c5111c) {
            this.f37817b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40416e(C10550p c10550p) {
            this.f37816a = c10550p;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37816a = null;
            this.f37817b = null;
            this.f37818c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40408b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37815d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40409c() {
        return this.f37813b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40410d() {
        return this.f37814c;
    }

    /* JADX INFO: renamed from: e */
    public C10550p m40411e() {
        return this.f37812a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10538l(C10550p c10550p, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37812a = c10550p;
        this.f37813b = c5111c;
        this.f37814c = c5109a;
        this.f37815d = num;
    }
}
