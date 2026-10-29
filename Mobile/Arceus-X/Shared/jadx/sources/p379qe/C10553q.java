package p379qe;

import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.C12366e0;

/* JADX INFO: renamed from: qe.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10553q extends AbstractC10508b {

    /* JADX INFO: renamed from: a */
    public final C10565u f37856a;

    /* JADX INFO: renamed from: b */
    public final C5111c f37857b;

    /* JADX INFO: renamed from: c */
    public final C5109a f37858c;

    /* JADX INFO: renamed from: d */
    public final Integer f37859d;

    /* JADX INFO: renamed from: qe.q$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C10565u f37860a;

        /* JADX INFO: renamed from: b */
        public C5111c f37861b;

        /* JADX INFO: renamed from: c */
        public Integer f37862c;

        /* JADX INFO: renamed from: a */
        public C10553q m40461a() throws GeneralSecurityException {
            C10565u c10565u = this.f37860a;
            if (c10565u == null || this.f37861b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c10565u.m40497d() != this.f37861b.m23855c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f37860a.mo7230a() && this.f37862c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37860a.mo7230a() && this.f37862c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10553q(this.f37860a, this.f37861b, m40462b(), this.f37862c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m40462b() {
            if (this.f37860a.m40499f() == C10565u.c.f37896d) {
                return C12366e0.f44235a;
            }
            if (this.f37860a.m40499f() == C10565u.c.f37895c) {
                return C12366e0.m46287a(this.f37862c.intValue());
            }
            if (this.f37860a.m40499f() == C10565u.c.f37894b) {
                return C12366e0.m46288b(this.f37862c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f37860a.m40499f());
        }

        /* JADX INFO: renamed from: c */
        public b m40463c(Integer num) {
            this.f37862c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40464d(C5111c c5111c) {
            this.f37861b = c5111c;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40465e(C10565u c10565u) {
            this.f37860a = c10565u;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37860a = null;
            this.f37861b = null;
            this.f37862c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40457b() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f37859d;
    }

    /* JADX INFO: renamed from: c */
    public C5111c m40458c() {
        return this.f37857b;
    }

    /* JADX INFO: renamed from: d */
    public C5109a m40459d() {
        return this.f37858c;
    }

    /* JADX INFO: renamed from: e */
    public C10565u m40460e() {
        return this.f37856a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10553q(C10565u c10565u, C5111c c5111c, C5109a c5109a, Integer num) {
        this.f37856a = c10565u;
        this.f37857b = c5111c;
        this.f37858c = c5109a;
        this.f37859d = num;
    }
}
